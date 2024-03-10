/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_6;

public class Doctor {
    
    public void writeRecipe(String PrimaryText) {
        System.out.println("Recipe text: " + PrimaryText);
    }

    @Override
    public String toString() {
        return "Doctor";
    }
}