package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.0w  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02440w extends C2M implements K2 {
    public AE A00;
    @Nullable
    public List<PU> A01;

    public C02440w(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A00 = new AE(this, 1, null, null, null);
    }

    public final void A22(C0869Qp c0869Qp) {
        AE ae = this.A00;
        if (ae != null) {
            ae.A0d(c0869Qp);
        }
    }

    public AE getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0e(this.A01);
    }
}
