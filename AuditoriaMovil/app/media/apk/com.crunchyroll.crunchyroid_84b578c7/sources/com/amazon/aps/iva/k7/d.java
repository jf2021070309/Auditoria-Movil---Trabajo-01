package com.amazon.aps.iva.k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SpliceInsertCommand.java */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.k7.b {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final List<b> i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    /* compiled from: SpliceInsertCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i) {
            return new d[i];
        }
    }

    /* compiled from: SpliceInsertCommand.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // com.amazon.aps.iva.k7.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.g);
        sb.append(", programSplicePlaybackPositionUs= ");
        return com.amazon.aps.iva.c.b.b(sb, this.h, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        List<b> list = this.i;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = list.get(i2);
            parcel.writeInt(bVar.a);
            parcel.writeLong(bVar.b);
            parcel.writeLong(bVar.c);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    public d(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }
}
