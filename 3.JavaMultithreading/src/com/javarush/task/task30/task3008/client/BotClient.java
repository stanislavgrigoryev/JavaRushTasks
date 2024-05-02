package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {

            BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");

            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) throws IOException, ClassNotFoundException {
            ConsoleHelper.writeMessage(message);

            String userNameDelimiter = ": ";
            String[] split = message.split(userNameDelimiter);
            if (split.length != 2) return;

            String messageWithoutUserName = split[1];


            String format = null;
            switch (messageWithoutUserName) {
                case "дата":
                    format = "d.MM.YYYY";
                    break;
                case "день":
                    format = "d";
                    break;
                case "месяц":
                    format = "MMMM";
                    break;
                case "год":
                    format = "YYYY";
                    break;
                case "время":
                    format = "H:mm:ss";
                    break;
                case "час":
                    format = "H";
                    break;
                case "минуты":
                    format = "m";
                    break;
                case "секунды":
                    format = "s";
                    break;
            }

            if (format != null) {
                String answer = new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
                BotClient.this.sendTextMessage("Информация для " + split[0] + ": " + answer);
            }
        }
    }

}
