package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Jp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC0693Jp implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0691Jn A00;
    public final /* synthetic */ C0692Jo A01;

    public View$OnAttachStateChangeListenerC0693Jp(C0692Jo c0692Jo, EnumC0691Jn enumC0691Jn) {
        this.A01 = c0692Jo;
        this.A00 = enumC0691Jn;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A02(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
