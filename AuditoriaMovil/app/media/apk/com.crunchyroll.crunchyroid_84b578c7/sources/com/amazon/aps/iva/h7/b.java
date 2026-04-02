package com.amazon.aps.iva.h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.t5.g0;
/* compiled from: IcyHeaders.java */
/* loaded from: classes.dex */
public final class b implements f0.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;

    /* compiled from: IcyHeaders.java */
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

    public b(int i, int i2, String str, String str2, String str3, boolean z) {
        com.amazon.aps.iva.cq.b.t(i2 == -1 || i2 > 0);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.h7.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            java.lang.String r0 = "icy-br"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L23
            int r0 = r0 * 1000
            if (r0 <= 0) goto L1d
            r4 = r1
            goto L28
        L1d:
            com.amazon.aps.iva.t5.p.g()     // Catch: java.lang.NumberFormatException -> L24
            r4 = r2
            r0 = r3
            goto L28
        L23:
            r0 = r3
        L24:
            com.amazon.aps.iva.t5.p.g()
            r4 = r2
        L28:
            r6 = r0
            goto L2c
        L2a:
            r4 = r2
            r6 = r3
        L2c:
            java.lang.String r0 = "icy-genre"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            r5 = 0
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r4 = r1
            goto L41
        L40:
            r8 = r5
        L41:
            java.lang.String r0 = "icy-name"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L54
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r4 = r1
            goto L55
        L54:
            r9 = r5
        L55:
            java.lang.String r0 = "icy-url"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L68
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r10 = r0
            r4 = r1
            goto L69
        L68:
            r10 = r5
        L69:
            java.lang.String r0 = "icy-pub"
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L82
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = "1"
            boolean r0 = r0.equals(r4)
            r11 = r0
            r4 = r1
            goto L83
        L82:
            r11 = r2
        L83:
            java.lang.String r0 = "icy-metaint"
            java.lang.Object r12 = r12.get(r0)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto La5
            java.lang.Object r12 = r12.get(r2)
            java.lang.String r12 = (java.lang.String) r12
            int r12 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.NumberFormatException -> La2
            if (r12 <= 0) goto L9b
            r3 = r12
            goto L9f
        L9b:
            com.amazon.aps.iva.t5.p.g()     // Catch: java.lang.NumberFormatException -> La1
            r1 = r4
        L9f:
            r4 = r1
            goto La5
        La1:
            r3 = r12
        La2:
            com.amazon.aps.iva.t5.p.g()
        La5:
            r7 = r3
            if (r4 == 0) goto Lae
            com.amazon.aps.iva.h7.b r12 = new com.amazon.aps.iva.h7.b
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h7.b.a(java.util.Map):com.amazon.aps.iva.h7.b");
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
        if (this.b == bVar.b && g0.a(this.c, bVar.c) && g0.a(this.d, bVar.d) && g0.a(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.b) * 31;
        int i4 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.e;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.d + "\", genre=\"" + this.c + "\", bitrate=" + this.b + ", metadataInterval=" + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        int i2 = g0.a;
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
    }

    @Override // com.amazon.aps.iva.q5.f0.b
    public final void y(d0.a aVar) {
        String str = this.d;
        if (str != null) {
            aVar.E = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            aVar.C = str2;
        }
    }

    public b(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        int i = g0.a;
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt();
    }
}
