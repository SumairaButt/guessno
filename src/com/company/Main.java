package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rn = new Random();
        int guessnumber = rn.nextInt(100) + 1;
       // System.out.println("The number is : " +guessnumber);
        int inputnumber=0;
        int noofturn =0;
        do {
                System.out.println("Enter an integer between  1 to 100 : ");
                Scanner scanner = new Scanner(System.in);
                inputnumber = scanner.nextInt();

                if (guessnumber == inputnumber) {
                    System.out.println("Congratulations!. You guess the correct number " +inputnumber);
                    break;
                }
                else {
                    noofturn++;
                    if ( noofturn ==3) {
                        System.out.println("Sorry!. You can't guess the correct number. The number was " + guessnumber);
                    }
                    else {
                        System.out.println("Try again.");
                         }
                }
        }
        while (noofturn !=3);
    }
}
