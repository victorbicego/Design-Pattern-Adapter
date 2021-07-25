package com.victorbicego.designpattern;

public class SocketAdapter implements Socket {
    private Socket socketToBeConnected;

    public SocketAdapter(Socket socketToBeConnected) {
        this.socketToBeConnected = socketToBeConnected;
    }

    @Override
    public void connectSocket() {
        System.out.println("Adapter ON");
        if (socketToBeConnected instanceof SocketEU) {
            new SocketUS().connectSocket();
        }
        if (socketToBeConnected instanceof SocketUS) {
            new SocketEU().connectSocket();
        }
    }
}
