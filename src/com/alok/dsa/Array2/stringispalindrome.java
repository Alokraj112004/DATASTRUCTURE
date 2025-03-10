package com.alok.dsa.Array2;

public class stringispalindrome {
    public static void main(String[] args) {
        String str="Civic";
        String st1=str.toLowerCase();
        boolean ispalindrome=true;
        int leftpointer=0;
        int rightpointer=str.length()-1;
        //StringBuilder sb=new StringBuilder(str);//we are not updating a string so here it does't apply
        while(leftpointer<rightpointer){
            if(st1.charAt(leftpointer)!=st1.charAt(rightpointer)){
                ispalindrome=false;
                break;
            }
            else{
                leftpointer++;
                rightpointer--;
            }
        }
        if(ispalindrome==false){
            System.out.println("string is not palindrome");
        }
        else{
            System.out.println("string is palindorme");
        }



    }
}
