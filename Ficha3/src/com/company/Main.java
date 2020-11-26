package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char lowerSucessor = CharacterUtilities.lowerLetterSuccessorOf('a');
        System.out.println("carater é: " + lowerSucessor);

        char lowerPredecessor = CharacterUtilities.lowerLetterPredecessorOf('b');
        System.out.println("carater anterio é: " + lowerPredecessor);

        char lowerSteps = CharacterUtilities.lowerLetterSuccesorStepsOf('c', 1);
        System.out.println("carater pretendido: " + lowerSteps);

        char lowerPredecessorSteps = CharacterUtilities.lowerLetterPredecessorStepsOf('d', 1);
        System.out.println("carater pretendido: " + lowerPredecessorSteps);

        char array[] = {'a','b', 'c', 'd'};
        char array2[] = {'e','f', 'g', 'h'};

        int occurrences = CharacterUtilities.occurrencesOfCharacterIn(array, 'a');
        System.out.println("resultado é:" + occurrences);

        char[] replace = CharacterUtilities.replaceCharacterIn(array, 'f', 'g');
        System.out.println(replace);

        char[] concatenatiom = CharacterUtilities.concatenationOf(array, array2);
        System.out.println(concatenatiom);

        char[] copy = CharacterUtilities.copyOfPartOf(array, 1,2);
        System.out.println(copy);

        String cipher = CaesarCipherDecipherer.cipher("dsadsa", 1);
        System.out.println(cipher);

        String decipher = CaesarCipherDecipherer.decipher(cipher, 1);
        System.out.println(decipher);
    }
}
