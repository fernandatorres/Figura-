/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Ingenieria
 */
public abstract class Figuras implements IFugura
{

    protected double area;
    protected  double volumen;
    protected String texto;
    
    abstract public void calcularArea();
    
    abstract public void calcularVolumen();
    
    abstract public void pintar();

    @Override
    public void cambiarTexto(String texto)
    {
        this.texto = texto;
    }

    

    
    
}
