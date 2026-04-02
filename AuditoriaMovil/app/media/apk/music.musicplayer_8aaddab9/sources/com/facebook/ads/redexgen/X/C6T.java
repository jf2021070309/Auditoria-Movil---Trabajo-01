package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.6T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6T {
    public final List<InterfaceC03776d> A00 = new ArrayList();

    public final void A00() {
        for (InterfaceC03776d biometricSignalLifecycleHandler : this.A00) {
            biometricSignalLifecycleHandler.AD3();
        }
    }

    public final void A01(InterfaceC03776d interfaceC03776d) {
        this.A00.add(interfaceC03776d);
    }
}
