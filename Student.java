class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
    }
}

class UnderGraduateStudents extends Student {
    String branch;
    int year;

    UnderGraduateStudents(int rollno, String name, String branch, int year) {
        super(rollno, name);
        this.branch = branch;
        this.year = year;
    }

    void display() {
        super.display();
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
    }
}

class GraduateStudent extends Student {
    String course;

    GraduateStudent(int rollno, String name, String course) {
        super(rollno, name);
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

class Junior extends UnderGraduateStudents {
    int marks;

    Junior(int rollno, String name, String branch, int year, int marks) {
        super(rollno, name, branch, year);
        this.marks = marks;
    }

    void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

class Senior extends UnderGraduateStudents {
    int marks;

    Senior(int rollno, String name, String branch, int year, int marks) {
        super(rollno, name, branch, year);
        this.marks = marks;
    }

    void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

class MasterStudents extends GraduateStudent {
    int marks;

    MasterStudents(int rollno, String name, String course, int marks) {
        super(rollno, name, course);
        this.marks = marks;
    }

    void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

class PhdStudent extends GraduateStudent {
    int marks;

    PhdStudent(int rollno, String name, String course, int marks) {
        super(rollno, name, course);
        this.marks = marks;
    }

    void display() {
        super.display();
        System.out.println("Marks: " + marks);
    }
}

class Driver {
    public static void main(String[] args) {
        Junior j = new Junior(1, "John", "CSE", 1, 100);
        j.display();
        System.out.println();

        Senior s = new Senior(2, "John", "CSE", 1, 100);
        s.display();
        System.out.println();

        MasterStudents m = new MasterStudents(3, "John", "CSE", 100);
        m.display();
        System.out.println();

        PhdStudent p = new PhdStudent(4, "John", "CSE", 100);
        p.display();
    }
}
