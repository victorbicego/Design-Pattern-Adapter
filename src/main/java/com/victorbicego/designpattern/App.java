package com.victorbicego.designpattern;

public class App {
    public static void main(String[] args) {

        SocketEU socketEurope = new SocketEU();
        SocketUS socketUSA = new SocketUS();

        socketEurope.connectSocket();
        socketUSA.connectSocket();

        SocketAdapter socketAdapterEU = new SocketAdapter(socketEurope);
        socketAdapterEU.connectSocket();

        SocketAdapter socketAdapterUS = new SocketAdapter(socketUSA);
        socketAdapterUS.connectSocket();

    }
}
