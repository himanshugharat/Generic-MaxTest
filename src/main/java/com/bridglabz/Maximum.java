package com.bridglabz;


public class Maximum <E extends Comparable>{
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] array;
    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public Maximum(E[] array) {
        this.array=array;
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


}
