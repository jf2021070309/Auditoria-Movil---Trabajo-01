package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: ChapterFrame.java */
/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final h[] h;

    /* compiled from: ChapterFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(String str, int i, int i2, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = hVarArr;
    }

    @Override // com.amazon.aps.iva.i7.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && g0.a(this.c, cVar.c) && Arrays.equals(this.h, cVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((527 + this.d) * 31) + this.e) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        h[] hVarArr = this.h;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = g0.a;
        this.c = readString;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new h[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h[i2] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
