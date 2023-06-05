public class Shape {
    String color = "red";
    boolean filled = true;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public class Circle extends Shape{
        double radius = 1.0;
        ;
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        double getArea(double area ) {
            double luas = 3.14 * radius*radius;
            return area;
        }
        double getPerimeter(double perimeter) {
            double keliling = 2 * 3.14 * radius;
            return perimeter;
        }
        Circle(){
         System.out.println("Circle");   
        }
        Circle(double radius){
            this.radius = radius;
        }
        Circle(double radius, String color, boolean filled){
            this.radius = radius;
            this.color = color;
            this.filled = filled;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString();
        }
        

    }
    public class Rectangle extends Shape{
        double width = 1.0;
        double length = 1.0;
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        double getArea(double area) {
            double luas = width * length;
            return area;
        }
        double getPerimeter(double perimeter) {
            double keliling = 2 * (width + length);
            return perimeter;
        }
        Rectangle(){
            System.out.println("Rectangle");
        }
        Rectangle(double width, double length){
            this.width = width;
            this.length = length;
        }
        Rectangle(double width, double length, String color, boolean filled){
            this.width = width;
            this.length = length;
            this.color = color;
            this.filled = filled;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString();
        }
    }
    
    public class Square extends Rectangle{
        double side = 1.0;
        public double getSide() {
            return side;
        }
        public void setSide(double side) {
            this.side = side;
        }
        Square(){
            System.out.println("Square");
        }
        Square(double side){
            this.side = side;
        }
        Square(double side, String color, boolean filled){
            this.side = side;
            this.color = color;
            this.filled = filled;
        }
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString();
        }
    }

    public static void main(String[] args){
        Shape shape = new Shape();
        Shape.Circle circle = shape.new Circle();
        Shape.Rectangle rectangle = shape.new Rectangle();
        Shape.Square square = shape.new Square();
        System.out.println("Circle");
        System.out.println("Luas : " + circle.getArea(78));
        System.out.println("Keliling : " + circle.getPerimeter(33));
        System.out.println("Rectangle");
        System.out.println("Luas : " + rectangle.getArea(53));
        System.out.println("Keliling : " + rectangle.getPerimeter(45));
        System.out.println("Square");
        System.out.println("Luas : " + square.getArea(75));
        System.out.println("Keliling : " + square.getPerimeter(23));
    }
    
}
