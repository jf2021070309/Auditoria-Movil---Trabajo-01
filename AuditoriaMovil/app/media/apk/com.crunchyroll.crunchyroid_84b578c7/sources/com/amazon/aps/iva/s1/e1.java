package com.amazon.aps.iva.s1;

import com.amazon.aps.iva.s1.x;
import java.util.LinkedHashMap;
/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class e1 {
    public final g1 a;
    public x b;
    public final e c;
    public final b d;
    public final d e;
    public final c f;

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<androidx.compose.ui.node.e, com.amazon.aps.iva.o0.g0, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.o0.g0 g0Var) {
            com.amazon.aps.iva.o0.g0 g0Var2 = g0Var;
            com.amazon.aps.iva.yb0.j.f(eVar, "$this$null");
            com.amazon.aps.iva.yb0.j.f(g0Var2, "it");
            e1.this.a().b = g0Var2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<androidx.compose.ui.node.e, com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0>, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar) {
            com.amazon.aps.iva.xb0.p<? super a1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(eVar, "$this$null");
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            e1.this.a().i = pVar2;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<androidx.compose.ui.node.e, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0>, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(androidx.compose.ui.node.e eVar, com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar) {
            androidx.compose.ui.node.e eVar2 = eVar;
            com.amazon.aps.iva.xb0.p<? super f1, ? super com.amazon.aps.iva.o2.a, ? extends e0> pVar2 = pVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$null");
            com.amazon.aps.iva.yb0.j.f(pVar2, "it");
            x a = e1.this.a();
            x.a aVar = a.h;
            aVar.getClass();
            aVar.c = pVar2;
            eVar2.h(new y(a, pVar2, a.n));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<androidx.compose.ui.node.e, e1, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(androidx.compose.ui.node.e eVar, e1 e1Var) {
            androidx.compose.ui.node.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "$this$null");
            com.amazon.aps.iva.yb0.j.f(e1Var, "it");
            x xVar = eVar2.B;
            e1 e1Var2 = e1.this;
            if (xVar == null) {
                xVar = new x(eVar2, e1Var2.a);
                eVar2.B = xVar;
            }
            e1Var2.b = xVar;
            e1Var2.a().b();
            x a = e1Var2.a();
            g1 g1Var = e1Var2.a;
            com.amazon.aps.iva.yb0.j.f(g1Var, "value");
            if (a.c != g1Var) {
                a.c = g1Var;
                a.a(0);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e1(g1 g1Var) {
        this.a = g1Var;
        this.c = new e();
        this.d = new b();
        this.e = new d();
        this.f = new c();
    }

    public final x a() {
        x xVar = this.b;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final z b(Object obj, com.amazon.aps.iva.xb0.p pVar) {
        x a2 = a();
        a2.b();
        if (!a2.f.containsKey(obj)) {
            LinkedHashMap linkedHashMap = a2.j;
            Object obj2 = linkedHashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                androidx.compose.ui.node.e d2 = a2.d(obj);
                androidx.compose.ui.node.e eVar = a2.a;
                if (d2 != null) {
                    int indexOf = eVar.t().indexOf(d2);
                    int size = eVar.t().size();
                    eVar.m = true;
                    eVar.J(indexOf, size, 1);
                    eVar.m = false;
                    a2.m++;
                } else {
                    int size2 = eVar.t().size();
                    androidx.compose.ui.node.e eVar2 = new androidx.compose.ui.node.e(2, true);
                    eVar.m = true;
                    eVar.A(size2, eVar2);
                    eVar.m = false;
                    a2.m++;
                    d2 = eVar2;
                }
                linkedHashMap.put(obj, d2);
                obj3 = d2;
            }
            a2.c((androidx.compose.ui.node.e) obj3, obj, pVar);
        }
        return new z(a2, obj);
    }

    public e1() {
        this(l0.a);
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public interface a {
        default int a() {
            return 0;
        }

        void dispose();

        default void b(int i, long j) {
        }
    }
}
