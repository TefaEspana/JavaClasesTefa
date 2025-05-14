package com.cohorthe8.proyecto1;

public class Saludador {
    //#1 atributos
    //creo mensaje con diferente modificador
    public String mensajePublico ="Mensaje Publico";
    protected String mensajeProtegido ="Mensaje protegido";
    String mensajePaquete ="Mensaje Privado por defecto";
    private String mensajePrivado = "Mensaje Privado"; //se puedo modificar con SETTER pero si se pone final ya no podrian

    //#2 constructores
    public Saludador() {
    }

    public Saludador(String mensajePublico, String mensajeProtegido, String mensajePaquete, String mensajePrivado) {
        this.mensajePublico = mensajePublico;
        this.mensajeProtegido = mensajeProtegido;
        this.mensajePaquete = mensajePaquete;
        this.mensajePrivado = mensajePrivado;
    }

    //#3 Setter y Getter
    public String getMensajeProtegido() {
        return mensajeProtegido;
    }

    public void setMensajeProtegido(String mensajeProtegido) {
        this.mensajeProtegido = mensajeProtegido;
    }

    public String getMensajePaquete() {
        return mensajePaquete;
    }

    public void setMensajePaquete(String mensajePaquete) {
        this.mensajePaquete = mensajePaquete;
    }

    public String getMensajePrivado() {
        return mensajePrivado;
    }

    public void setMensajePrivado(String mensajePrivado) {
        this.mensajePrivado = mensajePrivado;
    }

    // #4 Metodo
    //saludar
    public void saludar(){
        System.out.println("Hola desde SALUDADOR");
    }

//    //Mala practica
//    public void mostrarMensajes(){
//        System.out.println("Mostrar mensaje desde saludador");
//        System.out.println(mensajePaquete);
//        System.out.println(mensajeProtegido);
//        System.out.println(mensajePublico);
//        System.out.println(mensajePrivado);
//    }



}
