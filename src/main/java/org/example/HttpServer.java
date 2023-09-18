package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpServer {

    public final ServerSocket serverSocket;


    public HttpServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);

        while (true) { // while true keeps requests going
            // Allows for other people to connect to us.

            Socket clientSocket = serverSocket.accept(); // When someone connects to us. Called "blocking"
            // .accept() Means wait until the client connects (break). Won't continue until connection happens.

            HttpRequestHandler requestHandler = new HttpRequestHandler(clientSocket);
            requestHandler.start();

            HttpRequest request = new HttpRequest(clientSocket);
            HttpResponse response = new HttpResponse();

            clientSocket.getOutputStream().write(
                    response.getResponse().getBytes(StandardCharsets.UTF_8));
            clientSocket.getOutputStream().close();
            clientSocket.close();

        }
        }


}