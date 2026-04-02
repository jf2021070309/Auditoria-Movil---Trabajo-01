package com.amazon.aps.iva.q5;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.d0;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;
/* compiled from: Metadata.java */
/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();
    public final b[] b;
    public final long c;

    /* compiled from: Metadata.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i) {
            return new f0[i];
        }
    }

    public f0(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final f0 a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i = com.amazon.aps.iva.t5.g0.a;
        b[] bVarArr2 = this.b;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new f0(this.c, (b[]) copyOf);
    }

    public final b b(int i) {
        return this.b[i];
    }

    public final int c() {
        return this.b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (Arrays.equals(this.b, f0Var.b) && this.c == f0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.c) + (Arrays.hashCode(this.b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.b));
        long j = this.c;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b[] bVarArr = this.b;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.c);
    }

    public f0(long j, b... bVarArr) {
        this.c = j;
        this.b = bVarArr;
    }

    public f0(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public f0(Parcel parcel) {
        this.b = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.b;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                this.c = parcel.readLong();
                return;
            }
        }
    }

    /* compiled from: Metadata.java */
    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        default byte[] B() {
            return null;
        }

        default v k() {
            return null;
        }

        default void y(d0.a aVar) {
        }
    }
}
