package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Sx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0929Sx extends L7 {
    public final WeakReference<C0869Qp> A00;

    public C0929Sx(C0869Qp c0869Qp) {
        this.A00 = new WeakReference<>(c0869Qp);
    }

    public C0929Sx(WeakReference<C0869Qp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C0869Qp c0869Qp = this.A00.get();
        if (c0869Qp != null) {
            c0869Qp.A0U();
        }
    }
}
