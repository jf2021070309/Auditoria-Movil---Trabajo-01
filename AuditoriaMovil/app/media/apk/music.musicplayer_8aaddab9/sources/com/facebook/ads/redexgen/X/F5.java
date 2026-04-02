package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.applovin.mediation.MaxErrorCode;
/* loaded from: assets/audience_network.dex */
public final class F5 {
    public final InterfaceC0629Hb A00;
    public final InterfaceC0631Hd A01;
    public final InterfaceC0631Hd A02;
    public final I3 A03;
    public final C0664Im A04;

    public F5(I3 i3, InterfaceC0631Hd interfaceC0631Hd) {
        this(i3, interfaceC0631Hd, null, null, null);
    }

    public F5(I3 i3, InterfaceC0631Hd interfaceC0631Hd, @Nullable InterfaceC0631Hd interfaceC0631Hd2, @Nullable InterfaceC0629Hb interfaceC0629Hb, @Nullable C0664Im c0664Im) {
        IJ.A01(interfaceC0631Hd);
        this.A03 = i3;
        this.A02 = interfaceC0631Hd;
        this.A01 = interfaceC0631Hd2;
        this.A00 = interfaceC0629Hb;
        this.A04 = c0664Im;
    }

    public final I3 A00() {
        return this.A03;
    }

    public final C0963Ug A01(boolean z) {
        InterfaceC0632He cacheReadDataSource;
        InterfaceC0630Hc c0964Uh;
        InterfaceC0631Hd interfaceC0631Hd = this.A01;
        if (interfaceC0631Hd != null) {
            cacheReadDataSource = interfaceC0631Hd.A4D();
        } else {
            cacheReadDataSource = new C0976Ut();
        }
        if (z) {
            return new C0963Ug(this.A03, C0977Uu.A02, cacheReadDataSource, null, 1, null);
        }
        InterfaceC0629Hb interfaceC0629Hb = this.A00;
        if (interfaceC0629Hb != null) {
            c0964Uh = interfaceC0629Hb.createDataSink();
        } else {
            c0964Uh = new C0964Uh(this.A03, 2097152L);
        }
        InterfaceC0632He A4D = this.A02.A4D();
        C0664Im c0664Im = this.A04;
        if (c0664Im != null) {
            A4D = new C0968Ul(A4D, c0664Im, MaxErrorCode.NETWORK_ERROR);
        }
        return new C0963Ug(this.A03, A4D, cacheReadDataSource, c0964Uh, 1, null);
    }

    public final C0664Im A02() {
        C0664Im c0664Im = this.A04;
        return c0664Im != null ? c0664Im : new C0664Im();
    }
}
