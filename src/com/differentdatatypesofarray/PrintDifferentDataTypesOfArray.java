package com.differentdatatypesofarray;

public class PrintDifferentDataTypesOfArray {
    public static void toPrintInteger(Integer[] Array){
        for (int i : Array){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public static void toPrintDouble(Double[] Array){
        for (double i : Array){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public static void toPrintCharacter(Character[] Array){
        for (char i : Array){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 3.2, 5.9, 4.6};
        Character[] charArray = {'K', 'U', 'N', 'D', 'A', 'N'};
        PrintDifferentDataTypesOfArray printDifferentDataTypesOfArray = new PrintDifferentDataTypesOfArray();

        printDifferentDataTypesOfArray.toPrintInteger(intArray);
        printDifferentDataTypesOfArray.toPrintDouble(doubleArray);
        printDifferentDataTypesOfArray.toPrintCharacter(charArray);

    }
}
