package com.amazon.aps.iva.i7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.g0;
import java.util.Arrays;
/* compiled from: MlltFrame.java */
/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public final int c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;

    /* compiled from: MlltFrame.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i) {
            return new j[i];
        }
    }

    public j(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    @Override // com.amazon.aps.iva.i7.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.c == jVar.c && this.d == jVar.d && this.e == jVar.e && Arrays.equals(this.f, jVar.f) && Arrays.equals(this.g, jVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f);
        return Arrays.hashCode(this.g) + ((hashCode + ((((((527 + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = g0.a;
        this.f = createIntArray;
        this.g = parcel.createIntArray();
    }
}
