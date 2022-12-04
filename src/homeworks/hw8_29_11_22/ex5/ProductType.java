package homeworks.hw8_29_11_22.ex5;

public enum ProductType {
    INTERNET("ИНТЕРНЕТ"), TELEPHONE("ТЕЛЕФОНИЯ"), TV("ТЕЛЕВИДЕНИЕ");

    final String PSEVDONIM;

    ProductType(String psevdonim) {
        this.PSEVDONIM = psevdonim;
    }

    public static ProductType myValueProduct(String productType){
        ProductType[] values = values();
        for (ProductType value : values) {
            if (value.name().equalsIgnoreCase(productType)) {
                return value;
            }
        }
        throw new RuntimeException("Неизвестный тип продукта");
    }

    @Override
    public String toString() {
        return PSEVDONIM;
    }
}
