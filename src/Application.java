public class Application {
    public static void main(String[] args) {
        Mypoint point1 = new Mypoint(3,0);
        Mypoint point2 = new Mypoint(0,4);
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(5,6));

        Mypoint point3 = new Mypoint();
        point3.setXY(5,5);
        System.out.println("point3= "+point3.toString());
        System.out.println(point3.distance(0,0));

    }
}
