package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
/* compiled from: UrlLinkFrame.java */
/* loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final String c;
    public final String d;

    /* compiled from: UrlLinkFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.b.equals(mVar.b) && g0.a(this.c, mVar.c) && g0.a(this.d, mVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int b = com.amazon.aps.iva.c80.a.b(this.b, 527, 31);
        int i2 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (b + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.amazon.aps.iva.i7.h
    public final String toString() {
        return this.b + ": url=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.amazon.aps.iva.t5.g0.a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.c = r0
            java.lang.String r3 = r3.readString()
            r2.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i7.m.<init>(android.os.Parcel):void");
    }
}
