/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

import java.io.*;
import java.net.*;

/**
 *
 * @author erik
 */
public class Cliente {

    int puerto;
    String Host;
    Socket s;
    InputStream aux;
    DataInputStream flujo;

    Cliente() {
        puerto = 5000;
        Host = "LocalHost";
        s = null;
        aux = null;
        flujo = null;

    }

    public String leer() {
        String Mensaje = "";
        try {
            s = new Socket(Host, puerto);
            aux = s.getInputStream();
            flujo = new DataInputStream(aux);
            Mensaje = flujo.readUTF();
            s.close();
            aux.close();
            flujo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Mensaje;
    }

    /**
     * // * @param args the command line arguments //
     */
//    public static void main(String[] args) {
//        Cliente cliente = new Cliente();
//        cliente.leer();
//        // TODO code application logic here
//    }
}
