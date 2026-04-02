package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class SR extends FrameLayout implements InterfaceC0762Ml {
    public final InterfaceC0761Mk A00;
    public final P4 A01;

    public SR(C1046Xo c1046Xo, InterfaceC0761Mk interfaceC0761Mk, P4 p4) {
        super(c1046Xo);
        this.A01 = p4;
        this.A00 = interfaceC0761Mk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        P4.A0B().incrementAndGet();
        this.A01.A0V();
        ML.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3H(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAq();
        }
        P4.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC0761Mk interfaceC0761Mk) {
    }
}
