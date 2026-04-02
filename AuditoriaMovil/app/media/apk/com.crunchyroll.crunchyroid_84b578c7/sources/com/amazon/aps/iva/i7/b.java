package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: BinaryFrame.java */
/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final byte[] c;

    /* compiled from: BinaryFrame.java */
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

    public b(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b.equals(bVar.b) && Arrays.equals(this.c, bVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + com.amazon.aps.iva.c80.a.b(this.b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.amazon.aps.iva.t5.g0.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i7.b.<init>(android.os.Parcel):void");
    }
}
