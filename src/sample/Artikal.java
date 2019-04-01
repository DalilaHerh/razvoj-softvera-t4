package sample;

import java.util.ArrayList;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;

    public Artikal() {

    }


    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                sifra + ',' +
                naziv + ',' +
                cijena +
                '}';
    }

    public Artikal(String podatak)
    {
        String [] artikal = podatak.split (",");
        sifra = artikal[0];
        naziv = artikal[1];
        cijena = Double.parseDouble(artikal[2]);
    }

    public boolean equals(Object o)
    {
        Artikal artikal = (Artikal) o;
        Artikal a = (Artikal) o;
        if(this == o) return true;
        if(naziv.equals(a.getNaziv())) return false;
        //onda commit

    }

    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli)
    {
     for (int i=0; i<artikli.size(); i++)
     {
         for(int j=i+1; j<artikli.size(); j++)
         {
             if(artikli.get(i).equals(artikli.get(j))) artikli.remove(j);

     }
    }
     return artikli;
}
