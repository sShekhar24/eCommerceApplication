package com.ecommerce.app;

public class MySQLDriverCheck {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL Driver is present!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found in classpath!");
            e.printStackTrace();
        }
    }
}
