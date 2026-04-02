package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.av  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1167av extends AbstractC03826i {
    public final List<C03926s> A00;

    public C1167av(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final void A02(C03926s c03926s) {
        if (!c03926s.A03().contains(EnumC03996z.A0B)) {
            this.A00.add(c03926s);
        }
    }

    public final void A03(EnumC03966w enumC03966w) {
        A01(enumC03966w, this.A00);
    }
}
