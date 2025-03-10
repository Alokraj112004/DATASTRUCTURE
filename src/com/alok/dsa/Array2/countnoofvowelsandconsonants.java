package com.alok.dsa.Array2;

import java.util.Scanner;
public class countnoofvowelsandconsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
            else{

            }
        }
        System.out.println("vowel:"+count+" with consonants:"+consonants);
        System.out.println("-------");
    }
}
