public class PointTest {
    public static void main(String[] args) {
        Point point2d = new Point(3, 5);
        System.out.println(point2d);

        Point3D point3d = new Point3D(5, 1, 7);
        System.out.println(point3d);

        Point p2 = new Point();
        Point p3 = new Point3D();

        System.out.println(p2);
        System.out.println(p3);
    }
}