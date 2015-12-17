/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

import java.io.*;
import java.net.*;
import java.util.Random;

/**
 *
 * @author erik
 */
public class Aplicacion extends Thread{

    int puerto;
    String Host;
    ServerSocket skSocket;
    Socket s, a;
    OutputStream aux;
    DataOutputStream flujo;
    String mensaje[] = new String[10];
    Ventana ven = new Ventana();
    Numeros na;

    Aplicacion() {
        puerto = 5000;
        Host = "LocalHost";
        skSocket = null;
        s = null;
        aux = null;
        flujo = null;
        mensaje[0] = "Hola ";
        mensaje[1] = "Como ";
        mensaje[2] = "Estas ";
        mensaje[3] = "Te Amo ";
        mensaje[4] = "Carmen ";
        mensaje[5] = "Erick ";
        mensaje[6] = "Equis de ";
        mensaje[7] = "Yolo ";
        
        na = new Numeros(0,7);
    }

    public void run() {
        try {
            System.out.println("Se ha iniciado el Servidor");
            while (true) {
                skSocket = new ServerSocket(puerto);
                s = skSocket.accept();
                aux = s.getOutputStream();
                flujo = new DataOutputStream(aux);
                int x;
                x=na.generar();
                flujo.writeUTF(mensaje[x]);
                skSocket.close();
                aux.close();
                flujo.close();

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
