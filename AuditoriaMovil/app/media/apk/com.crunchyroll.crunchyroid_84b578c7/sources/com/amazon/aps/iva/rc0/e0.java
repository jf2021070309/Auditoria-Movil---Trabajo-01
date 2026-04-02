package com.amazon.aps.iva.rc0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes4.dex */
public final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o> {
    public final /* synthetic */ g0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var) {
        super(0);
        this.h = g0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final o invoke() {
        g0 g0Var = this.h;
        c0 c0Var = g0Var.h;
        if (c0Var != null) {
            List<g0> a = c0Var.a();
            g0Var.A0();
            a.contains(g0Var);
            List<g0> list = a;
            for (g0 g0Var2 : list) {
                g0Var2.getClass();
            }
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (g0 g0Var3 : list) {
                com.amazon.aps.iva.oc0.g0 g0Var4 = g0Var3.i;
                com.amazon.aps.iva.yb0.j.c(g0Var4);
                arrayList.add(g0Var4);
            }
            return new o(arrayList, "CompositeProvider@ModuleDescriptor for " + g0Var.getName());
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = g0Var.getName().b;
        com.amazon.aps.iva.yb0.j.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set before querying module content");
        throw new AssertionError(sb.toString());
    }
}
