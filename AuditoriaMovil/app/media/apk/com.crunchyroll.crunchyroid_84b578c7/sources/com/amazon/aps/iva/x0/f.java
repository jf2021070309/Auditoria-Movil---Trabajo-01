package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.h2;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.l0;
import com.amazon.aps.iva.o0.q3;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.xb0.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: SaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.x0.e {
    public static final n d = m.a(a.h, b.h);
    public final Map<Object, Map<String, List<Object>>> a;
    public final LinkedHashMap b;
    public i c;

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<o, f, Map<Object, Map<String, ? extends List<? extends Object>>>> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(o oVar, f fVar) {
            f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(oVar, "$this$Saver");
            com.amazon.aps.iva.yb0.j.f(fVar2, "it");
            LinkedHashMap b0 = i0.b0(fVar2.a);
            for (c cVar : fVar2.b.values()) {
                cVar.a(b0);
            }
            if (b0.isEmpty()) {
                return null;
            }
            return b0;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Map<Object, Map<String, ? extends List<? extends Object>>>, f> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final f invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            Map<Object, Map<String, ? extends List<? extends Object>>> map2 = map;
            com.amazon.aps.iva.yb0.j.f(map2, "it");
            return new f((Map<Object, Map<String, List<Object>>>) map2);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public final class c {
        public final Object a;
        public boolean b;
        public final j c;

        /* compiled from: SaveableStateHolder.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, Boolean> {
            public final /* synthetic */ f h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(1);
                this.h = fVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Boolean invoke(Object obj) {
                boolean z;
                com.amazon.aps.iva.yb0.j.f(obj, "it");
                i iVar = this.h.c;
                if (iVar != null) {
                    z = iVar.a(obj);
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        public c(f fVar, Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "key");
            this.a = obj;
            this.b = true;
            a aVar = new a(fVar);
            q3 q3Var = k.a;
            this.c = new j(fVar.a.get(obj), aVar);
        }

        public final void a(Map<Object, Map<String, List<Object>>> map) {
            com.amazon.aps.iva.yb0.j.f(map, "map");
            if (this.b) {
                Map<String, List<Object>> d = this.c.d();
                boolean isEmpty = d.isEmpty();
                Object obj = this.a;
                if (isEmpty) {
                    map.remove(obj);
                } else {
                    map.put(obj, d);
                }
            }
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ f h;
        public final /* synthetic */ Object i;
        public final /* synthetic */ c j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar, f fVar, Object obj) {
            super(1);
            this.h = fVar;
            this.i = obj;
            this.j = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            com.amazon.aps.iva.yb0.j.f(v0Var, "$this$DisposableEffect");
            f fVar = this.h;
            LinkedHashMap linkedHashMap = fVar.b;
            Object obj = this.i;
            if (!linkedHashMap.containsKey(obj)) {
                fVar.a.remove(obj);
                LinkedHashMap linkedHashMap2 = fVar.b;
                c cVar = this.j;
                linkedHashMap2.put(obj, cVar);
                return new g(cVar, fVar, obj);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ Object i;
        public final /* synthetic */ p<com.amazon.aps.iva.o0.i, Integer, q> j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, int i) {
            super(2);
            this.i = obj;
            this.j = pVar;
            this.k = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.k | 1);
            Object obj = this.i;
            p<com.amazon.aps.iva.o0.i, Integer, q> pVar = this.j;
            f.this.f(obj, pVar, iVar, I);
            return q.a;
        }
    }

    public f() {
        this(0);
    }

    @Override // com.amazon.aps.iva.x0.e
    public final void c(Object obj) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        c cVar = (c) this.b.get(obj);
        if (cVar != null) {
            cVar.b = false;
        } else {
            this.a.remove(obj);
        }
    }

    @Override // com.amazon.aps.iva.x0.e
    public final void f(Object obj, p<? super com.amazon.aps.iva.o0.i, ? super Integer, q> pVar, com.amazon.aps.iva.o0.i iVar, int i) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.CONTENT);
        com.amazon.aps.iva.o0.j g = iVar.g(-1198538093);
        e0.b bVar = e0.a;
        g.s(444418301);
        g.x(obj);
        g.s(-492369756);
        Object e0 = g.e0();
        if (e0 == i.a.a) {
            i iVar2 = this.c;
            if (iVar2 != null) {
                z = iVar2.a(obj);
            } else {
                z = true;
            }
            if (z) {
                e0 = new c(this, obj);
                g.K0(e0);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        g.U(false);
        c cVar = (c) e0;
        l0.a(new h2[]{k.a.b(cVar.c)}, pVar, g, (i & 112) | 8);
        x0.a(q.a, new d(cVar, this, obj), g);
        g.r();
        g.U(false);
        j2 X = g.X();
        if (X != null) {
            X.d = new e(obj, pVar, i);
        }
    }

    public f(Map<Object, Map<String, List<Object>>> map) {
        com.amazon.aps.iva.yb0.j.f(map, "savedStates");
        this.a = map;
        this.b = new LinkedHashMap();
    }

    public /* synthetic */ f(int i) {
        this(new LinkedHashMap());
    }
}
