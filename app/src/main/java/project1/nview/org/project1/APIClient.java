//package project1.nview.org.project1;
//
//import android.widget.TextView;
//
//import com.android.volley.Request;
//import com.android.volley.RequestQueue;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.StringRequest;
//import com.android.volley.toolbox.Volley;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.ProtocolException;
//import java.net.URL;
//
//
//public class APIClient {
//    final TextView mTextView = (TextView) findViewById(R.id.text);
//
////    private static final String BASE_URL = "https://newsapi.org/v2/";
//    HttpURLConnection con;
//
//    public APIClient(String url){
//        try {
//             con = (HttpURLConnection) ( new URL(url)).openConnection();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void doGet() throws ProtocolException {
//
//
//// Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="http://www.google.com";
//
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        mTextView.setText("Response is: "+ response.substring(0,500));
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                mTextView.setText("That didn't work!");
//            }
//        });
//// Add the request to the RequestQueue.
//        queue.add(stringRequest);
//
//    }
//
//    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//
//        HttpClient client = new HttpClient() {
//        };
//        HttpGet request = new HttpGet("http://stackoverflow.com/opensearch.xml");
//        request.setHeader("User-Agent", "set your desired User-Agent");
//
//        try {
//            HttpResponse response = client.execute(request);
//
//        }
//    }
//
//    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.post(getAbsoluteUrl(url), params, responseHandler);
//    }
//
//    private static String getAbsoluteUrl(String relativeUrl) {
//        return BASE_URL + relativeUrl;
//    }
//}
