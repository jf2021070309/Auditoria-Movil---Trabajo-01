package com.amazon.aps.iva.eb;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: ParcelableContainer.java */
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public com.amazon.aps.iva.fb.b b;
    public final SparseArray<Object> c;
    public final SparseArray<Object> d;
    public int e;

    /* compiled from: ParcelableContainer.java */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i) {
            return new g[i];
        }
    }

    public g() {
        this.c = new SparseArray<>();
        SparseArray<Object> sparseArray = new SparseArray<>();
        this.d = sparseArray;
        sparseArray.put(1, 0);
        sparseArray.put(2, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeSparseArray(this.c);
        parcel.writeSparseArray(this.d);
        parcel.writeInt(this.e);
    }

    public g(Parcel parcel) {
        this.c = new SparseArray<>();
        this.d = new SparseArray<>();
        this.b = com.amazon.aps.iva.fb.b.CREATOR.createFromParcel(parcel);
        this.c = parcel.readSparseArray(com.amazon.aps.iva.gb.a.class.getClassLoader());
        this.d = parcel.readSparseArray(Integer.class.getClassLoader());
        this.e = parcel.readInt();
    }
}
