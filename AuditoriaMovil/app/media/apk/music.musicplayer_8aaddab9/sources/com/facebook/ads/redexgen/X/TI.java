package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: assets/audience_network.dex */
public class TI implements InterfaceC0759Mi {
    public static String[] A01 = {"h2gmCgzeOSwPpQadyubORmPME", "FUsicmE", "hn4NyL1W4e9kqLwlHKvUfsHZQMREJpya", "eHNPFabCzKzaRImgdDwbhByrCj67ZmIn", "6elmdBIgNV", "KYWsfvA8UKVAEYMYl", "OScpkLbA9Akq1WCCJj9B2P18mljyrRf1", "CLPqh0UltEqIAscKXF8yE5GQF7q0sxf27"};
    public final /* synthetic */ TE A00;

    public TI(TE te) {
        this.A00 = te;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Mi
    public final void AAI() {
        boolean A0Z;
        boolean z;
        C0692Jo c0692Jo;
        InterfaceC0761Mk interfaceC0761Mk;
        NC nc;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        OO oo;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            TE te = this.A00;
            if (A01[5].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "BQfapZ2cL00AEaaE3FSFtmiC2NvNVd8B";
            strArr[7] = "2Eilcj8Fw7KGtRQsL0qtkyDrsBY20NGQL";
            atomicBoolean2 = te.A0Q;
            if (!atomicBoolean2.get()) {
                oo = this.A00.A0O;
                oo.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0S;
        if (z) {
            atomicBoolean = this.A00.A0Q;
            boolean z2 = atomicBoolean.get();
            String[] strArr2 = A01;
            if (strArr2[1].length() == strArr2[4].length()) {
                throw new RuntimeException();
            }
            A01[5] = "H8RzDb7PgK43jKvxQ";
            if (!z2) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0V.setToolbarActionMode(0);
                    TE te2 = this.A00;
                    String[] strArr3 = A01;
                    if (strArr3[1].length() != strArr3[4].length()) {
                        A01[3] = "HnGIws8hCrqNeUOcBeXjDBOXn0GrcMNy";
                        te2.A0M();
                        return;
                    }
                    te2.A0M();
                    return;
                }
            }
        }
        c0692Jo = this.A00.A0I;
        c0692Jo.A02(EnumC0691Jn.A07, null);
        interfaceC0761Mk = this.A00.A0L;
        nc = this.A00.A0M;
        interfaceC0761Mk.A3r(nc.A6T());
    }
}
