package com.example.modul2_kel33;
import android.os.Parcel;
import android.os.Parcelable;


public class ParcelAccount implements Parcelable {

    private String avatar;

    public ParcelAccount(){
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    protected ParcelAccount(Parcel in) {
        avatar = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(avatar);
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public static final Parcelable.Creator<ParcelAccount> CREATOR = new Parcelable.Creator<ParcelAccount>() {
        @Override
        public ParcelAccount createFromParcel(Parcel in) {
            return new ParcelAccount(in);
        }
        @Override
        public ParcelAccount[] newArray(int size) {
            return new ParcelAccount[size];
        }
    };

}

