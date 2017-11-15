package trabajo_poo;

import java.util.Scanner;
import java.util.Arrays;

public class Trabajo_POO {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Figura figura = new Figura();
        String leer;
        
        System.out.println("Bienvenido a las coordenadas");
        System.out.println("(Si ingresa una coordenada -1, -1 ;  se considera que es un triangulo)");
        
        for (int i = 0; i <= 3; i++) {//pedir  4 coordenadas
            do { //pedir numeros hasta que la coordenada sea valida
                //hacer todo correcto
                System.out.print("Ingrese las coordenadas: ");
                leer = scan.nextLine();
                
                try {
                    String coordArray[] = leer.split(",");
                    int x = Integer.parseInt(coordArray[0]);
                    int y = Integer.parseInt(coordArray[1]);
                    
                    coordenada c = new coordenada(x, y);
                    figura.agregarCoordenada(c);
                    System.out.println();
                    
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } while (true);
        }
        
        System.out.println("Es una figura "+figura.getTipo());
     
        /*
            if(getAnguloRecto == true){}
        
        */
        //
    }
    
}
