package com.company;

public class MyFloat {

    private long mantissa;
    private long exponent;
    private int i;

    public MyFloat(long mantissa, long exponent) {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }

    public void raznost(MyFloat b) {
        long mant = this.mantissa;
        long mant2 = b.mantissa;
        long expon = Math.max(this.exponent, b.exponent);
        long rezult = 0;
        if (this.exponent > b.exponent) {
            mant2 = mant2 * (long) Math.pow(10, this.exponent - b.exponent);
        } else if (b.exponent > this.exponent) {
            mant = mant * (long) Math.pow(10, b.exponent - this.exponent);
        }
            rezult = mant2 - mant;

        char[] dot = Long.toString(rezult).toCharArray();
        for (int i = 0; i < (dot.length - exponent); ++i) {
            System.out.println(dot[i]);
        }
        System.out.print(",");
        for(int i = (dot.length - (int) exponent); i < dot.length; ++i);
        {
            System.out.print(dot[i]);

        }
    }
}




