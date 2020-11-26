package com.company;

    public class ArrayUtilities {

        public static String toString(int[] array) {
            String s = "[";
            for (int i = 0; i < array.length; i++) {
                s += array[i] + ",";

            }
            s += "]";
            return s;
        }

        public static int maximumOf(int[] array) {
            int resultado = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > resultado) {
                    resultado = array[i];
                }
            }
            return resultado;
        }

        public static int minimumOf(int[] array) {
            int resultado = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < resultado) {
                    resultado = array[i];
                }
            }
            return resultado;
        }

        public static int[] copyOf(int[] array) {
            int[] copy = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            return copy;
        }

        public static boolean contains(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value)
                    return true;
            }
            return false;
        }

        public static boolean containsDuplicates(int[] array) {
            int[] aux = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if (contains(aux, value)) {
                    return true;
                }
                aux[i] = value;
            }
            return false;
        }

        public static int indexOf(int[] array, int value) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value)
                    return i;
            }
            return -1;
        }

        public static int[] add(int[] array, int value) {
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            newArray[array.length] = value;
            return newArray;
        }

        public static int[] remove(int[] array, int value) {
            int index = indexOf(array, value);
            if (index == -1) {
                return array;
            } else {
                int newArray[] = new int[array.length - 1];
                for (int i = 0; i < array.length; i++) {
                    if (i < index) {
                        newArray[i] = array[i];
                    } else if (i > index) {
                        newArray[i - 1] = array[i];
                    }
                }
            }
        }
    }
