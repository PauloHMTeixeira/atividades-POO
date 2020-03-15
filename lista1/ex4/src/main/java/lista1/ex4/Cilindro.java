package lista1.ex4;
public class Cilindro {

    public Circulo circulo;
    public Double altura;

    public double volume() {
        return circulo.area() * this.altura;
    }

}