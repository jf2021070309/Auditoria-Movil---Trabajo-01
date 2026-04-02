package com.amazon.aps.iva.f0;

import java.util.List;
import java.util.Map;
/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Map<String, ? extends List<? extends Object>>, o0> {
    public final /* synthetic */ com.amazon.aps.iva.x0.i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.amazon.aps.iva.x0.i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final o0 invoke(Map<String, ? extends List<? extends Object>> map) {
        Map<String, ? extends List<? extends Object>> map2 = map;
        com.amazon.aps.iva.yb0.j.f(map2, "restored");
        return new o0(this.h, map2);
    }
}
