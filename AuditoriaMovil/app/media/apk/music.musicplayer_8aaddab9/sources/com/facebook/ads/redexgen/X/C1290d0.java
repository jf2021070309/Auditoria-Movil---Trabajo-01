package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
/* renamed from: com.facebook.ads.redexgen.X.d0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1290d0 implements C7M {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C02511d A00;
    public final /* synthetic */ C1046Xo A01;
    public final /* synthetic */ boolean A02;

    public C1290d0(C02511d c02511d, C1046Xo c1046Xo, boolean z) {
        this.A00 = c02511d;
        this.A01 = c1046Xo;
        this.A02 = z;
    }

    private void A00(boolean z) {
        InterfaceC02501c interfaceC02501c;
        InterfaceC02501c interfaceC02501c2;
        C1298d8 c1298d8;
        if (!z) {
            interfaceC02501c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC02501c.A9s(AdError.CACHE_ERROR);
            return;
        }
        if (JQ.A18(this.A01)) {
            boolean z2 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z2) {
                C02511d c02511d = this.A00;
                C1046Xo c1046Xo = this.A01;
                c1298d8 = c02511d.A03;
                c02511d.A02 = P5.A01(c1046Xo, c1298d8, 1, new C1291d1(this));
                return;
            }
        }
        interfaceC02501c2 = this.A00.A04;
        interfaceC02501c2.A9t();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAF() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAM() {
        A00(true);
    }
}
