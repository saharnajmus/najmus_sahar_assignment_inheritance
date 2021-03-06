package be.intecbrussel.graphics;

public class Triangle extends Shape {
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    {
        count++;
    }

    //All identifiers and parameter_names are according to the requirements of UMl
    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(int width, int height, int perpendicular) {
        this(width, height, perpendicular, 1, 1);
    }

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        setWidth(width);
        setHeight(height);
        setPerpendicular(perpendicular);
        setX(x);
        setY(y);
    }

    public Triangle(Triangle t) {
        this(t.getWidth(), t.getHeight(), t.getPerpendicular(), t.getX(), t.getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        //By using pythagorean theorem
        //c=sqrt(a^2+b^2)
        // a == height;
        // b== width/2
        double hypotenuse;

        double heightSquare = Math.pow(height, 2);
        double baseSquare = Math.pow(width / 2, 2);
        hypotenuse = Math.sqrt(heightSquare + baseSquare);
        double perimeterOfTriangle = height + width + hypotenuse;
        return perimeterOfTriangle;

    }

    public static int getCount() {
        return count;
    }
}
