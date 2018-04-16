/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author x4nte
 */
public class Student extends Osoba {
    private int nrIndeksu;
    private String typStudiow;
    private String kierunek;
    private int rokStudiow;

    public Student(int nrIndeksu, String typStudiow, String kierunek, int rokStudiow, String imie, String nazwisko, String plec) {
        super(imie, nazwisko, plec);
        this.nrIndeksu = nrIndeksu;
        this.typStudiow = typStudiow;
        this.kierunek = kierunek;
        this.rokStudiow = rokStudiow;
    }
    
    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public String getTypStudiow() {
        return typStudiow;
    }

    public String getKierunek() {
        return kierunek;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public void setTypStudiow(String typStudiow) {
        this.typStudiow = typStudiow;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }
    
    @Override
    public void Mow(){
        System.out.println("Przesloniona metoda mow");
        System.out.println(getImie() + " " + getNazwisko() + " " + getPlec() + " " + getNrIndeksu() + " " + getTypStudiow() + " " + getKierunek() + " " + getRokStudiow());
    }
}
