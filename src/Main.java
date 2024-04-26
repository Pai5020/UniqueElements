import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i,j;
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array : ");
        for(i=0; i<6; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The unique elements are : ");
        for(i=0; i<6; i++) {
            boolean unique = true;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}