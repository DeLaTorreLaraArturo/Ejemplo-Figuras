
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    @Override//Avisa alguna sobreescrutirua incorrecta
    public void calculaArea()
    {
        area = lado * lado;
    }
}
