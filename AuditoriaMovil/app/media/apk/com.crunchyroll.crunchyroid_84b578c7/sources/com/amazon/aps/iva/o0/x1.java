package com.amazon.aps.iva.o0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ParcelableSnapshotMutableLongState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class x1 extends f3 implements Parcelable {
    public static final Parcelable.Creator<x1> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableLongState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<x1> {
        @Override // android.os.Parcelable.Creator
        public final x1 createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            return new x1(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final x1[] newArray(int i) {
            return new x1[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeLong(m());
    }
}
