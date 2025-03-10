package linearsearching;

public class SentinellinearSearchbestthentrans {
    public static int sentinelsearch(int []arr , int target){
        int n = arr.length;
        int lastelement=arr[n-1];
        arr[n-1]=target;
        int i=0;
        while(arr[i]!= target){
            i++;
        }
        arr[n-1]=lastelement;
        if(i < n-1 || arr[n-1]==target){
            System.out.println("element found");
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
          int[] arr=new int[]{23,8,56,34,1,9,0,20};
          int key=20;
          int result=sentinelsearch(arr,key);
        System.out.println("index:"+result);


    }
}
