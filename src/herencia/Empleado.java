
package herencia;


public class Empleado extends Persona {
    double salario;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

   
}