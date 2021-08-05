
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
public class Hourly implements Serializable, Parcelable
{

    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feels_like")
    @Expose
    private Double feelsLike;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("dew_point")
    @Expose
    private Double dewPoint;
    @SerializedName("uvi")
    @Expose
    private Double uvi;
    @SerializedName("clouds")
    @Expose
    private Integer clouds;
    @SerializedName("visibility")
    @Expose
    private Integer visibility;
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
    private List<Weather__1> weather = null;
    @SerializedName("pop")
    @Expose
    private Double pop;
    @SerializedName("rain")
    @Expose
    private Rain__1 rain;
    public final static Creator<Hourly> CREATOR = new Creator<Hourly>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Hourly createFromParcel(android.os.Parcel in) {
            return new Hourly(in);
        }

        public Hourly[] newArray(int size) {
            return (new Hourly[size]);
        }

    }
    ;
    private final static long serialVersionUID = -6967160769066663504L;

    protected Hourly(android.os.Parcel in) {
        this.dt = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.temp = ((Double) in.readValue((Double.class.getClassLoader())));
        this.feelsLike = ((Double) in.readValue((Double.class.getClassLoader())));
        this.pressure = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.humidity = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dewPoint = ((Double) in.readValue((Double.class.getClassLoader())));
        this.uvi = ((Double) in.readValue((Double.class.getClassLoader())));
        this.clouds = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.visibility = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.windSpeed = ((Double) in.readValue((Double.class.getClassLoader())));
        this.windDeg = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.windGust = ((Double) in.readValue((Double.class.getClassLoader())));
        in.readList(this.weather, (com.batch9.aplikasicuaca.entity.oncall.Weather__1.class.getClassLoader()));
        this.pop = ((Double) in.readValue((Double.class.getClassLoader())));
        this.rain = ((Rain__1) in.readValue((Rain__1.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hourly() {
    }

    /**
     * 
     * @param rain
     * @param temp
     * @param visibility
     * @param windGust
     * @param uvi
     * @param pressure
     * @param clouds
     * @param dewPoint
     * @param dt
     * @param feelsLike
     * @param windDeg
     * @param pop
     * @param weather
     * @param humidity
     * @param windSpeed
     */
    public Hourly(Integer dt, Double temp, Double feelsLike, Integer pressure, Integer humidity, Double dewPoint, Double uvi, Integer clouds, Integer visibility, Double windSpeed, Integer windDeg, Double windGust, List<Weather__1> weather, Double pop, Rain__1 rain) {
        super();
        this.dt = dt;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dewPoint = dewPoint;
        this.uvi = uvi;
        this.clouds = clouds;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.windDeg = windDeg;
        this.windGust = windGust;
        this.weather = weather;
        this.pop = pop;
        this.rain = rain;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
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

    public Double getUvi() {
        return uvi;
    }

    public void setUvi(Double uvi) {
        this.uvi = uvi;
    }

    public Integer getClouds() {
        return clouds;
    }

    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
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

    public List<Weather__1> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather__1> weather) {
        this.weather = weather;
    }

    public Double getPop() {
        return pop;
    }

    public void setPop(Double pop) {
        this.pop = pop;
    }

    public Rain__1 getRain() {
        return rain;
    }

    public void setRain(Rain__1 rain) {
        this.rain = rain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Hourly.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dt");
        sb.append('=');
        sb.append(((this.dt == null)?"<null>":this.dt));
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
        sb.append("uvi");
        sb.append('=');
        sb.append(((this.uvi == null)?"<null>":this.uvi));
        sb.append(',');
        sb.append("clouds");
        sb.append('=');
        sb.append(((this.clouds == null)?"<null>":this.clouds));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
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
        sb.append("pop");
        sb.append('=');
        sb.append(((this.pop == null)?"<null>":this.pop));
        sb.append(',');
        sb.append("rain");
        sb.append('=');
        sb.append(((this.rain == null)?"<null>":this.rain));
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
        result = ((result* 31)+((this.rain == null)? 0 :this.rain.hashCode()));
        result = ((result* 31)+((this.temp == null)? 0 :this.temp.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.windGust == null)? 0 :this.windGust.hashCode()));
        result = ((result* 31)+((this.uvi == null)? 0 :this.uvi.hashCode()));
        result = ((result* 31)+((this.pressure == null)? 0 :this.pressure.hashCode()));
        result = ((result* 31)+((this.clouds == null)? 0 :this.clouds.hashCode()));
        result = ((result* 31)+((this.dewPoint == null)? 0 :this.dewPoint.hashCode()));
        result = ((result* 31)+((this.dt == null)? 0 :this.dt.hashCode()));
        result = ((result* 31)+((this.feelsLike == null)? 0 :this.feelsLike.hashCode()));
        result = ((result* 31)+((this.windDeg == null)? 0 :this.windDeg.hashCode()));
        result = ((result* 31)+((this.pop == null)? 0 :this.pop.hashCode()));
        result = ((result* 31)+((this.weather == null)? 0 :this.weather.hashCode()));
        result = ((result* 31)+((this.humidity == null)? 0 :this.humidity.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hourly) == false) {
            return false;
        }
        Hourly rhs = ((Hourly) other);
        return ((((((((((((((((this.rain == rhs.rain)||((this.rain!= null)&&this.rain.equals(rhs.rain)))&&((this.temp == rhs.temp)||((this.temp!= null)&&this.temp.equals(rhs.temp))))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.windGust == rhs.windGust)||((this.windGust!= null)&&this.windGust.equals(rhs.windGust))))&&((this.uvi == rhs.uvi)||((this.uvi!= null)&&this.uvi.equals(rhs.uvi))))&&((this.pressure == rhs.pressure)||((this.pressure!= null)&&this.pressure.equals(rhs.pressure))))&&((this.clouds == rhs.clouds)||((this.clouds!= null)&&this.clouds.equals(rhs.clouds))))&&((this.dewPoint == rhs.dewPoint)||((this.dewPoint!= null)&&this.dewPoint.equals(rhs.dewPoint))))&&((this.dt == rhs.dt)||((this.dt!= null)&&this.dt.equals(rhs.dt))))&&((this.feelsLike == rhs.feelsLike)||((this.feelsLike!= null)&&this.feelsLike.equals(rhs.feelsLike))))&&((this.windDeg == rhs.windDeg)||((this.windDeg!= null)&&this.windDeg.equals(rhs.windDeg))))&&((this.pop == rhs.pop)||((this.pop!= null)&&this.pop.equals(rhs.pop))))&&((this.weather == rhs.weather)||((this.weather!= null)&&this.weather.equals(rhs.weather))))&&((this.humidity == rhs.humidity)||((this.humidity!= null)&&this.humidity.equals(rhs.humidity))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(dt);
        dest.writeValue(temp);
        dest.writeValue(feelsLike);
        dest.writeValue(pressure);
        dest.writeValue(humidity);
        dest.writeValue(dewPoint);
        dest.writeValue(uvi);
        dest.writeValue(clouds);
        dest.writeValue(visibility);
        dest.writeValue(windSpeed);
        dest.writeValue(windDeg);
        dest.writeValue(windGust);
        dest.writeList(weather);
        dest.writeValue(pop);
        dest.writeValue(rain);
    }

    public int describeContents() {
        return  0;
    }

}
