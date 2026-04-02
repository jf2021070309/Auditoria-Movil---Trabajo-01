package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.facebook.ads.redexgen.X.8T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8T {
    public static final AtomicReference<C1045Xn> A00 = new AtomicReference<>();

    @Nullable
    public static C1045Xn A00() {
        return A00.get();
    }

    public static void A01(C1045Xn c1045Xn) {
        if (c1045Xn == null) {
            return;
        }
        A00.compareAndSet(null, c1045Xn);
    }
}
