package com.company;

public class EcuatieGrad1 {
    private int a;
    private int b;
    EcuatieGrad1(int _a,int _b)
    {
        this.a=_a;
        this.b=_b;
    }
    public String toString()
    {
        return a+"x+"+b+"=0";
    }

    public double rezolva()
    {
        return -b* 1.0 /a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
