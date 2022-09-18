/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.com.loginpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class loginConnection {


    public static void main(String [] args)
    {

        System.out.println("Hello ");
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "Yash Mittal";
        String password = "Y@shMitt@l30";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");                     // To load the driver
            System.out.println("Driver Successfully loaded.");

            Connection con = DriverManager.getConnection(url,user,password);      // To establishing the connection with database
            System.out.println("Connection successfully established.");

            //Create a statement...

//            String q = "create table message(text int(20))";
            String q = "select * from message";
//            int a = 19251552;

            //PrepareStatement
//            Scanner sc =  new Scanner(System.in);
//            int rollNo = sc.nextInt();
            PreparedStatement stm1 = con.prepareStatement(q);
//            stm.setInt(1,rollNo);

            stm1.executeUpdate();
//            System.out.println("table is created.");

//            q = "insert into message(text) value(?)";
//            int a = 19251552;

            //PrepareStatement
            Scanner sc =  new Scanner(System.in);
            int rollNo = sc.nextInt();
            PreparedStatement stm = con.prepareStatement(q);
            stm.setInt(1,rollNo);

            stm.executeUpdate();



            //  After Done all work close the connection
            con.close();

        } catch (ClassNotFoundException e) {                                     // To handle    ClassNotFoundException
            System.out.println("Drivers Not loaded.");
        }
        catch (SQLException e) {                                                 // To handle    SQLException
            System.out.println("Connection not established."+e);

        }

    }
}