package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: ApicFrame.java */
/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0355a();
    public final String c;
    public final String d;
    public final int e;
    public final byte[] f;

    /* compiled from: ApicFrame.java */
    /* renamed from: com.amazon.aps.iva.i7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0355a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.e == aVar.e && g0.a(this.c, aVar.c) && g0.a(this.d, aVar.d) && Arrays.equals(this.f, aVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (527 + this.e) * 31;
        int i3 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f) + ((i4 + i3) * 31);
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        aVar.a(this.e, this.f);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.createByteArray();
    }
}
