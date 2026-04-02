package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.n0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
/* compiled from: ErrorUtils.kt */
/* loaded from: classes4.dex */
public final class k {
    public static final k a = new k();
    public static final d b = d.b;
    public static final a c;
    public static final h d;
    public static final h e;
    public static final Set<n0> f;

    static {
        String format = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        com.amazon.aps.iva.yb0.j.e(format, "format(this, *args)");
        c = new a(com.amazon.aps.iva.nd0.f.j(format));
        d = c(j.CYCLIC_SUPERTYPES, new String[0]);
        e = c(j.ERROR_PROPERTY_TYPE, new String[0]);
        f = l1.H(new e());
    }

    public static final f a(g gVar, boolean z, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(gVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        if (z) {
            return new l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return new f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f b(g gVar, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(gVar, "kind");
        return a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final h c(j jVar, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(jVar, "kind");
        z zVar = z.b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        com.amazon.aps.iva.yb0.j.f(strArr2, "formatParams");
        return e(jVar, zVar, d(jVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static i d(j jVar, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(jVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        return new i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static h e(j jVar, List list, c1 c1Var, String... strArr) {
        com.amazon.aps.iva.yb0.j.f(jVar, "kind");
        com.amazon.aps.iva.yb0.j.f(strArr, "formatParams");
        return new h(c1Var, b(g.ERROR_TYPE_SCOPE, c1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null && ((kVar instanceof a) || (kVar.d() instanceof a) || kVar == b)) {
            return true;
        }
        return false;
    }
}
