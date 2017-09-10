
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = (base * altura)/2;
    }
}
