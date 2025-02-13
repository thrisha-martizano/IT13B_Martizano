/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

import java.util.Scanner;

/**
 *
 * @author W10
 */
public class Lab_act1_Arithmetics {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        
        System.out.println("Input first number: ");
        x = in.nextInt();
        
        System.out.println("Input second number: ");
        y = in.nextInt();
        
        System.out.println("Input third number: ");
        z = in.nextInt();
        
        System.out.println(x + " x " + y + " + " + z + " = " + (x * y + z));
        System.out.println(x + " - " + y + " % " + z + " = " + (x - y) % z);
        System.out.println(x + " + " + z + " + " + y + " / " + "3" + " = " + (x + z + y) / 3);
        System.out.println(x + " x " + z + " - " + y + " * " + y + " = " + (x * z - (y * y)));
        
    }
}
