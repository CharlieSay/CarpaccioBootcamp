package com.spring.Utility;

import com.spring.Config.Config;
import com.spring.Entity.Order;
import com.spring.Entity.OrderProgress;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    Config config;

    public DatabaseConnection(Config config) {
        this.config = config;
    }

    public Order getOrder(Integer orderId) {
        try (Connection con = DriverManager.getConnection(config.getDatabaseURL(),
                config.getDatabaseUsername(), config.getPassword())) {
            try (Statement stmt = con.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM Orders")) {
                    while (rs.next())
                        if (rs.getInt(1) == orderId) {
                            Order order = new Order(
                                    rs.getString("FIRST_NAME"),
                                    rs.getString("SECOND_NAME"),
                                    rs.getString("PHONE_NUMBER"),
                                    rs.getString("EMAIL_ADDRESS"),
                                    rs.getInt("GOLD_QUANTITY"),
                                    rs.getInt("SILVER_QUANTITY"),
                                    rs.getInt("BRONZE_QUANTITY"),
                                    Integer.parseInt(rs.getString("ORDER_NUMBER")));
                            order.setOrderProgress(OrderProgress.getProgress(rs.getString("ORDER_PROGRESS")));
                            stmt.getConnection().close();
                            return order;
                        }
                    return null;
                }
            }
        } catch (SQLException e) {
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return null;
        }
    }

    public boolean addOrder(Order order){
        String query = " insert into orders (ORDER_NUMBER, FIRST_NAME, SECOND_NAME, PHONE_NUMBER, " +
                "EMAIL_ADDRESS, GOLD_QUANTITY, SILVER_QUANTITY, BRONZE_QUANTITY, ORDER_PROGRESS)" +
                " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(config.getDatabaseURL(),
                config.getDatabaseUsername(), config.getPassword())) {
            try (PreparedStatement preparedStmt = con.prepareStatement(query)) {
                preparedStmt.setInt(1, Integer.parseInt(order.getOrderNumber()));
                preparedStmt.setString(2, order.getFirstName());
                preparedStmt.setString(3, order.getSecondName());
                preparedStmt.setString(4, order.getPhoneNumber());
                preparedStmt.setString(5, order.getEmailAddress());
                preparedStmt.setInt(6, order.getGoldQuantity());
                preparedStmt.setInt(7, order.getSilverQuantity());
                preparedStmt.setInt(8, order.getBronzeQuantity());
                preparedStmt.setString(9, order.getOrderProgress().toString());
                preparedStmt.execute();
                return true;
            }
        }catch (SQLException e){
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return false;
        }
    }

    public Integer getNewOrderNumber() {
        try (Connection con = DriverManager.getConnection(config.getDatabaseURL(),
                config.getDatabaseUsername(), config.getPassword())) {
            try (Statement stmt = con.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Orders")) {
                    rs.next();
                    return rs.getInt(1)+1;
                }
            }
        } catch (SQLException e) {
            Logger.getGlobal().log(Level.WARNING, "Context : " + e.toString());
            return null;
        }
    }

}
