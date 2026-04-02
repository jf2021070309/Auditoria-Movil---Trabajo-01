package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.dL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1311dL implements InterfaceC03545f {
    public final /* synthetic */ FQ A00;

    public C1311dL(FQ fq) {
        this.A00 = fq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void A9z() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03545f
    public final void AA0() {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACC(this.A00, AdError.CACHE_ERROR);
    }
}
