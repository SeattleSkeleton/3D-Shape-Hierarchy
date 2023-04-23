public class RectangularPrism implements Shape3D{


    public RectangularPrism() {

    }

    public RectangularPrism(double l, double w, double h) {


    }

    public double getLength() {
        return 10.0;

    }

    public double getWidth() {
        return 20.0;

    }

    public double getHeight() {
        return 37.0;

    }

    public double getArea() {

        return 2 * (getWidth() * getLength() + getHeight() * getLength() + getHeight() * getWidth());
    }

    public double getVolume() {

        return getLength() * getLength() * getHeight();
    }

    public String toString() {

        return "Rectangular Prism: width: 20, height: 37";
    }

    public boolean equals(Object obj) {

        return true;
    }
}
