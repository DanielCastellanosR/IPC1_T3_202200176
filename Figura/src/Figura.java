import java.text.DecimalFormat;

public abstract class Figura {
    protected int numLados;

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    public abstract double calcularArea();

    public abstract String getNombreFigura();

    public void imprimirArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Nombre de la figura: " + getNombreFigura());
        System.out.println("Área calculada: "+ df.format(calcularArea()));
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0); // Un círculo no tiene lados definidos
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getNombreFigura() {
        return "Círculo";
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getNombreFigura() {
        return "Triángulo";
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String getNombreFigura() {
        return "Cuadrado";
    }
}

class Main {
    public static void main(String[] args) {
        // Dentro del parentesis colocar el calor de cada figura como se señala.
        Circulo circulo = new Circulo(5);
        circulo.imprimirArea();

        Triangulo triangulo = new Triangulo(4, 3);
        triangulo.imprimirArea();

        Cuadrado cuadrado = new Cuadrado(6);
        cuadrado.imprimirArea();
    }
}
