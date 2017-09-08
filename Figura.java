/**
 * Esta clase es una superclase para representar las caracteristicas comunes de nuestras figuras
 * author@ Artur De La Torre Lara
 * version@ 08 de Septiembre del 2017
 */
public class Figura
{
    protected float area;
    
    /**
     * Costructor de la clase Figura
     */
    public Figura()
    {
        area = 0;
    }
    
    /**
     * Calcula el area de la figura
     */
    public void calculaArea()
    {
        System.out.println("No se como calcular el area");
    }
    
    /**
     * Imrime el Area de la figura
     */
    public void imprimeArea()
    {
        System.out.println("El area de la Figuara es: " + area);
    }
}