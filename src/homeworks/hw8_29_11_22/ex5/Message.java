package homeworks.hw8_29_11_22.ex5;

public class Message {
    private final String theme;
    private final ProductType productType;
    private final MessageType messageType;
    private final String message;

    public Message(String theme, ProductType productType, MessageType messageType, String message) {
        this.theme = theme;
        this.productType = productType;
        this.messageType = messageType;
        this.message = message;
    }

    public String getTheme() {
        return theme;
    }

    public ProductType getProductType() {
        return productType;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getMessage() {
        return message;
    }

    public void printAllMessages() {
        System.out.println("Тема сообщения: " + getTheme());
        System.out.println("Тип продукта: " + getProductType());
        System.out.println("Тип сообщения: " + getMessageType());
        System.out.println("Сообщение: " + getMessage());
        System.out.println();
    }
}
