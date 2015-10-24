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
public class Matrix {
    final int SIZE = 4;
	private int [] [] squares = new int [SIZE] [SIZE];
	public Matrix() {}

public void setCell(int a, int b, int sum){
	this.squares[a] [b] = sum;
}

public void addMatrices(Matrix c, Matrix d){
  int a;
  int b;
  for (a=0; a < SIZE; a++) {
  	for ( b=0; b < SIZE; b++) {
  squares[a][b] = c.getCell(a,b) + d.getCell(a,b);
  	}
  }
}

public int getCell (int a, int b){
	return this.squares[a] [b];
}

public void displayMatrix() {
	int a, b;
	for (a=0; a < SIZE; a++) {
  	for ( b=0; b < SIZE; b++) 
  		showCell (a, b);
        System.out.println("");
  }

  System.out.println ("");
}

public void showCell (int a, int b) {
	System.out.print( squares[a] [b] + " ");
}
}
