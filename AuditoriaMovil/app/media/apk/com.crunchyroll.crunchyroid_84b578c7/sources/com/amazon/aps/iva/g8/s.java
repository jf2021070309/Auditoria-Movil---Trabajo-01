package com.amazon.aps.iva.g8;

import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.g8.j0;
import com.amazon.aps.iva.g8.o0;
import java.util.Iterator;
/* compiled from: NavController.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ g0 h;
    public final /* synthetic */ i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g0 g0Var, i iVar) {
        super(1);
        this.h = g0Var;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(p0 p0Var) {
        boolean z;
        j0 j0Var;
        p0 p0Var2 = p0Var;
        com.amazon.aps.iva.yb0.j.f(p0Var2, "$this$navOptions");
        q qVar = q.h;
        com.amazon.aps.iva.yb0.j.f(qVar, "animBuilder");
        b bVar = new b();
        qVar.invoke(bVar);
        int i = bVar.a;
        o0.a aVar = p0Var2.a;
        aVar.a = i;
        aVar.b = bVar.b;
        aVar.c = bVar.c;
        aVar.d = bVar.d;
        g0 g0Var = this.h;
        boolean z2 = g0Var instanceof j0;
        i iVar = this.i;
        boolean z3 = false;
        if (z2) {
            int i2 = g0.j;
            Iterator it = g0.a.c(g0Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    g0 g0Var2 = (g0) it.next();
                    g0 g = iVar.g();
                    if (g != null) {
                        j0Var = g.c;
                    } else {
                        j0Var = null;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(g0Var2, j0Var)) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                z3 = true;
            }
        }
        if (z3) {
            int i3 = j0.o;
            int i4 = j0.a.a(iVar.i()).h;
            r rVar = r.h;
            com.amazon.aps.iva.yb0.j.f(rVar, "popUpToBuilder");
            p0Var2.d = i4;
            v0 v0Var = new v0();
            rVar.invoke(v0Var);
            p0Var2.e = v0Var.a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
