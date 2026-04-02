package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.facebook.ads.redexgen.X.ax  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1169ax extends AbstractC03826i implements InterfaceC03776d {
    public C6S A00;
    public final C6C A01;
    public final Map<Integer, C03926s> A02;

    @SuppressLint({"UseSparseArrays"})
    public C1169ax(Context context, C6C c6c) {
        super(context, c6c);
        this.A02 = new HashMap();
        this.A01 = c6c;
    }

    public final void A02(C03926s c03926s) {
        this.A02.put(Integer.valueOf(c03926s.A00()), c03926s);
    }

    public final void A03(EnumC03966w enumC03966w, Context context) {
        this.A00 = C6S.A00(context, this.A01);
        this.A00.A04(this.A02, enumC03966w);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03776d
    public final void AD3() {
        C6S c6s = this.A00;
        if (c6s != null) {
            c6s.A03();
        }
    }
}
