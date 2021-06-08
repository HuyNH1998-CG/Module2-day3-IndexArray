package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Raphael", "Michael", "Uriel", "Gabriel", "Belial", "Lucifer"};
        System.out.println("Enter a student's name");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals(inputName)){
                System.out.println("Student: " + inputName + " Number: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Student " + inputName + " not found");
        }
    }
}
