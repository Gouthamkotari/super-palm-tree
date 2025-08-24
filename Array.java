//package Array;
//import java.util.Scanner;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);

        // int[] a = {10,20,30,40,50};
        // for (int i = 0; i < a.length; i++) {
        //     System.out.println(a[i]);
        // }

        // enhanced
        // for (int element:a) {
        //     System.out.println(element);
        // }

        // int count = 0;
        // String[] s = {"a", "b", "c", "d", "e"};
        // for (int i = 0; i < s.length; i++) {
        //     System.out.print(s[i] + " ");
            
        // }
        // System.out.println();
        // for (String element : s) {
        //     System.out.print(element + " ");
        //     count++;
        // }
        // System.out.println("\nCount " + count);

        // int sumArray = 0;
        // // int[] arr = {1,3,5,7,20,25,2};
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     // System.out.print(arr[i] + " ");

        //     sumArray = sumArray + arr[i];
        // }

        // int oddsum=0, evensum=0;
        // int evencount = 0;
        // int oddcount = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 == 0) {
        //         System.out.print(arr[i] + " ");
        //         evensum = evensum + arr[i];
        //         evencount++;
        //     }
        // }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] % 2 != 0) {
        //         System.out.print(arr[i] + " ");
        //         oddsum = oddsum + arr[i];
        //         oddcount++;
        //     }
        // }
        // float avg = sumArray/10;
        // System.out.println();
        // System.out.println("Even Count = " + evencount);
        // System.out.println("Odd Count = " + oddcount);
        // System.out.println("Even Sum = " + evensum);
        // System.out.println("Odd sum = " + oddsum);
        // System.out.println("Sum = " + sumArray);
        // System.out.println("Avg = " + avg);

        //int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // for (int i = 0; i < arr.length; i++) {
        //     // if (arr[i] % 3 == 0 || arr[i] % 4 == 0)
        //     if (arr[i]%3!=0 && arr[i]%4!=0) {
        //         System.out.print(arr[i] + " ");
        //     }
        // }

        // int target = 5;
        // boolean flag = false; 
        // for (int i = 0; i < arr.length; i++) {
        //     // if (arr[i] % 3 == 0 || arr[i] % 4 == 0)
        //     if (target == arr[i]) {
        //         flag=true;
        //         break;
        //     }
        // }
        // if (flag == true) {
        //     System.out.println("Found");
        // } else {
        //     System.out.println("Not Found");
        // }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = in.nextInt();
        // int[] a = new int[5];
        // int b[] = new int[5];
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(i + " index :");
            arr[i] = in.nextInt();
        }
        System.out.println("Array elements are");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
