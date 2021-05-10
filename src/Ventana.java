import javax.swing.*;

public class Ventana implements InterfaceMetodosComunes {
    public void visualizaConfirmacion(String mensaje) {
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje);
    }


    @Override
    public void visualizar(String mensaje) {
        JOptionPane.showMessageDialog(null,mensaje);
    }

    @Override
    public void introducirDatos() {

    }
}
