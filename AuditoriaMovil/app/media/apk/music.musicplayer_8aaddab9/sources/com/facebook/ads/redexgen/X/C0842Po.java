package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Po  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0842Po extends AbstractC04429c<AnonymousClass84> {
    public final /* synthetic */ AnonymousClass88 A00;

    public C0842Po(AnonymousClass88 anonymousClass88) {
        this.A00 = anonymousClass88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(AnonymousClass84 anonymousClass84) {
        Q8 q8;
        Q8 q82;
        int A00 = anonymousClass84.A00();
        if (this.A00.A00 > 0) {
            q8 = this.A00.A0B;
            if (A00 == q8.getDuration()) {
                q82 = this.A00.A0B;
                if (q82.getDuration() > this.A00.A00) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    public final Class<AnonymousClass84> A01() {
        return AnonymousClass84.class;
    }
}
