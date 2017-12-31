package project1.nview.org.project1;

import com.loopj.android.http.*;
import org.json.*;


public class NewsSet {

    public void getNews()  {

        String apiParams = null;
        APIClient.get("/top-headlines", apiParams, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {

                try {
                    String news = response.getString("articles");
                    System.out.println(news);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
