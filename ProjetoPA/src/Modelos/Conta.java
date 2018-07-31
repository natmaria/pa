/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author nmpetry
 */
public class Conta {
    private String name;
    private int conta;
    private Double saldo;
    private Double limite;

    public void setName(String n) {
   this.name = n;
}
public String getName() {
    return this.name;
}

public void setConta(int c) {
    this.conta = c;
}
public int getConta() {
    return this.conta;
}

public void setSaldo(Double s) {
    this.saldo = s;
}
public Double getSaldo() {
    return this.saldo;
}
public void setLimite(Double l) {
    this.limite = l;
}
public Double getLimite() {
    return this.limite;
}
public String toString() {
    return "Nome do dono: " + getName() + "\n" +
            "Nº da Conta: " + getConta() +"\n" +
            "Saldo: " + getSaldo() + "\n" +
            "Limite da Conta: " + getLimite() + "\n" + "----";
}

public void debito(Double valor) {
    saldo = saldo - valor;
}

public void credito(Double valor) {
    saldo = saldo + valor;
}
}
