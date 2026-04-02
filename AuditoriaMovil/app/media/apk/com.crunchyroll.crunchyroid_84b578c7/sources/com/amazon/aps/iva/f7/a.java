package com.amazon.aps.iva.f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: EventMessage.java */
/* loaded from: classes.dex */
public final class a implements f0.b {
    public static final Parcelable.Creator<a> CREATOR;
    public static final v h;
    public static final v i;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final byte[] f;
    public int g;

    /* compiled from: EventMessage.java */
    /* renamed from: com.amazon.aps.iva.f7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0242a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    static {
        v.a aVar = new v.a();
        aVar.k = "application/id3";
        h = aVar.a();
        v.a aVar2 = new v.a();
        aVar2.k = "application/x-scte35";
        i = aVar2.a();
        CREATOR = new C0242a();
    }

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = bArr;
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final byte[] B() {
        if (k() != null) {
            return this.f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.d == aVar.d && this.e == aVar.e && g0.a(this.b, aVar.b) && g0.a(this.c, aVar.c) && Arrays.equals(this.f, aVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        if (this.g == 0) {
            int i3 = 0;
            String str = this.b;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = (527 + i2) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j = this.d;
            long j2 = this.e;
            this.g = Arrays.hashCode(this.f) + ((((((i4 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final v k() {
        String str = this.b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return i;
            case 1:
            case 2:
                return h;
            default:
                return null;
        }
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.e + ", durationMs=" + this.d + ", value=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeByteArray(this.f);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = g0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.createByteArray();
    }
}
