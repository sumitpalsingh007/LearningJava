package com.helloworldconsulting;

import java.sql.SQLException;

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void method() throws Exception {
        throw new SQLException("Runtime exception");
    }
}