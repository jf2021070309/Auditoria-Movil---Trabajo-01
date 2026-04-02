package com.amazon.aps.iva.u5;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.google.common.primitives.Longs;
/* compiled from: CreationTime.java */
/* loaded from: classes.dex */
public final class a implements f0.b {
    public static final Parcelable.Creator<a> CREATOR = new C0757a();
    public final long b;

    /* compiled from: CreationTime.java */
    /* renamed from: com.amazon.aps.iva.u5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0757a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(long j) {
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.b == ((a) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.b);
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j = this.b;
        if (j == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
    }

    public a(Parcel parcel) {
        this.b = parcel.readLong();
    }
}
