package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
/* renamed from: com.facebook.ads.redexgen.X.Vn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0995Vn implements InterfaceC0544Dq {
    public final C0659Ih A00 = new C0659Ih(new byte[4]);
    public final /* synthetic */ C0993Vl A01;

    public C0995Vn(C0993Vl c0993Vl) {
        this.A01 = c0993Vl;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0544Dq
    public final void A47(C0660Ii c0660Ii) {
        int i2;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        if (c0660Ii.A0E() != 0) {
            return;
        }
        c0660Ii.A0Z(7);
        int A04 = c0660Ii.A04() / 4;
        for (int i3 = 0; i3 < A04; i3++) {
            c0660Ii.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int A043 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(A043, new C0998Vq(new C0994Vm(this.A01, A043)));
                C0993Vl.A01(this.A01);
            }
        }
        i2 = this.A01.A05;
        if (i2 != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0544Dq
    public final void A8K(C0672Iu c0672Iu, Ce ce, C0550Dw c0550Dw) {
    }
}
