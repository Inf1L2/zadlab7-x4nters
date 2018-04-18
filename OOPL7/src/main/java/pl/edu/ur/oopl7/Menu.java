package pl.edu.ur.oopl7;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        
        while(menu!=0){
            System.out.println("Lab7 > Menu >");
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 0 ] Zakoncz");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 0: break;
                default: System.out.println("! Nieprawidlowa opcja");
                         scanner.next();
                         System.out.flush();
                         break;
            }
        }
    }
    
    private static void zadanie1(){
        Student student1 = new Student(1,"Inzynierskie","Informatyka",1,"Jan","Kowalski","Mezczyzna");
        Wykladowca wykladowca1 = new Wykladowca("Doktor","dobra","Jan","Jakistam","Mezczyzna");
        student1.Mow();
        wykladowca1.Mow();
        wykladowca1.WlaczRzutnik();
    }
    
    private static void zadanie2(){
        TestClass testClass = new TestClass();
        testClass.test2D();
        testClass.test3D();
        testClass.fillArray2D();
        testClass.fillArray3D();
        testClass.testCO();
    }
}
