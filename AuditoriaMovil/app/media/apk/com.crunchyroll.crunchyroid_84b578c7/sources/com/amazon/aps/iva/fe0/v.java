package com.amazon.aps.iva.fe0;

import com.amazon.aps.iva.ee0.c1;
/* compiled from: utils.kt */
/* loaded from: classes4.dex */
public final class v {
    public static final String a(c1 c1Var) {
        StringBuilder sb = new StringBuilder();
        b("type: " + c1Var, sb);
        b("hashCode: " + c1Var.hashCode(), sb);
        b("javaClass: " + c1Var.getClass().getCanonicalName(), sb);
        for (com.amazon.aps.iva.oc0.k k = c1Var.k(); k != null; k = k.d()) {
            b("fqName: ".concat(com.amazon.aps.iva.pd0.c.a.F(k)), sb);
            b("javaClass: " + k.getClass().getCanonicalName(), sb);
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final void b(String str, StringBuilder sb) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }
}
