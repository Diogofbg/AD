package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
      int power = NumericalUtilities.powerOf(2,4);
      out.println("Resultado: " + power);

      int natural = NumericalUtilities.sumOfNaturalNumbersUpTo(3);
      out.println("Soma: " + natural);

      int intervalo = NumericalUtilities.sumOfNaturalNumbersBetween(1,5);
      out.println("Soma no intervalo: " + intervalo);

      int intervaloPares = NumericalUtilities.sumOfEvenNumbersBetween(1,5);
      out.println("Soma pares no intervalo: " + intervaloPares);

      int divisores = NumericalUtilities.numberOfDivisorsOf(3);
      out.println("Numero de divisores: " + divisores);

      boolean primos = NumericalUtilities.isPrime(10);
      out.println("Numero é primo?: " + primos);

      int[] array = {1, 2, 3, 4};
      String toString = ArrayUtilities.toString(array);
      out.println("A string é: " + toString);

      int maximum = ArrayUtilities.maximumOf(array);
      out.println("O maximo é: " + maximum);

      int minimum = ArrayUtilities.minimumOf(array);
      out.println("O maximo é: " + minimum);

      int[] copy = ArrayUtilities.copyOf(array);
      out.println("Copia do array é: " + copy);

      boolean content = ArrayUtilities.contains(array, 10);
      out.println("Verificar:" + content);

      boolean duplicates = ArrayUtilities.containsDuplicates(array);
      out.println("Verifica se:" + duplicates);

      int index = ArrayUtilities.indexOf(array, 5);
      out.println("devolução: " + index);

      int[] add = ArrayUtilities.add(array, 10);
      out.println("valor adicionado é: " + add);

      int[] remove = ArrayUtilities.remove(array, 10);
      out.println("valor removido é:" + remove);
    }
}
