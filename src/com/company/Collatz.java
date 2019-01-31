package com.company;
/* You are going to develop an application to produce numbers in a sequence. 
The user will be required to enter a number, and for that number, you will: 
* Divide the number by 2 if it is even
* Multiply the number by 3, and add 1 if it is odd. 
* Do this until you get to 1. 
Ask the user if he/she would like to input another number, and continue until he/she does not want to enter any more numbers. 
Show the results as you go. For example, the number 5 should produce the following output: 
5 16 8 4 2 1
The number 3 should produce the following output: 
3 10 5 16 8 4 2 1 
*/

import java.util.Scanner;

class Collatz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter a number for the Collatz Sequence :   ");
        int num = scanner.nextInt();
        i = num;
        System.out.println();
        System.out.print(i);
        while (i != 1 ) {
            if (i % 2 == 0 )
                 i = i / 2;
            else if ( i % 2 == 1)
                i = (i* 3) + 1;
        System.out.print(" " + i);
        }
    }
}
