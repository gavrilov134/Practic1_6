/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_6;
import java.util.Scanner;

public class Practical1_6 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Evgeny Gavrilov, RIBO-01-22, Variant 3");
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Select doctor number (1 or 2): ");
        int NumberOfDoctor = scan.nextInt();

        Doctor doctor = new Doctor();

        if (NumberOfDoctor == 1) {
            doctor = new Doctor1();
        } else if (NumberOfDoctor == 2) {
            doctor = new Doctor2();
        } else {
            System.out.println("The doctor's number is incorrect.");
            return;
        }

        System.out.println("Enter recipe text: ");
        scan.nextLine();
        String PrimaryText = scan.nextLine();

        doctor.writeRecipe(PrimaryText);
        System.out.println(doctor);
    }
}

