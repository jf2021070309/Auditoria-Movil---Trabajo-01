package com.amazon.aps.iva.n4;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final ArrayList b;
    public final ArrayList c;

    /* compiled from: BackStackState.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.b = parcel.createStringArrayList();
        this.c = parcel.createTypedArrayList(androidx.fragment.app.b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        parcel.writeTypedList(this.c);
    }
}
