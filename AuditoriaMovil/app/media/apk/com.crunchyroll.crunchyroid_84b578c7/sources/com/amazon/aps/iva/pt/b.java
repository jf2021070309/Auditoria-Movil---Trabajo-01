package com.amazon.aps.iva.pt;

import com.amazon.aps.iva.vx.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BentoCardLayout.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final b h = new b();

    public b() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        k kVar = i.f;
        if (kVar != null) {
            return kVar.n().invoke();
        }
        j.m("dependencies");
        throw null;
    }
}
