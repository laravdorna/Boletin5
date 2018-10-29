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
        //bandera
        boolean aceptado;

        System.out.println("Bienvenido al gestor de cuentas bancarias."
                + " que operación desea realizar:");

        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //ver cuenta
                    cuentaCliente.datosCuenta();

                    break;
                case 2:
                    //ingresar
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n\t                 Ingresar               "
                            + "\n*************************************************************");
                    while (!aceptado) {

                        System.out.println("\nQue cantidad desea ingresar?:");
                        aceptado = cuentaCliente.ingresar(teclado.nextFloat());
                    }
                    break;
                case 3:
                    //retirar
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n\t                Reintegro                "
                            + "\n*************************************************************");
                    while (!aceptado) {

                        System.out.println("\nQue cantidad desea sacar?:");
                        aceptado = cuentaCliente.reintegro(teclado.nextFloat());
                    }
                    break;
                case 4:
                    //transferencia
                    aceptado = false;
                    System.out.println("\n*************************************************************"
                            + "\n\t                 Transferencia                "
                            + "\n*************************************************************");
                    while (!aceptado) {

                        System.out.println("\nQue cantidad desea transferir?:");
                        aceptado = cuentaCliente.transferencia(cuentaTraspaso, teclado.nextFloat());
                    }
                    break;
                case 0:
                    System.out.println("\n\t Gracias por usar nuestro banco.");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");

            }
        } while (opcion !=0);

    }

    private static int menu() {
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nQue operación desea realizar:"
                    + "\n1=>Ver sus datos de la cuenta bancaria"
                    + "\n2=>Ingresar dinero"
                    + "\n3=>Retirar dinero"
                    + "\n4=>Transferencia"
                    + "\n0=>Salir");
            op = Integer.parseInt(teclado.nextLine());
        } while (op < 0 || op > 3);
        return op;

    }

}
