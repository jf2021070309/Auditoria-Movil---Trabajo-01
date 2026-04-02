package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1197bP extends AbstractRunnableC0721Ku {
    public final /* synthetic */ C1194bM A00;
    public final /* synthetic */ KG A01;

    public C1197bP(C1194bM c1194bM, KG kg) {
        this.A00 = c1194bM;
        this.A01 = kg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0721Ku
    public final void A01() {
        C5Q c5q;
        C5Q c5q2;
        c5q = this.A00.A00;
        if (c5q.A02() != null) {
            c5q2 = this.A00.A00;
            c5q2.A02().onAdError(LY.A00(this.A01));
        }
    }
}
