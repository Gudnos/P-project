package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Petrov", (byte) 35);
        userService.saveUser("Nikolay", "Sidorov", (byte) 41);
        userService.saveUser("Petr", "Ivanov", (byte) 28);
        userService.saveUser("Sergey", "Smirnov", (byte) 56);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
