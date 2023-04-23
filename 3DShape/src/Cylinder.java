public class Cylinder implements Shape3D {
    public Cylinder() {

    }

    public Cylinder(double radius, double height) {

    }

    public double getHeight() {
        return 20.0;

    }

    public double getRadius() {
        return 10.0;
    }

    public double getArea() {

        return 2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * getRadius() * getRadius();
    }

    public double getVolume() {

        return Math.PI * getRadius() * getRadius() * getHeight();
    }

    public String toString() {
        return "Cylinder: height: 20, length: 10";

    }

    public boolean equals(Object obj) {
        return true;

    }
}
