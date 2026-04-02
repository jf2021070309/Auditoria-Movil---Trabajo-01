package com.amazon.aps.iva.a0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.amazon.aps.iva.f1.k0;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.u1.j {
    public h q;
    public float r;
    public com.amazon.aps.iva.f1.s s;
    public com.amazon.aps.iva.f1.u0 t;
    public final com.amazon.aps.iva.c1.b u;

    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c1.e, com.amazon.aps.iva.c1.i> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.c1.i invoke(com.amazon.aps.iva.c1.e eVar) {
            boolean z;
            float ceil;
            com.amazon.aps.iva.h1.f iVar;
            com.amazon.aps.iva.f1.s sVar;
            Object porterDuffColorFilter;
            com.amazon.aps.iva.c1.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$CacheDrawModifierNode");
            o oVar = o.this;
            boolean z2 = true;
            if (eVar2.getDensity() * oVar.r >= 0.0f && com.amazon.aps.iva.e1.g.c(eVar2.h()) > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return eVar2.b(i.h);
            }
            if (com.amazon.aps.iva.o2.e.a(oVar.r, 0.0f)) {
                ceil = 1.0f;
            } else {
                ceil = (float) Math.ceil(eVar2.getDensity() * oVar.r);
            }
            float f = 2;
            float min = Math.min(ceil, (float) Math.ceil(com.amazon.aps.iva.e1.g.c(eVar2.h()) / f));
            float f2 = min / f;
            long d = com.amazon.aps.iva.e1.d.d(f2, f2);
            long d2 = com.amazon.aps.iva.ab.r.d(com.amazon.aps.iva.e1.g.d(eVar2.h()) - min, com.amazon.aps.iva.e1.g.b(eVar2.h()) - min);
            if (f * min <= com.amazon.aps.iva.e1.g.c(eVar2.h())) {
                z2 = false;
            }
            com.amazon.aps.iva.f1.k0 a = oVar.t.a(eVar2.h(), eVar2.b.getLayoutDirection(), eVar2);
            if (a instanceof k0.a) {
                com.amazon.aps.iva.f1.s sVar2 = oVar.s;
                k0.a aVar = (k0.a) a;
                if (z2) {
                    return eVar2.b(new l(aVar, sVar2));
                }
                if (sVar2 instanceof com.amazon.aps.iva.f1.x0) {
                    long j = ((com.amazon.aps.iva.f1.x0) sVar2).a;
                    if (Build.VERSION.SDK_INT >= 29) {
                        porterDuffColorFilter = com.amazon.aps.iva.f1.q.a.a(j, 5);
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(defpackage.i.G(j), com.amazon.aps.iva.f1.f.b(5));
                    }
                    com.amazon.aps.iva.yb0.j.f(porterDuffColorFilter, "nativeColorFilter");
                }
                aVar.getClass();
                throw null;
            } else if (a instanceof k0.c) {
                com.amazon.aps.iva.f1.s sVar3 = oVar.s;
                k0.c cVar = (k0.c) a;
                boolean z3 = com.amazon.aps.iva.dg.b.z(cVar.a);
                com.amazon.aps.iva.e1.f fVar = cVar.a;
                if (z3) {
                    return eVar2.b(new m(z2, sVar3, fVar.e, f2, min, d, d2, new com.amazon.aps.iva.h1.i(min, 0.0f, 0, 0, 30)));
                }
                if (oVar.q == null) {
                    oVar.q = new h(0);
                }
                h hVar = oVar.q;
                com.amazon.aps.iva.yb0.j.c(hVar);
                com.amazon.aps.iva.f1.m0 m0Var = hVar.d;
                if (m0Var == null) {
                    m0Var = com.amazon.aps.iva.cq.b.j();
                    hVar.d = m0Var;
                }
                m0Var.reset();
                m0Var.h(fVar);
                if (!z2) {
                    com.amazon.aps.iva.f1.m j2 = com.amazon.aps.iva.cq.b.j();
                    float f3 = (fVar.c - fVar.a) - min;
                    float f4 = (fVar.d - fVar.b) - min;
                    long k = k.k(fVar.e, min);
                    long k2 = k.k(fVar.f, min);
                    long k3 = k.k(fVar.h, min);
                    long k4 = k.k(fVar.g, min);
                    sVar = sVar3;
                    j2.h(new com.amazon.aps.iva.e1.f(min, min, f3, f4, k, k2, k4, k3));
                    m0Var.k(m0Var, j2, 0);
                } else {
                    sVar = sVar3;
                }
                return eVar2.b(new n(m0Var, sVar));
            } else if (a instanceof k0.b) {
                com.amazon.aps.iva.f1.s sVar4 = oVar.s;
                if (z2) {
                    d = com.amazon.aps.iva.e1.c.b;
                }
                if (z2) {
                    d2 = eVar2.h();
                }
                if (z2) {
                    iVar = com.amazon.aps.iva.h1.h.a;
                } else {
                    iVar = new com.amazon.aps.iva.h1.i(min, 0.0f, 0, 0, 30);
                }
                return eVar2.b(new j(sVar4, d, d2, iVar));
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        }
    }

    public o(float f, com.amazon.aps.iva.f1.s sVar, com.amazon.aps.iva.f1.u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(sVar, "brushParameter");
        com.amazon.aps.iva.yb0.j.f(u0Var, "shapeParameter");
        this.r = f;
        this.s = sVar;
        this.t = u0Var;
        com.amazon.aps.iva.c1.d dVar = new com.amazon.aps.iva.c1.d(new com.amazon.aps.iva.c1.e(), new a());
        t1(dVar);
        this.u = dVar;
    }
}
