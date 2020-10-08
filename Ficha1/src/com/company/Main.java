package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int perimeter = calcularPerimetro(2, 4);
        System.out.println("O perimetro do retangulo é : " + perimeter);

        int volume = calcularVolume(3, 4, 5);
        System.out.println("O volume do paralelepipedo é : " + volume);

        double temp = calcularTemp (120);
        System.out.println("O valor em celsius é : " + temp);

        int valor = calcularSegundos (6,18,30);
        System.out.println("Em segundos é : " + valor);

        int [] array = {5,5,2,3};
        int maximum = calcularMaximo (array);
        int minimum = calcularMinimo (array);
        int media = calcularMedia (array);
        System.out.println("Maximo é : " + maximum);
        System.out.println("Minimo é : " + minimum);
        System.out.println("Media é : " + media);
    }

    // calcular perimetro
    private static int calcularPerimetro(int base, int altura) {
        int perimeter = 2 * (base + altura);
        return perimeter;
    }

    // calcular volume
    private static int calcularVolume(int comprimeto, int largura, int altura) {
        int volume = (comprimeto * largura * altura);
        return volume;
    }

    //converter de farenheit para celsius
    private static double calcularTemp(double graus) {
        double temp = (graus - 32)*5/9;
        return temp;
    }

    //Passar de horas para segundos;
    private static int calcularSegundos(int horas, int minutos, int segundos) {
        int valor = (horas * 3600) + (18*60) + segundos;
        return valor;
    }

    //Ver maximo de um array
    private static int calcularMaximo(final int[] array) {
        int maximum = array[0];
        for (int i = 1; i != array.length; i++)
            if(maximum < array[i])
                maximum = array[i];
        return maximum;
    }

    //Ver o minimo do array
    private static int calcularMinimo(final int[] array) {
        int minimum = array[0];
        for (int i = 1; i != array.length; i++)
            if(minimum > array[i])
                minimum = array[i];
        return minimum;
    }

    //Ver a media do array
    private static int calcularMedia(final int[] array) {
        int media = 0;
        int total = 0;
        for (int i = 0; i != array.length; i++)
            total += array[i];
            media = total/array.length;
        return media;
    }


}




