package sample;

import java.util.ArrayList;

public class Racun {
    private final ArrayList<Object> stavke;

    private class Stavka{
        private Artikal artikal;
        private int kolicina;

        public Stavka(Artikal artikal, int kolicina) {
            this.artikal = artikal;
            this.kolicina = kolicina;

        }

        public Artikal getArtikal() {
            return artikal;
        }

        public void setArtikal(Artikal artikal) {
            this.artikal = artikal;
        }

        public int getKolicina() {
            return kolicina;
        }

        public void setKolicina(int kolicina) {
            this.kolicina = kolicina;
        }
    }


    public Racun() {
        this.stavke = new ArrayList<>()
    }


    public void dodajStavku(Artikal artikal, int kolicina){
        Stavka tavka = new Stavka(artikal, kolicina);
        Object stavka;
        stavke.add(stavka);

    }
    public double ukupanIznos(){
        double iznos = 0;
        for(Stavka stavka : stavke){
            iznos = iznos + stavka.getArtikal().getCijena() * stavka.getKolicina();
        }
        return  0;
    }

    @Override
    public String toString() {
        String outout = "";
        for(Stavka stavka : stavke){
            Object output = output + stavka.getArtikal();
        }
        return "Racun{}";
    }
}
