package com.amazon.aps.iva.j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.q5.f0;
import com.google.common.primitives.Floats;
/* compiled from: SmtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class c implements f0.b {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final float b;
    public final int c;

    /* compiled from: SmtaMetadataEntry.java */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(float f, int i) {
        this.b = f;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Floats.hashCode(this.b) + 527) * 31) + this.c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }

    public c(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }
}
