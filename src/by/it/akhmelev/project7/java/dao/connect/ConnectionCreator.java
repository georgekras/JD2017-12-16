package by.it.akhmelev.project7.java.dao.connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {

    private static final String URL_DB =
            "jdbc:mysql://127.0.0.1:2016/akhmelev"
                    + "?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_DB = "root";
    private static final String PASSWORD_DB = "";

    private static Connection connection;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
            if (connection == null || connection.isClosed())
                connection = DriverManager.getConnection(
                        URL_DB, USER_DB, PASSWORD_DB
                );
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
