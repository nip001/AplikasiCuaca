package com.batch9.aplikasicuaca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.batch9.aplikasicuaca.adapter.OneCallWeatherAdapter;
import com.batch9.aplikasicuaca.entity.oncall.OneCallAPI;
import com.batch9.aplikasicuaca.entity.oncall.Weather;
import com.batch9.aplikasicuaca.service.ApiClient;
import com.batch9.aplikasicuaca.service.WeatherInterface;
import com.bumptech.glide.Glide;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

//    ImageView iconView;
//    TextView txtMain,txtDesc,txtTemp,txtHumidity;

    RecyclerView rvItem;
    String lat = "0";
    String lon = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvItem = findViewById(R.id.rv_cuaca);

        //GET LOCATION
        FusedLocationProviderClient mFusedLocationProviderClient = LocationServices
                .getFusedLocationProviderClient(MainActivity.this);

        mFusedLocationProviderClient.getLastLocation()
                .addOnSuccessListener(MainActivity.this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    lat = String.valueOf(location.getLatitude());
                    lon = String.valueOf(location.getLongitude());

                    WeatherInterface weatherInterface = ApiClient.getRetrofit().create(WeatherInterface.class);
                    Call<OneCallAPI> call = weatherInterface.getOneCallWeather(lon,lat,"minutely,daily,hourly","caadcf08bda325f870e17d08cf7ec231");

                    call.enqueue(new Callback<OneCallAPI>() {
                        @Override
                        public void onResponse(Call<OneCallAPI> call, Response<OneCallAPI> response) {
                            OneCallWeatherAdapter adapter = new OneCallWeatherAdapter((ArrayList<Weather>) response.body().getCurrent().getWeather(),MainActivity.this);
                            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
                            rvItem.setLayoutManager(layoutManager);
                            rvItem.setAdapter(adapter);
                        }

                        @Override
                        public void onFailure(Call<OneCallAPI> call, Throwable t) {
                            System.out.println(t);

                        }
                    });
                }
            }
        });

        //END GET LOCATION

//        WeatherInterface weatherInterface = ApiClient.getRetrofit().create(WeatherInterface.class);
//        Call<OneCallAPI> call = weatherInterface.getOneCallWeather(lon,lat,"minutely,daily,hourly","caadcf08bda325f870e17d08cf7ec231");
//
//        call.enqueue(new Callback<OneCallAPI>() {
//            @Override
//            public void onResponse(Call<OneCallAPI> call, Response<OneCallAPI> response) {
//                OneCallWeatherAdapter adapter = new OneCallWeatherAdapter((ArrayList<Weather>) response.body().getCurrent().getWeather(),MainActivity.this);
//                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
//                rvItem.setLayoutManager(layoutManager);
//                rvItem.setAdapter(adapter);
//            }
//
//            @Override
//            public void onFailure(Call<OneCallAPI> call, Throwable t) {
//                System.out.println(t);
//
//            }
//        });


        // TESTING API WEATHER
//        iconView = findViewById(R.id.iconImage);
//        txtDesc=findViewById(R.id.txtDesc);
//        txtMain=findViewById(R.id.txtMain);
//        txtHumidity=findViewById(R.id.txtHumidity);
//        txtTemp=findViewById(R.id.txtTemp);
//        WeatherInterface weatherInterface = ApiClient.getRetrofit().create(WeatherInterface.class);
//        Call<Weather> call = weatherInterface.getCurrentWeatherByCity("London","caadcf08bda325f870e17d08cf7ec231");
//        call.enqueue(new Callback<Weather>() {
//            @Override
//            public void onResponse(Call<Weather> call, Response<Weather> response) {
//                System.out.println(response.body());
//                Glide.with(MainActivity.this).load("http://openweathermap.org/img/wn/"+response.body().getWeather().get(0).getIcon()+".png").into(iconView);
//                txtDesc.setText(response.body().getWeather().get(0).getDescription());
//                txtMain.setText(response.body().getWeather().get(0).getMain());
//                txtTemp.setText(response.body().getMain().getTemp().toString());
//                txtHumidity.setText(response.body().getMain().getHumidity().toString());
//            }
//
//            @Override
//            public void onFailure(Call<Weather> call, Throwable t) {
//                System.out.println(t);
//            }
//        });

        //END TESTING API WEATHER
    }
}