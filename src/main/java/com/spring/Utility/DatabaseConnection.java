package com.spring.Utility;

import com.spring.Entity.Order;
import com.spring.Entity.OrderProgress;

import java.sql.*;

public class DatabaseConnection {

    public Order GetOrder(Integer orderId) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarpaccioOrders",
                "root", "busted29")) {
            try (Statement stmt = con.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("select * from Orders")) {
                    while (rs.next())
                        if (rs.getInt(1) == orderId) {
                            Order order = new Order(
                                    rs.getString("FIRST_NAME"),
                                    rs.getString("SECOND_NAME"),
                                    rs.getString("EMAIL_ADDRESS"),
                                    rs.getString("PHONE_NUMBER"),
                                    rs.getString("GOLD_QUANTITY"),
                                    rs.getString("SILVER_QUANTITY"),
                                    rs.getString("BRONZE_QUANTITY"),
                                    Integer.parseInt(rs.getString("ORDER_NUMBER")));
                            order.setOrderProgress(OrderProgress.getProgress(rs.getString("ORDER_PROGRESS")));
                            stmt.getConnection().close();
                            return order;
                        }
                    return null;
                } catch (SQLException e) {
                    return null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
