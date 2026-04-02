package com.amazon.aps.iva.g8;

import android.os.Bundle;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.g8.r0;
import java.util.List;
import kotlin.Metadata;
/* compiled from: NavGraphNavigator.kt */
@r0.b("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/amazon/aps/iva/g8/l0;", "Lcom/amazon/aps/iva/g8/r0;", "Lcom/amazon/aps/iva/g8/j0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class l0 extends r0<j0> {
    public final t0 c;

    public l0(t0 t0Var) {
        com.amazon.aps.iva.yb0.j.f(t0Var, "navigatorProvider");
        this.c = t0Var;
    }

    @Override // com.amazon.aps.iva.g8.r0
    public final void d(List<f> list, o0 o0Var, r0.a aVar) {
        boolean z;
        String str;
        g0 n;
        for (f fVar : list) {
            g0 g0Var = fVar.c;
            com.amazon.aps.iva.yb0.j.d(g0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            j0 j0Var = (j0) g0Var;
            Bundle g = fVar.g();
            int i = j0Var.l;
            String str2 = j0Var.n;
            if (i == 0 && str2 == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = j0Var.h;
                if (i2 != 0) {
                    str = String.valueOf(i2);
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (str2 != null) {
                n = j0Var.o(str2, false);
            } else {
                n = j0Var.n(i, false);
            }
            if (n == null) {
                if (j0Var.m == null) {
                    String str3 = j0Var.n;
                    if (str3 == null) {
                        str3 = String.valueOf(j0Var.l);
                    }
                    j0Var.m = str3;
                }
                String str4 = j0Var.m;
                com.amazon.aps.iva.yb0.j.c(str4);
                throw new IllegalArgumentException(defpackage.e.e("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            this.c.b(n.b).d(f1.J(b().a(n, n.d(g))), o0Var, aVar);
        }
    }

    @Override // com.amazon.aps.iva.g8.r0
    /* renamed from: g */
    public j0 a() {
        return new j0(this);
    }
}
