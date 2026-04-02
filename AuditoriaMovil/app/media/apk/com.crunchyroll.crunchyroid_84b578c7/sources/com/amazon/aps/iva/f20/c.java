package com.amazon.aps.iva.f20;

import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CrPlusSubscriptionModule.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public static final c h = new c();

    public c() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        int i = i.a;
        i iVar = i.a.a;
        if (iVar != null) {
            return iVar.u().invoke();
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
