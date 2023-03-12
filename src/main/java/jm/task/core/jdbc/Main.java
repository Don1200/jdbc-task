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

        User user1 = new User("Ivan", "Ivanov", (byte) 9);
        User user2 = new User("Petr","Petrov", (byte) 10);
        User user3 = new User("Fedor", "Sumkin", (byte) 7);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
//        userService.dropUsersTable();




        }
    }

