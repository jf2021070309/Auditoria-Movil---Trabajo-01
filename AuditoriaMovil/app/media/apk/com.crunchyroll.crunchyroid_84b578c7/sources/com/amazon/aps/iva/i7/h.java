package com.amazon.aps.iva.i7;

import com.amazon.aps.iva.q5.f0;
/* compiled from: Id3Frame.java */
/* loaded from: classes.dex */
public abstract class h implements f0.b {
    public final String b;

    public h(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.b;
    }
}
