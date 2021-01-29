package rutamascorta;

import java.util.*;

import static java.lang.System.out;

public class RutaMasCorta {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        out.print("Ingrese no. de nodos: ");
        
        int nodos = leer.nextInt();
        
        Grafo grafo = new Grafo(nodos);
        
        out.println();
        
        for(int i=0; i<nodos; i++) {
            
            leer = new Scanner(System.in);
            
            out.print("Ingrese destinos y costos del nodo " + (i+1) + " (Destino-Costo): ");
            
            StringTokenizer st1 = new StringTokenizer(leer.nextLine(), " ");
            
            while(st1.hasMoreTokens()) {
                
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(), "-");
                
                grafo.nodos.get(i).destinos.add(grafo.nodos.get(Integer.parseInt(st2.nextToken()) - 1));
                
                grafo.nodos.get(i).costos.add(Integer.parseInt(st2.nextToken()));
                
            }
            
        }
        
    }
    
}
