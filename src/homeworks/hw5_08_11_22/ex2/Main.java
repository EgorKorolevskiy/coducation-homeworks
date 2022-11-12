package homeworks.hw5_08_11_22.ex2;

public class Main {
    public static void main(String[] args) {
        TrueLists.addLists();

        Student student1 = new Student("Ivan", "Ivanov");
        student1.add((new Subject("Russian", 3)));
        student1.add((new Subject("Math", 4)));
        student1.add((new Subject("Physics", 3)));

        Student student2 = new Student("Andrew", "Black");
        student2.add(new Subject("Russian", 5));
        student2.add(new Subject("Physics", 2));

        // вывод через toString
        System.out.println(student1);
        System.out.println(student2);

        System.out.println();

        student1.printInfo();
        System.out.println(student1.getAverageMark());

        System.out.println();

        student2.printInfo();
        System.out.println(student2.getAverageMark());
    }
}
