package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: GeobFrame.java */
/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final byte[] f;

    /* compiled from: GeobFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i) {
            return new f[i];
        }
    }

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (g0.a(this.c, fVar.c) && g0.a(this.d, fVar.d) && g0.a(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.f) + ((i5 + i3) * 31);
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", filename=" + this.d + ", description=" + this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByteArray(this.f);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.createByteArray();
    }
}
