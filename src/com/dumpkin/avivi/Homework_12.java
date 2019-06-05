//        Написати програму яка створює List<Integer> ints
//        Наповнити список 10-ма довільними числами
//        Створити новий список List<Integer> doubledInts
//        Перенести кожне друге подвоїне число (х2) до нового списку
//        Вивести в консоль перший список. Другий список в зворотньому порядку

package com.dumpkin.avivi;


import com.dumpkin.avivi.work.MyArray;


public class Homework_12 {

    public static void main(String[] args) {
        System.out.println("Homework #12 colections");


        MyArray array = new MyArray();
        System.out.println(" generate new list ");

        array.generate();
        System.out.println(" view list ");
        array.view();
    }
}
