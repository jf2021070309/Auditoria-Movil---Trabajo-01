package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.j1.w;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import java.util.Map;
/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ p h;
        public final /* synthetic */ Map<String, m> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, Map<String, ? extends m> map) {
            super(2);
            this.h = pVar;
            this.i = map;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                t.a((n) this.h, this.i, iVar2, 64, 0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ n h;
        public final /* synthetic */ Map<String, m> i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(n nVar, Map<String, ? extends m> map, int i, int i2) {
            super(2);
            this.h = nVar;
            this.i = map;
            this.j = i;
            this.k = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            t.a(this.h, this.i, iVar, I, this.k);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(n nVar, Map<String, ? extends m> map, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        int i3;
        int i4;
        a0 a0Var;
        com.amazon.aps.iva.o0.j jVar;
        Map<String, ? extends m> map2;
        com.amazon.aps.iva.o0.j jVar2;
        Map<String, ? extends m> map3;
        com.amazon.aps.iva.yb0.j.f(nVar, "group");
        com.amazon.aps.iva.o0.j g = iVar.g(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (g.H(nVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if (i5 == 2 && (i3 & 91) == 18 && g.h()) {
            g.A();
            map2 = map;
            jVar = g;
        } else {
            if (i5 != 0) {
                a0Var = a0.b;
            } else {
                a0Var = map;
            }
            e0.b bVar = e0.a;
            for (p pVar : nVar.k) {
                if (pVar instanceof v) {
                    g.s(-326285735);
                    v vVar = (v) pVar;
                    a0Var.get(vVar.b);
                    com.amazon.aps.iva.yb0.j.f(w.c.a, "property");
                    int i6 = vVar.d;
                    String str = vVar.b;
                    w.a aVar = w.a.a;
                    com.amazon.aps.iva.f1.s sVar = vVar.e;
                    com.amazon.aps.iva.yb0.j.f(aVar, "property");
                    w.b bVar2 = w.b.a;
                    Float valueOf = Float.valueOf(vVar.f);
                    com.amazon.aps.iva.yb0.j.f(bVar2, "property");
                    float floatValue = valueOf.floatValue();
                    w.i iVar2 = w.i.a;
                    com.amazon.aps.iva.f1.s sVar2 = vVar.g;
                    com.amazon.aps.iva.yb0.j.f(iVar2, "property");
                    w.j jVar3 = w.j.a;
                    Float valueOf2 = Float.valueOf(vVar.h);
                    com.amazon.aps.iva.yb0.j.f(jVar3, "property");
                    float floatValue2 = valueOf2.floatValue();
                    w.k kVar = w.k.a;
                    Float valueOf3 = Float.valueOf(vVar.i);
                    com.amazon.aps.iva.yb0.j.f(kVar, "property");
                    float floatValue3 = valueOf3.floatValue();
                    int i7 = vVar.j;
                    Map<String, ? extends m> map4 = a0Var;
                    int i8 = vVar.k;
                    float f = vVar.l;
                    w.p pVar2 = w.p.a;
                    Float valueOf4 = Float.valueOf(vVar.m);
                    com.amazon.aps.iva.yb0.j.f(pVar2, "property");
                    float floatValue4 = valueOf4.floatValue();
                    w.n nVar2 = w.n.a;
                    com.amazon.aps.iva.o0.j jVar4 = g;
                    Float valueOf5 = Float.valueOf(vVar.n);
                    com.amazon.aps.iva.yb0.j.f(nVar2, "property");
                    float floatValue5 = valueOf5.floatValue();
                    w.o oVar = w.o.a;
                    Float valueOf6 = Float.valueOf(vVar.o);
                    com.amazon.aps.iva.yb0.j.f(oVar, "property");
                    map3 = map4;
                    l.b(vVar.c, i6, str, sVar, floatValue, sVar2, floatValue2, floatValue3, i7, i8, f, floatValue4, floatValue5, valueOf6.floatValue(), jVar4, 8, 0, 0);
                    jVar2 = jVar4;
                    jVar2.U(false);
                } else {
                    jVar2 = g;
                    map3 = a0Var;
                    if (pVar instanceof n) {
                        jVar2.s(-326283877);
                        n nVar3 = (n) pVar;
                        map3.get(nVar3.b);
                        String str2 = nVar3.b;
                        w.f fVar = w.f.a;
                        Float valueOf7 = Float.valueOf(nVar3.c);
                        com.amazon.aps.iva.yb0.j.f(fVar, "property");
                        float floatValue6 = valueOf7.floatValue();
                        w.g gVar = w.g.a;
                        Float valueOf8 = Float.valueOf(nVar3.f);
                        com.amazon.aps.iva.yb0.j.f(gVar, "property");
                        float floatValue7 = valueOf8.floatValue();
                        w.h hVar = w.h.a;
                        Float valueOf9 = Float.valueOf(nVar3.g);
                        com.amazon.aps.iva.yb0.j.f(hVar, "property");
                        float floatValue8 = valueOf9.floatValue();
                        w.l lVar = w.l.a;
                        Float valueOf10 = Float.valueOf(nVar3.h);
                        com.amazon.aps.iva.yb0.j.f(lVar, "property");
                        float floatValue9 = valueOf10.floatValue();
                        w.m mVar = w.m.a;
                        Float valueOf11 = Float.valueOf(nVar3.i);
                        com.amazon.aps.iva.yb0.j.f(mVar, "property");
                        float floatValue10 = valueOf11.floatValue();
                        w.d dVar = w.d.a;
                        Float valueOf12 = Float.valueOf(nVar3.d);
                        com.amazon.aps.iva.yb0.j.f(dVar, "property");
                        float floatValue11 = valueOf12.floatValue();
                        w.e eVar = w.e.a;
                        Float valueOf13 = Float.valueOf(nVar3.e);
                        com.amazon.aps.iva.yb0.j.f(eVar, "property");
                        float floatValue12 = valueOf13.floatValue();
                        com.amazon.aps.iva.yb0.j.f(w.c.a, "property");
                        l.a(str2, floatValue6, floatValue11, floatValue12, floatValue7, floatValue8, floatValue9, floatValue10, nVar3.j, com.amazon.aps.iva.v0.b.b(jVar2, 1450046638, new a(pVar, map3)), jVar2, 939524096, 0);
                        jVar2.U(false);
                    } else {
                        jVar2.s(-326282407);
                        jVar2.U(false);
                    }
                }
                a0Var = map3;
                g = jVar2;
            }
            jVar = g;
            map2 = a0Var;
            e0.b bVar3 = e0.a;
        }
        j2 X = jVar.X();
        if (X != null) {
            X.d = new b(nVar, map2, i, i2);
        }
    }
}
