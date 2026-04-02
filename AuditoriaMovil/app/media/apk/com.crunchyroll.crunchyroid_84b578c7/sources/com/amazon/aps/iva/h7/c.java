package com.amazon.aps.iva.h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import java.util.Arrays;
/* compiled from: IcyInfo.java */
/* loaded from: classes.dex */
public final class c implements f0.b {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final byte[] b;
    public final String c;
    public final String d;

    /* compiled from: IcyInfo.java */
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

    public c(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.b, ((c) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.c, this.d, Integer.valueOf(this.b.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        String str = this.c;
        if (str != null) {
            aVar.a = str;
        }
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.b = createByteArray;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
