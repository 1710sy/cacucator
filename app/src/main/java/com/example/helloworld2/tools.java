package com.example.helloworld2;

import android.widget.Toast;



public class tools {

    public static int charCounter(String str,char c) {
        int counter =0;
       for(int i=0;i<str.length();i++){

           if(str.charAt(i) == c)
               counter++;
       }
       return counter;
    }

}
