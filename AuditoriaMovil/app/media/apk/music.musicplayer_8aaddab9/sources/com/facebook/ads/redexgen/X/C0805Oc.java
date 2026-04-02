package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Oc */
/* loaded from: assets/audience_network.dex */
public class C0805Oc {
    @Nullable
    public View A02;
    @Nullable
    public U1 A03;
    @Nullable
    public AbstractC0760Mj A04;
    @Nullable
    public C0665In A05;
    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C1046Xo A08;
    public final InterfaceC0684Jg A09;
    public final MD A0A;
    public final InterfaceC0761Mk A0B;
    public final C0869Qp A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C0805Oc(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, AnonymousClass18 anonymousClass18, @Nullable View view, C0869Qp c0869Qp, MD md) {
        this.A08 = c1046Xo;
        this.A09 = interfaceC0684Jg;
        this.A0B = interfaceC0761Mk;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c0869Qp;
        this.A0A = md;
    }

    public final C0805Oc A0D(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C0805Oc A0E(int i2) {
        this.A01 = i2;
        return this;
    }

    public final C0805Oc A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C0805Oc A0G(U1 u1) {
        this.A03 = u1;
        return this;
    }

    public final C0805Oc A0H(AbstractC0760Mj abstractC0760Mj) {
        this.A04 = abstractC0760Mj;
        return this;
    }

    public final C0805Oc A0I(C0665In c0665In) {
        this.A05 = c0665In;
        return this;
    }

    public final C0806Od A0J() {
        return new C0806Od(this);
    }
}
