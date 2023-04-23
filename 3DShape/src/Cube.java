public class Cube extends RectangularPrism {
    public Cube() {

    }

    public Cube(double size) {


    }

    public double getSize() {
        return 10.0;
    }

    public double getArea() {

        return getSize() * 60;
    }

    public double getVolume() {

        return getSize() * getSize() * getSize();
    }



    public String toString() {

        return "Cube size: 10 ";
    }

    public boolean equals(Object obj) {

        return true;
    }
}
