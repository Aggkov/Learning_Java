public class student {
    String name;
    String surname;
    int grade1;
    int grade2;
    int exam;

    student(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }
    student(String name, String surname, int grade1, int grade2) {
        this(name,surname);           // call previous constructor
        this.grade1 = grade1;
        this.grade2 = grade2;
    }
    // method that sets grade1 equal to argument
     void gradeAssignment1(int grade1) {
        this.grade1 = grade1;
    }

    //method 2 that sets grade2 equal to argument
    void gradeAssignment2(int grade2) {
        this.grade2 = grade2;
    }
    //method that sets exam grade equal to argument
    void gradeFinalExam(int exam) {
        this.exam = exam;
    }

    //method that returns average of 3 grades
    double finalGrade() {
        return (grade1 + grade2 + exam) / (double)3;
    }
}

