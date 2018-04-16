package pl.edu.ur.oopl7;
import java.util.Date;

public class Osoba {
    private String imie;
    private String nazwisko;
    private Date date = new Date();
    private String plec;

    public Osoba(String imie, String nazwisko, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Date getDate() {
        return date;
    }

    public String getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
    
    public void Mow(){
        System.out.println("Mowie");
    }
}
