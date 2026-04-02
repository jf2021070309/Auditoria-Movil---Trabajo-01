package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.k.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ k[] newArray(int i) {
            return new k[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }
    };
    public final String a;
    public final String b;

    public k(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    k(Parcel parcel) {
        super(parcel.readString());
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f.equals(kVar.f) && t.a(this.a, kVar.a) && t.a(this.b, kVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
