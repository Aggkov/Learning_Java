public class Main {

    public static void main(String[] args) {
        student s = new student("Angelos", "Kovatsis");
        Professor p = new Professor();

        double grade;

        //call professor method to grade student
        p.grade(s);

        System.out.println("Final Grade is: " + s.finalGrade());



    }
}
