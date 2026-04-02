package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public abstract class NH extends FrameLayout {
    public int A00;
    public C2F A01;
    public C2G A02;
    @Nullable
    public C2H A03;
    public final C2D A04;
    public final C1046Xo A05;
    public final InterfaceC0684Jg A06;
    @Nullable
    public final InterfaceC0761Mk A07;
    @Nullable
    public final InterfaceC0762Ml A08;
    public final String A09;
    @Nullable
    public final C1U A0A;
    public final NJ A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2H c2h, C2F c2f);

    public abstract void A0O(C2H c2h, C2F c2f);

    public abstract boolean A0P();

    public NH(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str) {
        this(c1046Xo, interfaceC0684Jg, str, null, null, null);
    }

    public NH(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, String str, @Nullable C1U c1u, @Nullable InterfaceC0762Ml interfaceC0762Ml, @Nullable InterfaceC0761Mk interfaceC0761Mk) {
        super(c1046Xo);
        this.A00 = 0;
        this.A01 = C2F.A04;
        this.A03 = null;
        this.A0B = new T9(this);
        this.A05 = c1046Xo;
        this.A06 = interfaceC0684Jg;
        this.A08 = interfaceC0762Ml;
        this.A07 = interfaceC0761Mk;
        this.A09 = str;
        this.A0A = c1u;
        this.A04 = C2E.A00(this.A05.A00());
    }

    public static /* synthetic */ int A00(NH nh) {
        int i2 = nh.A00;
        nh.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A01(NH nh) {
        int i2 = nh.A00;
        nh.A00 = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A8q(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2H c2h) {
        this.A02.A08(this.A01);
        A0N(c2h, this.A01);
        C02420u.A03();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2H c2h) {
        this.A03 = c2h;
        this.A02.A09(this.A01, this.A00);
        A0O(c2h, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2G(new C0692Jo(this.A09, this.A06));
        InterfaceC0762Ml interfaceC0762Ml = this.A08;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml.ABg(true);
        }
        A0C();
    }
}
