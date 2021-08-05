
package com.batch9.aplikasicuaca.entity.oncall;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Daily implements Serializable, Parcelable
{

    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("sunrise")
    @Expose
    private Integer sunrise;
    @SerializedName("sunset")
    @Expose
    private Integer sunset;
    @SerializedName("moonrise")
    @Expose
    private Integer moonrise;
    @SerializedName("moonset")
    @Expose
    private Integer moonset;
    @SerializedName("moon_phase")
    @Expose
    private Double moonPhase;
    @SerializedName("temp")
    @Expose
    private Temp temp;
    @SerializedName("feels_like")
    @Expose
    private FeelsLike feelsLike;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("dew_point")
    @Expose
    private Double dewPoint;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_deg")
    @Expose
    private Integer windDeg;
    @SerializedName("wind_gust")
    @Expose
    private Double windGust;
    @SerializedName("weather")
    @Expose
    private List<Weather__2> weather = null;
    @SerializedName("clouds")
    @Expose
    private Integer clouds;
    @SerializedName("pop")
    @Expose
    private Double pop;
    @SerializedName("rain")
    @Expose
    private Double rain;
    @SerializedName("uvi")
    @Expose
    private Integer uvi;
    public final static Creator<Daily> CREATOR = new Creator<Daily>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Daily createFromParcel(android.os.Parcel in) {
            return new Daily(in);
        }

        public Daily[] newArray(int size) {
            return (new Daily[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3060762969909389661L;

    protected Daily(android.os.Parcel in) {
        this.dt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sunrise = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sunset = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.moonrise = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.moonset = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.moonPhase = ((Double) in.readValue((Double.class.getClassLoader())));
        this.temp = ((Temp) in.readValue((Temp.class.getClassLoader())));
        this.feelsLike = ((FeelsLike) in.readValue((FeelsLike.class.getClassLoader())));
        this.pressure = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.humidity = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dewPoint = ((Double) in.readValue((Double.class.getClassLoader())));
        this.windSpeed = ((Double) in.readValue((Double.class.getClassLoader())));
        this.windDeg = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.windGust = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.weather, (com.batch9.aplikasicuaca.entity.oncall.Weather__2.class.getClassLoader()));
        this.clouds = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pop = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rain = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uvi = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Daily() {
    }

    /**
     * 
     * @param moonset
     * @param rain
     * @param sunrise
     * @param temp
     * @param windGust
     * @param uvi
     * @param moonrise
     * @param pressure
     * @param clouds
     * @param dewPoint
     * @param dt
     * @param feelsLike
     * @param windDeg
     * @param pop
     * @param sunset
     * @param weather
     * @param humidity
     * @param moonPhase
     * @param windSpeed
     */
    public Daily(Integer dt, Integer sunrise, Integer sunset, Integer moonrise, Integer moonset, Double moonPhase, Temp temp, FeelsLike feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double windSpeed, Integer windDeg, Double windGust, List<Weather__2> weather, Integer clouds, Double pop, Double rain, Integer uvi) {
        super();
        this.dt = dt;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.moonrise = moonrise;
        this.moonset = moonset;
        this.moonPhase = moonPhase;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.clouds = clouds;
        this.pop = pop;
        this.rain = rain;
        this.uvi = uvi;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getSunrise() {
        return sunrise;
    }

    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    public Integer getSunset() {
        return sunset;
    }

    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    public Integer getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(Integer moonrise) {
        this.moonrise = moonrise;
    }

    public Integer getMoonset() {
        return moonset;
    }

    public void setMoonset(Integer moonset) {
        this.moonset = moonset;
    }

    public Double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(Double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(Double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDeg() {
        return windDeg;
    }

    public void setWindDeg(Integer windDeg) {
        this.windDeg = windDeg;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public List<Weather__2> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather__2> weather) {
        this.weather = weather;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Integer getUvi() {
        return uvi;
    }

    public void setUvi(Integer uvi) {
        this.uvi = uvi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Daily.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
        sb.append(',');
        sb.append("sunrise");
        sb.append('=');
        sb.append(((this.sunrise == null)?"<null>":this.sunrise));
        sb.append(',');
        sb.append("sunset");
        sb.append('=');
        sb.append(((this.sunset == null)?"<null>":this.sunset));
        sb.append(',');
        sb.append("moonrise");
        sb.append('=');
        sb.append(((this.moonrise == null)?"<null>":this.moonrise));
        sb.append(',');
        sb.append("moonset");
        sb.append('=');
        sb.append(((this.moonset == null)?"<null>":this.moonset));
        sb.append(',');
        sb.append("moonPhase");
        sb.append('=');
        sb.append(((this.moonPhase == null)?"<null>":this.moonPhase));
        sb.append(',');
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null)?"<null>":this.temp));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');
        sb.append("dewPoint");
        sb.append('=');
        sb.append(((this.dewPoint == null)?"<null>":this.dewPoint));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("windDeg");
        sb.append('=');
        sb.append(((this.windDeg == null)?"<null>":this.windDeg));
        sb.append(',');
        sb.append("windGust");
        sb.append('=');
        sb.append(((this.windGust == null)?"<null>":this.windGust));
        sb.append(',');
        sb.append("weather");
        sb.append('=');
        sb.append(((this.weather == null)?"<null>":this.weather));
        sb.append(',');
        sb.append("clouds");
        sb.append('=');
        sb.append(((this.clouds == null)?"<null>":this.clouds));
        sb.append(',');
        sb.append("pop");
        sb.append('=');
        sb.append(((this.pop == null)?"<null>":this.pop));
        sb.append(',');
        sb.append("rain");
        sb.append('=');
        sb.append(((this.rain == null)?"<null>":this.rain));
        sb.append(',');
        sb.append("uvi");
        sb.append('=');
        sb.append(((this.uvi == null)?"<null>":this.uvi));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.moonset == null)? 0 :this.moonset.hashCode()));
        result = ((result* 31)+((this.rain == null)? 0 :this.rain.hashCode()));
        result = ((result* 31)+((this.sunrise == null)? 0 :this.sunrise.hashCode()));
        result = ((result* 31)+((this.temp == null)? 0 :this.temp.hashCode()));
        result = ((result* 31)+((this.windGust == null)? 0 :this.windGust.hashCode()));
        result = ((result* 31)+((this.uvi == null)? 0 :this.uvi.hashCode()));
        result = ((result* 31)+((this.moonrise == null)? 0 :this.moonrise.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.clouds == null)? 0 :this.clouds.hashCode()));
        result = ((result* 31)+((this.dewPoint == null)? 0 :this.dewPoint.hashCode()));
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.feelsLike == null)? 0 :this.feelsLike.hashCode()));
        result = ((result* 31)+((this.windDeg == null)? 0 :this.windDeg.hashCode()));
        result = ((result* 31)+((this.pop == null)? 0 :this.pop.hashCode()));
        result = ((result* 31)+((this.sunset == null)? 0 :this.sunset.hashCode()));
        result = ((result* 31)+((this.weather == null)? 0 :this.weather.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.moonPhase == null)? 0 :this.moonPhase.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Daily) == false) {
            return false;
        }
        Daily rhs = ((Daily) other);
        return ((((((((((((((((((((this.moonset == rhs.moonset)||((this.moonset!= null)&&this.moonset.equals(rhs.moonset)))&&((this.rain == rhs.rain)||((this.rain!= null)&&this.rain.equals(rhs.rain))))&&((this.sunrise == rhs.sunrise)||((this.sunrise!= null)&&this.sunrise.equals(rhs.sunrise))))&&((this.temp == rhs.temp)||((this.temp!= null)&&this.temp.equals(rhs.temp))))&&((this.windGust == rhs.windGust)||((this.windGust!= null)&&this.windGust.equals(rhs.windGust))))&&((this.uvi == rhs.uvi)||((this.uvi!= null)&&this.uvi.equals(rhs.uvi))))&&((this.moonrise == rhs.moonrise)||((this.moonrise!= null)&&this.moonrise.equals(rhs.moonrise))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.clouds == rhs.clouds)||((this.clouds!= null)&&this.clouds.equals(rhs.clouds))))&&((this.dewPoint == rhs.dewPoint)||((this.dewPoint!= null)&&this.dewPoint.equals(rhs.dewPoint))))&&((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt))))&&((this.feelsLike == rhs.feelsLike)||((this.feelsLike!= null)&&this.feelsLike.equals(rhs.feelsLike))))&&((this.windDeg == rhs.windDeg)||((this.windDeg!= null)&&this.windDeg.equals(rhs.windDeg))))&&((this.pop == rhs.pop)||((this.pop!= null)&&this.pop.equals(rhs.pop))))&&((this.sunset == rhs.sunset)||((this.sunset!= null)&&this.sunset.equals(rhs.sunset))))&&((this.weather == rhs.weather)||((this.weather!= null)&&this.weather.equals(rhs.weather))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.moonPhase == rhs.moonPhase)||((this.moonPhase!= null)&&this.moonPhase.equals(rhs.moonPhase))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(dt);
        dest.writeValue(sunrise);
        dest.writeValue(sunset);
        dest.writeValue(moonrise);
        dest.writeValue(moonset);
        dest.writeValue(moonPhase);
        dest.writeValue(temp);
        dest.writeValue(feelsLike);
        dest.writeValue(pressure);
        dest.writeValue(humidity);
        dest.writeValue(dewPoint);
        dest.writeValue(windSpeed);
        dest.writeValue(windDeg);
        dest.writeValue(windGust);
        dest.writeList(weather);
        dest.writeValue(clouds);
        dest.writeValue(pop);
        dest.writeValue(rain);
        dest.writeValue(uvi);
    }

    public int describeContents() {
        return  0;
    }

}
