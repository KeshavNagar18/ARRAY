import java.util.Scanner;


public class SumOfElements {

    public static int sumOfAllElements(int[] arr){
        if(arr.length==0)return 0;
        int sum = 0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int result = sumOfAllElements(arr);
        System.out.println("Sum = "+ result);

    }
}
