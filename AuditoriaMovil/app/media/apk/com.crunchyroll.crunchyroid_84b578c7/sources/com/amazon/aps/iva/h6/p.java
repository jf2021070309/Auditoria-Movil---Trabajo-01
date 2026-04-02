package com.amazon.aps.iva.h6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amazon.aps.iva.q5.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: HlsTrackMetadataEntry.java */
/* loaded from: classes.dex */
public final class p implements f0.b {
    public static final Parcelable.Creator<p> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<b> d;

    /* compiled from: HlsTrackMetadataEntry.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i) {
            return new p[i];
        }
    }

    public p(String str, String str2, List<b> list) {
        this.b = str;
        this.c = str2;
        this.d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (TextUtils.equals(this.b, pVar.b) && TextUtils.equals(this.c, pVar.c) && this.d.equals(pVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.d.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.b;
        if (str2 != null) {
            str = defpackage.b.c(com.amazon.aps.iva.k.q.c(" [", str2, ", "), this.c, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        List<b> list = this.d;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
    }

    public p(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: HlsTrackMetadataEntry.java */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        /* compiled from: HlsTrackMetadataEntry.java */
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

        public b(int i, int i2, String str, String str2, String str3, String str4) {
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b == bVar.b && this.c == bVar.c && TextUtils.equals(this.d, bVar.d) && TextUtils.equals(this.e, bVar.e) && TextUtils.equals(this.f, bVar.f) && TextUtils.equals(this.g, bVar.g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.b * 31) + this.c) * 31;
            int i5 = 0;
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.e;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.f;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.g;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }

        public b(Parcel parcel) {
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.g = parcel.readString();
        }
    }
}
