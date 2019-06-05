package com.dumpkin.avivi.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyArray implements Let {

    private List<Integer> ints = new ArrayList<Integer>();

    public void generate() {
        // clear list if it has some values;
        ints.clear();
       //generate new values
        for (int a = 0; a < 10; a++) {
            Random r = new Random();
            ints.add(r.nextInt() / 1000);
        }
    }

    public void view() {

        for (Integer item : ints) {
            System.out.println(item);
        }
    }
};


