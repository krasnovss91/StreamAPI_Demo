package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Collections.addAll(integerArrayList,4,3,2,0,2,3,1,5,6,3,8);

        integerArrayList.stream().distinct().sorted().filter(s -> s % 2 == 0).forEach(s -> System.out.println(s));
    }
}
