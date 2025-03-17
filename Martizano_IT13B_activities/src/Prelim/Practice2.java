/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author W10
 */
public class Practice2 {

//    public static void main(String[] args) {
//        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
//                for (char m = 0; m < letters.length; m++) {
//            System.out.print(letters[m] + ",");
//
//        }
//    }
//}
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},};

        for (int t = 0; t < numbers.length; t++) {
            System.out.print("The Elements in Row " + (t + 1) + ": ");

            for (int m = 0; m < numbers[t].length; m++) {
                System.out.print(numbers[t][m] + " ");
            }

            System.out.println();

        }
    }
}
