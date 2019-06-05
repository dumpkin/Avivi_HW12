package com.dumpkin.avivi.work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
    }


    public List<Integer> getInts() {
        return ints;
    }

    public List<Integer> getDoubleints() {
        return doubleints;
    }
}


