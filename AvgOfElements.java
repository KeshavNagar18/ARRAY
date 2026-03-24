import java.util.Scanner;
public class AvgOfElements {
    public static float avgOfElements(int []arr ){
        if(arr.length==0)return 0;
        int sum = 0;

        for(int num:arr){
            sum +=num;

        }
        return (float) sum / arr.length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        float result = avgOfElements(arr);
        System.out.println(result);

        sc.close();

    }
}
