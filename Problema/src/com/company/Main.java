package com.company;

public class Main {

    public static void main(String[] args) {
        final int[] studentsNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms ={ "AD", "WEB-FE", "WEB-BE" };
        final int[][] studentGrades = {
                {15, 18, 17},
                {18, 10, 11},
                {11, 13, 15},
                {10, 19, 16}};

        float max = 0;
        int index = -1;

        for(int i=0; i<studentsNumbers.length; i++){
            float media = 0;

            System.out.println("Numero" + studentsNumbers[i]);

        for(int j=0; j<courseAcronyms.length; j++){
            System.out.println(courseAcronyms[j] + ": " + studentGrades[i][j]);
            media+=studentGrades[i][j];
        }
        media/= courseAcronyms.length;
            System.out.println("A media é: " + media);
            if(media>max){
                max = media;
                index = i;
        }
    }
        System.out.println(studentsNumbers[index] + ":  " + max);
    }
}

