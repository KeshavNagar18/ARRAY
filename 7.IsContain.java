import java.util.Scanner;
class IsContain {
    public static boolean isContain(int [] arr, int target){


        for(int num : arr){
            if(num == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        boolean result = isContain(arr,target);
        if(result){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
}
