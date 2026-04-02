package com.amazon.aps.iva.ik;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.yb0.j;
/* compiled from: VideoQuality.kt */
/* loaded from: classes.dex */
public final class a extends f {
    public static final Parcelable.Creator<a> CREATOR = new C0379a();
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: VideoQuality.kt */
    /* renamed from: com.amazon.aps.iva.ik.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0379a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a() {
        this(0);
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoVideoQuality(width=");
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

    public a(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public /* synthetic */ a(int i) {
        this(3840, 2160, Integer.MAX_VALUE);
    }
}
