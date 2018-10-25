/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_banco;

import java.util.Scanner;

/**
 *
 * @author lvazquezdorna
 */
public class Boletin5_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Inicializar objetos
        Cuenta cuentaCliente = new Cuenta("Gonzalo", "123456", 5000);
        Cuenta cuentaTraspaso = new Cuenta("Juan", "987654", 2000);

        System.out.println("Bienvenido al gestor de cuentas bancarias."
                + " que operación desea realizar:");

        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //ver cuenta

                    break;
                case 2:
                    //ingresar
                    // cuentaCliente.ingresar();
                    break;
                case 3:
                    //retirar

                    //cuentaCliente.reintegro();
                    break;
                case 4:
                    //transferencia
                    //transferencia();
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1=>Ver sus datos de la cuenta bancaria");
            System.out.println("2=>Ingresar dinero");
            System.out.println("3=>Retirar dinero");
            System.out.println("3=>Transferencia");
            System.out.println("0=>Salir");
            try {
                op = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Escoge el numero de opcion deseado");
                op = -1;
            }

        } while (op < 0 || op > 3);
        return op;

    }

}
