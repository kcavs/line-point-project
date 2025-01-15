public class TestLine2D {
    /**
     * @param args
     */
    public static void main(String[]args){
        Point p1=new Point();
        Point p2=new Point(3,4);
        Point p3=new Point(4,9);
        Point p4=new Point(6,8);
        Line2D l1=new Line2D(p1,p2);
        Line2D l2=new Line2D(p3,p4);
        Line2D l3=new Line2D(4,9,6,8);
        System.out.println(l1.isCollinear(p3));
        System.out.println(l1.isCollinear(p4));
        

    }
}
