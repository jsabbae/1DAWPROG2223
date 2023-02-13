package UTD4.Practica4.ejercicio6;

class empleado {
  char codEmpleado;
 String DNI;
String nombre;
String primerApellido;
 String segundoApellido;
 int añoNacimiento;
 boolean reduccionJornada;

    public void main(String[] args) {
        System.out.println("Su DNI es: " + DNI);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su primer apellido es: "+ primerApellido);
        System.out.println("su segundo apellido es: "+ segundoApellido);
        System.out.println("su año de nacimiento es: " + añoNacimiento);
        System.out.println("Su reducción de su jornada va a ser: "+ reduccionJornada);



    }


    public empleado(char codEmpleado, String DNI, String nombre, String primerApellido, String segundoApellido, int añoNacimiento, boolean reduccionJornada) {
        this.codEmpleado = codEmpleado;
        this.DNI = DNI;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.añoNacimiento = añoNacimiento;
        this.reduccionJornada = reduccionJornada;
    }





    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(char codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getañoNacimiento() {
        return añoNacimiento;
    }

    public void setañoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public boolean isReduccionJornada() {
        return reduccionJornada;
    }
    public void setReduccionJornada(){
    this.reduccionJornada = isReduccionJornada();
    }


}
