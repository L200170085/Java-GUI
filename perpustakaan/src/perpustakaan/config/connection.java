/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan.config;

import java.sql.DriverManager ;
import java.sql.Connection ;
import java.sql.SQLException ;
/**
 *
 * @author Gentur
 */
public class connection {
    public static Connection conn;
    public static Connection condb(){
        try {
            String URL  = "jdbc:mysql://localhost:3306/perpustakaan" ;//menyatakan URL Server database dan database yang akan digunakan
            String USER = "root" ;//digunakan untuk username databse
            String PASS = "" ;//digunakan untuk password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());//sebelum membuat koneksi ke server, kita harus tentukan dulu driver yang akan digunakan. dan disini digunakan untuk database MySQK
            conn = DriverManager.getConnection(URL, USER, PASS);//setelah memilih driver, selanjutnya kita lakukan koneksi ke database menggunakan paramater yg seudah dibuat
            //apabila koneksi gagal akan terjadi SQLException
        }catch(SQLException e){
            System.err.println("Connection failed "+e.getMessage());
        }
        return conn;
    }
    
    public static void main(String []args){
        System.out.println(connection.condb());
    }
}
