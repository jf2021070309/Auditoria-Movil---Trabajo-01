package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.facebook.ads.redexgen.X.Xs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1050Xs extends L7 {
    public final /* synthetic */ C7M A00;
    public final /* synthetic */ C7N A01;
    public final /* synthetic */ C7U A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1050Xs(C7U c7u, ArrayList arrayList, C7M c7m, C7N c7n, ArrayList arrayList2) {
        this.A02 = c7u;
        this.A03 = arrayList;
        this.A00 = c7m;
        this.A01 = c7n;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        AtomicBoolean A0C;
        C8U c8u;
        Handler handler;
        C8U c8u2;
        long j2;
        long j3;
        A0C = C7U.A0C(this.A03);
        c8u = this.A02.A04;
        if (c8u instanceof C1046Xo) {
            c8u2 = this.A02.A04;
            C1046Xo c1046Xo = (C1046Xo) c8u2;
            if (A0C.get()) {
                C0R A0D = c1046Xo.A0D();
                j3 = this.A02.A00;
                A0D.A3v(MC.A01(j3));
            } else {
                C0R A0D2 = c1046Xo.A0D();
                j2 = this.A02.A00;
                A0D2.A3u(MC.A01(j2));
            }
        }
        handler = this.A02.A02;
        handler.post(new C1051Xt(this, A0C));
        C7U.A0C(this.A04);
    }
}
