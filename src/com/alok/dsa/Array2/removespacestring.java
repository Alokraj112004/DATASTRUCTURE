package com.alok.dsa.Array2;

import java.util.function.DoubleToIntFunction;

public class removespacestring {
    public static void main(String[] args) {
        //using inbuilt function
//        String str="    welcome to  java cou\trse"; //it's is a regular expression and \n means new line
//        System.out.println(str.replaceAll("\\s+",""));
        String str="welcome back to    a java course";
        System.out.println(str);
        //String str1="";
        StringBuilder result= new StringBuilder();//empty string builder
        //System.out.println(str.length());
        int i=0;
        while(i<str.length()){
            if (str.charAt(i) != ' '&& str.charAt(i) != '\n' && str.charAt(i) != '\t') {
               result.append(str.charAt(i));
            }
            i++;
        }
        System.out.println(result);

    }
}
