/** Practical Exam
*
* Course :DSAJ
* Class :BR008
* Family Name : Nguyen Hoang
* Given Name : Gia
* Student Number :GT60737
* Username :GT60737
* Instructor : Romel
* Date : 12-12-2014
*
* I declare that this program is my own work in accordance with the
* university policy. No part of this program has been copied manually or
* electronically from any other source (including web sites) or distributed
* to other students
*/
package dsaj_pratical_exam;

import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class DSAJ_Pratical_Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int inputOption;
        System.out.println("Wellcome to Inverse Insertion sort program");
        try{
            System.out.println("Please choose the size of the array :");
            inputOption = sc.nextInt();
            
            int[] arrForSort = new int[inputOption];
            
            for(int i = 0; i < inputOption; i++){
                System.out.print("Enter the element "+i+" :");
                arrForSort[i]  = sc.nextInt();
            }
            
            InverseInsertionSort(arrForSort);
        }catch(Exception e){
            System.out.println("Error occur, Please try again");
        }

    }

    public static int[] InverseInsertionSort(int input_array[]) {
        int i, j, x;
        int n = input_array.length;
        
        System.out.print("Array before sort: ");
            printArray(input_array);
        
        
        for (i = 1; i < n; i++) {
            x = input_array[i];
            j = i;
            while (j > 0 && x > input_array[j - 1]) {
                input_array[j] = input_array[j - 1];
                j--;
            }
            input_array[j] = x;
            System.out.print("Array after "+i+" step: ");
            printArray(input_array);
        }
        return input_array;
    }
    
    private static void printArray(int in[]){
        for(int tem = 0; tem < in.length; tem ++){
                System.out.print(in[tem]+" ");
                
            }
        System.out.println("");
    }
}
