import java.io.*;
public class coche {
    String color;
    String marca;
    int km;

    public coche() {
    }

    public static void main(String[] args) {
        coche coche1 = new coche();
        coche1.color = "rojo";
        coche1.marca = "mitsubishi";
        coche1.km = 0;
        System.out.println("El color  del coche es: " + coche1.color);
        System.out.println("La marca  del coche es: " + coche1.marca);
        System.out.println("El km  del coche es: " + coche1.km);
    }
}
