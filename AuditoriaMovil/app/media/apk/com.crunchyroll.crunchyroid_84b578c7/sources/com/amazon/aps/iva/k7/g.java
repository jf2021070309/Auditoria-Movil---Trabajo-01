package com.amazon.aps.iva.k7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.t5.v;
/* compiled from: TimeSignalCommand.java */
/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public final long b;
    public final long c;

    /* compiled from: TimeSignalCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static long a(long j, v vVar) {
        long u = vVar.u();
        if ((128 & u) != 0) {
            return 8589934591L & ((((u & 1) << 32) | vVar.v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.k7.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.b);
        sb.append(", playbackPositionUs= ");
        return com.amazon.aps.iva.c.b.b(sb, this.c, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
