package com.amazon.aps.iva.k7;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: SpliceNullCommand.java */
/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* compiled from: SpliceNullCommand.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e();
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i) {
            return new e[i];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
