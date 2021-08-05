
package com.batch9.aplikasicuaca.entity.oncall;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Rain__1 implements Serializable, Parcelable
{

    @SerializedName("1h")
    @Expose
    private Double _1h;
    public final static Creator<Rain__1> CREATOR = new Creator<Rain__1>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Rain__1 createFromParcel(android.os.Parcel in) {
            return new Rain__1(in);
        }

        public Rain__1 [] newArray(int size) {
            return (new Rain__1[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4133404605715087633L;

    protected Rain__1(android.os.Parcel in) {
        this._1h = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rain__1() {
    }

    /**
     * 
     * @param _1h
     */
    public Rain__1(Double _1h) {
        super();
        this._1h = _1h;
    }

    public Double get1h() {
        return _1h;
    }

    public void set1h(Double _1h) {
        this._1h = _1h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rain__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_1h");
        sb.append('=');
        sb.append(((this._1h == null)?"<null>":this._1h));
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
        result = ((result* 31)+((this._1h == null)? 0 :this._1h.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rain__1) == false) {
            return false;
        }
        Rain__1 rhs = ((Rain__1) other);
        return ((this._1h == rhs._1h)||((this._1h!= null)&&this._1h.equals(rhs._1h)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(_1h);
    }

    public int describeContents() {
        return  0;
    }

}
