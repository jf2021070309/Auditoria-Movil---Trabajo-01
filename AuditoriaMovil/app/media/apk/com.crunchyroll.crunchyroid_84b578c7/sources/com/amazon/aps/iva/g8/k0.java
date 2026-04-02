package com.amazon.aps.iva.g8;

import com.amazon.aps.iva.g8.t0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NavGraphBuilder.kt */
/* loaded from: classes.dex */
public final class k0 extends i0<j0> {
    public final t0 g;
    public final String h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(t0 t0Var, String str, String str2) {
        super(t0Var.b(t0.a.a(l0.class)), str2);
        com.amazon.aps.iva.yb0.j.f(t0Var, "provider");
        com.amazon.aps.iva.yb0.j.f(str, "startDestination");
        this.i = new ArrayList();
        this.g = t0Var;
        this.h = str;
    }

    public final j0 b() {
        boolean z;
        String str;
        boolean z2;
        j0 j0Var = (j0) super.a();
        ArrayList arrayList = this.i;
        com.amazon.aps.iva.yb0.j.f(arrayList, "nodes");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var != null) {
                int i = g0Var.h;
                String str2 = g0Var.i;
                boolean z3 = true;
                if (i == 0 && str2 == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (j0Var.i != null && !(!com.amazon.aps.iva.yb0.j.a(str2, str))) {
                        throw new IllegalArgumentException(("Destination " + g0Var + " cannot have the same route as graph " + j0Var).toString());
                    }
                    if (i != j0Var.h) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        com.amazon.aps.iva.x.i<g0> iVar = j0Var.k;
                        g0 g0Var2 = (g0) iVar.d(i, null);
                        if (g0Var2 != g0Var) {
                            if (g0Var.c != null) {
                                z3 = false;
                            }
                            if (z3) {
                                if (g0Var2 != null) {
                                    g0Var2.c = null;
                                }
                                g0Var.c = j0Var;
                                iVar.f(g0Var.h, g0Var);
                            } else {
                                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalArgumentException(("Destination " + g0Var + " cannot have the same id as graph " + j0Var).toString());
                    }
                } else {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
                }
            }
        }
        String str3 = this.h;
        if (str3 == null) {
            if (this.c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        j0Var.q(str3);
        return j0Var;
    }

    public final void c(k0 k0Var) {
        this.i.add(k0Var.b());
    }
}
