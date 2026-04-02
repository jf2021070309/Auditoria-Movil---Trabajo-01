package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.i.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ i[] newArray(int i) {
            return new i[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }
    };
    public final String a;
    public final byte[] b;

    public i(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    i(Parcel parcel) {
        super("PRIV");
        this.a = parcel.readString();
        this.b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if (t.a(this.a, iVar.a) && Arrays.equals(this.b, iVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
