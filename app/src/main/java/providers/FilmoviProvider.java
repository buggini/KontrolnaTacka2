package providers;

import java.util.ArrayList;
import java.util.List;

import model.Filmovi;

public class FilmoviProvider {

        public  static List<Filmovi> getFilm(){

            List<Filmovi> filmovi = new ArrayList<>();
            filmovi.add(new Filmovi(0, "Rostilj"));
            filmovi.add(new Filmovi(1, "Kuvana Jela"));
            return filmovi;
        }

        public static List<String> getFilmNames(){
            List<String> names = new ArrayList<>();
            names.add("Mi nismo Andjeli");
            names.add("Rane");
            return names;

        }
        public static Filmovi getFilmoviById(int id){

            switch (id){
                case 0:
                    return new Filmovi(0, "Mi nismo Andjeli");
                case 1:
                    return new Filmovi(1, "Rane");
                default:
                    return null;
            }
        }
    }


