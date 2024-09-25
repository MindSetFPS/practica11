package com.mycompany.app;

import java.text.DecimalFormat;
import java.util.Random;

public class Matrix {
    public double[][] data;

    public int rows, cols;

    public Matrix(int rows, int cols) {
        if (rows < 1 || cols < 1) {
            throw new IllegalArgumentException("Rows and columns must be positive");
        }
        this.data = new double[rows][cols];
        this.cols = cols;
        this.rows = rows;
    }

    public void set(int row, int col, double value) {
        if (row >= 0 && row < data.length && col >= 0 && col < data[0].length) {
            data[row][col] = value;
        } else {
            throw new IndexOutOfBoundsException("Row and column indices out of bounds");
        }
    }

    public double get(int row, int col) {
        if (row >= 0 && row < data.length && col >= 0 && col < data[0].length) {
            return data[row][col];
        } else {
            throw new IndexOutOfBoundsException("Row and column indices out of bounds");
        }
    }

    public Matrix add(Matrix other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions to be added");
        }
        Matrix result = new Matrix(data.length, data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result.data[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Matrices must have compatible dimensions to be multiplied");
        }
        Matrix result = new Matrix(data.length, other.data[0].length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < data[i].length; k++) {
                    sum += data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    public void generateRandomCellValues() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                set(row, col, new Random().nextInt(100 - 1) + 1);
            }
        }
    }

    public String[][] asStringArray() {
        // Create a DecimalFormat instance to format the doubles as strings
        DecimalFormat df = new DecimalFormat("###.000");

        // Initialize the resulting 2D array of strings
        String[][] stringArray = new String[rows][cols];

        // Iterate over each element in the input array and convert it to a string
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                stringArray[i][j] = df.format(data[i][j]);
            }
        }
        return stringArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sb.append(String.format("%12.1f", data[i][j]));
            }
            if (i < data.length - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
