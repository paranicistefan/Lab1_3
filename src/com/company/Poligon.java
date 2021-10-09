package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Poligon {

    private final List<Punct> listaPuncte;

    Poligon()
    {
        listaPuncte= new ArrayList<Punct>();
        try
        {
            File myObj = new File("d:\\Doc\\Faculta\\SDA\\Lab1_3\\src\\com\\company\\poligon.txt");
            Scanner myReader = new Scanner(myObj);
            int n = myReader.nextInt();
            while (myReader.hasNextLine()) {
                int x = myReader.nextInt();
                int y = myReader.nextInt();
                listaPuncte.add(new Punct(x, y));
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fisier indisponibil");
        }
    }

    public String toString()
    {
        StringBuilder Numere = new StringBuilder();
        for (Punct elemnt:listaPuncte) {
            Numere.append(elemnt).append(" ");
        }
        return Numere.toString();
    }

    public double perimetru()
    {
        double perimetru = 0.0;
        for (int i=1;i<listaPuncte.size();i++)
        {
            perimetru += listaPuncte.get(i).distanta(listaPuncte.get(i-1));
        }
        return perimetru;
    }
}
