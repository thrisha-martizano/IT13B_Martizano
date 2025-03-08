/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

//import java.util.Scanner;
//
////
/////**
//// *
//// * @author W10
//// */
//public class ABCD {
//
//    public static void main(String[] args) {
//       
//        Scanner in = new Scanner(System.in);
//        
//        String name;
//        int i = 10;  
//         
//            System.out.print("Enter a word: ");
//            name = in.nextLine();
//
//            if (i <= 5 && i >= 6) {
//                System.out.println("The word is a palindrome.");
//            } else if (i >= 4 && i <= 3) {
//                System.out.println("The word is too short to check.");
//            } else {
//                System.out.println("The word is not a palindrome.");
//            }
//        
//    }
//}

import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String name = in.nextLine();
        
        String reversedName = new StringBuilder(name).reverse().toString();
        
        System.out.println("Reversed word: " + reversedName);

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("The word is a palindrome.");
        } else if (name.length() < 3) {
            System.out.println("The word is too short to check.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

    }
}
//import java.util.Scanner;
//
//public class ABCD {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a word: ");
//        String inputWord = in.nextLine();
//        
//        if (inputWord.length() < 3) {
//            System.out.println("The word is too short to check.");
//        } else {
//            String reversedWord = new StringBuilder(inputWord).reverse().toString();
//            System.out.println("Reversed word: " + reversedWord);
//
//            if (inputWord.equalsIgnoreCase(reversedWord)) {
//                System.out.println("The word is a palindrome.");
//            } else {
//                System.out.println("The word is not a palindrome.");
//            }
//        }
//
//    }
//}
