package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.br  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1224br implements InterfaceC03374o {
    public final /* synthetic */ C4T A00;

    public C1224br(C4T c4t) {
        this.A00 = c4t;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final View A5y(int i2) {
        return this.A00.A0t(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A60(View view) {
        return this.A00.A0j(view) + ((C4U) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A61(View view) {
        return this.A00.A0o(view) - ((C4U) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A76() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03374o
    public final int A77() {
        return this.A00.A0g();
    }
}
