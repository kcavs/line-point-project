public class Point{
    private int x;
    private int y;
    public Point(){
        x=0;
        y=0;
    }
    public Point(int tx, int ty){
        x=tx;
        y=ty;
    }
    public int manhattanDistance(Point other){
        int dist=Math.abs((this.getX()+(other.getX())+(this.getY()+other.getY())));
        return dist;
    }
    public boolean isCollinear(Point p1, Point p2){
        double s1=((double)this.getY()-(double)p1.getY())/((double)this.getX()-(double)p1.getX());
        double s2=((double)p1.getY()-(double)p2.getY())/((double)p1.getX()-(double)p2.getX());
        double s3=((double)p2.getY()-(double)this.getY())/((double)p2.getX()-(double)this.getX());
        double dif1=Math.abs(s1-s2);
        double dif2=Math.abs(s2-s3);
        double dif3=Math.abs(s3-s1);
        if(dif1<=0.01){
            if(dif2<-0.01){
                if(dif3<=0.01){
                    return true;
                }
            }
        }
      return false;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int tx){
        x=tx;
    }
    public void setY(int ty){
        y=ty;
    }
}