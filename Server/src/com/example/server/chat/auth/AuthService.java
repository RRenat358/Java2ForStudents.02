package com.example.server.chat.auth;

import java.util.Set;

public class AuthService {

    private static Set<User> USERS = Set.of(
            new User("1", "1", "username1"),
            new User("2", "2", "username2"),
            new User("3", "3", "username3")
    );

    public String getUsernameByLoginAndPassword(String login, String password) {
        User requiredUser = new User(login, password);
        for (User user : USERS) {
            if (requiredUser.equals(user)) {
                return user.getUsername();
            }
        }

        return null;
    }
}
