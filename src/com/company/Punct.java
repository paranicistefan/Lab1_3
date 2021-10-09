package com.company;

public class Punct {
    private int x;
    private int y;
    Punct()
    {
        x=y=0;
    }
    Punct(int _x,int _y)
    {
        this.x=_x;
        this.y=_y;
    }

    public String toString()
    {
        return "("+x+","+y+")";
    }
    public double distanta(Punct P)
    {
        int qx=P.x;
        int qy=P.y;
        return Math.sqrt(Math.pow(x-qx,2)+Math.pow(y-qy,2));
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
