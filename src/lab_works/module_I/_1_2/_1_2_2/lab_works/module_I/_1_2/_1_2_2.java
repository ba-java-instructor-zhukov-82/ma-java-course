package lab_works.module_I._1_2._1_2_2.lab_works.module_I._1_2;

import java.util.Scanner;

/*
 * Write a program that:
 *     1) Creates a Scanner to read from the keyboard;
 *     2) Prints an invitation to enter the student's name,
 *        example: "Enter the name of the student: ";
 *     3) Introduces the student's name in the line-invitation,
 *        and then outputs it in next line
 */
public class _1_2_2 {

    public static void main(String[] args) {

        //1) Creates a Scanner to read from the keyboard;
        Scanner input = new Scanner(System.in);
        //2) Prints an invitation to enter the student's name,
        //   example: "Enter the name of the student: "
        System.out.println("Please, enter your name:");
        String name = input.nextLine();
        //3) Introduces the student's name in the line-invitation,
        //   and then outputs it in next line
        System.out.format("Hello, %s!%n", name);

        input.close();
    }
}
