/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//paquetes
package boletin5_banco;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Cuenta {

    //atributos
    private String nome;
    private String nConta;
    private double saldo;

    //constructor
    public Cuenta() {
    }

    public Cuenta(String nome, String nConta, double saldo) {
        this.nome = nome;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    //metodos de acceso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnConta() {
        return nConta;
    }

    public void setnConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //metodo de visualizacion

    @Override
    public String toString() {
        return "Cuenta del cliente " + nome + "\n\tnumero de cuenta:" + nConta + "\n\tsaldo=" + saldo + '€';
    }

    public void datosCuenta() {
        System.out.println("\n********************************************************************"
                + "\n                    DATOS CUENTA CLIENTE"
                + "\n********************************************************************"
                + "\n\t Nombre del titular\t:" + this.nome
                + "\n\t Numero de cuenta\t:" + this.nConta
                + "\n\t Saldo actual\t:" + this.saldo + "€");
    }

    //METODOS DE CALCULO
    public boolean ingresar(double ingreso) {
        //comprobar que el dinero ingresado sea positivo 
        //boolean si se pudo o no hacer
        if (ingreso <= 0) {//

            System.out.println("\n********************************************************************"
                    + "\n                    ERROR EN LA OPERACION"
                    + "\n********************************************************************");
            return false;
        } else {
            this.saldo = ingreso + this.saldo;
            System.out.println("\n********************************************************************"
                    + "\n                 OPERACION DE INGRESO REALIZADA CON EXITO"
                    + "\n********************************************************************"
                    + "\n\tSu saldo actual es de \t:" + this.saldo + "€");
            return true;
        }
    }

    public boolean reintegro(double saco) {
        //no dejar sacar si no es positivo el saldo de la cuenta
        //boolean si se pudo o no hacer
        if (this.saldo >= 0) {
            this.saldo -= saco;
            System.out.println("\n********************************************************************"
                    + "\n                 OPERACION  REALIZADA CON EXITO"
                    + "\n********************************************************************"
                    + "\n\tHa retirado \t:" + saco + "€"
                    + "\n\tSu saldo actual es de \t:" + this.saldo + "€");
            return true;
        } else {
            System.out.println("\n********************************************************************"
                    + "\n                    ERROR EN LA OPERACION"
                    + "\n********************************************************************");
            return false;
        }
    }

    public boolean transferencia(Cuenta cuenta2, float transferido) {
        if (transferido > 0 && this.saldo >= transferido) {
            this.saldo -= transferido;
            cuenta2.setSaldo(cuenta2.getSaldo() + transferido);
            System.out.println("\n********************************************************************"
                    + "\n                 OPERACION  REALIZADA CON EXITO"
                    + "\n********************************************************************"
                    + "\n\tHa transferido \t:" + transferido + "€ a la cuenta: " + cuenta2.nConta
                    + "\n\tSu saldo actual es de \t:" + this.saldo + "€");
            return true;
        } else {
            System.out.println("\n********************************************************************"
                    + "\n                    ERROR EN LA OPERACION: Saldo insuficiente."
                    + "\n********************************************************************");
            return false;
        }

    }

}
