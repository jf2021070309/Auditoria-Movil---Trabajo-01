package com.amazon.aps.iva.o0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ParcelableSnapshotMutableIntState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class w1 extends e3 implements Parcelable {
    public static final Parcelable.Creator<w1> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableIntState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<w1> {
        @Override // android.os.Parcelable.Creator
        public final w1 createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            return new w1(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final w1[] newArray(int i) {
            return new w1[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeInt(t());
    }
}
