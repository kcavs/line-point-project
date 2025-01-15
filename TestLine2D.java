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
        System.out.println("the points: \np1: x=0, y=0\np2: x=3, y=4\np3: x=4, y=9\np4: x=6, y=8");
        System.out.println("testing constructor using 2 point objects and toString method:\nline 1: "+l1.toString()+"\nline 2: "+l2.toString());
        System.out.println("testing constructor using 4 int's and the toString method:\nline 1: "+l3.toString());
        System.out.println("testing getP1 and getP2 methods:\nline 1, getP1: x="+(l1.getP1()).getX()+", y="+(l1.getP1()).getY()+"\nline 1, getP2: x="+(l1.getP2()).getX()+", y="+(l1.getP2()).getY()+"\nline 2, getP1: x="+(l2.getP1()).getX()+", y="+(l2.getP1()).getY()+"\nline 2, getP2 x="+(l2.getP2()).getX()+", y="+(l2.getP2()).getY());
        System.out.println("testing getSlope:\nline 1 slope: "+l1.getSlope()+"\nline 2 slope: "+l2.getSlope());
        System.out.println("line1 and p3:"+l1.isCollinear(p3));
        System.out.println("line1 and p4:"+l1.isCollinear(p4));
        

    }
}
