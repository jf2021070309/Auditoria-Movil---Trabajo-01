package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class GK implements InterfaceC1357e7 {
    public final List<InterfaceC1356e6> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1357e7
    public final InterfaceC1356e6 A5X(int i2) {
        return this.A00.get(i2);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1356e6> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1357e7
    public final int size() {
        return this.A00.size();
    }
}
