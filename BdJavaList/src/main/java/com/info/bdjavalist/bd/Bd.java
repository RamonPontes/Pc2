/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.info.bdjavalist.bd;

import java.sql.*;

/**
 *
 * @author info2025
 */
public class Bd {
    private static Connection con = null;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/aluno?serverTimezone=America/Sao_Paulo";
    private static final String usuario = "root";
    private static final String senha = "vertrigo";

    public static Connection getCon() {
        try {
            if (con == null || con.isClosed() || con.isValid(1000)) {
                Class.forName(driver);
                con = DriverManager.getConnection(url, usuario, senha);
            }
        } catch (Exception e) {
            System.out.println(" erro na conexao\n" + e.getMessage());
        }
        return con;
    }

    public static void fecha() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Erro no fechamento");
        }
    }
}