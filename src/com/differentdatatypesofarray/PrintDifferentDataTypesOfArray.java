package com.differentdatatypesofarray;

public class PrintDifferentDataTypesOfArray<T> {
    private T[] Array;
    public PrintDifferentDataTypesOfArray(T[] Array){
        this.Array = Array;
    }
    public void toPrint(){
        PrintDifferentDataTypesOfArray.toPrint(this.Array);
    }
    public static <E> void toPrint(E[] Array){
        for (E element : Array){
            System.out.print(element + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 3.2, 5.9, 4.6};
        Character[] charArray = {'K', 'U', 'N', 'D', 'A', 'N'};
        PrintDifferentDataTypesOfArray printDifferentDataTypesOfArray = new PrintDifferentDataTypesOfArray(intArray);

        printDifferentDataTypesOfArray.toPrint(intArray);
        printDifferentDataTypesOfArray.toPrint(doubleArray);
        printDifferentDataTypesOfArray.toPrint(charArray);

    }

}
