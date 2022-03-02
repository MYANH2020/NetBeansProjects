/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;
import java.util.*;

/**
 *
 * @author anhhuynh
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,i,count=0;
Scanner s= new Scanner(System.in);
System.out.println("Enter a four digit number");
a=s.nextInt();
s= new Scanner(System.in);
System.out.println("Enter the pattern(eg:- ab+cd):");
String str= s.nextLine();
String number = String.valueOf(a);
char[] digits = number.toCharArray();
System.out.print(str.charAt(0)+":"+ digits[0]+",");
System.out.print(str.charAt(1)+":"+ digits[1]+",");
char c = str.charAt(2);
System.out.print(str.charAt(3)+":"+ digits[2]+",");
System.out.print(str.charAt(4)+":"+ digits[3]+"-->");
if (c=='+') {

int number1 = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1]));
int number2 = Integer.parseInt(Character.toString(digits[2]) + Character.toString(digits[3]));
System.out.println(number1+"+"+number2 + "-->"+ (number1+number2));

}
else if(c=='-') {
int number1 = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1]));
int number2 = Integer.parseInt(Character.toString(digits[2]) + Character.toString(digits[3]));
System.out.println(number1+"-"+number2 + "-->"+ (number1-number2));
}
else if(c=='*') {
int number1 = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1]));
int number2 = Integer.parseInt(Character.toString(digits[2]) + Character.toString(digits[3]));
System.out.println(number1+"*"+number2 + "-->"+ (number1*number2));
}
else if(c=='/') {
int number1 = Integer.parseInt(Character.toString(digits[0]) + Character.toString(digits[1]));
int number2 = Integer.parseInt(Character.toString(digits[2]) + Character.toString(digits[3]));
System.out.println(number1+"/"+number2 + "-->"+ (number1/number2));
}
}

        // TODO code application logic here
    
    
}
