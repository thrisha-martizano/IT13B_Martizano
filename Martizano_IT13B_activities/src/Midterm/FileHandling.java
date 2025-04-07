/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        int key = 6;
        String message1 = "I love you!";
        String message2 = "Gwapa ko!";
        String message3 = "Buotan si Ma'am";

        System.out.println("Original Message: \nI Love You! \nGwapa ko! \nBuotan si Ma'am");
        System.out.println("Encrypted Messages:");
        System.out.println(encryptMessage(message1, key));
        System.out.println(encryptMessage(message2, key));
        System.out.println(encryptMessage(message3, key));

        try {
            FileWriter myLOC = new FileWriter("C:\\Users\\W10\\Desktop\\MartizanoFileHandlingEncryption.txt.");
            myLOC.write("\nI Love You! \nGwapa ko! \nBuotan si Ma'am");
            System.out.println("Encrypted message has been saved");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the message.");
        }
    }

    public static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
        }
        return new String(chars);
    }
}
