package com.alok.dsa.Array2;

import java.util.Arrays;

public class anagram {
    public static boolean checkanagram(String name1,String name2){
        String str5=name1.replaceAll("\\s+","");//regular expression \\s+
        String str3=name2.replaceAll("\\s+","");//regular expression
        if(str5.length()!=str3.length()){
            return false;
        }
        char second[]=str5.toCharArray();
        char first[]=str3.toCharArray();

        //sort
        Arrays.sort(second);
        Arrays.sort(first);
        return Arrays.equals(first,second);  //euqal return boolean
    }
    public static void main(String[] args) {
        String str1="jenny           ";
        String str2="ennyj  ";
        System.out.println(checkanagram(str1,str2));


    }
}
