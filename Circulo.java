/**
 * Clase Circulo calcula su area y perimetro, resive como datos su radio
 * @author Arturo De La Torre Lara
 * @version 09 de Septiembre del 2017
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    /**
     * calcula el Area de un Circulo y lo guarda en la variable de instancia area, de la SuperClase Figura 
     */
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = 3.14f * (radio * radio);
    }
    
    /**
     * calcula el perimetro de un Circulo y lo guarda en la variable de instancia periemtro, de la SuperClase Figura 
     */
    public void calculaPerimetro()
    {
        perimetro = 2 * 3.14f * radio;
    }
}