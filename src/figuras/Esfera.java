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
public class Esfera extends Figuras{

 private double radio;
    private static double PI = 3.416;
public  void Esfera (double radio)
{
   this.radio=radio;
}

    @Override
    public void calcularArea() 
    {
        this.area = 4*PI*radio*radio;
    }

    @Override
    public void calcularVolumen() {
        this.volumen = (4/3)*PI*radio*radio;
    }

    @Override
    public void pintar() {
        //implementar codigo
    }

    @Override
    public void cambiarTexto(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
