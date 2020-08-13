package com.bridglabz;


public class Maximum {
    public Integer checkMaxInteger(Integer[] Integerarray) {
        if (Integerarray[0].compareTo(Integerarray[1]) > 0 && Integerarray[0].compareTo(Integerarray[2]) > 0) {
            return Integerarray[0];
        } else if (Integerarray[1].compareTo(Integerarray[0]) > 0 && Integerarray[1].compareTo(Integerarray[2]) > 0) {
            return Integerarray[1];
        } else {
            return Integerarray[2];
        }
    }

    public Float checkMaxFloat(Float[] floatarray) {
        if (floatarray[0].compareTo(floatarray[1]) > 0 && floatarray[0].compareTo(floatarray[2]) > 0) {
            return floatarray[0];
        } else if (floatarray[1].compareTo(floatarray[0]) > 0 && floatarray[1].compareTo(floatarray[2]) > 0) {
            return floatarray[1];
        } else {
            return floatarray[2];
        }
    }
    public String checkMaxString(String[] stringarray) {
        if (stringarray[0].compareTo(stringarray[1]) > 0 && stringarray[0].compareTo(stringarray[2]) > 0) {
            return stringarray[0];
        } else if (stringarray[1].compareTo(stringarray[0]) > 0 && stringarray[1].compareTo(stringarray[2]) > 0) {
            return stringarray[1];
        } else {
            return stringarray[2];
        }
    }
}
