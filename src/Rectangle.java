public class Rectangle {
    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getPerimeter() {
        return (Math.abs((topLeft.x - bottomRight.x)) + Math.abs((topLeft.y - bottomRight.y))) * 2;
    }

    public int getArea() {
        return Math.abs((topLeft.x - bottomRight.x) * (topLeft.y - bottomRight.y));
    }

    public boolean isOverLapping(Rectangle other) {
        if (this.topLeft.x > other.bottomRight.x || this.bottomRight.x < other.topLeft.x) return false;
        if (this.topLeft.y < other.bottomRight.y || this.bottomRight.y > other.topLeft.y) return false;
        return true;
    }
}
