package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Pr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0845Pr implements View.OnTouchListener {
    public final /* synthetic */ Q8 A00;

    public View$OnTouchListenerC0845Pr(Q8 q8) {
        this.A00 = q8;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C04419b c04419b;
        c04419b = this.A00.A0A;
        c04419b.A02(new C0707Kd(view, motionEvent));
        return false;
    }
}
