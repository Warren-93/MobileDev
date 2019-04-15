package project.suzieqcraft.View;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import project.suzieqcraft.Model.Product;
import project.suzieqcraft.Model.ProductArrayList;
import project.suzieqcraft.R;
import project.suzieqcraft.View.CustomAdapter;


public class test extends AppCompatActivity {

         public     RecyclerView recyclerViewer;
         public     CustomAdapter adapter;
         public     TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_test );


        new BackgroundProducts().execute();
        recyclerViewer = findViewById( R.id.recyclerViewer );
        //load_data_from_server(0);

        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager( this);
        recyclerViewer.setLayoutManager(linearLayoutManager);


//        adapter = new CustomAdapter(this, productsList);
//        recyclerViewer.setAdapter(adapter);

//        recyclerViewer.addOnScrollListener(new RecyclerView.OnScrollListener() {
//        @Override
//        public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//            if(linearLayoutManager.findLastCompletelyVisibleItemPosition() == (productsList.size() - 1)){
//                new BackgroundProducts().execute();
//                //load_data_from_server(data_list.get(data_list.size()-1).getId());
//                }
//            }
//        });
    }

     protected class BackgroundProducts extends AsyncTask<String, Void, String>{
        private String productjson_url;

        @Override
        protected void onPreExecute(){
            productjson_url = "https://mayar.abertay.ac.uk/~1605460/Android/Model/getProducts.php";
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL(productjson_url);
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection)url.openConnection();
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
                String result = "";
                String line;
                while((line = bufferedReader.readLine()) != null) {
                    result += line;
                }
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Void...values){
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            //                JSONArray products = new JSONArray(result);
//                ProductArrayList productList = new ObjectMapper().readValue(products.toString(), ProductArrayList.class);

//                JSONArray products = new JSONArray(result);
//                ArrayList<Product> productList;
//                productList = new ObjectMapper().readValue(products.toString(), ArrayList.class);
//


            try {
                JSONArray products = new JSONArray(result);
                ArrayList<HashMap<String, String>> jsonObjectArrayList = null;

                jsonObjectArrayList = new ObjectMapper().readValue( products.toString(), ArrayList.class );

                for (HashMap<String, String> products : jsonObjectArrayList) {
                    jsonObjectArrayList.add();

                }
            }catch (JSONException e) {
                e.printStackTrace();
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

//                adapter = new CustomAdapter( test.this, productList);
//                recyclerViewer.setAdapter(adapter);
//                adapter.notifyDataSetChanged();

        }
    }
}

