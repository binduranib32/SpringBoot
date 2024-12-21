package com.task.tasktest;

public class DriverTest {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class is valid.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class is not found: " + e.getMessage());
        }
    }
}
