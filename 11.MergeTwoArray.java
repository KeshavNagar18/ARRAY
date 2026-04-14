import java.util.Scanner;
class MergeTwoArray {
    public static int [] mergeTwoArray(int [] arr1, int [] arr2){

        int [] newArr = new int[arr1.length+ arr2.length];

        int k = 0;

        for (int num : arr1) {
            newArr[k++] = num;
        }
        for (int num : arr2) {
            newArr[k++] = num;
        }

        return newArr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int [] result = mergeTwoArray(arr1,arr2);
        for (int num : result) {
            System.out.print(num+" ");
        }
    }

}
