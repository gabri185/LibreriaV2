import javax.swing.*;
/**
 * Creado por @autor: gabriel
 * El  10 de may. de 2021.
 **/


public class Ventana implements InterfaceMetodosComunes {

    /**
     *Metodo que declara una variable que recibe el valor que le des por ventana
     **/
    public void visualizaConfirmacion(String mensaje) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje);
    }

    /**
     *Metodos abstractos de la interfaz modificados para la propia clase
     **/
    @Override
    public void visualizar(String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje);
    }

    @Override
    public void introducirDatos() {

    }
}
