package arraydsa;

import java.util.Arrays;

public class operationonarray {
    public static void traverseArray(int []a1,int size){
        for(int i=0;i<size;i++){
            System.out.print(a1[i]+" ");  //traversing
        }
//        for(int i:a1){
//            System.out.println(i);
//        }
//        int i=0;
//        while( i<size){
//            System.out.println(a1[i]);
//            i++;
//        }
    }
    public static void insertatbeginning(int[]b,int size,int additem){
        for(int i=size;i>0;i--){
            b[i]=b[i-1];
        }
        b[0]=additem;
        //System.out.println(size);
    }
    public static void insetAtposition(int[]a,int b, int k){
        try {
            //size mean count number of element
            int count = 0;
            for (int i : a) {
                if (a[i] != 0) {
                    count++;
                } else {
                    break;
                }
            }
            if(b<=0 || b>count+1){
                System.out.println("positon is not valid");
            }
            else {
                for (int i = count; i >= b; i--) {
                    a[i] = a[i - 1];
                }
                a[b - 1] = k;
                count++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getCause());
        }
    }
    public static void main(String[] args) {
        int a[]=new int[10];
        int size=5;
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
//        System.out.println(a[5]);
        //note:actual size is 5 but where the capacity is 10
        //traverseArray(a,size);
        insertatbeginning(a,size,30);
        size++;
        traverseArray(a,size);
        insetAtposition(a,3,100);



    }
}
