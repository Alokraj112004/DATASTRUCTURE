package BinarySearch;

import java.sql.SQLOutput;

public class lowerbound {
    public static int lowerBinary(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        if(target>arr[high]){
            return -1;
        }
        while(low<=high){
          int mid=low+(high-low)/2;
          if(arr[mid]>=target){
              //means that target element will be lie in left side of the array with an smallest index
              high=mid-1;
          }
          else{
              //means that target element will be lie in the right side of the array with an smallest index
              low=mid+1;
          }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,15,15,15,22,25,50};
        int key = 3;
        int result=lowerBinary(arr,key);
        System.out.println(key+ ":lowerbound is: "+result);
    }
}
