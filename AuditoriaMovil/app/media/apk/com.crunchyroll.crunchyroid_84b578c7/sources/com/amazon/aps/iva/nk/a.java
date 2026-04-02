package com.amazon.aps.iva.nk;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.a0.r;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AdState.kt */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0541a();
    public final List<Float> b;
    public final int c;
    public final int d;
    public final double e;
    public final double f;
    public final boolean g;

    /* compiled from: AdState.kt */
    /* renamed from: com.amazon.aps.iva.nk.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0541a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new a(arrayList, readInt2, readInt3, readDouble, readDouble2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(List<Float> list, int i, int i2, double d, double d2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(list, "adCuePoints");
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = d;
        this.f = d2;
        this.g = z;
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
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.e), Double.valueOf(aVar.e)) && com.amazon.aps.iva.yb0.j.a(Double.valueOf(this.f), Double.valueOf(aVar.f)) && this.g == aVar.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = r.a(this.d, r.a(this.c, this.b.hashCode() * 31, 31), 31);
        int hashCode = (Double.hashCode(this.f) + ((Double.hashCode(this.e) + a) * 31)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdInfo(adCuePoints=");
        sb.append(this.b);
        sb.append(", currentAdPosition=");
        sb.append(this.c);
        sb.append(", totalAds=");
        sb.append(this.d);
        sb.append(", totalAdPodDuration=");
        sb.append(this.e);
        sb.append(", currentAdDuration=");
        sb.append(this.f);
        sb.append(", isTruexAd=");
        return defpackage.a.b(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.amazon.aps.iva.yb0.j.f(parcel, "out");
        List<Float> list = this.b;
        parcel.writeInt(list.size());
        for (Float f : list) {
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
