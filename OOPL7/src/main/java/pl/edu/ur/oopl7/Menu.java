/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;
import java.util.Scanner;
/**
 *
 * @author x4nte
 */
public class Menu {
    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lab7 > Menu");
        System.out.println(" [ 1 ] Nowy student");
        System.out.println(" [ 2 ] Nowy wykladowca");
        System.out.print("Menu > ");
        int menu = scanner.nextInt();
        
        switch(menu){
            case 1: System.out.print("");
        }*/
        
        Student student1 = new Student(1,"Inzynierskie","Informatyka",1,"Jan","Kowalski","Mezczyzna");
        Wykladowca wykladowca1 = new Wykladowca("Doktor","dobra","Jan","Jakistam","Mezczyzna");
        student1.Mow();
        wykladowca1.Mow();
        wykladowca1.WlaczRzutnik();
        
    }
}
