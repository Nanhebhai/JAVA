// find the area and perimeter of rectangle without taking any input from user
public class pro4 {
    public static void main(String[] args) 
    {
        int length = 5;
        int breadth = 3;

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of rectangle: " + area);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}