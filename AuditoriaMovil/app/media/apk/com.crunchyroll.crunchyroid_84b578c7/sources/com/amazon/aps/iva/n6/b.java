package com.amazon.aps.iva.n6;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: Requirements.java */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int b;

    /* compiled from: Requirements.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r6.hasCapability(16) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.n6.b.a(android.content.Context):int");
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
        if (this.b == ((b) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
