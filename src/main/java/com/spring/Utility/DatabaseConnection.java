package com.spring.Utility;

import com.spring.Entity.Order;
import com.spring.Entity.OrderProgress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class DatabaseConnection {

    private String getPassword(){
        final String P_PATH = "/Users/charlie.say/WorkProject/Apprenticey Stuff/Carpaccio/DB_CARPACCIO_P.txt";
        try {
            try (BufferedReader in = new BufferedReader(new FileReader(P_PATH))) {
                String line;
                while ((line = in.readLine()) != null) {
                    return line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Order GetOrder(Integer orderId) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarpaccioOrders",
                "root", getPassword())) {
            try (Statement stmt = con.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Orders")) {
                    while (rs.next())
                        if (rs.getInt(1) == orderId) {
                            Order order = new Order(
                                    rs.getString("FIRST_NAME"),
                                    rs.getString("SECOND_NAME"),
                                    rs.getString("EMAIL_ADDRESS"),
                                    rs.getString("PHONE_NUMBER"),
                                    rs.getInt("GOLD_QUANTITY"),
                                    rs.getInt("SILVER_QUANTITY"),
                                    rs.getInt("BRONZE_QUANTITY"),
                                    Integer.parseInt(rs.getString("ORDER_NUMBER")));
                            order.setOrderProgress(OrderProgress.getProgress(rs.getString("ORDER_PROGRESS")));
                            stmt.getConnection().close();
                            return order;
                        }
                    return null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addOrder(Order order){
        String query = " insert into users (FIRST_NAME, SECOND_NAME, PHONE_NUMBER, " +
                "EMAIL_ADDRESS, GOLD_QUANTITY, SILVER_QUANTITY, BRONZE_QUANTITY, ORDER_PROGRESS)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarpaccioOrders",
                "root", getPassword())) {
            try (PreparedStatement preparedStmt = con.prepareStatement(query)) {
                preparedStmt.setString(2, order.getFirstName());
                preparedStmt.setString(3, order.getSecondName());
                preparedStmt.setString(4, order.getPhoneNumber());
                preparedStmt.setString(5, order.getEmailAddress());
                preparedStmt.setInt(6, order.getGoldQuantity());
                preparedStmt.setInt(7, order.getSilverQuantity());
                preparedStmt.setInt(8, order.getBronzeQuantity());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
