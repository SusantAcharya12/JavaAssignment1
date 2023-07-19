package AssignmentFirst;



public class StudentObjectLast {
    public void studentName(){
        System.out.println("Unknown");
    }

    public void studentName(String name){

        System.out.println(name);
    }


    public static void main(String[] args) {
        StudentObjectLast sol = new StudentObjectLast();
        sol.studentName();
        sol.studentName("susant");

    }
}
