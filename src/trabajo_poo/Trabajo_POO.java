package trabajo_poo;

import java.util.Scanner;
import java.util.Arrays;

public class Trabajo_POO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean limite;
        int puntos;
        
        System.out.println("Bienvenido a las coordenadas");
        System.out.print("ingrese las coordenadas: ");
        String coord = scan.nextLine();
        
        String coordArray[] = coord.split(",");
        
        int a = Integer.parseInt(coordArray[0]);
        int b = Integer.parseInt(coordArray[1]);
        
        if(a>40 || b>40){
            limite =true;
        }else{
            limite=false;
        }
        
        if(a<0 || a>40 || b<0 || b>20){
            System.out.println("por favor ingrese coordenadas dentro del limite establecido");
        }
        
        System.out.println("Ingrese los puntos de la figura.");
        puntos = scan.nextInt();
        
        if (puntos == 3) {
            System.out.println("Es una figura triangular");
        }else if (puntos == 4) {
            System.out.println("Es un para Paralelógramo o un No paralelógramo");
        } else {
            System.out.println("No es una figura correcta");
        }
    }
    
}
