package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0920So implements O9 {
    public final WeakReference<A8> A00;

    public C0920So(A8 a8) {
        this.A00 = new WeakReference<>(a8);
    }

    public /* synthetic */ C0920So(A8 a8, AD ad) {
        this(a8);
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void AAu(boolean z) {
        A8 a8 = this.A00.get();
        if (a8 != null) {
            a8.A04 = z;
            a8.A02();
        }
    }
}
