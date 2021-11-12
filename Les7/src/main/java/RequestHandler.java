import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RequestHandler {
    final static OkHttpClient okHttpClient = new OkHttpClient();

    public static String detectCity(String cityName) throws IOException {


        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "sKLqeKIYPzoYH9Nj1024Pt0hRfMbAXlZ")
                .addQueryParameter("q", cityName)
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(httpUrl)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        String json = response.body().string();

        return json;


    }

}
