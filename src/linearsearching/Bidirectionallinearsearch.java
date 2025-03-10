package linearsearching;
//better in linear search o(n) thitha(n/2)
public class Bidirectionallinearsearch {
    public static int bidirectional(int[] arr1,int target){
        int left=0;
        int right=arr1.length-1;
        while(left<right){
            if(arr1[left] == target){
                return left;
            }
            if(arr1[right] == target){
                  return right;
            }

          left++;
          right--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,7,10};
        int target=10;
        int index=bidirectional(arr,target);
        System.out.println(index);
        if(index!=-1){
            System.out.println("element found :" +index);
        }
        else{
            System.out.println("element not found");
        }
    }
}
