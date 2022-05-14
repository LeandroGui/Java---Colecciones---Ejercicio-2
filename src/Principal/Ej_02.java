/*
 * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
 * pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
 * Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
 * la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
 * y se mostrará la lista ordenada.
 */
package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author LEANDRO
 */
public class Ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        ArrayList <String> raza = new ArrayList();
        String dato;
        do {
            System.out.print("Ingrese la raza del perrro: ");
            raza.add(leer.next());
            System.out.println("¿Desea guardar otro perro?(S/N)");
            dato = leer.next();  
        }
        while(dato.equals("S"));
        
        System.out.println("<<<<< Perros Guardados >>>>>");
        System.out.println("Cantidad: "+raza.size());
        System.out.println(raza.toString());
        
        System.out.println("\nIngrese el nombre a eliminar: ");
        String eliminar = leer.next();
        boolean valor = false;
        Iterator <String>it = raza.iterator();
        while (it.hasNext()){
            String aux = it.next();
            if(aux.equals(eliminar)) {
                it.remove();
                valor = true;
        System.out.println("Cantidad: "+raza.size());
            }
        }
        if(valor) {
            Collections.sort(raza);
            System.out.println(raza.toString());
        }
        else {
            System.out.println("\nNo se encontro el nombre de la raza de perro");
            Collections.sort(raza);
            System.out.println(raza.toString());
        }
    }
    
}
