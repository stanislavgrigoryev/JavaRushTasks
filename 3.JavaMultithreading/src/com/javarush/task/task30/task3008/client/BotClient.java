package com.javarush.task.task30.task3008.client;

import java.io.IOException;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected String getUserName() throws IOException {
        int min = 0;
        int max = 99;
        int X = min + (int) (Math.random() * ((max - min) + 1));
        return "date_bot_" + X;
    }

    @Override
    protected boolean shouldSendTextFromConsole() throws IOException {
        return false;
    }

    public class BotSocketThread extends SocketThread {

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BotClient botClient = new BotClient();
        botClient.run();
    }

}
