package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.bs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1225bs implements InterfaceC03374o {
    public final /* synthetic */ C4T A00;

    public C1225bs(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final View A5y(int i2) {
        return this.A00.A0t(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A60(View view) {
        return this.A00.A0n(view) + ((C4U) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A61(View view) {
        return this.A00.A0k(view) - ((C4U) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A76() {
        return this.A00.A0h() - this.A00.A0f();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A77() {
        return this.A00.A0e();
    }
}
