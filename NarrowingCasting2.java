package AssignmentFirst;

public class NarrowingCasting2 {

    public void narrowCastingInt(){
        double d = 100.235;
        int i = (int) d;
        System.out.println("The converted value of double into int is :"+ " " + i);

    }

    public static void main(String[] args) {
       NarrowingCasting2 nw = new NarrowingCasting2();
       nw.narrowCastingInt();
    }

}
