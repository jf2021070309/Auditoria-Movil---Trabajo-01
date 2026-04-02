package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.Yb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1059Yb extends C03866m {
    public final Context A00;

    public C1059Yb(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<String, C1060Yc> hashMap) {
        return new C1055Xx(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    public final InterfaceC03956v A0G(List<C03946u> list, EnumC03916r enumC03916r) {
        return new C1061Yd(this, list, enumC03916r);
    }
}
