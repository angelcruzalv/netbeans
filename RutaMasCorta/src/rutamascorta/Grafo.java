package rutamascorta;

import java.util.*;

public class Grafo {
    
    public Grafo(int n) {
        
        nodos = new ArrayList<Nodo>();
        
        for(int i=0; i<n; i++) {
            
            nodos.add(new Nodo(i+1));
            
        }
        
    }
    
    public ArrayList<Nodo> nodos;
    
}
