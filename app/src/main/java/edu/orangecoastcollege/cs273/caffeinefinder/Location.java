package edu.orangecoastcollege.cs273.caffeinefinder;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * The <code>Location</code> class represents a place where one can get a caffeine fix, including
 * its name, address, phone number and latitude/longitude location.
 *
 * @author Michael Paulding
 */

public class Location implements Parcelable{
    private int mId;
    private String mName;
    private String mAddress;
    private String mCity;
    private String mState;
    private String mZipCode;
    private String mPhone;
    private double mLatitude;
    private double mLongitude;

    public Location(int id, String name, String address, String city, String state, String zipCode, String phone, double latitude, double longitude) {
        mId = id;
        mName = name;
        mAddress = address;
        mCity = city;
        mState = state;
        mZipCode = zipCode;
        mPhone = phone;
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public Location(String name, String address, String city, String state, String zipCode, String phone, double latitude, double longitude) {
        this(-1, name, address, city, state, zipCode, phone, latitude, longitude);
    }

    protected Location(Parcel in) {
        mId = in.readInt();
        mName = in.readString();
        mAddress = in.readString();
        mCity = in.readString();
        mState = in.readString();
        mZipCode = in.readString();
        mPhone = in.readString();
        mLatitude = in.readDouble();
        mLongitude = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mName);
        dest.writeString(mAddress);
        dest.writeString(mCity);
        dest.writeString(mState);
        dest.writeString(mZipCode);
        dest.writeString(mPhone);
        dest.writeDouble(mLatitude);
        dest.writeDouble(mLongitude);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getZipCode() {
        return mZipCode;
    }

    public void setZipCode(String zipCode) {
        mZipCode = zipCode;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public String getFullAddress()
    {
        return mAddress + "\n" + mCity + ", " + mState + "  " + mZipCode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Id=" + mId +
                ", Name='" + mName + '\'' +
                ", Address='" + mAddress + '\'' +
                ", City='" + mCity + '\'' +
                ", State='" + mState + '\'' +
                ", Zip Code='" + mZipCode + '\'' +
                ", Phone='" + mPhone + '\'' +
                ", Latitute=" + mLatitude +
                ", Longitude=" + mLongitude +
                '}';
    }
}
