package app;

import javax.xml.ws.Endpoint;

public class BancoServerPublisher{

    public static void main(String[] args)
    {
        Endpoint.publish("http://127.0.0.1:8080/app",
        new BancoServerImpl());
    }
}