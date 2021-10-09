package com.company;

public class Main {

    public static void main(String[] args) {
        EcuatieGrad1 ex= new EcuatieGrad1(3,0);
        System.out.println("Ecuatia este :"+ ex);
        System.out.println("Rezultatul este :"+ex.rezolva());
        Punct p = new Punct(2,3);
        System.out.println("Punctul este :"+ p);
        System.out.println("DIstanta fata de origine:"+p.distanta(new Punct()));
        Poligon plg = new Poligon();
        System.out.println("Varfurile poligonului sunt :"+ plg);
        System.out.println("Perimetrul poligonului este :"+ plg.perimetru());
    }
}
