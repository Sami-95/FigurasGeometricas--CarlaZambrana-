/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author HP
 */
public class Pentagono {
    
    private double Lado;
    private double Apotema;
    
    
    public Pentagono(double lado, double apotema){
        this.Lado = lado;
        this.Apotema = apotema;
    }
    
    public Pentagono() {
        this(0, 0);
    }
    
    public double getLado(){
        return Lado;
    }
    
    public void setLado(double lado){
        this.Lado = lado;
    }
    
    public double getApotema(){
        return Apotema;
    }
    
    public void setApotema(double apotema){
        this.Apotema = apotema;
    }
    
    public double getArea() {
        return ((5 * this.Lado * this.Apotema)/2);
    }
    
    public double getPerimetro() {
        return (5 * (this.Lado));
    }

}
