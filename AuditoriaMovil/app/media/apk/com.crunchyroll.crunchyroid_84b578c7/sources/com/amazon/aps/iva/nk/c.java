package com.amazon.aps.iva.nk;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.lb0.z;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AdState.kt */
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final boolean b;
    public final com.amazon.aps.iva.nk.a c;
    public final List<Long> d;
    public final b e;

    /* compiled from: AdState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            boolean z;
            com.amazon.aps.iva.nk.a createFromParcel;
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = com.amazon.aps.iva.nk.a.CREATOR.createFromParcel(parcel);
            }
            com.amazon.aps.iva.nk.a aVar = createFromParcel;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new c(z, aVar, arrayList, b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c() {
        this(null, 15);
    }

    public static c a(c cVar, boolean z, com.amazon.aps.iva.nk.a aVar, List list, b bVar, int i) {
        if ((i & 1) != 0) {
            z = cVar.b;
        }
        if ((i & 2) != 0) {
            aVar = cVar.c;
        }
        if ((i & 4) != 0) {
            list = cVar.d;
        }
        if ((i & 8) != 0) {
            bVar = cVar.e;
        }
        cVar.getClass();
        com.amazon.aps.iva.yb0.j.f(list, "adCuePoints");
        com.amazon.aps.iva.yb0.j.f(bVar, "adPlaybackState");
        return new c(z, aVar, list, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, cVar.d) && this.e == cVar.e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.b;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        com.amazon.aps.iva.nk.a aVar = this.c;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return this.e.hashCode() + defpackage.a.a(this.d, (i + hashCode) * 31, 31);
    }

    public final String toString() {
        return "AdState(isActive=" + this.b + ", adInfo=" + this.c + ", adCuePoints=" + this.d + ", adPlaybackState=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "out");
        parcel.writeInt(this.b ? 1 : 0);
        com.amazon.aps.iva.nk.a aVar = this.c;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i);
        }
        List<Long> list = this.d;
        parcel.writeInt(list.size());
        for (Long l : list) {
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.e.name());
    }

    public c(boolean z, com.amazon.aps.iva.nk.a aVar, List<Long> list, b bVar) {
        com.amazon.aps.iva.yb0.j.f(list, "adCuePoints");
        com.amazon.aps.iva.yb0.j.f(bVar, "adPlaybackState");
        this.b = z;
        this.c = aVar;
        this.d = list;
        this.e = bVar;
    }

    public /* synthetic */ c(b bVar, int i) {
        this(false, null, (i & 4) != 0 ? z.b : null, (i & 8) != 0 ? b.NOT_INITIALIZED : bVar);
    }
}
