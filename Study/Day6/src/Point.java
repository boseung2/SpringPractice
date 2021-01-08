class Point {
    int x;
    int y;

    public Point() {
        this(1, 1);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(Point p1, Point p2) {
        return Math.sqrt((p2.x-p1.x) * (p2.x-p1.x) + (p2.y-p2.x) * (p2.y-p2.x));
    }

    public double getDistance(Point p) {
        return Point.getDistance(this, p);
    }

    @Override
    public boolean equals(Object p) {
        if(!(p instanceof Point)) return false;
        Point point = (Point)p;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public String toString() {
        return "x=" + x + " y=" + y;
    }
}
