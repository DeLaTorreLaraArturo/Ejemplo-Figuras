
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = 3.14f * (radio * radio);
    }
    
    public void calculaPerimetro()
    {
        perimetro = 2 * 3.14f * radio;
    }
}