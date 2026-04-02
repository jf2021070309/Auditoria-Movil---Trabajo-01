package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class SE implements AnonymousClass57 {
    public final /* synthetic */ AnonymousClass92 A00;

    public SE(AnonymousClass92 anonymousClass92) {
        this.A00 = anonymousClass92;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass57
    public final boolean A8M() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
