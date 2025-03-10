package BinarySearch;

public class BinarySearch {
    public static int BinarySeachdecending(int[] arr, int key){
        int low =0;
        int high=arr.length;
        while(low <= high) {
            int mid=(low+high)/2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                high = mid - 1;
            } else {
                low= mid + 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{30,28,25,23,20,19,17,15,10,7};
        int key=10;
        int result=BinarySeachdecending(arr,key);
        if(result!=-1){
            System.out.println("element found at index: "+result);
        }
        else{
            System.out.println("element not found");
        }

    }
}
