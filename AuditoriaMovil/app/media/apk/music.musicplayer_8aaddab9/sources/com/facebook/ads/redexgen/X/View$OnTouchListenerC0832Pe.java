package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Pe  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0832Pe implements View.OnTouchListener {
    public final /* synthetic */ C0833Pf A00;

    public View$OnTouchListenerC0832Pe(C0833Pf c0833Pf) {
        this.A00 = c0833Pf;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC0684Jg interfaceC0684Jg;
        AnonymousClass18 anonymousClass18;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C0833Pf.A00(this.A00);
            interfaceC0684Jg = this.A00.A06;
            anonymousClass18 = this.A00.A03;
            interfaceC0684Jg.A98(anonymousClass18.A0T(), new OA().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
