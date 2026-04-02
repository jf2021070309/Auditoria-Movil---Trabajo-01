package com.amazon.aps.iva.j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SlowMotionData.java */
/* loaded from: classes.dex */
public final class b implements f0.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final List<C0404b> b;

    /* compiled from: SlowMotionData.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0404b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    /* compiled from: SlowMotionData.java */
    /* renamed from: com.amazon.aps.iva.j7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0404b implements Parcelable {
        public static final Parcelable.Creator<C0404b> CREATOR = new a();
        public final long b;
        public final long c;
        public final int d;

        /* compiled from: SlowMotionData.java */
        /* renamed from: com.amazon.aps.iva.j7.b$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<C0404b> {
            @Override // android.os.Parcelable.Creator
            public final C0404b createFromParcel(Parcel parcel) {
                return new C0404b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final C0404b[] newArray(int i) {
                return new C0404b[i];
            }
        }

        public C0404b(int i, long j, long j2) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            this.b = j;
            this.c = j2;
            this.d = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0404b.class != obj.getClass()) {
                return false;
            }
            C0404b c0404b = (C0404b) obj;
            if (this.b == c0404b.b && this.c == c0404b.c && this.d == c0404b.d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
        }

        public final String toString() {
            return g0.o("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeInt(this.d);
        }
    }

    public b(ArrayList arrayList) {
        this.b = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((C0404b) arrayList.get(0)).c;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((C0404b) arrayList.get(i)).b < j) {
                    z = true;
                    break;
                } else {
                    j = ((C0404b) arrayList.get(i)).c;
                    i++;
                }
            }
        }
        com.amazon.aps.iva.cq.b.t(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.b.equals(((b) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
    }
}
