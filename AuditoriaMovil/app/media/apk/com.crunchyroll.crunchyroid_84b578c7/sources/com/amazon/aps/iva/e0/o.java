package com.amazon.aps.iva.e0;

import com.amazon.aps.iva.f0.r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
/* compiled from: LazyListItemPlacementAnimator.kt */
/* loaded from: classes.dex */
public final class o {
    public int c;
    public final LinkedHashSet a = new LinkedHashSet();
    public com.amazon.aps.iva.f0.r b = r.a.a;
    public final LinkedHashSet<Object> d = new LinkedHashSet<>();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void a(c0 c0Var, int i) {
        long e;
        com.amazon.aps.iva.f0.e eVar;
        long a = c0Var.a(0);
        if (c0Var.c) {
            int i2 = com.amazon.aps.iva.o2.h.c;
            e = com.amazon.aps.iva.e.w.e((int) (a >> 32), i);
        } else {
            e = com.amazon.aps.iva.e.w.e(i, com.amazon.aps.iva.o2.h.b(a));
        }
        int c = c0Var.c();
        for (int i3 = 0; i3 < c; i3++) {
            Object b = c0Var.b(i3);
            if (b instanceof com.amazon.aps.iva.f0.e) {
                eVar = (com.amazon.aps.iva.f0.e) b;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long a2 = c0Var.a(i3);
                long e2 = com.amazon.aps.iva.e.w.e(((int) (a2 >> 32)) - ((int) (a >> 32)), com.amazon.aps.iva.o2.h.b(a2) - com.amazon.aps.iva.o2.h.b(a));
                eVar.o = com.amazon.aps.iva.e.w.e(((int) (e >> 32)) + ((int) (e2 >> 32)), com.amazon.aps.iva.o2.h.b(e2) + com.amazon.aps.iva.o2.h.b(e));
            }
        }
    }

    public static void b(c0 c0Var) {
        com.amazon.aps.iva.f0.e eVar;
        int c = c0Var.c();
        for (int i = 0; i < c; i++) {
            Object b = c0Var.b(i);
            if (b instanceof com.amazon.aps.iva.f0.e) {
                eVar = (com.amazon.aps.iva.f0.e) b;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long a = c0Var.a(i);
                long j = eVar.o;
                if (!com.amazon.aps.iva.o2.h.a(j, com.amazon.aps.iva.f0.e.p) && !com.amazon.aps.iva.o2.h.a(j, a)) {
                    com.amazon.aps.iva.e.w.e(((int) (a >> 32)) - ((int) (j >> 32)), com.amazon.aps.iva.o2.h.b(a) - com.amazon.aps.iva.o2.h.b(j));
                    throw null;
                }
                eVar.o = a;
            }
        }
    }
}
