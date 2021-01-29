package rutamascorta;

import java.util.*;

public class Nodo {
    
    public Nodo(int id) {
        
        destinos = new ArrayList<Nodo>();
        
        costos = new ArrayList<Integer>();
        
        costoA = 0;
        
        this.id = id;
        
    }
    
    public ArrayList<Nodo> destinos;
    
    public ArrayList<Integer> costos;
    
    public int id, costoA;
    
}