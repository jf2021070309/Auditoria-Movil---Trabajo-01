package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: PrivFrame.java */
/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public final String c;
    public final byte[] d;

    /* compiled from: PrivFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i) {
            return new k[i];
        }
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.c = str;
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (g0.a(this.c, kVar.c) && Arrays.equals(this.d, kVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.d) + ((527 + i) * 31);
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": owner=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.createByteArray();
    }
}
