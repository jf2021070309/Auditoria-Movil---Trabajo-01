package com.amazon.aps.iva.e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
/* compiled from: AppInfoTable.java */
/* loaded from: classes.dex */
public final class a implements f0.b {
    public static final Parcelable.Creator<a> CREATOR = new C0216a();
    public final int b;
    public final String c;

    /* compiled from: AppInfoTable.java */
    /* renamed from: com.amazon.aps.iva.e7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0216a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new a(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.b);
        sb.append(",url=");
        return defpackage.b.c(sb, this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }
}
