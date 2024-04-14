
package herencia;

import javax.swing.JOptionPane;



public class Principal {
public static void main(String[] args) {
      
        boolean a=true;
        while(a){
       
     int opcion =Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n"
                                                  +" 1:Agregar Empleado\n"
                                                  +" 2:Agregar Cliente\n"
                                                  +" 3:Salir del programa"));
       
       switch (opcion){
               case 1:
                    String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                    String e= JOptionPane.showInputDialog("Ingrese la edad del empleado:");
                    int edadEmpleado = Integer.parseInt(e);
                    String m = JOptionPane.showInputDialog("Ingrese el salario del empleado:");
                    double salarioEmpleado = Double.parseDouble(m);
                    Empleado nuevoEmpleado = new Empleado(salarioEmpleado, nombreEmpleado, edadEmpleado);
                   JOptionPane.showMessageDialog(null, "Empleado agregado:\n Nombre: " + nuevoEmpleado.nombre + "\nEdad: " + nuevoEmpleado.edad + "\nSalario: " + nuevoEmpleado.salario);
                   break;
               case 2: 
                    String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                    int edadCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
                    String direccionCliente = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
                    Cliente nuevoCliente = new Cliente(direccionCliente, nombreCliente, edadCliente);
                    JOptionPane.showMessageDialog(null, "Cliente agregado:\nNombre: " + nuevoCliente.nombre + "\nEdad: " + nuevoCliente.edad + "\nDirección: " + nuevoCliente.direccion);
                    break;
               case 3:
                   JOptionPane.showMessageDialog(null, "salir del programa");
                   a= false;
                }}
       
           
           
           
           
            
           
          
     }}