package com.amazon.aps.iva.m6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: DownloadRequest.java */
/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final String b;
    public final Uri c;
    public final String d;
    public final List<p0> e;
    public final byte[] f;
    public final String g;
    public final byte[] h;

    /* compiled from: DownloadRequest.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(String str, Uri uri, String str2, List<p0> list, byte[] bArr, String str3, byte[] bArr2) {
        int J = g0.J(uri, str2);
        if (J == 0 || J == 2 || J == 1) {
            boolean z = str3 == null;
            com.amazon.aps.iva.cq.b.v(z, "customCacheKey must be null for type: " + J);
        }
        this.b = str;
        this.c = uri;
        this.d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.g = str3;
        this.h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : g0.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.b.equals(mVar.b) || !this.c.equals(mVar.c) || !g0.a(this.d, mVar.d) || !this.e.equals(mVar.e) || !Arrays.equals(this.f, mVar.f) || !g0.a(this.g, mVar.g) || !Arrays.equals(this.h, mVar.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31 * 31)) * 31;
        int i2 = 0;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (Arrays.hashCode(this.f) + ((this.e.hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.h) + ((hashCode2 + i2) * 31);
    }

    public final String toString() {
        return this.d + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d);
        List<p0> list = this.e;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
    }

    public m(Parcel parcel) {
        String readString = parcel.readString();
        int i = g0.a;
        this.b = readString;
        this.c = Uri.parse(parcel.readString());
        this.d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((p0) parcel.readParcelable(p0.class.getClassLoader()));
        }
        this.e = Collections.unmodifiableList(arrayList);
        this.f = parcel.createByteArray();
        this.g = parcel.readString();
        this.h = parcel.createByteArray();
    }
}
