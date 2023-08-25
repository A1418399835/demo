package com.example.demo.util;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

public class PortUtil {

    static ResourceBundle rb;
    static {
        rb = ResourceBundle.getBundle("dataSource");

    }




    public static String getValue(int r) {
        String s = rb.getString("" + r);

        try {
            s = new String(s.getBytes("iso-8859-1"),"UTF-8");
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }

        return s;
    }

}
