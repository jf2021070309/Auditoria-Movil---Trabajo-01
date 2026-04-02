package com.amazon.aps.iva.ee0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: TypeAliasExpansion.kt */
/* loaded from: classes4.dex */
public final class w0 {
    public final w0 a;
    public final com.amazon.aps.iva.oc0.x0 b;
    public final List<j1> c;
    public final Map<com.amazon.aps.iva.oc0.y0, j1> d;

    /* compiled from: TypeAliasExpansion.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static w0 a(w0 w0Var, com.amazon.aps.iva.oc0.x0 x0Var, List list) {
            com.amazon.aps.iva.yb0.j.f(x0Var, "typeAliasDescriptor");
            com.amazon.aps.iva.yb0.j.f(list, "arguments");
            List<com.amazon.aps.iva.oc0.y0> parameters = x0Var.h().getParameters();
            com.amazon.aps.iva.yb0.j.e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            List<com.amazon.aps.iva.oc0.y0> list2 = parameters;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
            for (com.amazon.aps.iva.oc0.y0 y0Var : list2) {
                arrayList.add(y0Var.a());
            }
            return new w0(w0Var, x0Var, list, com.amazon.aps.iva.lb0.i0.Z(com.amazon.aps.iva.lb0.x.e1(arrayList, list)));
        }
    }

    public w0(w0 w0Var, com.amazon.aps.iva.oc0.x0 x0Var, List list, Map map) {
        this.a = w0Var;
        this.b = x0Var;
        this.c = list;
        this.d = map;
    }

    public final boolean a(com.amazon.aps.iva.oc0.x0 x0Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(x0Var, "descriptor");
        if (!com.amazon.aps.iva.yb0.j.a(this.b, x0Var)) {
            w0 w0Var = this.a;
            if (w0Var != null) {
                z = w0Var.a(x0Var);
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
