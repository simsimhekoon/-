package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JejuUserDao extends UserDao {
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        //mysql driver 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection 맺기
        return DriverManager.getConnection("jdbc:mysql://localhost/userdao?serverTimezone=Asia/Seoul", "root", "as1212");
    }
}
