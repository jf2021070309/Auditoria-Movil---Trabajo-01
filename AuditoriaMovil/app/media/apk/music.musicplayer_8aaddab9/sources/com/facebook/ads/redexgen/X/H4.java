package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public final class H4 implements RV {
    @Override // com.facebook.ads.redexgen.X.RV
    public final long A4e() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.X.RV
    public final void AEz(Object obj, long j2) throws InterruptedException {
        obj.wait(j2);
    }
}
