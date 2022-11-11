package homeworks.hw5_08_11_22.ex2;

import java.util.ArrayList;

public class Subject {
    private String nameSubject;
    private int mark;

    public Subject(String nameSubject, int mark) {
        this.nameSubject = nameSubject;
        this.mark = mark;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "nameSubject='" + nameSubject + '\'' +
                ", mark=" + mark +
                '}';
    }
}
