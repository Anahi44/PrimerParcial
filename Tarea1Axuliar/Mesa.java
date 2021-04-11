
/**
 * Write a description of class Mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
   private String forma;
   private int nroPatas;
   private double altura;
   private double ancho; 
   public Mesa(int pat, String form, double alt,double anc){
       this.forma = form;
       this.nroPatas = pat;
       this.altura= alt;
       this.ancho = anc;
    }
   public String getForm(){
       return forma;
    }
   public int getPatas(){
       return nroPatas;
    }
}
