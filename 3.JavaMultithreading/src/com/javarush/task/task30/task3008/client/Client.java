package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() throws IOException {
        String address = ConsoleHelper.readString();
        return address;
    }

    protected int getServerPort() {
        int port = ConsoleHelper.readInt();
        return port;
    }

    protected String getUserName() throws IOException {
        String name = ConsoleHelper.readString();
        return name;
    }

    protected boolean shouldSendTextFromConsole() throws IOException {
        return true;
    }

    protected SocketThread getSocketThread() {
        SocketThread socketThread = new SocketThread();
        return socketThread;
    }

    protected void sendTextMessage(String text) throws IOException, ClassNotFoundException {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка");
            clientConnected = false;
        }
    }

    public void run() throws IOException, ClassNotFoundException {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        synchronized (this) {
            try {
                wait();
                this.notify();
                if (clientConnected) {
                    ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
                } else {
                    ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
                }
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Произошла ошибка");
                socketThread.interrupt();
            }
            while (clientConnected) {
                String message = ConsoleHelper.readString();
                if (message.equals("exit")) {
                    break;
                }
                if (shouldSendTextFromConsole()) {
                    sendTextMessage(message);
                }

            }
        }

    }


    public class SocketThread extends Thread {


        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName);
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName);
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            synchronized (Client.this) {
                Client.this.clientConnected = clientConnected;
                Client.this.notify();
            }

        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client();
        client.run();

    }
}
