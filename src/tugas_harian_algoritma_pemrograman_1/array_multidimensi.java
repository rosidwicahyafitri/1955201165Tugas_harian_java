/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_harian_algoritma_pemrograman_1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class array_multidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[][] matriks_A = new int[3][3];
        int[][] matriks_B = new int[3][3];
        int [][] hasil = new int [3][3];
        int x, y;
        
        System.out.println("\nMasukkan matriks A : ");
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            System.out.println("["+x+"]"+"["+y+"]" + " : ");
            matriks_A[x][y] = n.nextInt();

        }    
    }
        System.out.println("\nMasukkan matriks B : ");
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            System.out.println("["+x+"]"+"["+y+"]" + " : ");
            matriks_B[x][y] = n.nextInt();
        }
        }
        
        System.out.println("\nMatriks A : ");
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            System.out.println(matriks_A[x][y] +" ");
        }
            System.out.println("\n");
    
    }    
        System.out.println("\nMatriks B : ");
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            System.out.println(matriks_B[x][y] +" ");
        }
            System.out.println("\n");
        }
        
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            hasil[x][y] = matriks_A[x][y] * matriks_B[x][y];
        }
        
}
        System.out.println("\nHasil perkalian matriks A dan B : ");
        for (x=0; x<3; x++) {
        for (y=0; y<3; y++) {
            System.out.println(hasil[x][y] +" ");
        }
            System.out.println("\n");
        }
        // TODO code application logic here
    }
    
}
