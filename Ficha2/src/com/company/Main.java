package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 3;
	    increment(n);
        System.out.println(n);

        int[] numbers = {1, 2, 3, 4};
        incrementFirstOf(numbers);
        System.out.println(numbers[0]);

        //CIFRA DE CESAR
        System.out.println(cipher("a,b,c", 1));

        //DISCIFRAR
        System.out.println(discipher("b,c,d", 1));

        // ---------------------------------------------------- //

    }

    private static void increment(int n) {
        System.out.println(n);
        n++;
        System.out.println(n);
    }

    private static void incrementFirstOf(int[] numbers) {
        numbers[0] = 100;
    }

    private static String cipher (String msg, int offset){
        String cipher = "";
        for(int i=0; i < msg.length(); i++){
            char c = msg.charAt(i);
            int code = (int) c;
            code += offset;
            char cx = (char) code;
            cipher += cx;
        }
        return cipher;
    };

    private static String discipher (String msg, int offset){
        String discipher = "";
        for(int i=0; i < msg.length(); i++){
            char c = msg.charAt(i);
            int code = (int) c;
            code -= offset;
            char cx = (char) code;
            discipher += cx;
        }
        return discipher;
    };
    // ---------------------------------------------------- //
}
