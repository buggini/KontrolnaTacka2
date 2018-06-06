package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Glumac {

    private int id;
    private String ime;
    private String prezime;
    private String biografija;
    private String fotografija;
    private float ocenaRating;
    private Date datumRodjenja;
    private Date datumSmrti;
    private List <Filmovi> filmoviList;
    private Filmovi filmovi;

    public Glumac(){

          filmoviList =  new ArrayList<>();
    }

    public Glumac(int id, String ime, String prezime, String biografija, String fotografija, float ocenaRating, Date datumRodjenja, Date datumSmrti) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.biografija = biografija;
        this.fotografija = fotografija;
        this.ocenaRating = ocenaRating;
        this.datumRodjenja = datumRodjenja;
        this.datumSmrti = datumSmrti;

        filmoviList =  new ArrayList<>();
    }

    public Filmovi getFilmovi() {
        return (Filmovi) filmovi;
    }

    public void setFilmovi(Filmovi filmovi) {
        this.filmovi = (Filmovi) filmovi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public String getFotografija() {
        return fotografija;
    }

    public void setFotografija(String fotografija) {
        this.fotografija = fotografija;
    }

    public float getOcenaRating() {
        return ocenaRating;
    }

    public void setOcenaRating(float ocenaRating) {
        this.ocenaRating = ocenaRating;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public Date getDatumSmrti() {
        return datumSmrti;
    }

    public void setDatumSmrti(Date datumSmrti) {
        this.datumSmrti = datumSmrti;
    }
    public float getRating() {
        return ocenaRating;
    }

    @Override
    public String toString() {
        return "Glumac{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", biografija='" + biografija + '\'' +
                ", fotografija='" + fotografija + '\'' +
                ", ocenaRating=" + ocenaRating +
                ", datumRodjenja=" + datumRodjenja +
                ", datumSmrti=" + datumSmrti +
                ", filmovi=" + filmovi +
                '}';
    }
}
