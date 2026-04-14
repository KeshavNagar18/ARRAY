import java.util.Scanner;
class CopyElements {
    public static int[] copyElements(int[]arr){
        int [] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

    return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = copyElements(arr);
        for (int num : result) {
            System.out.print(num+" ");
        }
    }
}

// Built-in Methods in java for copy array


// int[] newArr = arr.clone();

// int[] newArr = Arrays.copyOf(arr, arr.length);

