package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;
/* renamed from: com.facebook.ads.redexgen.X.ai  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1154ai implements InterfaceC03956v {
    public static String[] A01 = {"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    public final /* synthetic */ C1134aO A00;

    public C1154ai(C1134aO c1134aO) {
        this.A00 = c1134aO;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956v
    public final C7A A5I() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo != null) {
            C1134aO c1134aO = this.A00;
            applicationInfo2 = c1134aO.A01;
            if (A01[1].length() != 3) {
                A01[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
                return c1134aO.A08(applicationInfo2.taskAffinity);
            }
            throw new RuntimeException();
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
