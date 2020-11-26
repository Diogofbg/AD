package com.company;

public class MatrixUtilities {

    public static String show(int[][] matrix) {
        String str = "";
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               str+= matrix[i][j] + " ";
            }
        }
        return str;
    }


    public static boolean isMatrix(int[][] matrix) {
        int columns = matrix[0].length;
        for (int i = 1; i < matrix.length ; i++) {
                if(columns != matrix[i].length){
                    return false;
                }
            }
        return true;
    }

    public static boolean isIdentity(int[][] matrixIdentify) {
        for (int i = 0; i <matrixIdentify.length ; i++) {
            for (int j = 0; j <matrixIdentify.length ; j++) {
                if(i == j && matrixIdentify[i][j] != 1) {
                    return false;
                }
                if(i!=j && matrixIdentify[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int number) {
        int novo[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                novo [i][j] = matrix[i][j] * number;
            }
        }
        return novo;
    }

    public static boolean areCompatibleForSum(int[][] matrix, int[][] matrix2) {
        if(MatrixUtilities.isMatrix(matrix) && MatrixUtilities.isMatrix(matrix2) == true){
            if(matrix.length == matrix2.length){
                return true;
            }
        }
        return false;
    }


    public static int[][] sumOf(int[][] matrix, int[][] matrix2) {
        int result[][] = new int [matrix.length][matrix[0].length];
        if(areCompatibleForSum(matrix, matrix2)){
            for (int i = 0; i < matrix.length ; i++) {
                for (int j = 0; j <matrix[i].length ; j++) {
                    result[i][j] = matrix[i][j] + matrix2[i][j];
                }
            }
        }
        return result;
    }
}
