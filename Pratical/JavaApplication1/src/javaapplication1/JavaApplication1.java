package javaapplication1;

//Inverse Insertion Sort 
 
import java.util.Scanner; 
 
public class JavaApplication1 { 
    static void InverseInsertionSort(int[] array) { 
        int temp; 
        int i, j; 
        for( i=1; i<array.length; i++ ) 
        { 
            temp = array[i]; 
            for( j=i; j>0 && temp>array[j-1]; j--) 
                array[j] = array[j-1]; 
 
            array[j] = temp; 
//             int n; 
//            System.out.print("In sorting: " ); 
//            for( n=0; n<array.length; n++ ) 
//                System.out.print(" " + array[n]); 
//            System.out.println(""); 
        } 
    } 
 
    static void inputArray( int in[], int num ) { 
        Scanner easy = new Scanner(System.in); 
        int i; 
        for( i=0; i<num; i++ ) 
        { 
            System.out.print("Enter val[" + i + "]: "); 
            in[i] = easy.nextInt(); 
        } 
    } 
 
    public static void main(String args[]) { 
        Scanner easy = new Scanner(System.in); 
 
        /* input the number of students */ 
        System.out.print("Input the number of integers: "); 
        int number = easy.nextInt(); 
 
        int [] array = new int [number]; 
 
        inputArray( array, number ); 
 
        int n = 0; 
        System.out.println("\n"); 
        System.out.print("Before sorting: " ); 
        for( n=0; n<number; n++ ) 
            System.out.print(" " + array[n]); 
        System.out.println(""); 
 
        InverseInsertionSort(array); 
 
        System.out.print("After sorting: " ); 
        for( n=0; n<number; n++ ) 
            System.out.print(" " + array[n]); 
        System.out.println(""); 
  } 
 
} 