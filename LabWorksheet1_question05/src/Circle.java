public class Circle {
    private double radius;

    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double computeArea(){
        return Math.PI * radius * radius;
    }
    public double computeCircumference(){
        return 2 * Math.PI * radius ;
    }
}

