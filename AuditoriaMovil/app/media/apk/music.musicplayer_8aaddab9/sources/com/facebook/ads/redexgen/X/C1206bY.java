package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;
/* renamed from: com.facebook.ads.redexgen.X.bY  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1206bY implements InterfaceC0822Ot {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1201bT A01;
    public final /* synthetic */ U1 A02;

    public C1206bY(C1201bT c1201bT, U1 u1, NativeAd nativeAd) {
        this.A01 = c1201bT;
        this.A02 = u1;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void A8i() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void AAd() {
        C04529n c04529n;
        C04529n c04529n2;
        c04529n = this.A01.A0A;
        if (c04529n != null) {
            c04529n2 = this.A01.A0A;
            c04529n2.setAdViewabilityChecker(this.A02.A1C());
        }
        this.A02.A1d(true, true);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void AAq() {
        C04529n c04529n;
        C04529n c04529n2;
        c04529n = this.A01.A0A;
        if (c04529n != null) {
            c04529n2 = this.A01.A0A;
            c04529n2.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0822Ot
    public final void ACU(View view, MotionEvent motionEvent) {
        boolean A0I;
        this.A02.A1B().A06(motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0I = this.A01.A0I(this.A00);
            if (!A0I && this.A02.A14() != null) {
                this.A02.A14().onClick(view);
            }
        }
    }
}
