package AssignmentFirst;

public class TrianglePerimeter {

    public void perimeterOfTriangle(int a, int b, int c){

        int perimenter = a + b + c;
        System.out.println("The perimeter of triangle of given sides is "+perimenter);

    }

    public static void main(String[] args) {
        TrianglePerimeter tp = new TrianglePerimeter();
        tp.perimeterOfTriangle(2,3,5);
    }
}
