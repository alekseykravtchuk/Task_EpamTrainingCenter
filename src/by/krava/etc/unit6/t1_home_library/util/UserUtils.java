package by.krava.etc.unit6.t1_home_library.util;

import by.krava.etc.unit6.t1_home_library.entity.User;
import by.krava.etc.unit6.t1_home_library.entity.UserLevel;

import java.util.Iterator;
import java.util.List;

public class UserUtils {

	private static List<User> users;

	static {
		users = FileHandler.loadUsers();
	}

	public static List<User> getUsers() {
		return users;
	}

	public static User login(String username, String password) {
		for (User user : users) {
			if (user.getLogin()
			        .equalsIgnoreCase(username) && PasswordUtils.verifyUserPassword(password, user.getPassword())) {
				return user;
			}
		}

		return null;
	}

	public static boolean addUser(String login, String password) {
		if (isUserExist(login)) {
			System.out.println("The user with \"" + login + "\" is exist!");
			return false;
		} else {
			String securePassword = PasswordUtils.md5Custom(password);
			User user = new UserBuilder(login, securePassword).build();
			users.add(user);
			FileHandler.saveUserList(users);
			return true;
		}
	}

	public static boolean removeUser(String login, String password) {
		if (!isUserExist(login)) {
			System.out.println("The user with \"" + login + "\" isn't exist!");
			return false;
		} else {
			Iterator<User> iterator = users.iterator();
			while (iterator.hasNext()) {
				User user = iterator.next();
				if (login.equalsIgnoreCase(user.getLogin())){
					String securedPassword = PasswordUtils.md5Custom(password);
					if (securedPassword.equalsIgnoreCase(user.getPassword())){
						iterator.remove();
					}
				}
			}
			FileHandler.saveUserList(users);
			return true;
		}
	}

	private static boolean isUserExist(String username) {
		return users.stream().anyMatch(u -> u.getUsername().equalsIgnoreCase(username));
	}

	public static boolean isAdmin(User user) {
		return user.getUserLevel() == UserLevel.ADMIN;
	}
}
