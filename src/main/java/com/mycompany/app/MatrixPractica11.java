package com.mycompany.app;

public class MatrixPractica11 extends Matrix {
    public MatrixPractica11(int rows, int cols){
        super(rows, cols);
    }
    
    public MatrixPractica11 sumColumns(){
        MatrixPractica11 newMatrix = new MatrixPractica11(6, cols);
        System.out.println(rows + 1);
        for(int col = 0; col < cols; col++){
            double sum = 0;
            // System.out.println("printing col " + (col + 1));
            for(int row = 0; row < rows; row++){
                newMatrix.set(row, col, data[row][col]);
                System.out.println(newMatrix.get(row, col));
                sum = sum + data[row][col];
            }
            newMatrix.set(5, col, sum);
            // System.out.println("data[" + (newMatrix.rows - 1) + "][" + col + "]");
        }
        // System.out.println(this);
        System.out.println(newMatrix);
        return newMatrix;
    }
}
