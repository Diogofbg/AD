package com.company;

public class Main {

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int matrix2[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int matrixIdentify[][] = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        String show = MatrixUtilities.show(matrix);
        System.out.println(show);

        boolean isMatrix = MatrixUtilities.isMatrix(matrix);
        System.out.println(isMatrix);

        boolean isIdentity = MatrixUtilities.isIdentity(matrixIdentify);
        System.out.println(isIdentity);

        int number = 2;
        int[][] multiplyBy = MatrixUtilities.multiplyBy(matrix, number);
        String multiply = MatrixUtilities.show(multiplyBy);
        System.out.println(multiply);

        boolean areCompatibleForSum = MatrixUtilities.areCompatibleForSum(matrix, matrix2);
        System.out.println(areCompatibleForSum);

        int[][] sumOf = MatrixUtilities.sumOf(matrix, matrix2);
        System.out.println(sumOf);


        CharacterDrawingUtilities.drawElement('a');

        CharacterDrawingUtilities.drawNewLine();

        CharacterDrawingUtilities.drawHorizontalSegmentWith('+', 5);

        CharacterDrawingUtilities.drawFilledRectangleWith('+', 5, 10);

        CharacterDrawingUtilities.drawEmptyRectangleWith('+', 10, 5);

    }

    
}
