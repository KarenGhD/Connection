package Comp;

import java.security.spec.ECField;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Conexao realizada");
            } else {
                System.out.println("Falha na conexao");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
