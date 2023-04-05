public class Rectangle {
    private double x;
    private double y;
    private double height;
    private double width;
    public Rectangle(double x , double y, double height, int width) {
        this.x=x;
        this.y=y;
        this.height=height;
        this.width=width;
    }
    public Rectangle(){
        x = 0;
        y = 0;;
        height = 1;
        width = 1;
    }

    double getX(){
        return x;
    }
    double getY(){
        return y;
    }
    double getLeftX(){
        return (x-(width/2));
    }
    double getRightX(){
        return (x+(width/2));
    }
    double getTopY(){
        return (y+(height/2));
    }
    double getBottomY(){
        return (y-(height/2));
    }
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    double getArea(){
        return (x*y*width*height);
    }
    double getPerimeter(){
        return ((x*2)+(y*2));
    }
    boolean contains(double x, double y){   //take the point location, use the 2D area of the rectangle
        if (x>getLeftX() && x<getRightX() && y>getBottomY() && y<getTopY()){
            return true;
        } else {
            return false;
        }
    }
    boolean contains(Rectangle r){ //r.getLeftX
        if (r.getLeftX()>getLeftX() && r.getRightX()<getRightX() && r.getBottomY()>getBottomY() && r.getTopY()<getTopY()){
            return true;
        } else {
            return false;
        }
    }
}
