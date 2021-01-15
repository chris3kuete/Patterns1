/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap5_loops;

import java.util.Scanner;

/**
 *
 * @author sa
 */
public class Chap5_Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of lines");
        int n = scan.nextInt();

        System.out.println("Pattern A");
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(j + 1);

            }
            System.out.println();
        }

        System.out.println("Pattern B");
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                System.out.print(j + 1);
            }
            System.out.println();

        }

        System.out.println("Pattern C");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= i; j++) {

                System.out.print(j + "");

            }
            System.out.println("");
        }

        System.out.println("Pattern D");
        for (int i = 0; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {

                System.out.print(j);

            }
            System.out.println("");

        }

    }

}
