package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.e0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1350e0 {
    public final Map<String, C1363eD> A00;
    public final Set<C1363eD> A01;

    public C1350e0() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1363eD> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1363eD> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1363eD c1363eD : this.A01) {
            this.A00.put(c1363eD.A03, c1363eD);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1363eD c1363eD) {
        if (this.A01.add(c1363eD)) {
            this.A00.remove(c1363eD.A03);
            return true;
        }
        return false;
    }
}
