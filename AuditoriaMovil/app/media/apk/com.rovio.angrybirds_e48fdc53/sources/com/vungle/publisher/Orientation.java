package com.vungle.publisher;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public enum Orientation implements Parcelable {
    autoRotate,
    matchVideo;
    
    public static final Parcelable.Creator<Orientation> CREATOR = new Parcelable.Creator<Orientation>() { // from class: com.vungle.publisher.Orientation.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Orientation createFromParcel(Parcel parcel) {
            return Orientation.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Orientation[] newArray(int i) {
            return new Orientation[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
