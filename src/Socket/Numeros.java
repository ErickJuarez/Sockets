/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

import java.util.ArrayList;

/**
 *
 * @author erick
 */
public class Numeros {

    private int valorInicial;
    private int valorFinal;
    private ArrayList listaNumero;

    public Numeros(int valorInicial, int valorFinal) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        listaNumero = new ArrayList();
    }

    private int numAleatorio() {
        return (int) (Math.random() * (valorFinal - valorInicial + 1) + valorInicial);
    }

    public int generar() {
        if (listaNumero.size() < (valorFinal - valorInicial) + 1) {
            int numero = (int) (Math.random() * (valorFinal - valorInicial + 1) + valorInicial);//numAleatorio
            if (listaNumero.isEmpty()) {
                listaNumero.add(numero);
                return numero;
            } else {
                if (listaNumero.contains(numero)) {
                    return generar();
                } else {
                    listaNumero.add(numero);
                    return numero;
                }
            }
        } else {
            return -1;
        }
    }
}
