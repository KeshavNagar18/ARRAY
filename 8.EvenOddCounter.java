import java.util.Scanner;
class EvenOddCounter {
    public static void evenOddCounter(int [] arr){
        int even = 0;
        int odd = 0;
        for(int num : arr){
            if((num%2)==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(even + " Even");
        System.out.println(odd + " Odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n ; i++){
            arr[i]=sc.nextInt();
        }


        evenOddCounter(arr);

    }
}
