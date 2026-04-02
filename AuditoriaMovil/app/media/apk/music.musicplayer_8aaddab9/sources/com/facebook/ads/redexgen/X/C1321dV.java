package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.dV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1321dV implements InterfaceC0822Ot {
    public final /* synthetic */ C1318dS A00;

    public C1321dV(C1318dS c1318dS) {
        this.A00 = c1318dS;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void A8i() {
        C1300dA c1300dA;
        E5 e5;
        c1300dA = this.A00.A02;
        String A00 = c1300dA.A0Q().A00();
        if (!TextUtils.isEmpty(A00)) {
            LV lv = new LV();
            e5 = this.A00.A03;
            LV.A0A(lv, e5, Uri.parse(A00), this.A00.A64());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void AAd() {
        C04529n c04529n;
        C04529n c04529n2;
        C0869Qp c0869Qp;
        C0869Qp c0869Qp2;
        this.A00.A0A();
        c04529n = this.A00.A08;
        if (c04529n != null) {
            c04529n2 = this.A00.A08;
            c0869Qp = this.A00.A0A;
            c04529n2.setAdViewabilityChecker(c0869Qp);
            c0869Qp2 = this.A00.A0A;
            c0869Qp2.A0U();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void AAq() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void ACU(View view, MotionEvent motionEvent) {
    }
}
