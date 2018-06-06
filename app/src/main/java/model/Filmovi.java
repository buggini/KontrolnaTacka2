package model;

import java.util.ArrayList;
import java.util.List;

public class Filmovi {

    private int id;
    private String nazivFilma;
    private List<Glumac> glumac;


    public Filmovi(){

         glumac = new ArrayList<>();
    }

    public Filmovi(int id, String nazivFilma) {
        this.id = id;
        this.nazivFilma = nazivFilma;

        glumac = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public void addGlumac(Glumac glumac) {

        this.glumac.add(glumac);
    }

    public void removeGlumac(Glumac glumac) {

        this.glumac.remove(glumac);
    }



    @Override
    public String toString() {
        return  nazivFilma;

    }
}
