package com.amazon.aps.iva.sd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.lc0.o;
import java.util.List;
/* compiled from: constantValues.kt */
/* loaded from: classes4.dex */
public class b extends g<List<? extends g<?>>> {
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.oc0.c0, e0> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.oc0.c0, ? extends e0> lVar) {
        super(list);
        com.amazon.aps.iva.yb0.j.f(lVar, "computeType");
        this.b = lVar;
    }

    @Override // com.amazon.aps.iva.sd0.g
    public final e0 a(com.amazon.aps.iva.oc0.c0 c0Var) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "module");
        e0 invoke = this.b.invoke(c0Var);
        if (!com.amazon.aps.iva.lc0.k.z(invoke) && !com.amazon.aps.iva.lc0.k.G(invoke) && !com.amazon.aps.iva.lc0.k.C(invoke, o.a.V.i()) && !com.amazon.aps.iva.lc0.k.C(invoke, o.a.W.i()) && !com.amazon.aps.iva.lc0.k.C(invoke, o.a.X.i())) {
            com.amazon.aps.iva.lc0.k.C(invoke, o.a.Y.i());
        }
        return invoke;
    }
}
