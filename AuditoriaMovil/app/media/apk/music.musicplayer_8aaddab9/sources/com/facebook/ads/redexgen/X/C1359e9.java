package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.e9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1359e9 {
    public final Map<View, C1363eD> A00 = new WeakHashMap();

    public final C1363eD A00(View view) {
        C1363eD c1363eD = this.A00.get(view);
        if (c1363eD == null) {
            return C1363eD.A06;
        }
        return c1363eD;
    }

    public final void A01(View view) {
        this.A00.remove(view);
    }

    public final void A02(View view, C1363eD c1363eD) {
        this.A00.put(view, c1363eD);
    }

    public final void A03(Collection<View> collection) {
        for (View view : this.A00.keySet()) {
            collection.add(view);
        }
    }
}
