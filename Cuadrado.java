/**
 * Clase Circulo calcula su area y perimetro, resive como datos su radio
 * @author Arturo De La Torre Lara
 * @version 09 de Septiembre del 2017
 */
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    /**
     * Calcula el Area de un Cuadrado y lo guarda en la variable de instancia area, de la SuperClase Figura
     */
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = lado * lado;
    }
    
    /**
     * Calcula el Area de un Cuadrado y lo guarda en la variable de instancia area, de la SuperClase Figura
     */
    public void calculaPerimetro()
    {
        perimetro = 4 * lado;
    }
}
