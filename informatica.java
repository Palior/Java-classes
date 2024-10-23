public class informatica extends empleado
{
    private int anios;
    public informatica(String nombre, String apellido, double sueldo, int edad, int anios){
    super(nombre, apellido, sueldo, edad);
    this.anios = anios;
}
private int getAnios(){
    return anios;
}
}