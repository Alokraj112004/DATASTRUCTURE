package BinarySearch;

public class orderagnosticBinarySearch {
    public static int orderBinarySeach(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        boolean isAscending=arr[low]<arr[high];
        while(low<high){
            int mid=low + (high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(isAscending){
                if(key>arr[mid]){
                    low = mid + 1;
                }
                else{
                    high= mid -1;
                }
            }
            else{
                if(key>arr[mid]){
                    high= mid-1;
                }
                else{
                    low = mid+1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,19,40,60,80};
        int key=60;
        int result=orderBinarySeach(arr,key);
        if(result!=-1){
            System.out.println("element found at index: "+result);
        }
        else{
            System.out.println("element not found in enitre array");
        }
    }
}
