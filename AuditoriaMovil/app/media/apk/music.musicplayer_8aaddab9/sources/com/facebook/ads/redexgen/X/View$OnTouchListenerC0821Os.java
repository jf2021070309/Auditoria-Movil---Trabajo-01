package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Os  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0821Os implements View.OnTouchListener {
    public final /* synthetic */ C04579s A00;

    public View$OnTouchListenerC0821Os(C04579s c04579s) {
        this.A00 = c04579s;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0825Ow c0825Ow;
        c0825Ow = this.A00.A0E;
        c0825Ow.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
