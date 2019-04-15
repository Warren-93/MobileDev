//package project.suzieqcraft.View;
//
//import android.content.Intent;
//import android.opengl.Visibility;
//import android.os.AsyncTask;
//import android.os.Bundle;
//import android.support.design.widget.NavigationView;
//import android.support.v4.view.GravityCompat;
//import android.support.v4.widget.DrawerLayout;
//import android.support.v7.app.ActionBarDrawerToggle;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import javax.net.ssl.HttpsURLConnection;
//
//import project.suzieqcraft.Controller.Connection;
//import project.suzieqcraft.R;
//
//public class AppMenu extends AppCompatActivity
//        implements NavigationView.OnNavigationItemSelectedListener {
//
//    TextView displayUserEmail;
//
//    Button testBtn;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate( savedInstanceState );
//        displayUserEmail = findViewById( R.id.displayUserEmail );
//        //testBtn = findViewById( R.id.testBtn );
//
//
//        setContentView( R.layout.activity_menu );
//        Toolbar toolbar = findViewById( R.id.toolbar );
//        setSupportActionBar( toolbar );
//
//        DrawerLayout drawer = findViewById( R.id.drawer_layout );
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
//        drawer.addDrawerListener( toggle );
//        toggle.syncState();
//
//        NavigationView navigationView = findViewById( R.id.nav_view );
//        navigationView.setNavigationItemSelectedListener( this );
//
////        testBtn.setOnClickListener( new View.OnClickListener() {
////            @Override
////            public void onClick(View view){
////                startActivity(new Intent(AppMenu.this, test.class));
////            }
////        });
//
//        class BackgroundProducts extends AsyncTask<String, Void, String>{
//            private String productjson_url;
//
//            @Override
//            protected void onPreExecute(){
//                productjson_url = "https://mayar.abertay.ac.uk/~1605460/Android/Model/getProducts.php";
//            }
//
//            @Override
//            protected String doInBackground(String... strings) {
//                try {
//                    URL url = new URL(productjson_url);
//                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection)url.openConnection();
//                    InputStream inputStream = httpsURLConnection.getInputStream();
//                    BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( inputStream ) );
//                    StringBuilder stringBuilder = new StringBuilder();
//                    String result = "";
//                    String line;
//                    while((line = bufferedReader.readLine()) != null) {
//                        result += line;
//                    }
//                    bufferedReader.close();
//                    inputStream.close();
//                    httpsURLConnection.disconnect();
//
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            protected void onProgressUpdate(Void...values){
//                super.onProgressUpdate( values );
//
//            }
//
//            @Override
//            protected void onPostExecute(String result) {
//                try{
//                    JSONArray products = new JSONArray( result );
//                    for(int i=0; i < products.length(); i++) {
//                        JSONObject jsonobject = products.getJSONObject(i);
//                        String type     = jsonobject.getString("Product_Type");
//                        String price    = jsonobject.getString("Product_Price");
//                        String image    = jsonobject.getString( "Product_Image" );
//
////                        TextView textView = findViewById( R.id.textView );
////                        ImageView image = findViewById( R.id.imageView );
////                        textView.setText( type );
////                        textView2.setText(price);
//                    }
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                } {
//
//                }
//            }
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = findViewById( R.id.drawer_layout );
//        if (drawer.isDrawerOpen( GravityCompat.START )) {
//            drawer.closeDrawer( GravityCompat.START );
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    public boolean onCreateOptionsMenu(AppMenu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate( R.menu.menu, (android.view.Menu) menu );
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected( item );
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_productlist) {
//
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_basket) {
//
//        } else if (id == R.id.nav_send) {
//
//        } else if (id == R.id.nav_exit) {
//        }
//
//        DrawerLayout drawer = findViewById( R.id.drawer_layout );
//        drawer.closeDrawer( GravityCompat.START );
//        return true;
//    }
//
//
//}
//
//
//
//
