package Java9POOFundamentos;

public class Auto { //1 atributos 2 constructores 3 metodos
    //#1 creo los atributos (caracteristicas
    String modelo;
    String marca;
    int anio;
    int kilometraje;

    //#2 Constructores:
    //    public Auto(String color, String marca, int modelo){
//        this.color = color; //el this hacer que se diferencien y despues los iguale
//        this.marca = marca; // este this esta asociado al objeto y =marca es del parametro
//        this.modelo = modelo; //por buena practica se pone el mismo nombre
//    }
    // mismo nombre de la clase-NO lleva void- No retorna ningún valor
    public Auto(){//vacio (construye un objeto para en main crearlos o para ponerle datos predeterminados)
        //por buena practica se crea vacio
        //this.marca = "Desconocido"; //se puede poner un parametro predeterminado
        this.kilometraje = 0;
    }

    public Auto(String modelo, String marca, int anio, int kilometraje) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = 0;
    }
    //set y get

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    // con click derecho en Generete--> constructor puedes tambien crearlo vacio o lleno
//    //#3 Metodos

//    public void arrancar(){
//        System.out.println("el carro "+color+" arranco");
//    }
//
//    public void frenar(){
//        System.out.println("el carro freno");
//    }

    public void mostrarInformacion(){
        System.out.println("__Datos del carro:__");
        System.out.println("Marca: " +marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Año: " +anio);
    }
    public void actualizarKilometraje(double rodo){
        if (rodo >= 1){
            kilometraje += rodo;
            System.out.println("Tu ultima rodada fue de "+rodo+" Km");
            System.out.println("Tu nuevo kilometraje es: "+kilometraje+" Km");
        }else{
            System.out.println("Ve a rodar");
        }
    }
}
