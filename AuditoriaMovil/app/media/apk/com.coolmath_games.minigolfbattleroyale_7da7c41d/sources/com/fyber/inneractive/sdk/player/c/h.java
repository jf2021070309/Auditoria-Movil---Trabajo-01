package com.fyber.inneractive.sdk.player.c;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: com.fyber.inneractive.sdk.player.c.h.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ h[] newArray(int i) {
            return new h[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }
    };
    private int A;
    public final String a;
    public final int b;
    public final String c;
    public final com.fyber.inneractive.sdk.player.c.f.a d;
    public final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final com.fyber.inneractive.sdk.player.c.c.a i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    public final int o;
    public final byte[] p;
    public final com.fyber.inneractive.sdk.player.c.l.b q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static h a(String str, String str2, int i, int i2, List<byte[]> list, float f) {
        return a(str, str2, -1, i, i2, list, -1, f, null, -1, null, null);
    }

    public static h a(String str, String str2, int i, int i2, int i3, List<byte[]> list, int i4, float f, byte[] bArr, int i5, com.fyber.inneractive.sdk.player.c.l.b bVar, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        return new h(str, null, str2, null, -1, i, i2, i3, -1.0f, i4, f, bArr, i5, bVar, -1, -1, -1, -1, -1, 0, null, -1, LongCompanionObject.MAX_VALUE, list, aVar, null);
    }

    public static h a(String str, String str2, int i, int i2, int i3, int i4, List<byte[]> list, com.fyber.inneractive.sdk.player.c.c.a aVar, String str3) {
        return a(str, str2, i, i2, i3, i4, -1, list, aVar, 0, str3);
    }

    public static h a(String str, String str2, int i, int i2, int i3, int i4, int i5, List<byte[]> list, com.fyber.inneractive.sdk.player.c.c.a aVar, int i6, String str3) {
        return a(str, str2, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str3, null);
    }

    public static h a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, com.fyber.inneractive.sdk.player.c.c.a aVar, int i8, String str3, com.fyber.inneractive.sdk.player.c.f.a aVar2) {
        return new h(str, null, str2, null, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str3, -1, LongCompanionObject.MAX_VALUE, list, aVar, aVar2);
    }

    public static h a(String str, String str2, int i, String str3, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        return a(str, str2, i, str3, -1, aVar, LongCompanionObject.MAX_VALUE, Collections.emptyList());
    }

    public static h a(String str, String str2, int i, String str3, int i2) {
        return a(str, str2, i, str3, i2, null, LongCompanionObject.MAX_VALUE, Collections.emptyList());
    }

    public static h a(String str, String str2, int i, String str3, int i2, com.fyber.inneractive.sdk.player.c.c.a aVar, long j, List<byte[]> list) {
        return new h(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i, str3, i2, j, list, aVar, null);
    }

    public static h a(String str, String str2, List<byte[]> list, String str3, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        return new h(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str3, -1, LongCompanionObject.MAX_VALUE, list, aVar, null);
    }

    public static h a(String str, long j) {
        return new h(null, null, str, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static h a(String str, String str2, com.fyber.inneractive.sdk.player.c.c.a aVar) {
        return new h(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, LongCompanionObject.MAX_VALUE, null, aVar, null);
    }

    public h(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, com.fyber.inneractive.sdk.player.c.l.b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, com.fyber.inneractive.sdk.player.c.c.a aVar, com.fyber.inneractive.sdk.player.c.f.a aVar2) {
        this.a = str;
        this.e = str2;
        this.f = str3;
        this.c = str4;
        this.b = i;
        this.g = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = i5;
        this.n = f2;
        this.p = bArr;
        this.o = i6;
        this.q = bVar;
        this.r = i7;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.x = i12;
        this.y = str5;
        this.z = i13;
        this.w = j;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = aVar;
        this.d = aVar2;
    }

    h(Parcel parcel) {
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readInt();
        this.g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (com.fyber.inneractive.sdk.player.c.l.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.c.l.b.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (com.fyber.inneractive.sdk.player.c.c.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.c.c.a.class.getClassLoader());
        this.d = (com.fyber.inneractive.sdk.player.c.f.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.c.f.a.class.getClassLoader());
    }

    public final h a(long j) {
        return new h(this.a, this.e, this.f, this.c, this.b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, j, this.h, this.i, this.d);
    }

    public final int a() {
        int i;
        int i2 = this.j;
        if (i2 == -1 || (i = this.k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final MediaFormat b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f);
        String str = this.y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.g);
        a(mediaFormat, ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.j);
        a(mediaFormat, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.k);
        float f = this.l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        a(mediaFormat, "rotation-degrees", this.m);
        a(mediaFormat, "channel-count", this.r);
        a(mediaFormat, "sample-rate", this.s);
        a(mediaFormat, "encoder-delay", this.u);
        a(mediaFormat, "encoder-padding", this.v);
        for (int i = 0; i < this.h.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(this.h.get(i)));
        }
        com.fyber.inneractive.sdk.player.c.l.b bVar = this.q;
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.c);
            a(mediaFormat, "color-standard", bVar.a);
            a(mediaFormat, "color-range", bVar.b);
            byte[] bArr = bVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        return "Format(" + this.a + ", " + this.e + ", " + this.f + ", " + this.b + ", " + this.y + ", [" + this.j + ", " + this.k + ", " + this.l + "], [" + this.r + ", " + this.s + "])";
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            String str5 = this.y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.z) * 31;
            com.fyber.inneractive.sdk.player.c.c.a aVar = this.i;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.c.f.a aVar2 = this.d;
            this.A = hashCode6 + (aVar2 != null ? aVar2.hashCode() : 0);
        }
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h hVar = (h) obj;
            if (this.b == hVar.b && this.g == hVar.g && this.j == hVar.j && this.k == hVar.k && this.l == hVar.l && this.m == hVar.m && this.n == hVar.n && this.o == hVar.o && this.r == hVar.r && this.s == hVar.s && this.t == hVar.t && this.u == hVar.u && this.v == hVar.v && this.w == hVar.w && this.x == hVar.x && t.a(this.a, hVar.a) && t.a(this.y, hVar.y) && this.z == hVar.z && t.a(this.e, hVar.e) && t.a(this.f, hVar.f) && t.a(this.c, hVar.c) && t.a(this.i, hVar.i) && t.a(this.d, hVar.d) && t.a(this.q, hVar.q) && Arrays.equals(this.p, hVar.p) && this.h.size() == hVar.h.size()) {
                for (int i = 0; i < this.h.size(); i++) {
                    if (!Arrays.equals(this.h.get(i), hVar.h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p != null ? 1 : 0);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.h.get(i2));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
