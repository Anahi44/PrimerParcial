
/**
 * Write a description of class Mesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
   private String forma;
   private String color;
   private double area;
   private Punto centro;
 
   public Figura( String form, String col, double a, int x, int y){
       this.forma = form;
       this.color =col;
       this.area = a;
       centro = new Punto(x,y);
    }
   public String getForm(){
       return forma;
    }
   public String  getColor(){
       return color;
    }
    public void modificarPunto(int x){
        centro.setX(x);
   }
    
}
