package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.m0.k;
import java.util.Map;
/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes.dex */
public final class g1 implements k.a<g2> {
    public final /* synthetic */ f2 a;
    public final /* synthetic */ com.amazon.aps.iva.se0.g0 b;

    /* compiled from: ModalBottomSheet.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public g1(f2 f2Var, com.amazon.aps.iva.se0.g0 g0Var) {
        this.a = f2Var;
        this.b = g0Var;
    }

    @Override // com.amazon.aps.iva.m0.k.a
    public final void a(Object obj, Map map, com.amazon.aps.iva.mb0.b bVar) {
        g2 g2Var;
        boolean z;
        g2 g2Var2 = (g2) obj;
        com.amazon.aps.iva.yb0.j.f(g2Var2, "prevTarget");
        com.amazon.aps.iva.yb0.j.f(map, "prevAnchors");
        Float f = (Float) map.get(g2Var2);
        int i = a.a[g2Var2.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            g2Var = g2.HalfExpanded;
            if (!bVar.containsKey(g2Var)) {
                g2Var = g2.Expanded;
                if (!bVar.containsKey(g2Var)) {
                    g2Var = g2.Hidden;
                }
            }
        } else {
            g2Var = g2.Hidden;
        }
        float floatValue = ((Number) com.amazon.aps.iva.lb0.i0.S(g2Var, bVar)).floatValue();
        if (f != null && floatValue == f.floatValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f2 f2Var = this.a;
            if (f2Var.c.n.getValue() == 0) {
                z2 = false;
            }
            com.amazon.aps.iva.se0.g0 g0Var = this.b;
            if (z2) {
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new h1(f2Var, g2Var, null), 3);
                return;
            }
            com.amazon.aps.iva.yb0.j.f(g2Var, "target");
            if (!f2Var.c.h(g2Var)) {
                com.amazon.aps.iva.se0.i.d(g0Var, null, null, new i1(f2Var, g2Var, null), 3);
            }
        }
    }
}
