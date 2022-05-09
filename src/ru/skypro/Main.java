package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main ( String[] args ) {
        IntegerListRealisation myArray = new IntegerListRealisation();

        myArray.add(2);
        myArray.add(24);
        myArray.add(-67);
        myArray.add(28);
        myArray.removeIndex(0);
        System.out.println(myArray.toString());
        System.out.println(myArray.contains(2));
        System.out.println(myArray.contains(28));
        System.out.println(myArray.arrayInt.length);
        myArray.grow();
        System.out.println(myArray.arrayInt.length);
        int[] someArr = IntegerListRealisation.generateRandomArray();
        IntegerListRealisation.quickSort(someArr,0,someArr.length-1);
        System.out.println(Arrays.toString(someArr));
//        Код Сравнения времени сортировок

//        long minSortTime = 100_000;
//        int minSortIndex = 0;
//        for (int i = 1; i < 4; i++) {
//            int[] randomArray = IntegerListRealisation.generateRandomArray();
//            int[] randomArrayCopyOne = Arrays.copyOf(randomArray, randomArray.length);
//            int[] randomArrayCopyTwo = Arrays.copyOf(randomArray, randomArray.length);
//            long currentTime = IntegerListRealisation.sortTime(i, randomArray, randomArrayCopyOne, randomArrayCopyTwo);
//            if (currentTime < minSortTime) {
//                minSortTime = currentTime;
//                minSortIndex = i;
//            }
//        }
//        System.out.println(
//                "Минимальное время сортировки: " + minSortTime +
//                        "\nИндекс минимальной сортировки: " + minSortIndex);

    }
}
