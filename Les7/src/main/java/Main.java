import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String cityCode = RequestHandler.detectCity("Moscow");
        String forecast = RequestHandler.getForecast(cityCode);
        System.out.println(forecast);


       /* OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://gb.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response);*/

    }
}
