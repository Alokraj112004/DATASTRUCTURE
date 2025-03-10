package com.alok.dsa.Array2;
class Test{
    String name; //class level variable instance variable.field
    int rollNo;
    void display(){
        System.out.println("Name: "+name+" with rollno: "+rollNo);
    }
}
public class student {
    public static void main(String[] args) {
        Test[] t=new Test[3];//it's is references to an actual array
//        System.out.println(t);
        //System.out.println(t[0]);
        t[0]=new Test();//here we create the actual objects with the help of references
        t[0].rollNo=10;
        t[0].name="alok";
        //System.out.println(t[0].name);
        t[0].display();
        //System.out.println(t[0].rollNo);
        t[1]=new Test();
        t[1].name="sunnysingh";
        t[1].rollNo=40;
        t[1].display();
    }
}
