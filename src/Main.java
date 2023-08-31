public class Main {
    public static void main(String[] args) {
        Point A1 = new Point(0, 2);
        Point B1 = new Point(4, 0);
        Rectangle R1 = new Rectangle(A1, B1);

        Point A2 = new Point(2, 1);
        Point B2 = new Point(5, -1);
        Rectangle R2 = new Rectangle(A2, B2);

        if (R2.isOverLapping(R1))
            System.out.println("Rectangles overlap");
        else
            System.out.println("Rectangles don't overlap");
    }
}