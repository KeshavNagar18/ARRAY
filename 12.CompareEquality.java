import java.util.Scanner;

class CompareEquality {
    public static boolean compareEquality(int[]arr1, int[]arr2){

        if (arr1.length != arr2.length) {
            return false;
        }

        for(int i = 0; i<arr1.length ; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
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
        boolean result = compareEquality(arr1,arr2);

        if(result){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }

}


// Arrays.equals(arr1, arr2)