package com.jrtstudio.audio;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
/* loaded from: classes.dex */
public class Bookmark implements Serializable, Parcelable {
    public static final Parcelable.Creator<Bookmark> CREATOR = new a();
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public String f4872b;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<Bookmark> {
        @Override // android.os.Parcelable.Creator
        public Bookmark createFromParcel(Parcel parcel) {
            return new Bookmark(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Bookmark[] newArray(int i2) {
            return new Bookmark[i2];
        }
    }

    public Bookmark() {
    }

    public Bookmark(long j2, String str) {
        this.a = j2;
        this.f4872b = str;
    }

    public Bookmark(Parcel parcel) {
        this.a = parcel.readLong();
        this.f4872b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.a);
        parcel.writeString(this.f4872b);
    }
}
