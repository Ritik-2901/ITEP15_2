import java.util.Scanner;
class Student {
    private String name;
    private int marks;

    public Student() {}

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public String getGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}


  class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("ritik", 85);
        Student s2 = new Student("dinesh", 70);
        Student s3 = new Student("dipesh", 35);

        System.out.println(s1.getName() + " grade: " + s1.getGrade());
        System.out.println(s2.getName() + " grade: " + s2.getGrade());
        System.out.println(s3.getName() + " grade: " + s3.getGrade());
    }
}


