import java.util.Scanner;
class ReplaceOccurrence {
    public static int[] replaceOccurrence(int []arr, int a, int b){

         for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                arr[i] = b;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] result = replaceOccurrence(arr, a,b);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
