import org.example.HttpClient;
import org.junit.jupiter.api.Test;

public class HttpClientTest {

    @Test
    void shouldMakeHttpCallAndGet200Response(){
        HttpClient client = new HttpClient("httpbin.org", 80, "/html");

        assert client.statusCode == 200;
        assert client.headers.get("Content-Type") != null;
        assert client.body != null;
    }
}