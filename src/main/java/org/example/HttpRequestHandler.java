package org.example;

import java.net.Socket;

public class HttpRequestHandler extends Thread {

    private final Socket clientSocket;

    public HttpRequestHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

    }
}
