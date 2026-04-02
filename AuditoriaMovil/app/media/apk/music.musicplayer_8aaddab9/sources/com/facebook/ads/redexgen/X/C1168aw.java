package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.aw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168aw extends AbstractC03826i {
    public final List<C03926s> A00;

    public C1168aw(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = new ArrayList();
    }

    public final List<C03926s> A02() {
        return Collections.unmodifiableList(this.A00);
    }

    public final void A03(C03926s c03926s) {
        if (c03926s.A03().contains(EnumC03996z.A0B)) {
            this.A00.add(c03926s);
        }
    }

    public final void A04(EnumC03966w enumC03966w) {
        A01(enumC03966w, this.A00);
    }
}
