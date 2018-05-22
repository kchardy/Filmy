package Filmy.kchardy.com.github;
/**
 * @author kchardy
 */
import java.util.*;

public class Filmy {
    /**
     * Mapa przechowywujaca stringi  i tablice stringow
     */
    private static Map<String, List<Aktor>> filmy;
    static {
        Aktor atkinson = new Aktor("Rowan Atkinson", Plec.M);
        Aktor bloom = new Aktor("Orlando Bloom", Plec.M);
        Aktor dennehy = new Aktor("Brian Dennehy", Plec.M);
        Aktor depp = new Aktor("Johnny Depp", Plec.M);
        Aktor firth = new Aktor("Colin Firth", Plec.M);
        Aktor fishburne = new Aktor("Laurence Fishburne", Plec.M);
        Aktor gibson = new Aktor("Mel Gibson", Plec.M);
        Aktor grant = new Aktor("Hugh Grant", Plec.M);
        Aktor hunt = new Aktor("Helen Hunt", Plec.K);
        Aktor keaton = new Aktor("Diane Keaton", Plec.K);
        Aktor knightley = new Aktor("Keira Knightley", Plec.K);
        Aktor linney = new Aktor("Laura Linney", Plec.K);
        Aktor mccutcheon = new Aktor("Martine McCutcheon", Plec.K);
        Aktor neeson = new Aktor("Liam Neeson", Plec.M);
        Aktor nicholson = new Aktor("Jack Nicholson", Plec.M);
        Aktor nighy = new Aktor("Bill Nighy", Plec.M);
        Aktor peet = new Aktor("Amanda Peet", Plec.K);
        Aktor reeves = new Aktor("Keanu Reeves", Plec.M);
        Aktor rickman = new Aktor("Alan Rickman", Plec.M);
        Aktor rush = new Aktor("Geoffrey Rush", Plec.M);
        Aktor stallone = new Aktor("Sylvester Stallone", Plec.M);
        Aktor thompson = new Aktor("Emma Thompson", Plec.K);
        Aktor tomei = new Aktor("Marisa Tomei", Plec.K);

        filmy = new HashMap<>();

        filmy.put("Piraci z Karaibów", Arrays.asList(depp, rush, bloom, knightley));
        filmy.put("Czego pragną kobiety", Arrays.asList(gibson, hunt, tomei));
        filmy.put("To właśnie miłość", Arrays.asList(grant, neeson, firth, linney,
                thompson, rickman, knightley, mccutcheon, nighy, atkinson));
        filmy.put("Lepiej późno niż później", Arrays.asList(nicholson, keaton, reeves, peet));
        filmy.put("Matrix", Arrays.asList(reeves, fishburne));
        filmy.put("Rambo. Pierwsza krew", Arrays.asList(stallone, dennehy));
    }

    /**
     * wypisanie zawartosci mapy w odpowiedniej kolejnosci
     */
    public static void filmoteka() {

        for (Map.Entry<String, List<Aktor>> listEntry : filmy.entrySet()) {
            System.out.print("\nW filmie pt. \"" + listEntry.getKey() + "\" grali: ");
            /**
             * posortowanie
             */
            Collections.sort(listEntry.getValue());
            for (Aktor aktor : listEntry.getValue()) {

                System.out.print( "\n- " + aktor.getNazwa() + "("+ aktor.getPlec()+ ")");
            }
            System.out.println();
        }
    }


}
