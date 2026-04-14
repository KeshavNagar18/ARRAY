import java.util.Scanner;
class SeparateEvenOdd {
    public static void separateEvenOdd(int[]arr){
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        int [] even = new int[evenCount];
        int [] odd = new int [oddCount];

        int e =0 , o=0;
        for(int num : arr){
            if(num%2==0){
                even[e++]=num;
            }else{
                odd[o++]=num;
            }
        }

        System.out.print("Even: ");
        for (int num : even) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Odd: ");
        for (int num : odd) {
            System.out.print(num + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        separateEvenOdd(arr);

    }


}
