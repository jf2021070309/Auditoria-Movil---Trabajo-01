package com.amazon.aps.iva.o0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ParcelableSnapshotMutableFloatState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class v1 extends d3 implements Parcelable {
    public static final Parcelable.Creator<v1> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableFloatState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<v1> {
        @Override // android.os.Parcelable.Creator
        public final v1 createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            return new v1(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final v1[] newArray(int i) {
            return new v1[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeFloat(d());
    }
}
