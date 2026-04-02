package com.amazon.aps.iva.pd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.v1;
/* compiled from: DescriptorRendererImpl.kt */
/* loaded from: classes4.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<j1, CharSequence> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(j1 j1Var) {
        j1 j1Var2 = j1Var;
        com.amazon.aps.iva.yb0.j.f(j1Var2, "it");
        if (j1Var2.b()) {
            return "*";
        }
        e0 type = j1Var2.getType();
        com.amazon.aps.iva.yb0.j.e(type, "it.type");
        String u = this.h.u(type);
        if (j1Var2.c() == v1.INVARIANT) {
            return u;
        }
        return j1Var2.c() + ' ' + u;
    }
}
