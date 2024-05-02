package com.javarush.task.task30.task3008.client;

import java.io.IOException;

public class ClientGuiController extends Client {
    private ClientGuiModel model = new ClientGuiModel();
    private ClientGuiView view = new ClientGuiView(this);

    @Override
    protected String getServerAddress() throws IOException {
        return view.getServerAddress();
    }

    @Override
    protected int getServerPort() {
        return view.getServerPort();
    }

    @Override
    protected String getUserName() throws IOException {
        return view.getUserName();
    }

    public ClientGuiModel getModel() {
        return model;
    }

    public void sendTextMessage(String text) {
        sendTextMessage(text);
    }

    @Override
    public void run() {
        getSocketThread().run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new GuiSocketThread();
    }


    public class GuiSocketThread extends SocketThread {
        @Override
        protected void processIncomingMessage(String message) throws IOException, ClassNotFoundException {
            model.setNewMessage(message);
            view.refreshMessages();
        }

        @Override
        protected void informAboutAddingNewUser(String userName) {
            model.addUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void informAboutDeletingNewUser(String userName) {
            model.deleteUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            view.notifyConnectionStatusChanged(clientConnected);
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClientGuiController controller = new ClientGuiController();
        controller.run();
    }
}
