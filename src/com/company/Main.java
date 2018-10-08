package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



       String option;
        do {
            System.out.println("Enter and exam score");
            String score = input.nextLine();
            int examScore = Integer.parseInt(score);
          //  System.out.println("Enter and exam score");

            // int score = input.nextInt();
            //input.nextLine();

            if (examScore >= 97 && examScore <= 100) {
                System.out.println("Excellent Your grade is A+");
            } else if (examScore >= 94 && examScore <= 96) {
                System.out.println("Good job. Your grade is A ");
            } else if (examScore >= 90 && examScore <= 95) {
                System.out.println("Well done. Your grade is A- ");
            } else if (examScore >= 86 && examScore <= 89) {
                System.out.println("Great job. Your grade is B+");
            } else if (examScore >= 80 && examScore <= 85) {
                System.out.println("Great job. Your grade is B- ");
            } else if (examScore >= 75 && examScore <= 79) {
                System.out.println("Great job. Your grade is B ");
            } else if (examScore >= 70 && examScore <= 74) {
                System.out.println("Well done. Your grade is C+");
            } else if (examScore >= 65 && examScore <= 69) {
                System.out.println("Well done Your grade is C");
            } else if (examScore >= 60 && examScore <= 64) {
                System.out.println("Well done. Your grade is C- ");
            } else if (examScore >= 57 && examScore <= 59) {
                System.out.println("You passed. Your grade is D+ ");
            } else if (examScore >= 50 && examScore <= 56) {
                System.out.println("Well done. Your grade is D ");

            } else {

                System.out.println("You failed Your grade is F ");
            }
            System.out.println("Do you want to enter another score (Y/N)");

           option = input.nextLine();


        } while (option.equalsIgnoreCase("Y"));
    }
}
