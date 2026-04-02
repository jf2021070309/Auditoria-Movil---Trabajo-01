package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
/* loaded from: assets/audience_network.dex */
public class XY implements InterfaceC0724Kx {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0724Kx
    public final void ADx(Throwable th, Object obj) {
        if (obj instanceof C8S) {
            C1046Xo A5a = ((C8S) obj).A5a();
            if (A5a != null) {
                A5a.A0H(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C1046Xo)) {
                return;
            }
            ((C1046Xo) context).A0H(th);
        }
    }
}
