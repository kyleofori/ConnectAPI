package com.detroitlabs.kyleofori.connectapi.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kyleofori on 11/20/14.
 */
public class DaysWeatherObject implements Parcelable {
    private String date;
    private String description;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeString(this.description);
    }

    public DaysWeatherObject() {
    }

    private DaysWeatherObject(Parcel in) {
        this.date = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<DaysWeatherObject> CREATOR = new Parcelable.Creator<DaysWeatherObject>() {
        public DaysWeatherObject createFromParcel(Parcel source) {
            return new DaysWeatherObject(source);
        }

        public DaysWeatherObject[] newArray(int size) {
            return new DaysWeatherObject[size];
        }
    };
}
