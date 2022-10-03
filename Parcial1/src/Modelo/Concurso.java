
package Modelo;


public class Concurso {
    
    private Participante A;
    private Participante B;
    private Participante C;
    private Participante  ganador;
    private int cont;

    public Concurso(Participante A, Participante B) {
        this.A = A;
        this.B = B;
        
    }
    
    public Concurso() {
        this.cont=0;
    }

    public Participante getA() {
        return A;
    }

    

    
    public void setA(Participante A) {
        this.A = A;
    }

    public Participante getB() {
        return B;
    }

    public void setB(Participante B) {
        this.B = B;
    }

    public Participante getC() {
        return C;
    }

    public void setC(Participante C) {
        this.C = C;
    }

    
    public void setGanador(Participante ganador) {
       
       
         this.ganador=ganador;
         cont=1;
      
    }
    public Participante getGanador() {
        
        
      if (cont==0) {  
        if ((B.result>A.result) && (B.result>C.result)){ 
            this.ganador=B;
        }
        
        if ((A.result>B.result) && (A.result>C.result)){ 
            this.ganador=A;
        }
        
        if ((C.result>A.result) && (C.result>B.result)){ 
            this.ganador=C;
        }
        
        }
        return ganador;
        
    }

    
    
   
    
    
    

   
    
    
  
    
}
