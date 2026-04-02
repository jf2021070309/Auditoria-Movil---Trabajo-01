package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1196bO extends AbstractRunnableC0721Ku {
    public final /* synthetic */ C1195bN A00;

    public C1196bO(C1195bN c1195bN) {
        this.A00 = c1195bN;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0721Ku
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A01.A00;
        if (c5q.A02() != null) {
            c5q2 = this.A00.A01.A00;
            c5q2.A02().onAdsLoaded();
        }
    }
}
