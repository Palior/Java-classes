public class empleado{
    private String nombre;
    private String apellido;
    private double sueldo;
    private int edad;
    public empleado(String nombre, String apellido, double sueldo, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.sueldo = sueldo;
    this.edad = edad;
}
public String devuelveNombre(String nombre, String apellido){
    String nombreCompleto = nombre+ " " + apellido;
    System.out.println("El nombre del empleado es: " + nombreCompleto);
    return nombreCompleto;
}
public double devuelveSueldoLiquido(double sueldo){
    double sueldoLiquido = sueldo*0.9;
    System.out.println("El sueldo liquido es: " + sueldoLiquido);
    return sueldoLiquido;
}
public static void main(String[] args)throws Exception{
    empleado empleadoUno = new empleado("Pa", "Lior", 430.000, 26); 
    String nombreC = empleadoUno.devuelveNombre(empleadoUno.nombre, empleadoUno.apellido);
    double sueldoL = empleadoUno.devuelveSueldoLiquido(empleadoUno.sueldo);
}
}