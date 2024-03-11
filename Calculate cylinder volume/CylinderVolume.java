public class CylinderVolume {
    public static void main(String[] args) {
        /*
        Java program that calculates the volume of a cylinder with given dimensions.
        Formula for calculation: V = r^2 * Pi * H

        r – the radius of the base of the cylinder
        H – height
        Pi – constant Pi, 3.14

        Output is the result.
         */

        double Pi = 3.14;
        double r = 10;
        double H = 50;
        double V = (r*r) * Pi * H;

        
        System.out.println("Un cilindru a carui raza este 10 iar inaltimea 50 are volumul:"+ V);
    }
}
