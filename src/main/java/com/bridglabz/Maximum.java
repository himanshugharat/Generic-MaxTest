package com.bridglabz;

import java.lang.reflect.Array;
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

    public E checkMaxParameters() {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(secondValue) > 0) {
            return firstValue;
        } else if (secondValue.compareTo(firstValue) > 0 && secondValue.compareTo(thirdValue) > 0) {
            return secondValue;
        } else {
            return thirdValue;
        }
    }
    public E checkMax() {
        if (array[0].compareTo(array[1]) > 0 && array[0].compareTo(array[2]) > 0) {
            return array[0];
        } else if (array[1].compareTo(array[0]) > 0 && array[1].compareTo(array[2]) > 0) {
            return array[1];
        } else {
            return array[2];
        }
    }
    public E printMax(int parameter) {
        if (parameter <= 3)
            checkMax();
        else {
            Arrays.sort(array);
        }
        max=array[0];
        if (max.compareTo(array[array.length - 1]) < 0)
            max = array[array.length - 1];

        return max;
    }



}


