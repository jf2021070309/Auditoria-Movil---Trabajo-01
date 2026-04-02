package com.amazon.aps.iva.f0;

import java.util.List;
import java.util.Map;
/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.x0.o, o0, Map<String, ? extends List<? extends Object>>> {
    public static final p0 h = new p0();

    public p0() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Map<String, ? extends List<? extends Object>> invoke(com.amazon.aps.iva.x0.o oVar, o0 o0Var) {
        o0 o0Var2 = o0Var;
        com.amazon.aps.iva.yb0.j.f(oVar, "$this$Saver");
        com.amazon.aps.iva.yb0.j.f(o0Var2, "it");
        Map<String, List<Object>> d = o0Var2.d();
        if (d.isEmpty()) {
            return null;
        }
        return d;
    }
}
