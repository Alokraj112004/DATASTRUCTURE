package com.alok.dsa.Array2;

import java.util.Scanner;

public class ReverseString {
    //Approach 1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        //two pointers left and right
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char charAtleft=str.charAt(left);
            char charAtright=str.charAt(right);
            sb.setCharAt(left,charAtright);
            sb.setCharAt(right,charAtleft);
            //sb.toString();
            left++;
            right--;
        }
        System.out.println("String reverse:");
        System.out.println(sb.toString());

    }
    //approach 2
//    public static void main(String[] args) {
//        String str="Alok";
//        for(int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
//    }
    //approach 3
    //using inbuilt function we are reverseing the string by a inbuilt method
//    public static void main(String[] args) {
//        String str="alokraj";
//        StringBuilder sb= new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb);
//    }
    //approach 4
//    public static void main(String[] args) {
//        String str="alok";//we start fatching the character from last and will append this on emptystring
//        String emptyString="";
//        StringBuilder strresult= new StringBuilder(emptyString);
//        for(int i=str.length()-1;i>=0;i--){
//            //System.out.println(str.charAt(i));
//             strresult.append(str.charAt(i));
//        }
//        System.out.println(strresult.toString());
//        //System.out.println(emptyString);
//        //but we can't take one more extrastring
//    }


}
