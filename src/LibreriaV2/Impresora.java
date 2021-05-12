package LibreriaV2;

public class Impresora  implements InterfaceMetodosComunes{

    /**
     * Metodo para visualizar
     * @param mensaje
     */
    @Override
    public void visualizar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void introducirDatos() {

    }
}
