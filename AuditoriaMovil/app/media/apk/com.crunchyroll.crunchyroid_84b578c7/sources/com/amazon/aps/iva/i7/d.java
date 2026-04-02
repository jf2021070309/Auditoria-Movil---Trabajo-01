package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: ChapterTocFrame.java */
/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    public final h[] g;

    /* compiled from: ChapterTocFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = strArr;
        this.g = hVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.d == dVar.d && this.e == dVar.e && g0.a(this.c, dVar.c) && Arrays.equals(this.f, dVar.f) && Arrays.equals(this.g, dVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((527 + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        h[] hVarArr = this.g;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.g = new h[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
