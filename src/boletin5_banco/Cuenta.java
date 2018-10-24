/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_banco;

/**
 *
 * @author lvazquezdorna
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

    //METODOS DE CALCULO
    public boolean ingresar(double ingreso) {
        //comprobar que el dinero ingresado sea positivo 
        //boolean si se pudo o no hacer
        if (ingreso <= 0) {
            return false;
        } else {
            this.saldo = ingreso + this.saldo;
            return true;
        }
    }

    public boolean reintegro(double saco) {
        //no dejar sacar si no es positivo el saldo de la cuenta
        //boolean si se pudo o no hacer
        if (this.saldo>=0){
        this.saldo = this.saldo - saco;
        return true;
        }
        return false;
    }

}
