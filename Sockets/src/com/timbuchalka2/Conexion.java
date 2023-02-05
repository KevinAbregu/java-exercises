package com.timbuchalka2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author davin
 */
public class Conexion {

    //representa la conexion con la Base de datos, creamos un objeto conexion
    private Connection conexion;

    // creamos el constructor de la conexion
    public Conexion(String bd) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conector = "jdbc:mysql:";
        String servidor = "//localhost:3306/";
        String usuario = "root";
        String contrasenia = "root";
        String zonaHoraria = "?serverTimezone=UTC";
        String cadenaConexion = conector + servidor + bd + zonaHoraria;
        conexion = DriverManager.getConnection(cadenaConexion, usuario, contrasenia);
    }

    public Connection getConexion() {
        return conexion;
    }

}