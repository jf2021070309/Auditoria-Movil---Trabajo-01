package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.dv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1345dv {
    public final C1359e9 A00;
    public final C1354e4 A01;

    public C1345dv(AbstractC1365eF abstractC1365eF, C1354e4 c1354e4, C1359e9 c1359e9) {
        this.A00 = c1359e9;
        this.A01 = c1354e4;
        abstractC1365eF.A02(new GH(c1354e4));
    }

    public static C1345dv A00(AbstractC1365eF abstractC1365eF, InterfaceC1361eB interfaceC1361eB, GI gi) {
        C1359e9 c1359e9 = new C1359e9();
        return new C1345dv(abstractC1365eF, new C1354e4(interfaceC1361eB, new GL(), gi, c1359e9, new Handler()), c1359e9);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1363eD c1363eD) {
        this.A00.A02(view, c1363eD);
    }

    public final void A03(@Nullable InterfaceC1366eG interfaceC1366eG) {
        this.A01.A0B(interfaceC1366eG);
    }

    public final void A04(@Nullable InterfaceC1368eI interfaceC1368eI) {
        this.A01.A0C(interfaceC1368eI);
    }
}
