
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
    
    public void calculaPerimetroEquilatero()
    {
        perimetro = 3 * base;
    }
    
    public void calculaPerimetroIsoceles(float unLado)
    {
        perimetro = (2 * unLado) + base;
    }
    
    public void calculaPerimetroEscaleno(float unLado)
    {
        perimetro = altura + base + unLado;
    }
}
