package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.oc0.s0;
/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.b, Boolean> {
    public final /* synthetic */ s0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s0 s0Var) {
        super(1);
        this.h = s0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "it");
        return Boolean.valueOf(j0.j.containsKey(com.amazon.aps.iva.gd0.x.b(this.h)));
    }
}
