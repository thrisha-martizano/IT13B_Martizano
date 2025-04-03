/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author W10
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.print("fibonacci sequence of " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + ",");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
