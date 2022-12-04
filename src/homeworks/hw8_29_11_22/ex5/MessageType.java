package homeworks.hw8_29_11_22.ex5;

public enum MessageType {
    FEEDBACK("ОТЗЫВ"), CRASH("АВАРИЯ"), FAULT("МЕЛКИЕ НЕПОЛАДКИ"), PAYMENT("ОПЛАТА");

    final String PSEVDONIM;

    MessageType (String psevdonim) {
        this.PSEVDONIM = psevdonim;
    }

    public static MessageType myValueOfMessage(String messageType) {
        MessageType[] values = values();
        for (MessageType value : values) {
            if (value.name().equalsIgnoreCase(messageType)) {
                return value;
            }
        }
        throw new RuntimeException("Неизвестный тип сообщения");
    }

    @Override
    public String toString() {
        return PSEVDONIM;
    }
}
