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
public class Wykladowca extends Osoba {
    private String tytul;
    private String opiniaStudentow;
    
    public Wykladowca(String tytul, String opiniaStudentow, String imie, String nazwisko, String plec) {
        super(imie, nazwisko, plec);
        this.tytul = tytul;
        this.opiniaStudentow = opiniaStudentow;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpiniaStudentow() {
        return opiniaStudentow;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setOpiniaStudentow(String opiniaStudentow) {
        this.opiniaStudentow = opiniaStudentow;
    }
    
    public void WlaczRzutnik(){
        System.out.println("Rzutnik wlaczony");
    }
}
