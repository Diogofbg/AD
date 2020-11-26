package com.company;

import static java.lang.Character.*;

public class CharacterUtilities {
    public static char lowerLetterSuccessorOf(char character) {
        char lower = toLowerCase(character);
        if(lower == 'z'){
            return 'a';
        }
        int characterCode = (int) lower;
        int newCharacterCode = characterCode + 1;
        char newCharacter = (char) newCharacterCode;
        return newCharacter;
    }

    public static char lowerLetterPredecessorOf(char character) {
        char lower = toLowerCase(character);
        if(lower == 'a'){
            return 'z';
        }
        int characterCode = (int) lower;
        int newCharacterCode = characterCode - 1;
        char newCharacter = (char) newCharacterCode;
        return newCharacter;
    }

    public static char lowerLetterSuccesorStepsOf(char character, int number) {
        char newCharacter = character;
        for (int i = 0; i < number ; i++) {
            newCharacter = lowerLetterSuccessorOf(newCharacter);
        }
        return newCharacter;
    }

    public static char lowerLetterPredecessorStepsOf(char character, int number) {
        char newCharacter = character;
        for (int i = 0; i < number ; i++) {
            newCharacter = lowerLetterPredecessorOf(newCharacter);
        }
        return newCharacter;
    }

    public static int occurrencesOfCharacterIn(char[] array, char character) {
        int resultado = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == character) {
                resultado += 1;
            }
        }
        return resultado;
    }

    public static char[] replaceCharacterIn(char[] array, char character, char character2) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == character) {
                array[i] = character2;
            }
        }
        return array;
    }

    public static char[] concatenationOf(char[] array, char[] array2) {
        int indice = 0;
        char[] newArray = new char[array.length + array2.length];
        for (int i = 0; i < array.length ; i++) {
            newArray[indice] = array[i];
            indice++;
        }
        for (int t = 0; t < array2.length ; t++) {
            newArray[indice] = array2[t];
            indice++;
        }
        return newArray;
    }

    public static char[] copyOfPartOf(char[] array, int indice, int indice1) {
        char[] newArray = new char[array.length];
        for (int i = indice; i <= indice1 ; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
