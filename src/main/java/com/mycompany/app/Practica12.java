package com.mycompany.app;

public class Practica12 {
    /*
    La siguiente tabla es un resumen de ventas en donde las filas representan meses del año y las 
    columnas representan días de la semana,  realiza lo siguiente:   
    a) Declara e inicializa un arreglo con esa información.   
    b) Imprime la menor venta realizada y el mes y día en que fue hecho  
    c) Imprime la mayor venta realizada y el mes y día en que fue hecho.   
    d) Imprime la venta total.   
    e) Imprime la venta por día, es decir la suma de las ventas durante los doce meses por cada día de la 
    semana. Ej. Lunes: $ X.00, Martes: $X.00, etc. 
    
    //           Lunes    Martes   Miercoles   JUeves    Viernes   Sabado    Domingo
    // Enero    
    // Febrero
    // Marzo
    // Abril
    // Mayo
    // Junio
    // 
    */

    Matrix matrix;

    public void run(){

        int months = 12;
        int days = 5;
        
        String[] dayName = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        String[] monthName = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}
        
        double tables[][] = {
            {5, 16, 10, 12, 24},
            {40, 55, 10, 11, 18},
            {15, 41, 78, 14, 51},
            {35, 22, 81, 15, 12},
            {50, 12, 71, 10, 20},
            {70, 40, 60, 28, 22},
            {50, 50, 50, 36, 25},
            {40, 70, 40, 11, 20},
            {20, 20, 30, 12, 18},
            {10, 40, 32, 13, 16},
            {50, 3, 24, 15, 82},
            {40, 46, 15, 46, 22},
        };
        
        int smallestNumberDay = 0;
        int smallestNumberMonth = 0;
        
        for(int m = 0; m < months; m++){
            for(int d = 0; d < days; d++){

            }
        }
        
        Matrix newMatrix = new Matrix(months, days);
        newMatrix.data = tables;
        matrix = newMatrix;

        System.out.println(matrix);
    }
    // Matrix tables = new Matrix(0, 0)
}
