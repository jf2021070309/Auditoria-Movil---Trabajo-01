package com.amazon.aps.iva.o0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: ParcelableSnapshotMutableState.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class y1<T> extends g3<T> implements Parcelable {
    public static final Parcelable.Creator<y1<Object>> CREATOR = new a();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(T t, h3<T> h3Var) {
        super(t, h3Var);
        com.amazon.aps.iva.yb0.j.f(h3Var, "policy");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
        parcel.writeValue(getValue());
        r1 r1Var = r1.a;
        h3<T> h3Var = this.b;
        if (com.amazon.aps.iva.yb0.j.a(h3Var, r1Var)) {
            i2 = 0;
        } else if (com.amazon.aps.iva.yb0.j.a(h3Var, s3.a)) {
            i2 = 1;
        } else if (com.amazon.aps.iva.yb0.j.a(h3Var, t2.a)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }

    /* compiled from: ParcelableSnapshotMutableState.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.ClassLoaderCreator<y1<Object>> {
        public static y1 a(Parcel parcel, ClassLoader classLoader) {
            h3 h3Var;
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt != 0) {
                if (readInt != 1) {
                    if (readInt == 2) {
                        h3Var = t2.a;
                    } else {
                        throw new IllegalStateException(com.amazon.aps.iva.c80.a.d("Unsupported MutableState policy ", readInt, " was restored"));
                    }
                } else {
                    h3Var = s3.a;
                }
            } else {
                h3Var = r1.a;
            }
            return new y1(readValue, h3Var);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            com.amazon.aps.iva.yb0.j.f(parcel, "parcel");
            return a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new y1[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ y1<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }
    }
}
