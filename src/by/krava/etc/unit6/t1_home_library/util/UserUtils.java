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

	public static Email getAdminEmail() {
		for (User user : users) {
			if (user.getUserLevel().getName().equalsIgnoreCase("admin")) {
				return user.getEmail();
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

	public static boolean isUserExist(String username) {
		return users.stream().anyMatch(u -> u.getUsername().equalsIgnoreCase(username));
	}

	public static boolean isAdmin(User user) {
		return user.getUserLevel() == UserLevel.ADMIN;
	}
}
