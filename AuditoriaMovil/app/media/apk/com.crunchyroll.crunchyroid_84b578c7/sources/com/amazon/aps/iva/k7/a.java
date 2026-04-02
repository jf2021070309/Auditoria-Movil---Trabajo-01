package com.amazon.aps.iva.k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
/* compiled from: PrivateCommand.java */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0435a();
    public final long b;
    public final long c;
    public final byte[] d;

    /* compiled from: PrivateCommand.java */
    /* renamed from: com.amazon.aps.iva.k7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0435a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(long j, byte[] bArr, long j2) {
        this.b = j2;
        this.c = j;
        this.d = bArr;
    }

    @Override // com.amazon.aps.iva.k7.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.b);
        sb.append(", identifier= ");
        return com.amazon.aps.iva.c.b.b(sb, this.c, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeByteArray(this.d);
    }

    public a(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = g0.a;
        this.d = createByteArray;
    }
}
