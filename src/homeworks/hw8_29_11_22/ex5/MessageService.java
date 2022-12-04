package homeworks.hw8_29_11_22.ex5;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private final List<Message> listOfMessage = new ArrayList<>();

    public void test() {
        addMessage(new Message("Отзыв о работе", ProductType.INTERNET, MessageType.FEEDBACK, "Интернет работает хорошо"));
        addMessage(new Message("Неполадки на линии", ProductType.TELEPHONE, MessageType.CRASH, "Недоступны городские звонки"));
        addMessage(new Message("Заедает кнопка в телефоне", ProductType.TELEPHONE, MessageType.FAULT, "Кнопка нажимается с трудом, требуется анализ работы телефона"));
        addMessage(new Message("Обрыв связи с сервером", ProductType.INTERNET, MessageType.CRASH, "Затопило серверную"));
        addMessage(new Message("Отзыв о работе", ProductType.TELEPHONE, MessageType.FEEDBACK, "Классный телефонный тариф"));
        addMessage(new Message("Потеря доступа в интернет", ProductType.INTERNET, MessageType.CRASH, "Обледенение оптоволокна"));
        addMessage(new Message("Абонентская плата", ProductType.TV, MessageType.PAYMENT, "Абонентская плата повышается со следующего месяца"));
        addMessage(new Message("Потеря каналов", ProductType.TV, MessageType.CRASH, "Нет доступа к спутниковому ТВ"));

        // выводим инфу о всех одинаковых продуктах
        showInfoMessages(getProductTypeMessages(ProductType.TELEPHONE));

        // выводим инфу о всех одинаковых типах сообщений
        showInfoMessages(getMessageTypeMessages(MessageType.CRASH));

        // выводим инфу о всех одинаковых темах сообщений
        showInfoMessages(getStringThemeMessages("Отзыв о работе"));

        // выводим инфу о всех самых популярных продуктах по типу сообщений
        System.out.println(getMostPopularProduct(MessageType.CRASH));
    }

    public void addMessage(Message message) {
        listOfMessage.add(message);
    }

    public List<Message> getProductTypeMessages(ProductType productType) {
        List<Message> productTypeList = new ArrayList<>();
        ProductType strProductType = ProductType.myValueProduct(productType.name());

        for (Message message : listOfMessage) {
            if (message.getProductType().equals(strProductType)) {
                productTypeList.add(message);
            }
        }
        return productTypeList;
    }

    public List<Message> getMessageTypeMessages(MessageType messageType) {
        List<Message> messageTypeList = new ArrayList<>();
        MessageType strMessageType = MessageType.myValueOfMessage(messageType.name());

        for (Message message : listOfMessage) {
            if (message.getMessageType().equals(strMessageType)) {
                messageTypeList.add(message);
            }
        }
        return messageTypeList;
    }

    public List<Message> getStringThemeMessages(String theme) {
        List<Message> messageStringThemeList = new ArrayList<>();
        for (Message message : listOfMessage) {
            if (message.getTheme().equals(theme)) {
                messageStringThemeList.add(message);
            }
        }
        return messageStringThemeList;
    }

    // жесть, а не метод. Логика тупо в лоб, зато работает. Нужно фиксить...
    public ProductType getMostPopularProduct(MessageType messageType) {
        int countInternet = 0, countTelephone = 0, countTV = 0;
        for (Message message : listOfMessage) {
            if (message.getMessageType().equals(messageType) && message.getProductType().equals(ProductType.INTERNET)) {
                countInternet++;
            } else if (message.getMessageType().equals(messageType) && message.getProductType().equals(ProductType.TELEPHONE)) {
                countTelephone++;
            } else if (message.getMessageType().equals(messageType) && message.getProductType().equals(ProductType.TV)) {
                countTV++;
            }
        }
        if (countInternet > countTelephone && countInternet > countTV) {
            return ProductType.INTERNET;
        } else if (countTelephone > countInternet && countTelephone > countTV) {
            return ProductType.TELEPHONE;
        } else if (countTV > countInternet && countTV > countTelephone) {
            return ProductType.TV;
        }
        return null;
    }


    public void showInfoMessages(List<Message> messages) {
        for (Message message : messages) {
            message.printAllMessages();
        }
    }
}

