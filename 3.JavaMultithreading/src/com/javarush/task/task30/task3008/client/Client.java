package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() throws IOException{
        ConsoleHelper.writeMessage("Введите адрес сервера:");
        String address = ConsoleHelper.readString();
        return address;
    }

    protected int getServerPort() {
        ConsoleHelper.writeMessage("Введите порт сервера:");
        int port = ConsoleHelper.readInt();
        return port;
    }

    protected String getUserName() throws IOException{
        ConsoleHelper.writeMessage("Введите ваше имя:");
        String name = ConsoleHelper.readString();
        return name;
    }

    protected boolean shouldSendTextFromConsole() throws IOException {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) throws IOException, ClassNotFoundException {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка. Не удалось отправить сообщение");
            clientConnected = false;
        }
    }

    public class SocketThread extends Thread {
    }
}
