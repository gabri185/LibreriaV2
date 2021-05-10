import javax.swing.*;

public class InVentana implements InterfaceMetodosComunes{
    /**
     * @param mensaje
     **/
    @Override
    public void visualizar(String mensaje) {

    }

    /**
     * Metodo que sirve para pedir por ventana un string
     */
    @Override
    public void introducirDatos() {
        String entrada= JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");

    }
}