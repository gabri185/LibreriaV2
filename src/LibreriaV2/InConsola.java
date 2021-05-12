package LibreriaV2;

import java.util.Scanner;

public class InConsola implements InterfaceMetodosComunes{

    @Override
    public void visualizar(String mensaje) {

    }

    /**
     * Metodo que pide por consola un dato tipo string
     */
    @Override
    public void introducirDatos() {
        System.out.println("Por favor, introduzca datos\n");
        Scanner sc = new Scanner(System.in);
        String entrada="";
        entrada=sc.nextLine();

    }
}