package Filmy.kchardy.com.github;
/**
 * @author kchardy
 */
public class Aktor implements Comparable<Aktor>{

    private String nazwa;
    private Plec plec;

    /**
     * kontruktor Aktora
     * @param nazwa string przechowywujacy imie i nazwisko
     * @param plec typ wyliczeniowy
     */
    public Aktor(String nazwa, Plec plec)
    {
        this.nazwa = nazwa;
        this.plec = plec;
    }

    /**
     * wyłuskanie nazwiska z nazwy
     * @return nazwisko
     */
    public String getNazwisko()
    {
        String nazwa = this.getNazwa();
        String imie ="";
        String nazwisko = "";

        if(nazwa.split("\\w").length>1)
        {
            nazwisko = nazwa.substring(nazwa.lastIndexOf(" ")+1);
            imie = nazwa.substring(0, nazwa.lastIndexOf(' '));
        }
        else
            imie = nazwa;
        return nazwisko;
    }

    public void setNazwa(String nazwa)
    {
        this.nazwa = nazwa;
    }
    public void setPlec(Plec plec)
    {
        this.plec = plec;
    }

    public Plec getPlec() {
        return plec;
    }

    public String getNazwa() {
        return nazwa;
    }

    /**
     * nadpisanie metody compareTo
     * @param o typu Aktor
     * @return wynik porownania zmiennej plec metodą compareTo
     */

    @Override
    public int compareTo(Aktor o) {

        int plec = getPlec().compareTo(o.getPlec());

        if(plec == 0)
        {
            return getNazwisko().compareTo(o.getNazwisko());
        }
        else
        {
            return plec;
        }
    }
}

