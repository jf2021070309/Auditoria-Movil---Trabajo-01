package com.amazon.aps.iva.u5;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.google.common.primitives.Floats;
/* compiled from: Mp4LocationData.java */
/* loaded from: classes.dex */
public final class c implements f0.b {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final float b;
    public final float c;

    /* compiled from: Mp4LocationData.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(float f, float f2) {
        com.amazon.aps.iva.cq.b.v(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Floats.hashCode(this.c) + ((Floats.hashCode(this.b) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.b + ", longitude=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public c(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}
