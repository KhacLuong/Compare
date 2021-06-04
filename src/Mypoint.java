public class Mypoint {
    int x;
    int y;

    public Mypoint() {
        x=0;
        y=0;
    }

    public Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public double distance(int x, int y){
        int xDiff = this.x -x;
        int yDiff = this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(Mypoint point1){
        int xDiff = this.x - point1.x;
        int yDiff = this.y - point1.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }


    public int getX() {
        return x;
    }

    public void setX(int i, int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
