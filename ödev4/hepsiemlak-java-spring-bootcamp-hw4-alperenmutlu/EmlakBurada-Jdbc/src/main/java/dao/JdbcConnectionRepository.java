package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionRepository {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASSWORD ="test";

    protected Connection connect(){
        try{
            Class.forName(JDBC_DRIVER);
            return DriverManager.getConnection(DB_URL,USER,PASSWORD);
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;


    }



}

