
class Rectangle{
    double length;
    double width;
    public Rectangle(double l,double w){
        this.length = l;
        this.width = w; 
    }
    public double calculateArea(){
        double area = length * width;
        return area; 
    }
}

class RectangleArea{
    public static void main(String args[]){
        Rectangle rect = new Rectangle(5.0,5.0);
        double result = rect.calculateArea();
        System.out.println("Area: " +result );
    }
}