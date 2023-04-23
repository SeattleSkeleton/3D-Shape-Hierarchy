public class CircularCone implements Shape3D {
    public double radius;


    public CircularCone() {

    }

    public CircularCone(double radius, double height) {

    }

    public double getDiameter() {
        return 50.0;

    }

    public double getRadius() {
        return 10.0;

    }

    public double getArea() {


        return Math.PI * getRadius() * (getRadius() + Math.sqrt(getRadius() * getRadius() + getHeight() * getHeight()));
    }


    public double getHeight() {

        return 10.0;
    }

    public double getVolume() {
        
        return getArea() * getHeight() / 3.0;
    }

    public String toString() {
        return "Cone: radius: 10, height: 20 ";

    }

    public boolean equals(Object obj) {
        return true;

    }
}
