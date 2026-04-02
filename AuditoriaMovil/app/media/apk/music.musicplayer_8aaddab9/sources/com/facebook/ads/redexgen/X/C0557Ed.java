package com.facebook.ads.redexgen.X;

import android.os.Parcel;
/* renamed from: com.facebook.ads.redexgen.X.Ed  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0557Ed {
    public final int A00;
    public final long A01;

    public C0557Ed(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public /* synthetic */ C0557Ed(int i2, long j2, C0556Ec c0556Ec) {
        this(i2, j2);
    }

    public static C0557Ed A00(Parcel parcel) {
        return new C0557Ed(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
