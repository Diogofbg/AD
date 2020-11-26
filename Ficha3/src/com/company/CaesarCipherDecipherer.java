package com.company;

public class CaesarCipherDecipherer {

    public static String cipher(String nome, int offset) {
        String cipher = "";
        for (int i = 0; i < nome.length() ; i++) {
            char n = nome.charAt(i);
            int codigo = (int) n;
            codigo += offset;
            char no = (char) codigo;
            cipher += no;
        }
        return cipher;
    }
    public static String decipher(String nome, int offset) {
        String decipher = "";
        for (int i = 0; i < nome.length() ; i++) {
           decipher = cipher(nome, -offset);
        }
        return decipher;
    }
}
