/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Pc
 */
public class CheckDate {
    //private static Object formatter;
    public static void main(String args[]) throws ParseException{
          java.util.Date dt1=Calendar.getInstance().getTime();
           Calendar calendar = Calendar.getInstance();
           java.sql.Date sda = new java.sql.Date(calendar.getTime().getTime());
      
           SimpleDateFormat s1=new SimpleDateFormat("dd-MMM-yyyy");
         String today=s1.format(sda);
        System.out.println("Date:" +today);
           
       
    }
}
