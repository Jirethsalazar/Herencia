
package herencia;


public class Cliente extends Persona {
    String  direccion;

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }

  
    
    
    
}