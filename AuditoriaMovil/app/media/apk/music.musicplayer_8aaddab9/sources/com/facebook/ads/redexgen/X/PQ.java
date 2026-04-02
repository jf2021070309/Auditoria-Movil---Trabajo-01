package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class PQ extends AbstractC04429c<AnonymousClass86> {
    public final /* synthetic */ AnonymousClass88 A00;

    public PQ(AnonymousClass88 anonymousClass88) {
        this.A00 = anonymousClass88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(AnonymousClass86 anonymousClass86) {
        int A00 = anonymousClass86.A00();
        int A01 = anonymousClass86.A01();
        if (this.A00.A00 > 0 && A00 == A01 && A01 > this.A00.A00) {
            return;
        }
        if (A01 < A00 + 500) {
            if (A01 == 0) {
                AnonymousClass88 anonymousClass88 = this.A00;
                anonymousClass88.A0d(anonymousClass88.A00);
                return;
            }
            this.A00.A0d(A01);
            return;
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    public final Class<AnonymousClass86> A01() {
        return AnonymousClass86.class;
    }
}
