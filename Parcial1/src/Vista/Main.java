/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Concurso;
import Modelo.Llanta;
import Modelo.Participante;


public class Main {
    
    public static void main(String[] args) {
        
        Participante A=new Participante("Luis","Parez",1,new Llanta(10));
        Participante B=new Participante("Carlos","Lopez",2,new Llanta(5));
        Participante C=new Participante("George","Pinto",3,new Llanta(7));
   
        Concurso concurso=new Concurso(A,B);
        concurso.setC(C);
        
       
        
        System.out.println("RESULTADO LANZAMIENTOS  ");
        System.out.println("-------------------------------");
        System.out.println("RESULTADO A:  "+concurso.getA().ResultadoLanzamiento(3));
        System.out.println("RESULTADO B:  "+concurso.getB().ResultadoLanzamiento(6.001));
        System.out.println("RESULTADO B:  "+concurso.getC().ResultadoLanzamiento(4));
        System.out.println("");
        
      
        Participante ganador=concurso.getGanador();
        System.out.println("Ganador  " +ganador);
    }
    
}
