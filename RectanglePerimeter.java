public class RectanglePerimeter {
    int length, breadth;

    public RectanglePerimeter(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(5, 4);
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
