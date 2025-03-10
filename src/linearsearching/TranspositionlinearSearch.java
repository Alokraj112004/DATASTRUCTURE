package linearsearching;

public class TranspositionlinearSearch {
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                int index=i;
                if(i>0){
                    int temp=arr[i];
                    arr[i]=arr[0];
                    arr[0]=temp;
                }
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        int target=10;
        int c = linearSearch(arr,target);
        if(c!=0){
            System.out.println("elememnt found"+c);
        }
        else{
            System.out.println("element not found");
        }
    }
}
