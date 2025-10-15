/*
Demo que crea objetos Libro invocando a los constructores definidos. 
 */
package tema3;
import PaqueteLectura.Lector;
public class Demo01ConstructoresLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero de libros que se van a almacenar en este estante");
        int x= Lector.leerInt();
        
        Estante estante = new Estante(x);
        
        PrimerAutor autor= new PrimerAutor("Juan Pablo", "Nacido en el 1934", "La Plata");
        
        Libro libro;
        
        System.out.println("Ingrese titulo del libro");
        String titulo = Lector.leerString();
        
        while (titulo.equals("ZZZ")){
            System.out.println("Ingrese editorial"); String editorial = Lector.leerString();
            System.out.println("Ingrese año de edicion"); int añoEdicion= Lector.leerInt();
            System.out.println("Ingrese autor"); // se lee autor
            System.out.println("Ingrese ISBN");String isbn= Lector.leerString();
            System.out.println("Ingrese precio"); double precio= Lector.leerDouble();
            
            libro= new Libro(titulo,editorial,añoEdicion,autor,isbn,precio);
            
            System.out.println("Ingrese titulo del libro");
            titulo = Lector.leerString();
        
        }
        System.out.println("Ingrese titulo a buscar");
        String tituloBuscar = Lector.leerString();
        
        libro = estante.buscarLibro(tituloBuscar);
        if (libro !=null){
            System.out.println(libro.toString());
        }
    }
    
}
