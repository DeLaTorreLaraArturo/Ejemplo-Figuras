/**
 * Clase circulo calcula su area y perimetro, resive como datos su radio
 * @author Arturo De La Torre Lara
 * @version 09 de Septiembre del 2017
/**
 * Clase Triangulo calcula su area y perimetro, resive como datos su base y altura
 * @version 09 de Septiembre del 2017
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    /**
     * Calcula el Area de un Triangulo y lo guarda en la variable de instancia area, de la SuperClase Figura
     */
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = (base * altura)/2;
    }
    
    /**
     * Calcula el Perimetro de un Triangulo Equilatero y lo guarda en la variable de instancia perimetro, de la SuperClase Figura
     */
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaPerimetro()
    {
        perimetro = 3 * base;
    }
    
    /**
     * Calcula el Perimetro de un Triangulo Isoceles y lo guarda en la variable de instancia perimetro, de la SuperClase Figura
     */
    //@Override//Avisa alguna sobreescrutirua incorrecta
    /*public void calculaPerimetroIsoceles(float unLado)
    {
        perimetro = (2 * unLado) + base;
    }*/
    
    /**
     * Calcula el Perimetro de un Triangulo Escaleno y lo guarda en la variable de instancia perimetro, de la SuperClase Figura
     */
   // @Override//Avisa alguna sobreescrutirua incorrecta
    /*public void calculaPerimetroEscaleno(float unLado)
    {
        perimetro = altura + base + unLado;
    }*/
}
