package com.amazon.aps.iva.g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.v;
import com.google.common.base.Charsets;
import java.util.Arrays;
/* compiled from: PictureFrame.java */
/* loaded from: classes.dex */
public final class a implements f0.b {
    public static final Parcelable.Creator<a> CREATOR = new C0292a();
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

    /* compiled from: PictureFrame.java */
    /* renamed from: com.amazon.aps.iva.g7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0292a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }

    public static a a(v vVar) {
        int e = vVar.e();
        String s = vVar.s(vVar.e(), Charsets.US_ASCII);
        String r = vVar.r(vVar.e());
        int e2 = vVar.e();
        int e3 = vVar.e();
        int e4 = vVar.e();
        int e5 = vVar.e();
        int e6 = vVar.e();
        byte[] bArr = new byte[e6];
        vVar.d(0, bArr, e6);
        return new a(e, s, r, e2, e3, e4, e5, bArr);
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
        if (this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && Arrays.equals(this.i, aVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = com.amazon.aps.iva.c80.a.b(this.c, (this.b + 527) * 31, 31);
        return Arrays.hashCode(this.i) + ((((((((com.amazon.aps.iva.c80.a.b(this.d, b, 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        aVar.a(this.b, this.i);
    }

    public a(Parcel parcel) {
        this.b = parcel.readInt();
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.createByteArray();
    }
}
