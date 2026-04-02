package com.amazon.aps.iva.k7;

import com.amazon.aps.iva.q5.f0;
/* compiled from: SpliceCommand.java */
/* loaded from: classes.dex */
public abstract class b implements f0.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
