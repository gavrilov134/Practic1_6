/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_6;

public class Doctor2 extends Doctor {
    
    @Override
    public void writeRecipe(String PrimaryText) {
        String transformedText = "Your recipe: " + PrimaryText.toUpperCase();
        System.out.println("Converted recipe text: " + transformedText);
    }

    @Override
    public String toString() {
        return "Doctor №2";
    }
}
