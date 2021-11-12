import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.sjavac.server.RequestHandler;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(RequestHandler.detectCity("Moscow"));





        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://gb.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();

    }
}
