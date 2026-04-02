package com.fyber.inneractive.sdk.player.c.f.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.fyber.inneractive.sdk.player.c.f.a.j.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ j[] newArray(int i) {
            return new j[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }
    };
    public final String a;
    public final String b;

    public j(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    j(Parcel parcel) {
        super(parcel.readString());
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f.equals(jVar.f) && t.a(this.a, jVar.a) && t.a(this.b, jVar.b)) {
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
