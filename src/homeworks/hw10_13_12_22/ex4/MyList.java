package homeworks.hw10_13_12_22.ex4;

public interface MyList {

    //добавляет элемент в список, в качестве основы для хранения чисел взять массив
    // ArrayList
    void add(int val);
    int get(int index);
    int size();
    boolean contains(int val);
}
