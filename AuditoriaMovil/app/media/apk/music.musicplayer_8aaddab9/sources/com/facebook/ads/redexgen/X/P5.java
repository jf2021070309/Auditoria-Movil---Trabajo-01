package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: assets/audience_network.dex */
public final class P5 {
    public static final Map<String, WeakReference<P4>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static P4 A01(C1046Xo c1046Xo, AnonymousClass18 anonymousClass18, int i2, P2 p2) {
        P4 p4 = new P4(c1046Xo, anonymousClass18, c1046Xo.A00().A08(), i2);
        p4.A0b(p2);
        p4.A0X();
        A00.put(anonymousClass18.A0Y(), new WeakReference<>(p4));
        return p4;
    }

    @Nullable
    public static P4 A02(String str) {
        WeakReference<P4> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AnonymousClass18 anonymousClass18, P4 p4) {
        A00.put(anonymousClass18.A0Y(), new WeakReference<>(p4));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
