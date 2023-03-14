package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Petr","Petrov", (byte) 21);
        userService.saveUser("Fedor", "Sumkin", (byte) 22);
        userService.saveUser("Alexei", "Alekseev", (byte) 23);

        System.out.println(userService.getAllUsers());

        userService.dropUsersTable();








    }
    }

