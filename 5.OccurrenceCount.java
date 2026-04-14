import java.util.*;
class OccurrenceCount {

    public static int occurrenceCount(int[] arr, int target){
        int count = 0;
        for(int i :arr){
            if(i == target){
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        int result = occurrenceCount(arr,target);
        System.out.println(result);
    }
}
