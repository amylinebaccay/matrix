/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Daisy
 */
public class MatrixApp {
    public static void main (String[] args) {
        Matrix A = new Matrix();
        Matrix B = new Matrix();
       
        Matrix Sum = new Matrix();
        
        A.setCell(0, 0, 2);
        A.setCell(0, 1, 4);
        A.setCell(0, 2, 6);
        A.setCell(0, 3, 8);
        
        A.setCell(1, 0, 3);
        A.setCell(1, 1, 6);
        A.setCell(1, 2, 9);
        A.setCell(1, 3, 12);
        
        A.setCell(2, 0, 4);
        A.setCell(2, 1, 8);
        A.setCell(2, 2, 16);
        A.setCell(2, 3, 24);
        
        A.setCell(3, 0, 5);
        A.setCell(3, 1, 10);
        A.setCell(3, 2, 15);
        A.setCell(3, 3, 20);
        A.displayMatrix();
        System.out.println();
        
        B.setCell(0, 0, 6);
        B.setCell(0, 1, 12);
        B.setCell(0, 2, 18);
        B.setCell(0, 3, 24);
        
        B.setCell(1, 0, 7);
        B.setCell(1, 1, 14);
        B.setCell(1, 2, 21);
        B.setCell(1, 3, 28);
        
        B.setCell(2, 0, 8);
        B.setCell(2, 1, 16);
        B.setCell(2, 2, 24);
        B.setCell(2, 3, 32);
        
        B.setCell(3, 0, 9);
        B.setCell(3, 1, 18);
        B.setCell(3, 2, 27);
        B.setCell(3, 3, 36);
        B.displayMatrix();
        System.out.println();
        
        Sum.addMatrices(A, B);
        Sum.displayMatrix();
    }
}
