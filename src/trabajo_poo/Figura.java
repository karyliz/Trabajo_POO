
package trabajo_poo;

import java.util.ArrayList;
import java.util.List;

public class Figura {
    private List<coordenada> coordenadas;
    private String tipo;

    public Figura() {
        coordenadas = new ArrayList<coordenada>();
    }
    
    public void agregarCoordenada(coordenada c) throws Exception {
        if(c.getX() < -1 || c.getX()  > 40 || c.getY() > 40 || c.getY() < -1){
            throw new Exception("Por favor ingrese coordenadas dentro del limite establecido");
        }else if(c.getX() > -1 || c.getY() > -1){
            coordenadas.add(c);
        }
        
        if (coordenadas.size() == 3) {
            tipo = "Triangular";
        } else if (coordenadas.size() == 4) {
            tipo = "Paralelogramo";
        }
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    //obtener angulos
    
    //obtener distancia
    
    public boolean hayAnguloRecto(){
        //1.recorrer angulos figura
              //1'.Reconocer angulos entre puntos()
        
        //si existe un angulo recto en la figura
        return true;
    }
}

