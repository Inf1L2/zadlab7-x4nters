package pl.edu.ur.oopl7;
import java.util.Random;


public class Punkt2D {
    public double coordinateX;
    public double coordinateY;

    
    public Punkt2D() {
        coordinateX = 0;
        coordinateY = 0;
    }

    public Punkt2D(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }
    
    public void randomCO(){
        Random randomDouble = new Random();
        coordinateX = (-10) + (10 - (-10)) * randomDouble.nextDouble();
        coordinateY = (-10) + (10 - (-10)) * randomDouble.nextDouble();
    }
    
    @Override
    public String toString(){
        return "Wspolrzedne punktu 2D: " + Double.toString(coordinateX) + " x " + Double.toString(coordinateY);
    }
}
