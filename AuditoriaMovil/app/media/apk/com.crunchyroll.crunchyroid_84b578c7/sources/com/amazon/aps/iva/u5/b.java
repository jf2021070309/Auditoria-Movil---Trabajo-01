package com.amazon.aps.iva.u5;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
/* compiled from: MdtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class b implements f0.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;

    /* compiled from: MdtaMetadataEntry.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(String str, byte[] bArr, int i, int i2) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b.equals(bVar.b) && Arrays.equals(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + com.amazon.aps.iva.c80.a.b(this.b, 527, 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        String p;
        boolean z;
        boolean z2;
        byte[] bArr = this.c;
        int i = this.e;
        if (i != 1) {
            if (i != 23) {
                if (i != 67) {
                    int i2 = g0.a;
                    StringBuilder sb = new StringBuilder(bArr.length * 2);
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i3] & Ascii.SI, 16));
                    }
                    p = sb.toString();
                } else {
                    int i4 = g0.a;
                    if (bArr.length == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.amazon.aps.iva.cq.b.t(z2);
                    p = String.valueOf(bArr[3] | (bArr[1] << Ascii.DLE) | (bArr[0] << Ascii.CAN) | (bArr[2] << 8));
                }
            } else {
                int i5 = g0.a;
                if (bArr.length == 4) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.t(z);
                p = String.valueOf(Float.intBitsToFloat((bArr[3] & UnsignedBytes.MAX_VALUE) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[0] << Ascii.CAN) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8)));
            }
        } else {
            p = g0.p(bArr);
        }
        return com.amazon.aps.iva.n4.a.a(new StringBuilder("mdta: key="), this.b, ", value=", p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i = g0.a;
        this.b = readString;
        this.c = parcel.createByteArray();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
}
