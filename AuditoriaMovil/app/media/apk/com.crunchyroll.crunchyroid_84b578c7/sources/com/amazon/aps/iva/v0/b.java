package com.amazon.aps.iva.v0;

import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.i2;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ComposableLambda.kt */
/* loaded from: classes.dex */
public final class b {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final a b(i iVar, int i, l lVar) {
        a aVar;
        j.f(iVar, "composer");
        iVar.s(i);
        Object t = iVar.t();
        if (t == i.a.a) {
            aVar = new a(i, true);
            iVar.n(aVar);
        } else {
            j.d(t, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            aVar = (a) t;
        }
        aVar.f(lVar);
        iVar.G();
        return aVar;
    }

    public static final a c(int i, l lVar, boolean z) {
        j.f(lVar, "block");
        a aVar = new a(i, z);
        aVar.f(lVar);
        return aVar;
    }

    public static final boolean d(i2 i2Var, i2 i2Var2) {
        boolean z;
        boolean z2;
        if (i2Var == null) {
            return true;
        }
        if ((i2Var instanceof j2) && (i2Var2 instanceof j2)) {
            j2 j2Var = (j2) i2Var;
            if (j2Var.b != null) {
                com.amazon.aps.iva.o0.c cVar = j2Var.c;
                if (cVar != null && cVar.a != Integer.MIN_VALUE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    if (z || j.a(i2Var, i2Var2) || j.a(j2Var.c, ((j2) i2Var2).c)) {
                        return true;
                    }
                }
            }
            z = false;
            return z ? true : true;
        }
        return false;
    }
}
