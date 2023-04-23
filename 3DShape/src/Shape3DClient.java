public class Shape3DClient {
    public static final int MAX = 6;

    public static void main(String[] args) {
        Shape3D[] shapes = new Shape3D[MAX];
        shapes[0] = new SquarePyramid(37, 20);
        shapes[1] = new Sphere(20);
        shapes[2] = new RectangularPrism(10, 20, 37);
        shapes[3] = new Cube(10);
        shapes[4] = new Cylinder(10, 20);
        shapes[5] = new CircularCone(10.0, 20.0);




        for (int i = 0; i < shapes.length; i++) {

            System.out.println("------------------------------------------------------------------");
            System.out.print("This is a ");

            switch(i) {
                case 0:
                    System.out.print("square pyramid. ");
                    break;
                case 1:
                    System.out.print("sphere. ");
                    break;
                case 2:
                    System.out.print("rectangular prism. ");
                    break;
                case 3:
                    System.out.print("cube. ");
                    break;
                case 4:
                    System.out.print("cylinder. ");
                    break;
                case 5:
                    System.out.print("circular cone. ");
            }


            System.out.printf("Area = %.2f. ", shapes[i].getArea());
            System.out.printf("Volume = %.2f. \n", shapes[i].getVolume());



            printInfo(shapes[i]);

        } // end of for
    } // end of main

    public static void printInfo(Shape3D s) {
        System.out.println(s);
        System.out.printf("\tArea = %.2f. ", s.getArea());
        System.out.printf("Volume = %.2f\n", s.getVolume());
    }
}
