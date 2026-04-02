package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.dH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1307dH extends AbstractC02370p {
    public static String[] A05 = {"RwkPFHsv9wotgH8PCqYhpIij5lIi", "drIC7gYxypHASOm9CvVJaHIQeep0", "f0dvIXyq27iv5zRXvkJTu2cqkG", "fzusVvXWPget8SSdASQ7tAMFHi8p37he", "Ar6p", "jDkSEm6Ik6fEWWn08WKTicIvFe3Dtksc", "J7vaKr0jTjoObEFZmlhET1S0K8S4ujA7", "2rimL2d5m8eNJCurq2ysJBza56R6EvG7"};
    public static final String A06 = C1307dH.class.getSimpleName();
    public C1309dJ A00;
    public boolean A01;
    public final C1046Xo A02;
    public final InterfaceC0684Jg A03;
    public final O0 A04;

    public C1307dH(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, O0 o0, C0869Qp c0869Qp, AbstractC02380q abstractC02380q) {
        super(c1046Xo, abstractC02380q, c0869Qp);
        this.A03 = interfaceC0684Jg;
        this.A04 = o0;
        this.A02 = c1046Xo;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02370p
    public final void A06(Map<String, String> map) {
        C1309dJ c1309dJ = this.A00;
        if (c1309dJ != null && !TextUtils.isEmpty(c1309dJ.A64())) {
            this.A02.A0D().A2Y();
            AnonymousClass29.A00(this.A00.A05());
            InterfaceC0684Jg interfaceC0684Jg = this.A03;
            String A64 = this.A00.A64();
            String[] strArr = A05;
            if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[0] = "Tkg0tGhzpCvpbpNuTPjRHtf4b45H";
            strArr2[1] = "dBPpzaB1YNfwJk5banXGE19c57tB";
            interfaceC0684Jg.A93(A64, map);
        }
    }

    public final synchronized void A07() {
        if (!this.A01 && this.A00 != null) {
            this.A01 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                MF.A00(new C1308dI(this));
            }
        }
    }

    public final void A08(C1309dJ c1309dJ) {
        this.A00 = c1309dJ;
    }
}
