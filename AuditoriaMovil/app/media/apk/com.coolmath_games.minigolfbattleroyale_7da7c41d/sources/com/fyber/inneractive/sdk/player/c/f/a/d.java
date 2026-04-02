package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.d.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }
    };
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final h[] e;

    public d(String str, boolean z, boolean z2, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = hVarArr;
    }

    d(Parcel parcel) {
        super("CTOC");
        this.a = parcel.readString();
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.e = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.e[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.b == dVar.b && this.c == dVar.c && t.a(this.a, dVar.a) && Arrays.equals(this.d, dVar.d) && Arrays.equals(this.e, dVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.b ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        int i2 = 0;
        while (true) {
            h[] hVarArr = this.e;
            if (i2 >= hVarArr.length) {
                return;
            }
            parcel.writeParcelable(hVarArr[i2], 0);
            i2++;
        }
    }
}
