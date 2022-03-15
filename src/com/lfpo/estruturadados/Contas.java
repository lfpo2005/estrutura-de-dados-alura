package com.lfpo.estruturadados;

public class Contas {

    public int agencia;
    public int numero;

    public Contas() {
    }

    public Contas(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
