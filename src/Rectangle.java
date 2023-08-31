public class Rectangle {
    private final Point topLeft;
    private final Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean isOverLapping(Rectangle other) {
        if (this.topLeft.x > other.bottomRight.x || this.bottomRight.x < other.topLeft.x)
            return false;
        if (this.topLeft.y < other.bottomRight.y || this.bottomRight.y > other.topLeft.y)
            return false;
        return true;
    }
}
