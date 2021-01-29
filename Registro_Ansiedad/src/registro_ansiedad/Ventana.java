package registro_ansiedad;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.*;

public class Ventana {
    
    public static class Marco extends JFrame {
        
        public Marco() throws Exception{
            
            setTitle("Registro semanal de nivel de ansiedad");
            
            int w = Toolkit.getDefaultToolkit().getScreenSize().width;
            int h = Toolkit.getDefaultToolkit().getScreenSize().height;
            
            setBounds(w/2 - (2*w/3)/2, h/4, 2*w/3, h/2);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            add(new Lamina());
            
        }
        
    }
    
    public static class Lamina extends JPanel {
        
        public Lamina() throws Exception {
            
            setLayout(new BorderLayout());
            
            JButton bt1 = new JButton("Registrar nueva semana");           
            Oyente o = new Oyente();           
            bt1.addMouseListener(o);
            
            JPanel laminaNorte = new JPanel();
            laminaNorte.setLayout(new FlowLayout(FlowLayout.RIGHT));
            laminaNorte.add(bt1);
            
            add(laminaNorte, BorderLayout.NORTH);
            
            tabla = new JTable();
      
            JScrollPane laminaCentro = new JScrollPane(tabla);
            add(laminaCentro, BorderLayout.CENTER);
            
            generarTabla();
            
        }
        
        private DefaultTableModel modelo;
        private JTable tabla;
        private String[] array;
        
        private void iniciarArray() {
            
            array = new String[] {
            
                "Pensamientos obsesivos",
                "Pensar en el futuro",
                "Pensamientos agresivos",
                "Angustia",
                "Nerviosismo",
                "Miedo o susto",
                "Irritabilidad",
                "Vacío",
                "Aprehensión",
                "Intolerancia o desesperación",
                "Evitación de lugares o personas",
                "Ejecución de rituales para evitar un daño",
                "Dificultad para llorar",
                "Tensión o dolor muscular",
                "Taquicardia",
                "Sudoración",
                "Mareo",
                "Sensación de ahogo o falta de aliento",
                "Atragantarse",
                "Molestias estomacales",
                "Sensación de frío",
                "Sacudidas o temblores",
                "Dolor de quijada",
                "Escalofríos",
                "Entumecimiento",
                "Debilidad en todo el cuerpo o alguna parte",
                "Sueño"
            
            };
            
        }
        
        private void registrar() throws Exception {
        }
        
        private void generarTabla() throws Exception {
        }
        
        private class Oyente extends MouseAdapter {
            
            public void mouseClicked(MouseEvent e) {
                
                try {
                    
                    System.out.println("FUNCIONA");
                    
                } catch(Exception ex) {
                    
                    ex.printStackTrace();
                    
                } 
                
            }
            
        }
        
    }
    
}
