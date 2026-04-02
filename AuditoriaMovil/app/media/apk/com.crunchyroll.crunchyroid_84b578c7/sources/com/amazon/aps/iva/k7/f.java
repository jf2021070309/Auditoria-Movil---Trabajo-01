package com.amazon.aps.iva.k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: SpliceScheduleCommand.java */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.k7.b {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final List<c> b;

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i) {
            return new f[i];
        }
    }

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public f(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<c> list = this.b;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = list.get(i2);
            parcel.writeLong(cVar.a);
            parcel.writeByte(cVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.d ? (byte) 1 : (byte) 0);
            List<b> list2 = cVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = list2.get(i3);
                parcel.writeInt(bVar.a);
                parcel.writeLong(bVar.b);
            }
            parcel.writeLong(cVar.e);
            parcel.writeByte(cVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.h);
            parcel.writeInt(cVar.i);
            parcel.writeInt(cVar.j);
            parcel.writeInt(cVar.k);
        }
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new c(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        public c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(arrayList);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}
