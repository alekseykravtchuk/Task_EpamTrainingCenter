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

	public static User getAdmin() {
		for (User user : users) {
			if (user.getUserLevel().getName().equalsIgnoreCase("admin")) {
				return user;
			}
		}
		return null;
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

	public static boolean isUserExist(String login) {
		return users.stream().anyMatch(u -> u.getLogin().equalsIgnoreCase(login));
	}

	static boolean addUser() {
		System.out.print("Enter login: ");
		String login = InputUtil.checkInputLine();
		List<User> users = UserUtils.getUsers();
		if (UserUtils.isUserExist(login)) {
			System.out.println("The user with \"" + login + "\" is exist!");
			return false;
		}
		System.out.print("Enter password: ");
		String password = InputUtil.checkInputLine();
		String encryptedPassword = PasswordUtils.md5Custom(password);
		System.out.println("Enter name: ");
		String name = InputUtil.checkInputLine();
		User user = new UserBuilder(login, encryptedPassword).setName(name).setUserLevel(UserLevel.USER).build();
		users.add(user);
		FileHandler.saveUserList(users);
		return true;
	}

	static boolean removeUser() {
		System.out.print("Enter login: ");
		String login = InputUtil.checkInputLine();
		List<User> users = UserUtils.getUsers();
		if (!UserUtils.isUserExist(login)) {
			System.out.println("The user with \"" + login + "\" does not exist!");
			return false;
		}
		System.out.print("Enter password: ");
		String password = InputUtil.checkInputLine();
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (login.equalsIgnoreCase(user.getLogin())){
				String encryptedPassword = PasswordUtils.md5Custom(password);
				if (encryptedPassword.equalsIgnoreCase(user.getPassword())){
					iterator.remove();
				}
			}
		}
		FileHandler.saveUserList(users);
		return true;
	}

	public static boolean isAdmin(User user) {
		return user.getUserLevel() == UserLevel.ADMIN;
	}
}
