public class RectangleArea {
    int length, breadth;

    public RectangleArea(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea(5, 4);
        System.out.println("Area: " + rect.getArea());
    }
}
