package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
/* loaded from: assets/audience_network.dex */
public class TF implements InterfaceC0831Pd {
    public final /* synthetic */ TE A00;

    public TF(TE te) {
        this.A00 = te;
    }

    public /* synthetic */ TF(TE te, TL tl) {
        this(te);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Pd
    public final void AAO() {
        this.A00.A0X(true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Pd
    public final void AAw() {
        AnonymousClass18 anonymousClass18;
        InterfaceC0761Mk interfaceC0761Mk;
        NC nc;
        InterfaceC0684Jg interfaceC0684Jg;
        AnonymousClass18 anonymousClass182;
        C0833Pf c0833Pf;
        C0833Pf c0833Pf2;
        AnonymousClass18 anonymousClass183;
        C1046Xo c1046Xo;
        anonymousClass18 = this.A00.A0D;
        if (!TextUtils.isEmpty(anonymousClass18.A0T())) {
            interfaceC0684Jg = this.A00.A0H;
            anonymousClass182 = this.A00.A0D;
            String A0T = anonymousClass182.A0T();
            OA oa = new OA();
            c0833Pf = this.A00.A06;
            OA A03 = oa.A03(c0833Pf.getViewabilityChecker());
            c0833Pf2 = this.A00.A06;
            interfaceC0684Jg.A93(A0T, A03.A02(c0833Pf2.getTouchDataRecorder()).A05());
            anonymousClass183 = this.A00.A0D;
            AnonymousClass29.A00(anonymousClass183.A0V());
            c1046Xo = this.A00.A0G;
            c1046Xo.A0D().A2Y();
        }
        interfaceC0761Mk = this.A00.A0L;
        nc = this.A00.A0M;
        interfaceC0761Mk.A3r(nc.A6l());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Pd
    public final void ABH() {
        InterfaceC0761Mk interfaceC0761Mk;
        NC nc;
        interfaceC0761Mk = this.A00.A0L;
        nc = this.A00.A0M;
        interfaceC0761Mk.A3r(nc.A6Y());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0831Pd
    public final void ACr() {
        InterfaceC0761Mk interfaceC0761Mk;
        interfaceC0761Mk = this.A00.A0L;
        interfaceC0761Mk.AAD(15);
    }
}
