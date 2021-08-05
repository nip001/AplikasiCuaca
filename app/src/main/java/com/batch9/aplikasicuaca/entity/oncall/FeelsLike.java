
package com.batch9.aplikasicuaca.entity.oncall;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class FeelsLike implements Serializable, Parcelable
{

    @SerializedName("day")
    @Expose
    private Double day;
    @SerializedName("night")
    @Expose
    private Double night;
    @SerializedName("eve")
    @Expose
    private Double eve;
    @SerializedName("morn")
    @Expose
    private Double morn;
    public final static Creator<FeelsLike> CREATOR = new Creator<FeelsLike>() {


        @SuppressWarnings({
            "unchecked"
        })
        public FeelsLike createFromParcel(android.os.Parcel in) {
            return new FeelsLike(in);
        }

        public FeelsLike[] newArray(int size) {
            return (new FeelsLike[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5653396341660838303L;

    protected FeelsLike(android.os.Parcel in) {
        this.day = ((Double) in.readValue((Double.class.getClassLoader())));
        this.night = ((Double) in.readValue((Double.class.getClassLoader())));
        this.eve = ((Double) in.readValue((Double.class.getClassLoader())));
        this.morn = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public FeelsLike() {
    }

    /**
     * 
     * @param eve
     * @param night
     * @param day
     * @param morn
     */
    public FeelsLike(Double day, Double night, Double eve, Double morn) {
        super();
        this.day = day;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
    }

    public Double getDay() {
        return day;
    }

    public void setDay(Double day) {
        this.day = day;
    }

    public Double getNight() {
        return night;
    }

    public void setNight(Double night) {
        this.night = night;
    }

    public Double getEve() {
        return eve;
    }

    public void setEve(Double eve) {
        this.eve = eve;
    }

    public Double getMorn() {
        return morn;
    }

    public void setMorn(Double morn) {
        this.morn = morn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeelsLike.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("day");
        sb.append('=');
        sb.append(((this.day == null)?"<null>":this.day));
        sb.append(',');
        sb.append("night");
        sb.append('=');
        sb.append(((this.night == null)?"<null>":this.night));
        sb.append(',');
        sb.append("eve");
        sb.append('=');
        sb.append(((this.eve == null)?"<null>":this.eve));
        sb.append(',');
        sb.append("morn");
        sb.append('=');
        sb.append(((this.morn == null)?"<null>":this.morn));
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
        result = ((result* 31)+((this.day == null)? 0 :this.day.hashCode()));
        result = ((result* 31)+((this.eve == null)? 0 :this.eve.hashCode()));
        result = ((result* 31)+((this.morn == null)? 0 :this.morn.hashCode()));
        result = ((result* 31)+((this.night == null)? 0 :this.night.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeelsLike) == false) {
            return false;
        }
        FeelsLike rhs = ((FeelsLike) other);
        return (((((this.day == rhs.day)||((this.day!= null)&&this.day.equals(rhs.day)))&&((this.eve == rhs.eve)||((this.eve!= null)&&this.eve.equals(rhs.eve))))&&((this.morn == rhs.morn)||((this.morn!= null)&&this.morn.equals(rhs.morn))))&&((this.night == rhs.night)||((this.night!= null)&&this.night.equals(rhs.night))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(day);
        dest.writeValue(night);
        dest.writeValue(eve);
        dest.writeValue(morn);
    }

    public int describeContents() {
        return  0;
    }

}
