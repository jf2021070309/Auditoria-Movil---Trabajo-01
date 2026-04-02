package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.a.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }

    a(Parcel parcel) {
        super("APIC");
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.c == aVar.c && t.a(this.a, aVar.a) && t.a(this.b, aVar.b) && Arrays.equals(this.d, aVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.a;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }
}
