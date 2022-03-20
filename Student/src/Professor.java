import java.util.Random;

class Professor {
    Random r = new Random();

    //method that grades a student with random grades
    void grade(student s) {
        s.gradeAssignment1(r.nextInt(11));
        s.gradeAssignment2(r.nextInt(11));
        s.gradeFinalExam(r.nextInt(11));



     /* s.grade1 = r.nextInt(11);
        s.grade2 = r.nextInt(11);
        s.exam = r.nextInt(11);

        System.out.println("Student Grade 1 is: "+ s.grade1);
        System.out.println("Student Grade 2 is: "+ s.grade2);
        System.out.println("Student Grade for exam is: "+ s.exam);

      */
    }
}
