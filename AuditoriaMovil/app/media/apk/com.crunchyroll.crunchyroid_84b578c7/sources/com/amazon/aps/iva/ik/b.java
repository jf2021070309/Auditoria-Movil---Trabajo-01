package com.amazon.aps.iva.ik;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.yb0.j;
/* compiled from: VideoQuality.kt */
/* loaded from: classes.dex */
public final class b extends f {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: VideoQuality.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new b(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // com.amazon.aps.iva.ik.f
    public final int a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ik.f
    public final int b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ik.f
    public final int c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.c == bVar.c && this.d == bVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeightVideoQuality(width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", bitrate=");
        return b2.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "out");
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
