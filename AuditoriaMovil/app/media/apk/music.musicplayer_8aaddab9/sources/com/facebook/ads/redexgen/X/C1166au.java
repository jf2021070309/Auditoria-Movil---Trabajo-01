package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
/* renamed from: com.facebook.ads.redexgen.X.au  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1166au implements InterfaceC03956v {
    public static String[] A01 = {"ks6FgoJovve7iHM2pZkl", "wha53u", "49wSJ7V8XkDKZTUcjMDnpoSn", "1JQ5I5ad77Yrp3ewkirQ0oRutiEmvr6i", "jAt3ZHaaMbDXz0fIQiir7V", "EKdcAjdCbYFTR4bnYqi4SV", "MwtlcC", "w1RouBmka6J1zGDRhikmrfItH78owLWg"};
    public final /* synthetic */ C1155aj A00;

    public C1166au(C1155aj c1155aj) {
        this.A00 = c1155aj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ActivityManager activityManager;
        activityManager = this.A00.A02;
        if (activityManager != null) {
            return this.A00.A0F(ActivityManager.isUserAMonkey());
        }
        C1155aj c1155aj = this.A00;
        AnonymousClass76 anonymousClass76 = AnonymousClass76.A07;
        if (A01[2].length() != 23) {
            String[] strArr = A01;
            strArr[3] = "MHidzBjnmsHNQkooJipxy3AaWgleVPOv";
            strArr[7] = "EW2Ra62KpqEXQLSIkiFDqiivYFqdEGvM";
            return c1155aj.A07(anonymousClass76);
        }
        throw new RuntimeException();
    }
}
