package com.amazon.aps.iva.fb;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
/* compiled from: AnchorViewState.java */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public Integer b;
    public final Rect c;

    /* compiled from: AnchorViewState.java */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<b> {
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
        this.b = 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "AnchorState. Position = %d, Rect = %s", this.b, String.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        Integer num = this.b;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeParcelable(this.c, 0);
    }

    public b(int i, Rect rect) {
        this.b = 0;
        this.b = Integer.valueOf(i);
        this.c = rect;
    }

    public b(Parcel parcel) {
        this.b = 0;
        int readInt = parcel.readInt();
        this.b = readInt == -1 ? null : Integer.valueOf(readInt);
        this.c = (Rect) parcel.readParcelable(b.class.getClassLoader());
    }
}
