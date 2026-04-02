package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.p3;
import java.util.Map;
/* compiled from: AnimateAsState.kt */
/* loaded from: classes.dex */
public final class e {
    public static final u0<Float> a = k.c(0.0f, null, 7);

    static {
        Map<l1<?, ?>, Float> map = a2.a;
        k.c(0.0f, new com.amazon.aps.iva.o2.e(0.1f), 3);
        int i = com.amazon.aps.iva.e1.g.d;
        com.amazon.aps.iva.ab.r.d(0.5f, 0.5f);
        int i2 = com.amazon.aps.iva.e1.c.e;
        com.amazon.aps.iva.e1.d.d(0.5f, 0.5f);
        int i3 = com.amazon.aps.iva.o2.h.c;
        com.amazon.aps.iva.e.w.e(1, 1);
    }

    public static final p3 a(float f, k1 k1Var, com.amazon.aps.iva.o0.i iVar) {
        iVar.s(-1407150062);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        p3 b = b(new com.amazon.aps.iva.o2.e(f), n1.c, k1Var, null, "DpAnimation", null, iVar, 384, 8);
        iVar.G();
        return b;
    }

    public static final p3 b(Object obj, l1 l1Var, j jVar, Float f, String str, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        j jVar2;
        Float f2;
        String str2;
        com.amazon.aps.iva.xb0.l lVar2;
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        iVar.s(-1994373980);
        int i3 = i2 & 4;
        i.a.C0550a c0550a = i.a.a;
        if (i3 != 0) {
            iVar.s(-492369756);
            Object t = iVar.t();
            if (t == c0550a) {
                t = k.c(0.0f, null, 7);
                iVar.n(t);
            }
            iVar.G();
            jVar2 = (j) t;
        } else {
            jVar2 = jVar;
        }
        if ((i2 & 8) != 0) {
            f2 = null;
        } else {
            f2 = f;
        }
        if ((i2 & 16) != 0) {
            str2 = "ValueAnimation";
        } else {
            str2 = str;
        }
        if ((i2 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.s(-492369756);
        Object t2 = iVar.t();
        if (t2 == c0550a) {
            t2 = com.amazon.aps.iva.cq.b.c0(null);
            iVar.n(t2);
        }
        iVar.G();
        com.amazon.aps.iva.o0.q1 q1Var = (com.amazon.aps.iva.o0.q1) t2;
        iVar.s(-492369756);
        Object t3 = iVar.t();
        if (t3 == c0550a) {
            t3 = new b((Float) obj, (l1<Float, V>) l1Var, f2, str2);
            iVar.n(t3);
        }
        iVar.G();
        b bVar2 = (b) t3;
        com.amazon.aps.iva.o0.q1 h0 = com.amazon.aps.iva.cq.b.h0(lVar2, iVar);
        if (f2 != null && (jVar2 instanceof u0)) {
            u0 u0Var = (u0) jVar2;
            if (!com.amazon.aps.iva.yb0.j.a(u0Var.c, f2)) {
                jVar2 = new u0(u0Var.a, u0Var.b, f2);
            }
        }
        com.amazon.aps.iva.o0.q1 h02 = com.amazon.aps.iva.cq.b.h0(jVar2, iVar);
        iVar.s(-492369756);
        Object t4 = iVar.t();
        if (t4 == c0550a) {
            t4 = com.amazon.aps.iva.dg.b.c(-1, null, 6);
            iVar.n(t4);
        }
        iVar.G();
        com.amazon.aps.iva.ue0.f fVar = (com.amazon.aps.iva.ue0.f) t4;
        com.amazon.aps.iva.o0.x0.f(new c(fVar, obj), iVar);
        com.amazon.aps.iva.o0.x0.c(fVar, new d(fVar, bVar2, h02, h0, null), iVar);
        p3 p3Var = (p3) q1Var.getValue();
        if (p3Var == null) {
            p3Var = bVar2.c;
        }
        iVar.G();
        return p3Var;
    }
}
