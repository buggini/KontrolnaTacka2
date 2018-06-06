package providers;

import java.util.ArrayList;
import java.util.List;

import model.Filmovi;
import model.Glumac;

public class GlumacProvider {



    public static List<Glumac> getGlumac (){


        Filmovi filmovi1 = new Filmovi(0,"Mi nismo Andjeli");
        Filmovi filmovi2 = new Filmovi(1,"Rane");

        List<Glumac> glumac = new ArrayList<>();

        glumac.add(new Glumac(0,"Nikola","Djuricko", "Rodjen na selu","NikolaDjuricko.jpeg", 4.0f, null,null ));
        glumac.add(new Glumac(1,"Nikola","Kojo", "Rodjen u Nisu","NikolaKojo.jpeg", 4.5f, null,null ));
        return glumac;

    }
    public static List<String> getGlumacNames(){

        List<String> names = new ArrayList<>();
        names.add("Nikola Djuricko");
        names.add("Nikola Kojo");
        return names;

    }
    public static Glumac getGlumacById(int id){

        Filmovi filmovi1 = new Filmovi(0,"Mi nismo Andjeli");
        Filmovi filmovi2 = new Filmovi(1,"Rane");

        switch (id){
            case 0:
                return new Glumac(0,"Nikola","Djuricko", "Rodjen na selu","NikolaDjuricko.jpeg", 4.0f, null,null);

            case 1:
                return new Glumac(1,"Nikola","Kojo", "Rodjen u Nisu","NikolaKojo.jpeg", 4.5f, null,null);
            default:
                return null;
        }
    }
}
