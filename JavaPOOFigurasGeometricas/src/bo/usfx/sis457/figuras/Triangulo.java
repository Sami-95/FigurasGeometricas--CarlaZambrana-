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
public class Triangulo {
    
    private double Base;
    private double Altura;
    
    
    public Triangulo(double base, double altura){
        this.Base = base;
        this.Altura = altura;
    }
    
    public Triangulo() {
        this(0, 0);
    }
    
    public double getBase(){
        return Base;
    }
    
    public void setBase(double base){
        this.Base = base;
    }
    
    public double getAltura(){
        return Altura;
    }
    
    public void setAltura(double altura){
        this.Altura = altura;
    }
    
    public double getArea() {
        return ((this.Base * this.Altura)/2);
    }
    
    public double getPerimetro() {
        return (3 * (this.Base));
    }

}
