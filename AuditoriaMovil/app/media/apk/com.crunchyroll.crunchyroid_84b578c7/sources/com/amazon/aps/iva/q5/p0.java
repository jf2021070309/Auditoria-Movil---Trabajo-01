package com.amazon.aps.iva.q5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: StreamKey.java */
/* loaded from: classes.dex */
public final class p0 implements Comparable<p0>, Parcelable, k {
    public static final Parcelable.Creator<p0> CREATOR = new a();
    public static final String e = com.amazon.aps.iva.t5.g0.L(0);
    public static final String f = com.amazon.aps.iva.t5.g0.L(1);
    public static final String g = com.amazon.aps.iva.t5.g0.L(2);
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: StreamKey.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        public final p0 createFromParcel(Parcel parcel) {
            return new p0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p0[] newArray(int i) {
            return new p0[i];
        }
    }

    public p0() {
        throw null;
    }

    public p0(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p0 p0Var) {
        p0 p0Var2 = p0Var;
        int i = this.b - p0Var2.b;
        if (i == 0) {
            int i2 = this.c - p0Var2.c;
            if (i2 == 0) {
                return this.d - p0Var2.d;
            }
            return i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.b == p0Var.b && this.c == p0Var.c && this.d == p0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.b;
        if (i != 0) {
            bundle.putInt(e, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            bundle.putInt(f, i2);
        }
        int i3 = this.d;
        if (i3 != 0) {
            bundle.putInt(g, i3);
        }
        return bundle;
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public p0(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
