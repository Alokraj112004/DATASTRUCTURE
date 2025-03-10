package com.alok.dsa.Array2;

public class toggleofcharacter {
    public static void main(String[] args) {
        String str="alok";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);//we can't call islower case method beacuse it's not a object it's a simple variable that why we need to convert them to itobject type
            if(Character.isLowerCase(ch)){  //we are converting  this into a wrapper classes and upon that we call islowercase()method
                sb.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch)); // we are
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString()); //we are converting this to it's string type
    }
}
