package com.bridglabz;


public class Maximum {
    public <E extends Comparable> E checkMax(E[] array) {
        if (array[0].compareTo(array[1]) > 0 && array[0].compareTo(array[2]) > 0) {
            return array[0];
        } else if (array[1].compareTo(array[0]) > 0 && array[1].compareTo(array[2]) > 0) {
            return array[1];
        } else {
            return array[2];
        }
    }


}
