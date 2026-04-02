package com.amazon.aps.iva.sd;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchProgressUiModel.kt */
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final long b;
    public final long c;

    /* compiled from: WatchProgressUiModel.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            j.f(parcel, "parcel");
            return new f(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i) {
            return new f[i];
        }
    }

    public f(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.b == fVar.b && this.c == fVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchProgressUiModel(durationSec=");
        sb.append(this.b);
        sb.append(", playheadSec=");
        return com.amazon.aps.iva.c.b.b(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "out");
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
