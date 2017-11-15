package trabajo_poo;

public class coordenada {
    
    private int a;
    private int b;
    private String[][] coordenada;
    

    public coordenada(int a, int b, String[][] coordenada) {
        this.a = a;
        this.b = b;
        this.coordenada = coordenada;
    }
    
    public String[][] getCoordenadas(){
        return coordenada;
    }
    
    public void setCoordenada(String[][] coordenada){
        this.coordenada = coordenada;
    }
    
}
