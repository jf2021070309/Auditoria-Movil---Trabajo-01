package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class FR extends AbstractC1285cv {
    public final /* synthetic */ FQ A00;
    public final /* synthetic */ AbstractC1305dF A01;
    public final /* synthetic */ C1294d4 A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FR(FQ fq, boolean z, boolean z2, C1294d4 c1294d4, AbstractC1305dF abstractC1305dF) {
        super(z);
        this.A00 = fq;
        this.A03 = z2;
        this.A02 = c1294d4;
        this.A01 = abstractC1305dF;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1285cv
    public final void A00() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACC(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1285cv
    public final void A01(boolean z) {
        C1046Xo c1046Xo;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1046Xo c1046Xo2;
        c1046Xo = this.A00.A04;
        if (!JQ.A1B(c1046Xo) || !this.A03) {
            atomicBoolean = this.A00.A0D;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC9(this.A01);
            return;
        }
        FQ fq = this.A00;
        c1046Xo2 = fq.A04;
        fq.A07 = P5.A01(c1046Xo2, this.A02, 0, new C1312dM(this));
    }
}
