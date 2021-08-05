package com.batch9.aplikasicuaca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.batch9.aplikasicuaca.entity.Weather;
import com.batch9.aplikasicuaca.service.ApiClient;
import com.batch9.aplikasicuaca.service.WeatherInterface;
import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ImageView iconView;
    TextView txtMain,txtDesc,txtTemp,txtHumidity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cuaca);

        iconView = findViewById(R.id.iconImage);
        txtDesc=findViewById(R.id.txtDesc);
        txtMain=findViewById(R.id.txtMain);
        txtHumidity=findViewById(R.id.txtHumidity);
        txtTemp=findViewById(R.id.txtTemp);
//        Map<String, String> data = new HashMap<>();
//        data.put("q","Jakarta");
//        data.put("appid","caadcf08bda325f870e17d08cf7ec231");
        WeatherInterface weatherInterface = ApiClient.getRetrofit().create(WeatherInterface.class);
        Call<Weather> call = weatherInterface.getCurrentWeatherByCity("London","caadcf08bda325f870e17d08cf7ec231");
        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                System.out.println(response.body());
                Glide.with(MainActivity.this).load("http://openweathermap.org/img/wn/"+response.body().getWeather().get(0).getIcon()+".png").into(iconView);
                txtDesc.setText(response.body().getWeather().get(0).getDescription());
                txtMain.setText(response.body().getWeather().get(0).getMain());
                txtTemp.setText(response.body().getMain().getTemp().toString());
                txtHumidity.setText(response.body().getMain().getHumidity().toString());
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                System.out.println(t);
            }
        });
    }
}