package Java9POOFundamentos;

public class CuentaBancaria {
    //#1 crear atributos
    //se ponen private para que no puedan modificarlo tan facil
    private String numeroCuenta; //Identificador único de la cuenta
    private String nombreTitular; //Nombre del dueñx de la cuenta
    private double saldo; //Dinero disponible (debe ser siempre  0)
    private String tipoCuenta; //"Ahorros" o "Corriente"

    //#2 crear constructores
    //Vacio
    public CuentaBancaria() {
        this.saldo=0;
    }
    //Llenito
    public CuentaBancaria(String nombreTitular, String numeroCuenta, double saldo, String tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.setTipoCuenta(tipoCuenta); // se usa el setter para validar el tipo de cuenta
    }

    //#3 Crear Getters y setters para todos los atributos
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta != null && (tipoCuenta.equalsIgnoreCase("Ahorros") || tipoCuenta.equalsIgnoreCase("Corriente"))) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta inválido. Se asignará 'Ahorros' por defecto.");
            this.tipoCuenta = "Ahorros";
        }
    }

    //Crear metodos
    //depositar(double monto): Suma al saldo solo si el monto es positivo
    public void depositar(double monto){
        if (monto >= 1){
            saldo += monto;
            System.out.println("Deposito exitoso");
            System.out.println("Tu nuevo saldo es: $"+saldo);
        }else{
            System.out.println("Monto Inválido, intentalo nuevamente");
        }
    }
    //retirar(double monto): Resta del saldo si hay fondos suficientes y el monto es válido
    public void retirar(double monto){
        if (monto <= saldo && monto > 0){
            saldo-=monto;
            System.out.println("Retiro exitoso");
            System.out.println("Tu nuevo saldo es: $"+saldo);
        }else {
            System.out.println("Monto Inválido o Saldo insuficiente, intentalo nuevamente");
        }

    }

    //mostrarDatos(): Imprime todos los datos de la cuenta
    public void mostrarDatos(){
        System.out.println("Datos de la Cuenta");
        System.out.println("Numero de la cuenta: " +numeroCuenta);
        System.out.println("Nombre del titular: " +nombreTitular);
        System.out.println("Tipo de cuenta: " +tipoCuenta);
        System.out.println("Saldo Disponible: " +saldo);
    }
}
