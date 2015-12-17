/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Socket;

/**
 *
 * @author erick
 */
public class Serie {
    
    static String arreglo[]=new String[7];
    
    public String[] Serie(){
        int num1=1;
        int num2=2;
        Numeros na = new Numeros(0, 9);
        Numeros nal = new Numeros(65, 90);
        for(int i=0; i<7; i++){
            int num3 = (int) Math.floor(Math.random()*(num2-num1+1)+num1);
            if(num3==1){
                arreglo[i]=""+na.generar()+"";
            }else{
                arreglo[i]=""+(char)nal.generar()+"";
            }
        }
        for(int i=0; i<arreglo.length; i++){
            //System.out.print(arreglo[i]);
        }
        System.out.println("");
        String array=arreglo.toString();
        //System.out.println(arreglo);
        return arreglo; 
    }
}
