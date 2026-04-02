package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class SD implements O9 {
    public final /* synthetic */ AnonymousClass92 A00;

    public SD(AnonymousClass92 anonymousClass92) {
        this.A00 = anonymousClass92;
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void AAu(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}
