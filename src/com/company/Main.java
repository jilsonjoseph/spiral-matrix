package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        // r - row size
        // c - column size
        int r, c;

        // get size of matrix
        System.out.println("Enter row and column");
        r = sc.nextInt();
        c = sc.nextInt();

        // declare and initialize matrix
        int[][] matrix = new int[r][c];

        // accept matrix
        System.out.println("Enter the matrix");
        for(int i = 0; i< r; i++){
            for(int j = 0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        printMatrix(matrix);
        spiralPrintMatrix(matrix);

    }

    // display matrix
    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int col : row)
                System.out.print(" "+col);
            System.out.println();
        }
    }

    // display matrix spirally
    public static void spiralPrintMatrix(int[][] matrix){
        // rs - row start, re - row end
        // cs - column start, ce - column end
        int rs =0, re = matrix.length - 1;
        int cs =0, ce = matrix[0].length - 1;

        while (rs<=re && cs<=ce){
            for(int k = cs; k<=ce; k++){
                System.out.print(" "+matrix[rs][k]);
            }
            rs++;

            for(int k = rs; k<=re; k++){
                System.out.print(" "+matrix[k][ce]);
            }
            ce--;

            for(int k = ce; k >= cs; k--){
                System.out.print(" "+matrix[re][k]);
            }
            re--;

            for(int k = re; k>=rs; k--){
                System.out.print(" "+matrix[k][cs]);
            }
            cs++;
        }

    }
}
