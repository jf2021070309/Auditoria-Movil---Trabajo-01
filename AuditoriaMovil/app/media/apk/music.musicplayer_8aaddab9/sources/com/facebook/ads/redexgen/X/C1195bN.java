package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAd;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.bN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1195bN implements C7M {
    public final List<C1315dP> A00;
    public final /* synthetic */ C1194bM A01;

    public C1195bN(C1194bM c1194bM, List<C1315dP> list) {
        this.A01 = c1194bM;
        this.A00 = list;
    }

    private void A00() {
        C5Q c5q;
        C5Q c5q2;
        C5Q c5q3;
        C1046Xo c1046Xo;
        C5Q c5q4;
        C5Q c5q5;
        C1046Xo c1046Xo2;
        c5q = this.A01.A00;
        c5q.A07(true);
        c5q2 = this.A01.A00;
        c5q2.A04();
        c5q3 = this.A01.A00;
        c5q3.A05(0);
        for (C1315dP c1315dP : this.A00) {
            c1046Xo = this.A01.A01;
            K3 A0K = U1.A0K();
            c5q4 = this.A01.A00;
            U1 u1 = new U1(c1046Xo, c1315dP, null, A0K, c5q4.A03());
            C1315dP nativeAdapter = u1.A10();
            if (nativeAdapter != null) {
                C1315dP nativeAdapter2 = u1.A10();
                if (nativeAdapter2.A0F() != null) {
                    C1315dP nativeAdapter3 = u1.A10();
                    ((AbstractC1276cm) nativeAdapter3.A0F()).A00(u1);
                }
            }
            c5q5 = this.A01.A00;
            c1046Xo2 = this.A01.A01;
            c5q5.A06(new NativeAd(c1046Xo2, u1));
        }
        C0725Ky.A00(new C1196bO(this));
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAF() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAM() {
        A00();
    }
}
