package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.h1.a;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.v2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.y0.d0;
import com.amazon.aps.iva.y0.e0;
import java.util.Iterator;
import java.util.Map;
/* compiled from: CommonRipple.kt */
/* loaded from: classes.dex */
public final class c extends p implements v2 {
    public final boolean c;
    public final float d;
    public final p3<x> e;
    public final p3<h> f;
    public final com.amazon.aps.iva.y0.w<com.amazon.aps.iva.c0.o, i> g;

    /* compiled from: CommonRipple.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ i i;
        public final /* synthetic */ c j;
        public final /* synthetic */ com.amazon.aps.iva.c0.o k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, c cVar, com.amazon.aps.iva.c0.o oVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = iVar;
            this.j = cVar;
            this.k = oVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            com.amazon.aps.iva.c0.o oVar = this.k;
            c cVar = this.j;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    i iVar = this.i;
                    this.h = 1;
                    if (iVar.a(this) == aVar) {
                        return aVar;
                    }
                }
                cVar.g.remove(oVar);
                return com.amazon.aps.iva.kb0.q.a;
            } catch (Throwable th) {
                cVar.g.remove(oVar);
                throw th;
            }
        }
    }

    public c() {
        throw null;
    }

    public c(boolean z, float f, q1 q1Var, q1 q1Var2) {
        super(q1Var2, z);
        this.c = z;
        this.d = f;
        this.e = q1Var;
        this.f = q1Var2;
        this.g = new com.amazon.aps.iva.y0.w<>();
    }

    @Override // com.amazon.aps.iva.a0.r0
    public final void a(com.amazon.aps.iva.h1.c cVar) {
        boolean z;
        float floatValue;
        long j;
        Float valueOf;
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "<this>");
        long j2 = this.e.getValue().a;
        cVar.f1();
        c(cVar2, this.d, j2);
        Iterator it = this.g.c.iterator();
        while (((e0) it).hasNext()) {
            i iVar = (i) ((Map.Entry) ((d0) it).next()).getValue();
            float f = this.f.getValue().d;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                long b = x.b(j2, f);
                iVar.getClass();
                if (iVar.d == null) {
                    long h = cVar.h();
                    float f2 = l.a;
                    iVar.d = Float.valueOf(Math.max(com.amazon.aps.iva.e1.g.d(h), com.amazon.aps.iva.e1.g.b(h)) * 0.3f);
                }
                Float f3 = iVar.e;
                boolean z2 = iVar.c;
                if (f3 == null) {
                    float f4 = iVar.b;
                    if (Float.isNaN(f4)) {
                        valueOf = Float.valueOf(l.a(cVar2, z2, cVar.h()));
                    } else {
                        valueOf = Float.valueOf(cVar2.P0(f4));
                    }
                    iVar.e = valueOf;
                }
                if (iVar.a == null) {
                    iVar.a = new com.amazon.aps.iva.e1.c(cVar.Z0());
                }
                if (iVar.f == null) {
                    iVar.f = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.d.d(com.amazon.aps.iva.e1.g.d(cVar.h()) / 2.0f, com.amazon.aps.iva.e1.g.b(cVar.h()) / 2.0f));
                }
                if (((Boolean) iVar.l.getValue()).booleanValue() && !((Boolean) iVar.k.getValue()).booleanValue()) {
                    floatValue = 1.0f;
                } else {
                    floatValue = iVar.g.c().floatValue();
                }
                Float f5 = iVar.d;
                com.amazon.aps.iva.yb0.j.c(f5);
                float floatValue2 = f5.floatValue();
                Float f6 = iVar.e;
                com.amazon.aps.iva.yb0.j.c(f6);
                float Y = com.amazon.aps.iva.cq.b.Y(floatValue2, f6.floatValue(), iVar.h.c().floatValue());
                com.amazon.aps.iva.e1.c cVar3 = iVar.a;
                com.amazon.aps.iva.yb0.j.c(cVar3);
                float c = com.amazon.aps.iva.e1.c.c(cVar3.a);
                com.amazon.aps.iva.e1.c cVar4 = iVar.f;
                com.amazon.aps.iva.yb0.j.c(cVar4);
                float c2 = com.amazon.aps.iva.e1.c.c(cVar4.a);
                com.amazon.aps.iva.z.b<Float, com.amazon.aps.iva.z.m> bVar = iVar.i;
                float Y2 = com.amazon.aps.iva.cq.b.Y(c, c2, bVar.c().floatValue());
                com.amazon.aps.iva.e1.c cVar5 = iVar.a;
                com.amazon.aps.iva.yb0.j.c(cVar5);
                float d = com.amazon.aps.iva.e1.c.d(cVar5.a);
                com.amazon.aps.iva.e1.c cVar6 = iVar.f;
                com.amazon.aps.iva.yb0.j.c(cVar6);
                long d2 = com.amazon.aps.iva.e1.d.d(Y2, com.amazon.aps.iva.cq.b.Y(d, com.amazon.aps.iva.e1.c.d(cVar6.a), bVar.c().floatValue()));
                long b2 = x.b(b, x.d(b) * floatValue);
                if (z2) {
                    float d3 = com.amazon.aps.iva.e1.g.d(cVar.h());
                    float b3 = com.amazon.aps.iva.e1.g.b(cVar.h());
                    a.b R0 = cVar.R0();
                    long h2 = R0.h();
                    R0.a().n();
                    j = j2;
                    R0.a.b(0.0f, 0.0f, d3, b3, 1);
                    com.amazon.aps.iva.h1.e.D(cVar, b2, Y, d2, null, 120);
                    R0.a().g();
                    R0.b(h2);
                } else {
                    j = j2;
                    com.amazon.aps.iva.h1.e.D(cVar, b2, Y, d2, null, 120);
                }
                cVar2 = cVar;
                j2 = j;
            } else {
                cVar2 = cVar;
            }
        }
    }

    @Override // com.amazon.aps.iva.n0.p
    public final void b(com.amazon.aps.iva.c0.o oVar, g0 g0Var) {
        com.amazon.aps.iva.e1.c cVar;
        com.amazon.aps.iva.yb0.j.f(oVar, "interaction");
        com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
        com.amazon.aps.iva.y0.w<com.amazon.aps.iva.c0.o, i> wVar = this.g;
        Iterator it = wVar.c.iterator();
        while (it.hasNext()) {
            i iVar = (i) ((Map.Entry) it.next()).getValue();
            iVar.l.setValue(Boolean.TRUE);
            iVar.j.g0(com.amazon.aps.iva.kb0.q.a);
        }
        boolean z = this.c;
        if (z) {
            cVar = new com.amazon.aps.iva.e1.c(oVar.a);
        } else {
            cVar = null;
        }
        i iVar2 = new i(cVar, this.d, z);
        wVar.put(oVar, iVar2);
        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(iVar2, this, oVar, null), 3);
    }

    @Override // com.amazon.aps.iva.n0.p
    public final void d(com.amazon.aps.iva.c0.o oVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "interaction");
        i iVar = this.g.get(oVar);
        if (iVar != null) {
            iVar.l.setValue(Boolean.TRUE);
            iVar.j.g0(com.amazon.aps.iva.kb0.q.a);
        }
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onAbandoned() {
        this.g.clear();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onForgotten() {
        this.g.clear();
    }

    @Override // com.amazon.aps.iva.o0.v2
    public final void onRemembered() {
    }
}
