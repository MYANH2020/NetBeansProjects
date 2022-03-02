/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagenumber;
import java.util.Scanner;


/**
 *
 * @author anhhuynh
 */
public class AverageNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int size;
        int sumOfNum=0;
        float avg=0;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the No. Numbers to calculate the average");
        size = number.nextInt();
        System.out.println(size);
        int[] arrOfNum = new int[size];
        for(int i=0;i<size;i++)
            {
                int tempSize = size - i;
               System.out.println("Enter "+tempSize+" number/s more");
               arrOfNum[i]=number.nextInt();
            }
        for(int i=0;i<size;i++)
            {
                sumOfNum += arrOfNum[i];
            }
        avg = sumOfNum/size;
        System.out.println(avg);
   }


       
        
        
        // TODO code application logic here
    
    
}
