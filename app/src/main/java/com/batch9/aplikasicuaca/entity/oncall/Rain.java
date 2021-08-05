
package com.batch9.aplikasicuaca.entity.oncall;

import java.io.Serializable;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Rain implements Serializable, Parcelable
{

    @SerializedName("1h")
    @Expose
    private Double _1h;
    public final static Creator<Rain> CREATOR = new Creator<Rain>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Rain createFromParcel(android.os.Parcel in) {
            return new Rain(in);
        }

        public Rain[] newArray(int size) {
            return (new Rain[size]);
        }

    }
    ;
    private final static long serialVersionUID = -8498309569760950406L;

    protected Rain(android.os.Parcel in) {
        this._1h = ((Double) in.readValue((Double.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rain() {
    }

    /**
     * 
     * @param _1h
     */
    public Rain(Double _1h) {
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
        sb.append(Rain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Rain) == false) {
            return false;
        }
        Rain rhs = ((Rain) other);
        return ((this._1h == rhs._1h)||((this._1h!= null)&&this._1h.equals(rhs._1h)));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(_1h);
    }

    public int describeContents() {
        return  0;
    }

}
