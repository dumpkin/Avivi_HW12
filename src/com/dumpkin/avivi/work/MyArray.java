//вся логыка тут

package com.dumpkin.avivi.work;

import java.util.*;

public class MyArray implements Let {

    private List<Integer> ints = new ArrayList<Integer>();
    private List<Integer> doubleints = new LinkedList<>();

    public void generate() {
        // clear list if it has some values;
        ints.clear();
        //generate new values
        for (int a = 0; a < 10; a++) {
            Random r = new Random();
            ints.add(r.nextInt() / 1000);
        }
        // second list generates empty
        doubleints.clear();
    }

    private void show(List<Integer> inner) {

        for (Integer item : inner) {
            System.out.println(item);
        }
    }

    public void view() {
        System.out.println("First List has:\n");
        show(getInts());
        System.out.println("second List has:\n");
        show(getDoubleints());

        System.out.println("________________________________________\n" +
                "send 2x multiple values to second list\n" +
                "________________________________________");
        sendToAnother();
        System.out.println("doubled list is: \n");
        show(doubleints);
        System.out.println("==========================================\n\n");

        System.out.println("reversed doubled list is: \n");
        showreversed(doubleints);
    }


    public List<Integer> getInts() {
        return ints;
    }

    public List<Integer> getDoubleints() {
        return doubleints;
    }

    //send double values from one List to another
    void sendToAnother() {

        for (Integer item : ints) {
            doubleints.add(item * 2);
        }
    }

    void showreversed(List<Integer> list) {
        Collections.reverse(list);
        System.out.println("_____________________________\n        Reversed\n");
        show(list);
    }
}


