package pl.edu.ur.oopl7;
import java.util.Random;


public class Punkt3D extends Punkt2D {
    public double coordinateZ;

    public Punkt3D() {
        coordinateX = 0;
        coordinateY = 0;
    }

    public Punkt3D(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }
    
    @Override
    public void randomCO(){
        Random randomDouble = new Random();
        coordinateX = (-10) + (10 - (-10)) * randomDouble.nextDouble();
        coordinateY = (-10) + (10 - (-10)) * randomDouble.nextDouble();
        coordinateZ = (-10) + (10 - (-10)) * randomDouble.nextDouble();
    }
    
    @Override
    public String toString(){
        return "Wspolrzedne punktu 3D: " + Double.toString(coordinateX) + " x " + Double.toString(coordinateY) + " x " + Double.toString(coordinateZ);
    }
}
