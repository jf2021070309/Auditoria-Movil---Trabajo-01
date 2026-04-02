package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
/* renamed from: com.facebook.ads.redexgen.X.Go  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0616Go {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<C0617Gp> A09;
    public final boolean A0A;

    public C0616Go(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<C0617Gp> sparseArray) {
        this.A03 = i2;
        this.A0A = z;
        this.A08 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A01 = i6;
        this.A00 = i7;
        this.A07 = i8;
        this.A06 = i9;
        this.A05 = i10;
        this.A09 = sparseArray;
    }

    public final void A00(C0616Go c0616Go) {
        if (c0616Go == null) {
            return;
        }
        SparseArray<C0617Gp> sparseArray = c0616Go.A09;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            this.A09.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
        }
    }
}
