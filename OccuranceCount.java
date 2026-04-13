import java.util.*;
public class OccuranceCount {

    public static boolean occuranceCount(int[] arr, int target){
        boolean found = false;
        for(int i :arr){
            if(i == target){
                found = true;
                break;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        boolean result = occuranceCount(arr,target);
        if(result){
            System.out.println("Found");
        }else{
            System.out.println("No");
        }
    }
}
