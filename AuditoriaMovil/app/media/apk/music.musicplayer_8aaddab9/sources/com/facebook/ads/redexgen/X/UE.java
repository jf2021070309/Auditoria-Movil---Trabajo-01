package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* loaded from: assets/audience_network.dex */
public class UE implements InterfaceC0701Jx {
    public WeakReference<U1> A00;

    public UE(U1 u1) {
        this.A00 = new WeakReference<>(u1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0701Jx
    public final void ABh(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1d(z, false);
        }
    }
}
