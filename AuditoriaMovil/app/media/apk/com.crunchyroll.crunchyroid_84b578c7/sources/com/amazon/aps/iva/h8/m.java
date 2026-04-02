package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g8.j0;
import com.amazon.aps.iva.g8.k0;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.v1.u1;
import com.amazon.aps.iva.ve0.i0;
import com.amazon.aps.iva.y.e0;
import com.amazon.aps.iva.y.r0;
import com.amazon.aps.iva.y.s0;
import com.amazon.aps.iva.y.t0;
import com.amazon.aps.iva.z.a1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: NavHost.kt */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var) {
            super(0);
            this.h = m0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.n();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<v0, u0> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ com.amazon.aps.iva.i5.o i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var, com.amazon.aps.iva.i5.o oVar) {
            super(1);
            this.h = m0Var;
            this.i = oVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final u0 invoke(v0 v0Var) {
            androidx.lifecycle.g lifecycle;
            m0 m0Var = this.h;
            m0Var.getClass();
            com.amazon.aps.iva.i5.o oVar = this.i;
            com.amazon.aps.iva.yb0.j.f(oVar, "owner");
            if (!com.amazon.aps.iva.yb0.j.a(oVar, m0Var.p)) {
                com.amazon.aps.iva.i5.o oVar2 = m0Var.p;
                com.amazon.aps.iva.g8.h hVar = m0Var.t;
                if (oVar2 != null && (lifecycle = oVar2.getLifecycle()) != null) {
                    lifecycle.removeObserver(hVar);
                }
                m0Var.p = oVar;
                oVar.getLifecycle().addObserver(hVar);
            }
            return new com.amazon.aps.iva.h8.n();
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, e0> {
        public final /* synthetic */ Map<String, Float> h;
        public final /* synthetic */ com.amazon.aps.iva.h8.e i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> k;
        public final /* synthetic */ p3<List<com.amazon.aps.iva.g8.f>> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Map map, com.amazon.aps.iva.h8.e eVar, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2, q1 q1Var) {
            super(1);
            this.h = map;
            this.i = eVar;
            this.j = lVar;
            this.k = lVar2;
            this.l = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar) {
            com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar2 = qVar;
            float f = 0.0f;
            if (this.l.getValue().contains(qVar2.c())) {
                String str = qVar2.c().g;
                Map<String, Float> map = this.h;
                Float f2 = map.get(str);
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    map.put(qVar2.c().g, Float.valueOf(0.0f));
                }
                if (!com.amazon.aps.iva.yb0.j.a(qVar2.a().g, qVar2.c().g)) {
                    if (((Boolean) this.i.c.getValue()).booleanValue()) {
                        f -= 1.0f;
                    } else {
                        f += 1.0f;
                    }
                }
                map.put(qVar2.a().g, Float.valueOf(f));
                return new e0(this.j.invoke(qVar2), this.k.invoke(qVar2), f, 8);
            }
            s0 s0Var = r0.a;
            com.amazon.aps.iva.y.u0 u0Var = t0.a;
            com.amazon.aps.iva.yb0.j.f(s0Var, "<this>");
            com.amazon.aps.iva.yb0.j.f(u0Var, "exit");
            return new e0(s0Var, u0Var, 0.0f, 12);
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g8.f, Object> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.g8.f fVar) {
            return fVar.g;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.r<com.amazon.aps.iva.y.o, com.amazon.aps.iva.g8.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.h8.e h;
        public final /* synthetic */ com.amazon.aps.iva.x0.e i;
        public final /* synthetic */ p3<List<com.amazon.aps.iva.g8.f>> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.h8.e eVar, com.amazon.aps.iva.x0.f fVar, q1 q1Var) {
            super(4);
            this.h = eVar;
            this.i = fVar;
            this.j = q1Var;
        }

        @Override // com.amazon.aps.iva.xb0.r
        public final com.amazon.aps.iva.kb0.q K(com.amazon.aps.iva.y.o oVar, com.amazon.aps.iva.g8.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
            List<com.amazon.aps.iva.g8.f> value;
            com.amazon.aps.iva.g8.f fVar2;
            com.amazon.aps.iva.y.o oVar2 = oVar;
            com.amazon.aps.iva.g8.f fVar3 = fVar;
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            num.intValue();
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            if (((Boolean) iVar2.i(u1.a)).booleanValue()) {
                value = (List) this.h.b().e.getValue();
            } else {
                value = this.j.getValue();
            }
            ListIterator<com.amazon.aps.iva.g8.f> listIterator = value.listIterator(value.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    fVar2 = listIterator.previous();
                    if (com.amazon.aps.iva.yb0.j.a(fVar3, fVar2)) {
                        break;
                    }
                } else {
                    fVar2 = null;
                    break;
                }
            }
            com.amazon.aps.iva.g8.f fVar4 = fVar2;
            if (fVar4 != null) {
                com.amazon.aps.iva.h8.h.a(fVar4, this.i, com.amazon.aps.iva.v0.b.b(iVar2, -1425390790, new com.amazon.aps.iva.h8.o(fVar4, oVar2)), iVar2, 456);
            }
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ a1<com.amazon.aps.iva.g8.f> h;
        public final /* synthetic */ Map<String, Float> i;
        public final /* synthetic */ p3<List<com.amazon.aps.iva.g8.f>> j;
        public final /* synthetic */ com.amazon.aps.iva.h8.e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(a1<com.amazon.aps.iva.g8.f> a1Var, Map<String, Float> map, p3<? extends List<com.amazon.aps.iva.g8.f>> p3Var, com.amazon.aps.iva.h8.e eVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.h = a1Var;
            this.i = map;
            this.j = p3Var;
            this.k = eVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.h, this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            a1<com.amazon.aps.iva.g8.f> a1Var = this.h;
            if (com.amazon.aps.iva.yb0.j.a(a1Var.b(), a1Var.d())) {
                for (com.amazon.aps.iva.g8.f fVar : this.j.getValue()) {
                    this.k.b().b(fVar);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Float> map = this.i;
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!com.amazon.aps.iva.yb0.j.a(entry.getKey(), a1Var.d().g)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    map.remove(entry2.getKey());
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ j0 i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(m0 m0Var, j0 j0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar4, int i, int i2) {
            super(2);
            this.h = m0Var;
            this.i = j0Var;
            this.j = fVar;
            this.k = aVar;
            this.l = lVar;
            this.m = lVar2;
            this.n = lVar3;
            this.o = lVar4;
            this.p = i;
            this.q = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            m.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final r0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar) {
            return com.amazon.aps.iva.y.g0.b(com.amazon.aps.iva.z.k.d(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> {
        public static final i h = new i();

        public i() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar) {
            return com.amazon.aps.iva.y.g0.c(com.amazon.aps.iva.z.k.d(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ String i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ String l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> o;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> p;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<k0, com.amazon.aps.iva.kb0.q> q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(m0 m0Var, String str, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, String str2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar4, com.amazon.aps.iva.xb0.l<? super k0, com.amazon.aps.iva.kb0.q> lVar5, int i, int i2) {
            super(2);
            this.h = m0Var;
            this.i = str;
            this.j = fVar;
            this.k = aVar;
            this.l = str2;
            this.m = lVar;
            this.n = lVar2;
            this.o = lVar3;
            this.p = lVar4;
            this.q = lVar5;
            this.r = i;
            this.s = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            m.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, iVar, com.amazon.aps.iva.ff0.b.I(this.r | 1), this.s);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> {
        public static final k h = new k();

        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final r0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar) {
            return com.amazon.aps.iva.y.g0.b(com.amazon.aps.iva.z.k.d(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> {
        public static final l h = new l();

        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final t0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> qVar) {
            return com.amazon.aps.iva.y.g0.c(com.amazon.aps.iva.z.k.d(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    /* renamed from: com.amazon.aps.iva.h8.m$m  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0326m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ j0 i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0326m(m0 m0Var, j0 j0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar4, int i, int i2) {
            super(2);
            this.h = m0Var;
            this.i = j0Var;
            this.j = fVar;
            this.k = aVar;
            this.l = lVar;
            this.m = lVar2;
            this.n = lVar3;
            this.o = lVar4;
            this.p = i;
            this.q = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            m.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ m0 h;
        public final /* synthetic */ j0 i;
        public final /* synthetic */ com.amazon.aps.iva.a1.f j;
        public final /* synthetic */ com.amazon.aps.iva.a1.a k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> l;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> n;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(m0 m0Var, j0 j0Var, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar4, int i, int i2) {
            super(2);
            this.h = m0Var;
            this.i = j0Var;
            this.j = fVar;
            this.k = aVar;
            this.l = lVar;
            this.m = lVar2;
            this.n = lVar3;
            this.o = lVar4;
            this.p = i;
            this.q = i2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            m.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, iVar, com.amazon.aps.iva.ff0.b.I(this.p | 1), this.q);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> {
        public final /* synthetic */ com.amazon.aps.iva.h8.e h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, r0> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(com.amazon.aps.iva.h8.e eVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar2) {
            super(1);
            this.h = eVar;
            this.i = lVar;
            this.j = lVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0055 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.y.r0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> r5) {
            /*
                r4 = this;
                com.amazon.aps.iva.y.q r5 = (com.amazon.aps.iva.y.q) r5
                java.lang.Object r0 = r5.a()
                com.amazon.aps.iva.g8.f r0 = (com.amazon.aps.iva.g8.f) r0
                com.amazon.aps.iva.g8.g0 r0 = r0.c
                java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"
                com.amazon.aps.iva.yb0.j.d(r0, r1)
                com.amazon.aps.iva.h8.e$a r0 = (com.amazon.aps.iva.h8.e.a) r0
                com.amazon.aps.iva.h8.e r1 = r4.h
                com.amazon.aps.iva.o0.y1 r1 = r1.c
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = 0
                if (r1 == 0) goto L62
                int r1 = com.amazon.aps.iva.g8.g0.j
                com.amazon.aps.iva.ne0.h r0 = com.amazon.aps.iva.g8.g0.a.c(r0)
                java.util.Iterator r0 = r0.iterator()
            L2c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.amazon.aps.iva.g8.g0 r1 = (com.amazon.aps.iva.g8.g0) r1
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.e.a
                if (r3 == 0) goto L49
                com.amazon.aps.iva.h8.e$a r1 = (com.amazon.aps.iva.h8.e.a) r1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> r1 = r1.n
                if (r1 == 0) goto L52
                java.lang.Object r1 = r1.invoke(r5)
                com.amazon.aps.iva.y.r0 r1 = (com.amazon.aps.iva.y.r0) r1
                goto L53
            L49:
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.d.a
                if (r3 == 0) goto L52
                com.amazon.aps.iva.h8.d$a r1 = (com.amazon.aps.iva.h8.d.a) r1
                r1.getClass()
            L52:
                r1 = r2
            L53:
                if (r1 == 0) goto L2c
                r2 = r1
            L56:
                if (r2 != 0) goto La1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> r0 = r4.i
                java.lang.Object r5 = r0.invoke(r5)
                r2 = r5
                com.amazon.aps.iva.y.r0 r2 = (com.amazon.aps.iva.y.r0) r2
                goto La1
            L62:
                int r1 = com.amazon.aps.iva.g8.g0.j
                com.amazon.aps.iva.ne0.h r0 = com.amazon.aps.iva.g8.g0.a.c(r0)
                java.util.Iterator r0 = r0.iterator()
            L6c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L96
                java.lang.Object r1 = r0.next()
                com.amazon.aps.iva.g8.g0 r1 = (com.amazon.aps.iva.g8.g0) r1
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.e.a
                if (r3 == 0) goto L89
                com.amazon.aps.iva.h8.e$a r1 = (com.amazon.aps.iva.h8.e.a) r1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> r1 = r1.l
                if (r1 == 0) goto L92
                java.lang.Object r1 = r1.invoke(r5)
                com.amazon.aps.iva.y.r0 r1 = (com.amazon.aps.iva.y.r0) r1
                goto L93
            L89:
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.d.a
                if (r3 == 0) goto L92
                com.amazon.aps.iva.h8.d$a r1 = (com.amazon.aps.iva.h8.d.a) r1
                r1.getClass()
            L92:
                r1 = r2
            L93:
                if (r1 == 0) goto L6c
                r2 = r1
            L96:
                if (r2 != 0) goto La1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.r0> r0 = r4.j
                java.lang.Object r5 = r0.invoke(r5)
                r2 = r5
                com.amazon.aps.iva.y.r0 r2 = (com.amazon.aps.iva.y.r0) r2
            La1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h8.m.o.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: NavHost.kt */
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> {
        public final /* synthetic */ com.amazon.aps.iva.h8.e h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, t0> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(com.amazon.aps.iva.h8.e eVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2) {
            super(1);
            this.h = eVar;
            this.i = lVar;
            this.j = lVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0055 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.y.t0 invoke(com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f> r5) {
            /*
                r4 = this;
                com.amazon.aps.iva.y.q r5 = (com.amazon.aps.iva.y.q) r5
                java.lang.Object r0 = r5.c()
                com.amazon.aps.iva.g8.f r0 = (com.amazon.aps.iva.g8.f) r0
                com.amazon.aps.iva.g8.g0 r0 = r0.c
                java.lang.String r1 = "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination"
                com.amazon.aps.iva.yb0.j.d(r0, r1)
                com.amazon.aps.iva.h8.e$a r0 = (com.amazon.aps.iva.h8.e.a) r0
                com.amazon.aps.iva.h8.e r1 = r4.h
                com.amazon.aps.iva.o0.y1 r1 = r1.c
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r2 = 0
                if (r1 == 0) goto L62
                int r1 = com.amazon.aps.iva.g8.g0.j
                com.amazon.aps.iva.ne0.h r0 = com.amazon.aps.iva.g8.g0.a.c(r0)
                java.util.Iterator r0 = r0.iterator()
            L2c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r0.next()
                com.amazon.aps.iva.g8.g0 r1 = (com.amazon.aps.iva.g8.g0) r1
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.e.a
                if (r3 == 0) goto L49
                com.amazon.aps.iva.h8.e$a r1 = (com.amazon.aps.iva.h8.e.a) r1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.t0> r1 = r1.o
                if (r1 == 0) goto L52
                java.lang.Object r1 = r1.invoke(r5)
                com.amazon.aps.iva.y.t0 r1 = (com.amazon.aps.iva.y.t0) r1
                goto L53
            L49:
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.d.a
                if (r3 == 0) goto L52
                com.amazon.aps.iva.h8.d$a r1 = (com.amazon.aps.iva.h8.d.a) r1
                r1.getClass()
            L52:
                r1 = r2
            L53:
                if (r1 == 0) goto L2c
                r2 = r1
            L56:
                if (r2 != 0) goto La1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.t0> r0 = r4.i
                java.lang.Object r5 = r0.invoke(r5)
                r2 = r5
                com.amazon.aps.iva.y.t0 r2 = (com.amazon.aps.iva.y.t0) r2
                goto La1
            L62:
                int r1 = com.amazon.aps.iva.g8.g0.j
                com.amazon.aps.iva.ne0.h r0 = com.amazon.aps.iva.g8.g0.a.c(r0)
                java.util.Iterator r0 = r0.iterator()
            L6c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L96
                java.lang.Object r1 = r0.next()
                com.amazon.aps.iva.g8.g0 r1 = (com.amazon.aps.iva.g8.g0) r1
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.e.a
                if (r3 == 0) goto L89
                com.amazon.aps.iva.h8.e$a r1 = (com.amazon.aps.iva.h8.e.a) r1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.t0> r1 = r1.m
                if (r1 == 0) goto L92
                java.lang.Object r1 = r1.invoke(r5)
                com.amazon.aps.iva.y.t0 r1 = (com.amazon.aps.iva.y.t0) r1
                goto L93
            L89:
                boolean r3 = r1 instanceof com.amazon.aps.iva.h8.d.a
                if (r3 == 0) goto L92
                com.amazon.aps.iva.h8.d$a r1 = (com.amazon.aps.iva.h8.d.a) r1
                r1.getClass()
            L92:
                r1 = r2
            L93:
                if (r1 == 0) goto L6c
                r2 = r1
            L96:
                if (r2 != 0) goto La1
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, com.amazon.aps.iva.y.t0> r0 = r4.j
                java.lang.Object r5 = r0.invoke(r5)
                r2 = r5
                com.amazon.aps.iva.y.t0 r2 = (com.amazon.aps.iva.y.t0) r2
            La1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h8.m.p.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class q implements com.amazon.aps.iva.ve0.f<List<? extends com.amazon.aps.iva.g8.f>> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2", f = "NavHost.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.h8.m$q$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0327a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0327a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(com.amazon.aps.iva.ve0.g gVar) {
                this.b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r7, com.amazon.aps.iva.ob0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.amazon.aps.iva.h8.m.q.a.C0327a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.amazon.aps.iva.h8.m$q$a$a r0 = (com.amazon.aps.iva.h8.m.q.a.C0327a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.h8.m$q$a$a r0 = new com.amazon.aps.iva.h8.m$q$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r8)
                    goto L67
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r8)
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L3f:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L5c
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    com.amazon.aps.iva.g8.f r4 = (com.amazon.aps.iva.g8.f) r4
                    com.amazon.aps.iva.g8.g0 r4 = r4.c
                    java.lang.String r4 = r4.b
                    java.lang.String r5 = "composable"
                    boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r5)
                    if (r4 == 0) goto L3f
                    r8.add(r2)
                    goto L3f
                L5c:
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r7 = r6.b
                    java.lang.Object r7 = r7.a(r8, r0)
                    if (r7 != r1) goto L67
                    return r1
                L67:
                    com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h8.m.q.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public q(i0 i0Var) {
            this.b = i0Var;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends com.amazon.aps.iva.g8.f>> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new a(gVar), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class r implements com.amazon.aps.iva.ve0.f<List<? extends com.amazon.aps.iva.g8.f>> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2", f = "NavHost.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.h8.m$r$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0328a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0328a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(com.amazon.aps.iva.ve0.g gVar) {
                this.b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r7, com.amazon.aps.iva.ob0.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.amazon.aps.iva.h8.m.r.a.C0328a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.amazon.aps.iva.h8.m$r$a$a r0 = (com.amazon.aps.iva.h8.m.r.a.C0328a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.h8.m$r$a$a r0 = new com.amazon.aps.iva.h8.m$r$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r8)
                    goto L67
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r8)
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L3f:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L5c
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    com.amazon.aps.iva.g8.f r4 = (com.amazon.aps.iva.g8.f) r4
                    com.amazon.aps.iva.g8.g0 r4 = r4.c
                    java.lang.String r4 = r4.b
                    java.lang.String r5 = "composable"
                    boolean r4 = com.amazon.aps.iva.yb0.j.a(r4, r5)
                    if (r4 == 0) goto L3f
                    r8.add(r2)
                    goto L3f
                L5c:
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r7 = r6.b
                    java.lang.Object r7 = r7.a(r8, r0)
                    if (r7 != r1) goto L67
                    return r1
                L67:
                    com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h8.m.r.a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public r(i0 i0Var) {
            this.b = i0Var;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends com.amazon.aps.iva.g8.f>> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new a(gVar), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0306, code lost:
        if ((r12.length == 0) != false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0604, code lost:
        if (r7 == r6) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f6  */
    @android.annotation.SuppressLint({"StateFlowValueCalledInComposition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.amazon.aps.iva.g8.m0 r33, com.amazon.aps.iva.g8.j0 r34, com.amazon.aps.iva.a1.f r35, com.amazon.aps.iva.a1.a r36, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends com.amazon.aps.iva.y.r0> r37, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends com.amazon.aps.iva.y.t0> r38, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends com.amazon.aps.iva.y.r0> r39, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends com.amazon.aps.iva.y.t0> r40, com.amazon.aps.iva.o0.i r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.h8.m.a(com.amazon.aps.iva.g8.m0, com.amazon.aps.iva.g8.j0, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.a1.a, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.o0.i, int, int):void");
    }

    public static final void b(m0 m0Var, String str, com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.a1.a aVar, String str2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar2, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar3, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar4, com.amazon.aps.iva.xb0.l<? super k0, com.amazon.aps.iva.kb0.q> lVar5, com.amazon.aps.iva.o0.i iVar, int i2, int i3) {
        f.a aVar2;
        com.amazon.aps.iva.a1.b bVar;
        String str3;
        h hVar;
        i iVar2;
        com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends r0> lVar6;
        int i4;
        com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.y.q<com.amazon.aps.iva.g8.f>, ? extends t0> lVar7;
        com.amazon.aps.iva.o0.j g2 = iVar.g(410432995);
        if ((i3 & 4) != 0) {
            aVar2 = f.a.c;
        } else {
            aVar2 = fVar;
        }
        if ((i3 & 8) != 0) {
            bVar = a.C0097a.e;
        } else {
            bVar = aVar;
        }
        if ((i3 & 16) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        if ((i3 & 32) != 0) {
            hVar = h.h;
        } else {
            hVar = lVar;
        }
        if ((i3 & 64) != 0) {
            iVar2 = i.h;
        } else {
            iVar2 = lVar2;
        }
        if ((i3 & 128) != 0) {
            i4 = i2 & (-29360129);
            lVar6 = hVar;
        } else {
            lVar6 = lVar3;
            i4 = i2;
        }
        if ((i3 & 256) != 0) {
            i4 &= -234881025;
            lVar7 = iVar2;
        } else {
            lVar7 = lVar4;
        }
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        g2.s(1618982084);
        boolean H = g2.H(str3) | g2.H(str) | g2.H(lVar5);
        Object e0 = g2.e0();
        if (H || e0 == i.a.a) {
            k0 k0Var = new k0(m0Var.w, str, str3);
            lVar5.invoke(k0Var);
            e0 = k0Var.b();
            g2.K0(e0);
        }
        g2.U(false);
        int i5 = i4 >> 3;
        a(m0Var, (j0) e0, aVar2, bVar, hVar, iVar2, lVar6, lVar7, g2, (i4 & 896) | 72 | (i4 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        j2 X = g2.X();
        if (X != null) {
            X.d = new j(m0Var, str, aVar2, bVar, str3, hVar, iVar2, lVar6, lVar7, lVar5, i2, i3);
        }
    }
}
