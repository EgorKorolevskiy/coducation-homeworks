package homeworks.hw11_20_12_22_lyambda_try_catch.ex4;

public class ServiceList {
    MyList myList;

    public ServiceList(MyList myList) {
        this.myList = myList;
    }

    //добавляет элемент в myList
    public void add(int val) {
        myList.add(val);
    }

    //возвращает элемент из myList под индексом index
    public int get(int index) {
       return myList.get(index);
    }

    public int size() {
        return myList.size();
    }

    public boolean contains(int val) {
        return myList.contains(val);
    }
}
