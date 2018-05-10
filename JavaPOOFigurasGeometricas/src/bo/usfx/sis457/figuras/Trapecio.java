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
public class Trapecio {
    
    private double Base1;
    private double Base2;
    private double Lados;
    private double Altura;
    
    
    public Trapecio(double base1, double base2, double lados, double altura){
        this.Base1 = base1;
        this.Base2 = base2;
        this.Lados = lados;
        this.Altura = altura;
    }
    
    public Trapecio() {
        this(0, 0, 0, 0);
    }
    
    public double getBase1(){
        return Base1;
    }
    
    public void setBase1(double base1){
        this.Base1 = base1;
    }
    
    public double getBase2(){
        return Base2;
    }
    
    public void setBase2(double base2){
        this.Base2 = base2;
    }
    
    public double getLados(){
        return Lados;
    }
    
    public void setLados(double lados){
        this.Lados = lados;
    }
    
    public double getAltura(){
        return Altura;
    }
    
    public void setAltura(double altura){
        this.Altura = altura;
    }
    
    public double getArea() {
        return (this.Altura * ((this.Base1 + this.Base2)/2));
    }
    
    public double getPerimetro() {
        return (this.Base1 + this.Base2 + (this.Lados * 2));
    }

}
