package com.bridglabz;



public class Maximum {
    int max=0;
    public Integer checkMaxInteger(Integer[] Integerarray) {
        if(Integerarray[0].compareTo(Integerarray[1])>0 && Integerarray[0].compareTo(Integerarray[2])>0){
            return Integerarray[0];
        }
        else if(Integerarray[1].compareTo(Integerarray[0])>0 && Integerarray[1].compareTo(Integerarray[2])>0) {
            return Integerarray[1];
        }
        else{
            return Integerarray[2];
        }
    }
}
