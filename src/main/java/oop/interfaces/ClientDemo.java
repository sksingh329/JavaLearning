package oop.interfaces;

public class ClientDemo {
    public static void main(String[] args) {
        Callback callbackClient = new Client();
        callbackClient.callback(20);
    }
}
