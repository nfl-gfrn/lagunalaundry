/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lagunalaundry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author W4RD
 */
public class Koneksi {
        private static Connection conn;
        private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private static final String DB_NAME = "";
        private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
        private static final String DB_UNAME = "root";
        private static final String DB_PASS = "";

        public static Connection getConnection() {
            if (conn == null) {
                try {
                    Class.forName(JDBC_DRIVER);
                    conn = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PASS);
                } catch (ClassNotFoundException e) {
                    System.err.format("Class not found");
                } catch (SQLException e) {
                    System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
                } catch (Exception e) {
                    System.out.println("Koneksi Gagal");
                }
            }
            return conn;
        }
    }
