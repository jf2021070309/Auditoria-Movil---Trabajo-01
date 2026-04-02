package com.amazon.aps.iva.f0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.d0.b2;
/* compiled from: Lazy.android.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int b;

    /* compiled from: Lazy.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            return new b(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.b == ((b) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return b2.b(new StringBuilder("DefaultLazyKey(index="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeInt(this.b);
    }
}
