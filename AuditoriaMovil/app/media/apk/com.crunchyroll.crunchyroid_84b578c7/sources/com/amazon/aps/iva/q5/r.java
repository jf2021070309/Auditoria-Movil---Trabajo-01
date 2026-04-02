package com.amazon.aps.iva.q5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* compiled from: DrmInitData.java */
/* loaded from: classes.dex */
public final class r implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();
    public final b[] b;
    public int c;
    public final String d;
    public final int e;

    /* compiled from: DrmInitData.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i) {
            return new r[i];
        }
    }

    public r() {
        throw null;
    }

    public r(String str, ArrayList arrayList) {
        this(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public final r a(String str) {
        if (com.amazon.aps.iva.t5.g0.a(this.d, str)) {
            return this;
        }
        return new r(str, false, this.b);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = l.a;
        if (uuid.equals(bVar3.c)) {
            if (uuid.equals(bVar4.c)) {
                return 0;
            }
            return 1;
        }
        return bVar3.c.compareTo(bVar4.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (com.amazon.aps.iva.t5.g0.a(this.d, rVar.d) && Arrays.equals(this.b, rVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.c == 0) {
            String str = this.d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.c = (hashCode * 31) + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeTypedArray(this.b, 0);
    }

    public r(b... bVarArr) {
        this(null, true, bVarArr);
    }

    public r(String str, boolean z, b... bVarArr) {
        this.d = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.b = bVarArr;
        this.e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    /* compiled from: DrmInitData.java */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int b;
        public final UUID c;
        public final String d;
        public final String e;
        public final byte[] f;

        /* compiled from: DrmInitData.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
            throw null;
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.c = uuid;
            this.d = str;
            str2.getClass();
            this.e = str2;
            this.f = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = l.a;
            UUID uuid3 = this.c;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            if (!com.amazon.aps.iva.t5.g0.a(this.d, bVar.d) || !com.amazon.aps.iva.t5.g0.a(this.e, bVar.e) || !com.amazon.aps.iva.t5.g0.a(this.c, bVar.c) || !Arrays.equals(this.f, bVar.f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.b == 0) {
                int hashCode2 = this.c.hashCode() * 31;
                String str = this.d;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.b = Arrays.hashCode(this.f) + com.amazon.aps.iva.c80.a.b(this.e, (hashCode2 + hashCode) * 31, 31);
            }
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.c;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeByteArray(this.f);
        }

        public b(Parcel parcel) {
            this.c = new UUID(parcel.readLong(), parcel.readLong());
            this.d = parcel.readString();
            String readString = parcel.readString();
            int i = com.amazon.aps.iva.t5.g0.a;
            this.e = readString;
            this.f = parcel.createByteArray();
        }
    }

    public r(Parcel parcel) {
        this.d = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i = com.amazon.aps.iva.t5.g0.a;
        this.b = bVarArr;
        this.e = bVarArr.length;
    }
}
