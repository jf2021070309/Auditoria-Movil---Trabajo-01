package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.81  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass81 extends LF {
    public final /* synthetic */ KV A00;

    public AnonymousClass81(KV kv) {
        this.A00 = kv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC04429c
    /* renamed from: A00 */
    public final void A03(C0731Le c0731Le) {
        if (KV.A07(this.A00) && KV.A08(this.A00)) {
            KV.A0B(this.A00, false);
            if (KV.A0A(this.A00, QL.A04) || KV.A09(this.A00)) {
                KV.A0C(this.A00, false);
                KV.A01(this.A00).postDelayed(new KX(this), KV.A00(this.A00));
            } else if (!KV.A0A(this.A00, QL.A03)) {
            } else {
                KV.A04(this.A00);
                KV.A05(this.A00, true, true);
            }
        }
    }
}
