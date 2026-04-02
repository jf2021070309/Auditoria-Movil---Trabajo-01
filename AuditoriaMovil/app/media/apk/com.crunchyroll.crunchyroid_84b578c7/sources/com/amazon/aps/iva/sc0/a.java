package com.amazon.aps.iva.sc0;

import com.amazon.aps.iva.oc0.f1;
import com.amazon.aps.iva.oc0.g1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: JavaVisibilities.kt */
/* loaded from: classes4.dex */
public final class a extends g1 {
    public static final a c = new a();

    public a() {
        super("package", false);
    }

    @Override // com.amazon.aps.iva.oc0.g1
    public final Integer a(g1 g1Var) {
        j.f(g1Var, "visibility");
        boolean z = false;
        if (this == g1Var) {
            return 0;
        }
        com.amazon.aps.iva.mb0.b bVar = f1.a;
        if (g1Var == f1.e.c || g1Var == f1.f.c) {
            z = true;
        }
        if (z) {
            return 1;
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.oc0.g1
    public final String b() {
        return "public/*package*/";
    }

    @Override // com.amazon.aps.iva.oc0.g1
    public final g1 c() {
        return f1.g.c;
    }
}
