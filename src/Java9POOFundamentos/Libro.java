package Java9POOFundamentos;

public class Libro {
    //#1 crear atributos
    //se ponen private para que no puedan modificarlo tan facil
    String titulo;
    String autor;
    int anioPublicacion;
    boolean disponible;

    //#2 crear constructores
    //Vacio
    public Libro() {
        this.disponible = true;
    }
    //Llenito
    public Libro(String titulo, String autor, int anioPublicacion){//no lo pidas el boolean
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = true;
    }
    //#3 Crear Getters y setters para todos los atributos


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //Crear metodos
    //mostrarDetalles()
    public void mostrarDetalles(){
        System.out.println("Detalles del libro");
        System.out.println("Titulo: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Año de publicación: " +anioPublicacion);
        System.out.println("Disponibilidad: " +disponible);
    }
    //prestar()
    public void prestar(){
        if (disponible){
            this.disponible = false;
            System.out.println("prestamo exitoso");
        }else {
            System.out.println("Lo siento, el libro no esta disponible");
        }
    }
    //devolver()
    public void devolver(){
        if (disponible == false){
            this.disponible = true;
            System.out.println("Gracias por devolver el libro "+titulo);
        }else {
            System.out.println("ese libro no reguistra como prestado, verifica los datos");
        }
    }

}
