package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Ng  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0783Ng implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        int action = motionEvent.getAction();
        if (action == 0) {
            i2 = C0789Nm.A0D;
            ML.A0M(view, i2);
        } else if (action == 1) {
            ML.A0M(view, 0);
        }
        return false;
    }
}
