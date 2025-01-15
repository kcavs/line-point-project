public class TestPoint {
    public static void main(String[]args){
        Point p1=new Point();
        Point p2=new Point(3,4);
        Point p3=new Point(-5,7);
        Point p4=new Point(3,-10);
        Point p5=new Point(3,10);
        Point p6=new Point(6,8);
        int r1 =p2.manhattanDistance(p3); 
        int r2= p3.manhattanDistance(p4); 
        System.out.println("the points: \np1: x=0, y=0\np2: x=3, y=4\np3: x=-5,y=7\np4: x=3, y=-10\np5: x=3, y=10\np6: x=6, y=8");
        System.out.println("\nTesting manhattanDistance:");
        System.out.println("p2 to p3: "+r1);
        System.out.println("p3 to p4: "+r2);
        System.out.println("\nTesting isCollinear: ");
        System.out.println("p2, p4, p5: "+p2.isCollinear(p4,p5));
        System.out.println("p2, p3, p4: "+p2.isCollinear(p3,p4));
        System.out.println("p1, p2, p6: "+p1.isCollinear(p2,p6));
        System.out.println("p1, p2, p3: "+p1.isCollinear(p2,p3));
    }
}
