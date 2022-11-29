package homeworks.hw5_08_11_22.ex2;

import java.util.ArrayList;

public class TrueLists {
    public static ArrayList<String> listsSubjectsNames = new ArrayList<>();
    public static ArrayList<Integer> listsOfMarks = new ArrayList<>();

    public static void addLists() {
        listsSubjectsNames.add("Russian");
        listsSubjectsNames.add("Math");
        listsSubjectsNames.add("Physics");

        listsOfMarks.add(1);
        listsOfMarks.add(2);
        listsOfMarks.add(3);
        listsOfMarks.add(4);
        listsOfMarks.add(5);
    }

    public static boolean checkTrueSubject(String subject) {
        for (String listsSubjectsName : listsSubjectsNames) {
            if (subject.equalsIgnoreCase(listsSubjectsName)) {
                return true;
            }
        }
        System.out.println("No such subject ");
        return false;
    }

    public static boolean checkTrueMark(int mark) {
        for (Integer listsOfAssessment : listsOfMarks) {
            if(mark == listsOfAssessment) {
                return true;
            }
        }
        System.out.println("No such mark");
        return false;
    }
}
