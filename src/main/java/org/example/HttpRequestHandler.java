package org.example;

import java.net.Socket;

public class HttpRequestHandler extends Thread {


    // BUILT IN .START() METHOD OF ALL THREAD - WILL RUN A SEPARATE THREAD
    private final Socket clientSocket;

    public HttpRequestHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {

    }
}
