/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_6;

public class Doctor1 extends Doctor {
    
    @Override
    public void writeRecipe(String PrimaryText) {
        String newText = "";
        for(int i=PrimaryText.length()-1; i>=0; i--) {
            newText += PrimaryText.charAt(i);
        }
        System.out.println("Converted recipe text: " + newText);
    }

    @Override
    public String toString() {
        return "Doctor №1";
    }
}