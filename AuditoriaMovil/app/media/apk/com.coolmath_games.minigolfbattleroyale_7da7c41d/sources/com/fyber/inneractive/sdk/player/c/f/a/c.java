package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.c.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ c[] newArray(int i) {
            return new c[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final h[] g;

    @Override // com.fyber.inneractive.sdk.player.c.f.a.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public c(String str, int i, int i2, long j, long j2, h[] hVarArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = hVarArr;
    }

    c(Parcel parcel) {
        super("CHAP");
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && t.a(this.a, cVar.a) && Arrays.equals(this.g, cVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        for (h hVar : this.g) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
