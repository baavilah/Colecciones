/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        
        Estudiante a = new Estudiante("1","F");
        Estudiante b = new Estudiante("2","I");
        Estudiante c = new Estudiante("3","V");
        
        estudiantes.add(a);
        estudiantes.add(b);
        estudiantes.add(c);
        
        for(Estudiante s : estudiantes){
            System.out.println(s.getName());
        }
        estudiantes.remove(0);
        estudiantes.add(0, a);
        
        HashMap<String, Estudiante> estudiante = new HashMap<String, Estudiante>();
        
        Estudiante s1 = new Estudiante("12345-42","Fred");
        Estudiante s2 = new Estudiante("98765-00","El Barto");
        Estudiante s3 = new Estudiante("71024-91","Willie");
        estudiante.put(s1.getIdNo(), s1);
        estudiante.put(s2.getIdNo(), s2);
        estudiante.put(s3.getIdNo(), s3);
        
        String id = "98765-00";
        System.out.println("Let's try to retrieve");
        Estudiante x = estudiante.get(id);
        if(x != null){
            System.out.println("Found! Name = "+x.getName());
        }
        else{
            System.out.println("Invalid ID: " + id);
        }
        TreeMap<String, String> t = new TreeMap<String, String>();
        
        
        
        
    }
    
}
