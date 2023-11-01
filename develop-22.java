import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleJavaServer {
  
  private int port;

  public SimpleJavaServer(int port) {
    this.port = port;
  }

  public void start() throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
    server.createContext("/", new RootHandler());
    server.setExecutor(null); // default executor
    server.start();
    System.out.println("server is listening on port" +port);
  }
  
  static class RootHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String response = "Hello, Wordl!";
      exchange.sendResponseHeaders(200, response.length());
      OutputStream os = exchange.getResponseBody();
      os.write(response.getBytes());
      os.close();
    }
  }

  public static void main(String[] args) throws IOException {
    SimpleJavaServer simpleJavaServer = new SimpleJavaServer(8000);
    simpleJavaServer.start();
  }

}





