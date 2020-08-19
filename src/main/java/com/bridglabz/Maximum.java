package com.bridglabz;

import java.util.Arrays;

public class Maximum<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] array;
    E max;

    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;

    }

    public Maximum(E[] array) {
        this.array = array;
    }


    public E printMax() {
        System.out.println("The max element is"+max);
        return checkMax();
    }

    public E checkMax() {
        Arrays.sort(array);
        max = array[0];
        if (max.compareTo(array[array.length - 1]) < 0)
            max = array[array.length - 1];
        return max;
    }


}


