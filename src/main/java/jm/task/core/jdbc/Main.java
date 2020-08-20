package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl user = new UserDaoJDBCImpl();
        user.createUsersTable();
        user.saveUser("Misha", "Terentev", (byte) 22);
        user.saveUser("Ivan", "Ivanov", (byte) 31);
        user.saveUser("Alex", "Alexov", (byte) 21);
        user.saveUser("NotIdea", "Terentev", (byte) 41);
        System.out.println(user.getAllUsers());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
