package com.amazon.aps.iva.w70;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CustomTabLayout.kt */
/* loaded from: classes2.dex */
public final class h implements Parcelable {
    public static final a CREATOR = new a();
    public final int b;
    public final Parcelable c;

    /* compiled from: CustomTabLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            Parcelable readParcelable;
            Object readParcelable2;
            j.f(parcel, "parcel");
            int readInt = parcel.readInt();
            if (Build.VERSION.SDK_INT >= 33) {
                readParcelable2 = parcel.readParcelable(ClassLoader.getSystemClassLoader(), Parcelable.class);
                readParcelable = (Parcelable) readParcelable2;
            } else {
                readParcelable = parcel.readParcelable(ClassLoader.getSystemClassLoader());
            }
            return new h(readParcelable, readInt);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i) {
            return new h[i];
        }
    }

    public h(Parcelable parcelable, int i) {
        this.b = i;
        this.c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.b == hVar.b && j.a(this.c, hVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.b) * 31;
        Parcelable parcelable = this.c;
        if (parcelable == null) {
            hashCode = 0;
        } else {
            hashCode = parcelable.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "State(tabPosition=" + this.b + ", parentState=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "parcel");
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
