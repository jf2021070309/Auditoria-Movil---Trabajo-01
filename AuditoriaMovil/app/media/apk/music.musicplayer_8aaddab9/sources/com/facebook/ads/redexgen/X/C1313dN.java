package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.dN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1313dN implements InterfaceC03545f {
    public final /* synthetic */ FQ A00;
    public final /* synthetic */ boolean A01;

    public C1313dN(FQ fq, boolean z) {
        this.A00 = fq;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void A9z() {
        C1046Xo c1046Xo;
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        C1046Xo c1046Xo2;
        AnonymousClass18 anonymousClass18;
        c1046Xo = this.A00.A04;
        if (!JQ.A1B(c1046Xo) || !this.A01) {
            atomicBoolean = this.A00.A0D;
            atomicBoolean.set(true);
            anonymousClass14 = this.A00.A01;
            anonymousClass14.AC9(this.A00);
            return;
        }
        FQ fq = this.A00;
        c1046Xo2 = fq.A04;
        anonymousClass18 = this.A00.A03;
        fq.A07 = P5.A01(c1046Xo2, (C1294d4) anonymousClass18, 0, new C1314dO(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void AA0() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACC(this.A00, AdError.CACHE_ERROR);
    }
}
