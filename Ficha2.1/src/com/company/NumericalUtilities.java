package com.company;

public class NumericalUtilities {
    public static int powerOf(int base, int exp) {
        int total =1;
        for(int i=0; i < exp; i++){
            total *= base;
        }
        return total;
    }

    public static int sumOfNaturalNumbersUpTo(int limite){
        int soma = 0;
        for(int i=0; i < limite; i++){
            soma += i;
        }
        return soma;
    }

    public static int sumOfNaturalNumbersBetween(int num1, int num2 ){
        int inter = 0;
        for(int i= num1; i<=num2; i++){
            inter += 1;
        }
        return inter;
    }

    public static int sumOfEvenNumbersBetween(int num2, int num3){
        int intervalo = 0;
        for(int i=num2; i<=num3; i++){
            if(i%2==0){
                intervalo += i;
            }
        }
        return intervalo;
    }

    public static int numberOfDivisorsOf(int dividir){
        int divisor = 0;
        for(int i=1; i<=dividir; i++){
            if(dividir%i==0){
                divisor += 1;
            }
        }
        return divisor;
    }
    public static boolean isPrime(int primo){
       return numberOfDivisorsOf(primo) == 2;
    }
}
