package com.mycompany.app;

import java.util.Random;

public class Practica11 {

    // Desarrolla una aplicación para llenar una matriz de 5 x 10 con números
    // aleatorios y calcule la suma
    // y promedio por cada fila y por cada columna y lo almacene en un arreglo de la
    // siguiente manera:

    // a) La suma de la primera fila se almacenará en la primera posición del
    // arreglo A y el promedio en la primera
    // posición del arreglo B y así sucesivamente.
    // b) La suma de la primera columna se almacenará en la primera posición del
    // arreglo C y el promedio en la
    // primera posición del arreglo D.
    // c) Imprimir la matriz y los resultados con el siguiente formato:

    Matrix matrix = new Matrix(7, 12);

    Practica11() {
        // matrix.generateRandomCellValues();
        // matrix = matrix.sumColumns();
        // System.out.println(matrix.get(5, 0));
    }

    public Matrix sumColumns() {
        MatrixPractica11 newMatrix = new MatrixPractica11(6, matrix.cols);
        System.out.println(matrix.rows + 1);
        for (int col = 0; col < matrix.cols; col++) {
            double sum = 0;
            // System.out.println("printing col " + (col + 1));
            for (int row = 0; row < matrix.rows; row++) {
                newMatrix.set(row, col, matrix.data[row][col]);
                System.out.println(newMatrix.get(row, col));
                sum = sum + matrix.data[row][col];
            }
            newMatrix.set(5, col, sum);
            // System.out.println("data[" + (newMatrix.rows - 1) + "][" + col + "]");
        }
        // System.out.println(this);
        System.out.println(newMatrix);
        return newMatrix;
    }

    public void calculateRowCD(){
        Matrix newMatrix = new Matrix(matrix.rows, matrix.cols);
        
        for(int col = 0; col < matrix.cols; col++){
            double sum = 0;
            for(int row = 0; row < matrix.rows; row++){
                if(col > 9){
                    break;
                }
                
                if(row < 5){
                    sum = sum + matrix.data[row][col];
                }

                if(row == 5){
                    matrix.data[row][col] = sum;
                    matrix.data[row][10] = 0;
                    matrix.data[row][11] = 0;
                }

                if(row == 6){
                    matrix.data[row][col] = sum / 5;
                    matrix.data[row][10] = 0;
                    matrix.data[row][11] = 0;
                }
            }
        }
    }

    public void calculateColumnAB() {
        Matrix newMatrix = new Matrix(matrix.rows, matrix.cols);

        for (int row = 0; row < matrix.rows; row++) {
            double sum = 0;
            for(int col = 0; col < matrix.cols; col++){
                if(col < 10){
                    Random rand = new Random();
                    int randNum = rand.nextInt(10) + 1;
                    sum = sum + randNum;
                    newMatrix.set(row, col, randNum);
                }
                if(col == 10) newMatrix.set(row, col, sum);
                if(col == 11) {
                    double average = sum / 10;
                    newMatrix.set(row, col, average);
                }
            }
        }
        System.out.println(newMatrix);
        matrix = newMatrix;
    }

    public void render(UI ui) {
    }
}
