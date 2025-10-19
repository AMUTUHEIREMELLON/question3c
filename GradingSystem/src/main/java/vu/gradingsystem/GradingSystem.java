/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.gradingsystem;

import java.util.Scanner;

/**
 *
 * @author Amutuheire
 */
public class GradingSystem {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter student's score
        System.out.print("Enter the student's score (0 - 100): ");
        int score = input.nextInt();

        int grade;
        String remark;

        // Determine grade and remark using if-else-if statements
        if (score >= 80 && score <= 100) {
            grade = 1;
            remark = "Distinction";
        } else if (score >= 75 && score <= 79) {
            grade = 2;
            remark = "Distinction";
        } else if (score >= 66 && score <= 74) {
            grade = 3;
            remark = "Credit";
        } else if (score >= 60 && score <= 65) {
            grade = 4;
            remark = "Credit";
        } else if (score >= 50 && score <= 59) {
            grade = 5;
            remark = "Credit";
        } else if (score >= 45 && score <= 49) {
            grade = 6;
            remark = "Credit";
        } else if (score >= 35 && score <= 44) {
            grade = 7;
            remark = "Pass";
        } else if (score >= 30 && score <= 34) {
            grade = 8;
            remark = "Pass";
        } else if (score >= 0 && score <= 29) {
            grade = 9;
            remark = "Fail";
        } else {
            // Handle invalid score input
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
            return;
        }

        // Display results
        System.out.println("\n--- Student Result ---");
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);
    }

}