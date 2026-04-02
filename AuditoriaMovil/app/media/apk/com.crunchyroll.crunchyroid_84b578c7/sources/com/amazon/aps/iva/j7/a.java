package com.amazon.aps.iva.j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.google.common.primitives.Longs;
/* compiled from: MotionPhotoMetadata.java */
/* loaded from: classes.dex */
public final class a implements f0.b {
    public static final Parcelable.Creator<a> CREATOR = new C0403a();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    /* compiled from: MotionPhotoMetadata.java */
    /* renamed from: com.amazon.aps.iva.j7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0403a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(long j, long j2, long j3, long j4, long j5) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Longs.hashCode(this.c);
        int hashCode2 = Longs.hashCode(this.d);
        int hashCode3 = Longs.hashCode(this.e);
        return Longs.hashCode(this.f) + ((hashCode3 + ((hashCode2 + ((hashCode + ((Longs.hashCode(this.b) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.b + ", photoSize=" + this.c + ", photoPresentationTimestampUs=" + this.d + ", videoStartPosition=" + this.e + ", videoSize=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
    }

    public a(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
    }
}
