package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.dK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1310dK implements InterfaceC02591l {
    public final /* synthetic */ FQ A00;

    public C1310dK(FQ fq) {
        this.A00 = fq;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02591l
    public final void ABj(AdError adError) {
        AnonymousClass14 anonymousClass14;
        anonymousClass14 = this.A00.A01;
        anonymousClass14.ACC(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02591l
    public final void ABk() {
        AtomicBoolean atomicBoolean;
        AnonymousClass14 anonymousClass14;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(true);
        anonymousClass14 = this.A00.A01;
        anonymousClass14.AC9(this.A00);
    }
}
