
package Modelo;



public class Participante {
    
    private String nombre;
    private String apellido;
    private int numero;
    private Llanta nllanta;
    private Concurso concurso;
    protected double result;


    public Participante(String nombre, String apellido, int numero, Llanta nllanta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
        this.nllanta = nllanta;
    }

    public Participante(String nombre, String apellido, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Llanta getNllanta() {
        return nllanta;
    }

    public void setNllanta(Llanta nllanta) {
        this.nllanta = nllanta;
    }
    
    public double ResultadoLanzamiento(double t){
        
        this.result= nllanta.getDiametro()*Math.PI*t;
        
      
        
       return result;
          
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + '}';
    }

    

    
    
    
    
}
