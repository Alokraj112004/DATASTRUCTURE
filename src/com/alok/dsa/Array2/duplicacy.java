package com.alok.dsa.Array2;

public class duplicacy {
    public static void main(String[] args) {
        String st="sunnysinghnnJJ".toLowerCase();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(str.toString().indexOf(ch)==-1){
                str.append(ch);
            }
        }
        System.out.println(str.toString());

    }
}
