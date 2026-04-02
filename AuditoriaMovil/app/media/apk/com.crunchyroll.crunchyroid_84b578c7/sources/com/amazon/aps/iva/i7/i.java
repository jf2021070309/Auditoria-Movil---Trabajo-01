package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
/* compiled from: InternalFrame.java */
/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: InternalFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (g0.a(this.d, iVar.d) && g0.a(this.c, iVar.c) && g0.a(this.e, iVar.e)) {
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
        return i5 + i3;
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": domain=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }
}
