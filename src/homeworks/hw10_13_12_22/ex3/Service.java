package homeworks.hw10_13_12_22.ex3;

class Service {
    private IntGenerator intGenerator;

    public Service(IntGenerator intGenerator){
        this.intGenerator = intGenerator;
    }

    //генерирует число за счет реализации из конструктора
    public int readInt() {
        return intGenerator.getInt();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
