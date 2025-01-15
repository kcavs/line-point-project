public class Line2D {
    Point endP1;
    Point endP2;
    int px1;
    int px2;
    int py1;
    int py2;
    public Line2D(Point p1, Point p2){
        endP1=p1;
        endP2=p2;
    }
    public Line2D(int x1,int y1,int x2,int y2){
        px1=x1;
        px2=x2;
        py1=y1;
        py2=y2;
    }
    public Point getP1(){
        return endP1;
    }
    public Point getP2(){
        return endP2;
    }
    public String toString(){
        if(endP1==null){
            return ("[("+px1+", "+py1+"), ("+px2+", "+py2+")]");
        }
        else{
            return ("[("+(this.endP1).getX()+", "+(this.endP1).getY()+"), ("+(this.endP2).getX()+", "+(this.endP2).getY()+")]");
        }
        
    }
    public double getSlope(){
        return (double)((this.endP1).getY()-(this.endP2).getY())/((this.endP1).getX()-(this.endP2).getX());
    }
    public boolean isCollinear(Point p){
        boolean result=false;
        double s1=((double)endP1.getY()-(double)endP2.getY())/((double)endP1.getX()-(double)endP2.getX());
        double s2=((double)endP2.getY()-(double)p.getY())/((double)endP2.getX()-(double)p.getX());
        double s3=((double)p.getY()-(double)endP1.getY())/((double)p.getX()-(double)endP1.getX());
        double dif1=Math.abs(s1-s2);
        double dif2=Math.abs(s2-s3);
        double dif3=Math.abs(s3-s1);
        double dif=dif1+dif2+dif3;
        if(dif<=0.01){
            result=true;
        }
      return result;
    }
}