package homeworks.hw5_08_11_22.ex2;

import java.util.ArrayList;

public class Student {
    private String nameStudent;
    private String surnameStudent;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public Student(String nameStudent, String surnameStudent) {
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public boolean add(Subject subject) {
        if (TrueLists.checkTrueSubject(subject.getNameSubject()) && TrueLists.checkTrueMark(subject.getMark())){
            subjects.add(new Subject(subject.getNameSubject(), subject.getMark()));
            return true;
        }
        return false;
    }

    public double getAverageMark() {
        double countMarks = 0;
        double count = 0;
        double averageMark = 0;
        for (Subject subject : subjects) {
            subject.getMark();
            countMarks++;
            count = subject.getMark();
            averageMark = averageMark + count;
        }
        System.out.print("Средняя оценка студента: " + getNameStudent() + " " + surnameStudent + " ");
        return averageMark / countMarks;
    }

    // почему только с булеан????
    public boolean printInfo() {
        System.out.println(nameStudent + " " + surnameStudent + " " + getSubjects() + " ");
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", surnameStudent='" + surnameStudent + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
