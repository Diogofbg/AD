package com.company;

public class CharacterDrawingUtilities {

    public static void drawElement(char a) {
        System.out.print(a);
    }

    public static void drawNewLine() {
        System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char a, int columns) {
        for (int i = 0; i < columns ; i++) {
           drawElement(a);
        }
    }

    public static void drawFilledRectangleWith(char c, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            drawHorizontalSegmentWith(c, columns);
            drawNewLine();
        }
    }

    public static void drawHorizontalSegmentWithEmpty(char c, int columns) {
        for (int i = 0; i < columns ; i++) {
            if(i==0 || i==columns-1) {
                drawElement(c);
            }else{
                drawElement(' ');
            }
        }
    }

    public static void drawEmptyRectangleWith(char c, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            if(i == 0 || i == rows -1){
                drawHorizontalSegmentWith(c, columns);
            }else {
                drawHorizontalSegmentWithEmpty(c, columns);
            }
            drawNewLine();
        }
    }


}
