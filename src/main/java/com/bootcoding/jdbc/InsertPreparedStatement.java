package com.bootcoding.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertPreparedStatement {

    public static void main(String[] args) {

        try{
            // 1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");

            // 2. Get Database Connection Object
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "postgres");

            // 3. Query Database using Statement Object
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO customer VALUES(2003, 'Raju', 'Nagpur', 'raju@nagpur.com', 123)";
            // 4. Execute Query and Get ResultSet
            stmt.executeUpdate(sql);
            // 4.1 Extract Result

            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO customer VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1, 2001);
            preparedStatement.setString(2, "Rajesh");
            preparedStatement.setString(3, "Akola");
            preparedStatement.setString(4, "rajesh@akola.in");
            preparedStatement.setInt(5, 122);
            int i = preparedStatement.executeUpdate();


            // 5.Connection CLose;
            conn.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
