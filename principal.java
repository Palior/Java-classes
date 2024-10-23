public class principal
{
    public static void main(String[] args){
    empleado empleadoUno = new empleado("Pablo", "Lizama", 430.000, 23);
    informatica informaticoUno = new informatica("Ignacio","Perez",100.000,30,2);
    double sueldoInfo = informaticoUno.getSueldo();
    double LiquidoInformatico = informaticoUno.devuelveSueldoLiquido(sueldoInfo);
}
}