package com.amazon.aps.iva.xa0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.xa0.a;
import com.amazon.aps.iva.yb0.j;
/* compiled from: InsetterDsl.kt */
/* loaded from: classes4.dex */
public final class e {
    public final int a;
    public a.C0849a b;

    public e(int i, a.C0849a c0849a) {
        j.f(c0849a, "builder");
        this.a = i;
        this.b = c0849a;
    }

    public static void a(e eVar, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        if ((i & 2) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        a.C0849a c0849a = eVar.b;
        c0849a.b.b(eVar.a, k.E(false, z3, false, z4, false, false));
        eVar.b = c0849a;
    }

    public static void b(e eVar) {
        eVar.getClass();
        c(eVar, false, false, true, true, false, 15);
    }

    public static void c(e eVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if ((i & 2) != 0) {
            z6 = false;
        } else {
            z6 = z;
        }
        if ((i & 8) != 0) {
            z7 = false;
        } else {
            z7 = z2;
        }
        if ((i & 16) != 0) {
            z8 = false;
        } else {
            z8 = z3;
        }
        if ((i & 32) != 0) {
            z9 = false;
        } else {
            z9 = z4;
        }
        if ((i & 64) == 0) {
            z10 = z5;
        }
        a.C0849a c0849a = eVar.b;
        int E = k.E(false, z6, false, z7, z8, z9);
        g gVar = c0849a.a;
        int i2 = eVar.a;
        gVar.b(i2, E);
        if (z10) {
            c0849a.c |= i2;
        }
        eVar.b = c0849a;
    }
}
