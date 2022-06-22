package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle, area: " + getArea()
                + " sq.units, " + "radius: " + radius
                + " units, color: " + getColor());

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
