package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
/* loaded from: assets/audience_network.dex */
public final class Z5 extends C03866m {
    public Z5(Context context, C6C c6c) {
        super(context, c6c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A02(HashMap<String, Z6> hashMap) {
        return new C1055Xx(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    public final InterfaceC03956v A0G() {
        return new Z7(this);
    }
}
