package com.alok.dsa.Array2;

public class longestwordinsentance {
//    public static void main(String[] args) {
//        //approach 1
//    }
//      String sentance="Welcome to jenny's lectures. ";
//      String lonestword="";
//      System.out.println(lonestword.length());
//      String words[]=sentance.split(" ");//it will return an array
//        // System.out.println(words[0].length());
//      for (String word : words){
//          if(word.length() > lonestword.length()){
//              lonestword=word;
//          }
//      }
//        System.out.println(lonestword);
//        System.out.println(lonestword.length());
//    }
    //approach 2
public static void main(String[] args) {
    //approach 2
    String str="Hii alokRaj ";
    str+=' ';
    String longestword="";
    String word="";
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch!=' ') {
            word += ch;
        }
        else{
            if(word.length()>longestword.length()){
                longestword=word;
            }
            word="";
        }
    }


    System.out.println(word.length());
    System.out.println(longestword);

}

}
