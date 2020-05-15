package kr.ac.jejunu.userdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionMaker {
    public Connection getConnection() throws ClassNotFoundException, SQLException;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost/userdao?serverTimezone=UTC"
//                , "root", "as1212");
}