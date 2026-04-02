package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* loaded from: assets/audience_network.dex */
public final class FJ extends AbstractC0932Ta<C1275cl> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FJ(C1275cl c1275cl) {
        super(c1275cl);
    }

    @Override // com.facebook.ads.redexgen.X.L7
    public final void A06() {
        C1046Xo c1046Xo;
        Handler handler;
        Runnable runnable;
        C1275cl A07 = A07();
        if (A07 == null) {
            return;
        }
        c1046Xo = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C0753Mc.A02(c1046Xo)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}
