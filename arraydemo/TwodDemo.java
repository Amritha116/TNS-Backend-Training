package com.tnsif.arraydemo;

public class TwodDemo {

    public static void main(String[] args) {
        int arr[][] = new int[2][3]; // Declared but unused
        int ar[][] = { {1, 2, 3}, {4, 5, 6} };

        for (int row = 0; row < ar.length; row++) {
            for (int col = 0; col < ar[row].length; col++) {
                System.out.print(ar[row][col] + " ");
            }
            System.out.println(); // Fixed: 'System' must be capitalized
        }
    }
}