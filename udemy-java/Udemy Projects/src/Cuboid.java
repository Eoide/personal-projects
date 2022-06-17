public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height<0) this.height = 0;
        else this.height = height;
    }

    public Cuboid() {
        super(0,0);
        this.height = 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.height*getArea();
    }
}
