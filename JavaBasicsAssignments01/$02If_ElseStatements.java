package JavaBasicsAssignments01;

import java.util.Scanner;

public class $02If_ElseStatements {
    Scanner input = new Scanner(System.in);

    public void main(String[] args) {
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        boolean isValid = true;
        char grade = ' ';

        if (score > 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score < 60 && score >= 0) {
            grade = 'F';
        } else {
            isValid = false;
            System.out.println("WRONG Grade!!\nPlease RESTART enter a grade between 100 & 0.");
        }
        if (isValid) {
            System.out.println("Your Score is " + score + "\nYour grade is " + grade);
        }
    }
}
