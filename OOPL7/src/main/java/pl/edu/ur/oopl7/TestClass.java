package pl.edu.ur.oopl7;
import java.util.Scanner;

public class TestClass {
    Scanner scanner = new Scanner(System.in);
    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    
    private Punkt2D random2D;
    private Punkt2D norandom2D;
    private Punkt3D random3D;
    private Punkt3D norandom3D;
    
    private Punkt2D[] array2D = new Punkt2D[100];
    private Punkt3D[] array3D = new Punkt3D[100];
            
    public TestClass(){
        System.out.print("X: ");
        coordinateX = scanner.nextDouble();
        System.out.print("Y: ");
        coordinateY = scanner.nextDouble();
        System.out.print("Z: ");
        coordinateZ = scanner.nextDouble();
        
        random2D = new Punkt2D();
        random2D.randomCO();
        
        norandom2D = new Punkt2D(coordinateX,coordinateY);
        
        random3D = new Punkt3D();
        random3D.randomCO();
        
        norandom3D = new Punkt3D(coordinateX,coordinateY,coordinateZ);
    }
    
    public void test2D(){
        System.out.println("2D random");
        System.out.println("---------");
        System.out.println(random2D.toString());
        
        System.out.println("2D norandom");
        System.out.println("---------");
        System.out.println(norandom2D.toString());
    }
    
    public void test3D(){
        System.out.println("3D random");
        System.out.println("---------");
        System.out.println(random3D.toString());
        
        System.out.println("3D norandom");
        System.out.println("---------");
        System.out.println(norandom3D.toString());
    }
    
    public void fillArray2D(){
        for(int i=0; i<100;i++){
            array2D[i] = new Punkt2D();
            array2D[i].randomCO();
        }
    }
    
    public void fillArray3D(){
        for(int i=0; i<100;i++){
            array3D[i] = new Punkt3D();
            array3D[i].randomCO();
        }
    }
    
    public void testCO(){
        for (int i=0; i<100; i++){
            for (int j=0; j<100; j++){
                if( (array2D[i].coordinateX == array3D[j].coordinateX) && (array2D[i].coordinateY == array3D[j].coordinateY) )
                    System.out.println(i+1 + " punkt 2D ma wspolne wspolrzedne z " + j+1 + ". punktem 3D (" + array2D[i].toString() + ")");
            }
        }
    }
}
