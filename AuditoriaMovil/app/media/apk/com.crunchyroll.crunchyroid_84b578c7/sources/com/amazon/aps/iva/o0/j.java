package com.amazon.aps.iva.o0;

import android.os.Trace;
import android.util.SparseArray;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.v0.c;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: V
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class j implements com.amazon.aps.iva.o0.i {
    public int A;
    public final com.amazon.aps.iva.o0.m B;
    public final o3 C;
    public boolean D;
    public y2 E;
    public z2 F;
    public b3 G;
    public boolean H;
    public c2 I;
    public ArrayList J;
    public com.amazon.aps.iva.o0.c K;
    public final ArrayList L;
    public boolean M;
    public int N;
    public int O;
    public final o3 P;
    public int Q;
    public boolean R;
    public boolean S;
    public final com.amazon.aps.iva.e0.f T;
    public final o3 U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final com.amazon.aps.iva.o0.d<?> a;
    public final g0 b;
    public final z2 c;
    public final Set<v2> d;
    public List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> e;
    public final List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> f;
    public final o0 g;
    public final o3 h;
    public b2 i;
    public int j;
    public final com.amazon.aps.iva.e0.f k;
    public int l;
    public final com.amazon.aps.iva.e0.f m;
    public int[] n;
    public HashMap<Integer, Integer> o;
    public boolean p;
    public boolean q;
    public final ArrayList r;
    public final com.amazon.aps.iva.e0.f s;
    public c2 t;
    public final com.amazon.aps.iva.p0.e u;
    public boolean v;
    public final com.amazon.aps.iva.e0.f w;
    public boolean x;
    public int y;
    public int z;

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public final class b extends g0 {
        public final int a;
        public final boolean b;
        public HashSet c;
        public final LinkedHashSet d = new LinkedHashSet();
        public final y1 e = com.amazon.aps.iva.cq.b.c0(com.amazon.aps.iva.v0.c.e);

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void a(o0 o0Var, com.amazon.aps.iva.v0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
            j.this.b.a(o0Var, aVar);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void b(m1 m1Var) {
            j.this.b.b(m1Var);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void c() {
            j jVar = j.this;
            jVar.z--;
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final boolean d() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final c2 e() {
            return (c2) this.e.getValue();
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final int f() {
            return this.a;
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final com.amazon.aps.iva.ob0.g g() {
            return j.this.b.g();
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void h(o0 o0Var) {
            com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
            j jVar = j.this;
            jVar.b.h(jVar.g);
            jVar.b.h(o0Var);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void i(m1 m1Var, l1 l1Var) {
            j.this.b.i(m1Var, l1Var);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final l1 j(m1 m1Var) {
            com.amazon.aps.iva.yb0.j.f(m1Var, "reference");
            return j.this.b.j(m1Var);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void k(Set<Object> set) {
            HashSet hashSet = this.c;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.c = hashSet;
            }
            hashSet.add(set);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void l(j jVar) {
            this.d.add(jVar);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void m(o0 o0Var) {
            com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
            j.this.b.m(o0Var);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void n() {
            j.this.z++;
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void o(com.amazon.aps.iva.o0.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "composer");
            HashSet hashSet = this.c;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((j) iVar).c);
                }
            }
            LinkedHashSet linkedHashSet = this.d;
            com.amazon.aps.iva.yb0.h0.a(linkedHashSet);
            linkedHashSet.remove(iVar);
        }

        @Override // com.amazon.aps.iva.o0.g0
        public final void p(o0 o0Var) {
            com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
            j.this.b.p(o0Var);
        }

        public final void q() {
            LinkedHashSet<j> linkedHashSet = this.d;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.c;
                if (hashSet != null) {
                    for (j jVar : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(jVar.c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.p<T, V, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ V i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.amazon.aps.iva.xb0.p<? super T, ? super V, com.amazon.aps.iva.kb0.q> pVar, V v) {
            super(3);
            this.h = pVar;
            this.i = v;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "applier");
            com.amazon.aps.iva.yb0.j.f(b3Var, "<anonymous parameter 1>");
            com.amazon.aps.iva.yb0.j.f(u2Var, "<anonymous parameter 2>");
            this.h.invoke(dVar2.e(), this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<T> h;
        public final /* synthetic */ com.amazon.aps.iva.o0.c i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.xb0.a<? extends T> aVar, com.amazon.aps.iva.o0.c cVar, int i) {
            super(3);
            this.h = aVar;
            this.i = cVar;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            b3 b3Var2 = b3Var;
            com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
            Object invoke = this.h.invoke();
            com.amazon.aps.iva.o0.c cVar = this.i;
            com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
            b3Var2.P(b3Var2.c(cVar), invoke);
            dVar2.c(this.j, invoke);
            dVar2.g(invoke);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o0.c h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, com.amazon.aps.iva.o0.c cVar) {
            super(3);
            this.h = cVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            b3 b3Var2 = b3Var;
            com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
            com.amazon.aps.iva.o0.c cVar = this.h;
            com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
            Object y = b3Var2.y(b3Var2.c(cVar));
            dVar2.h();
            dVar2.f(this.i, y);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Object h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj) {
            super(3);
            this.h = obj;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            u2 u2Var2 = u2Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var, "<anonymous parameter 1>", u2Var2, "rememberManager");
            u2Var2.d((com.amazon.aps.iva.o0.g) this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Integer, Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ j h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(j jVar, int i) {
            super(2);
            this.h = jVar;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Integer num, Object obj) {
            int intValue = num.intValue();
            boolean z = obj instanceof v2;
            int i = this.i;
            j jVar = this.h;
            if (z) {
                jVar.E.n(i);
                jVar.p0(false, new com.amazon.aps.iva.o0.k(obj, intValue));
            } else if (obj instanceof j2) {
                j2 j2Var = (j2) obj;
                l2 l2Var = j2Var.b;
                if (l2Var != null) {
                    l2Var.l(j2Var);
                }
                j2Var.b = null;
                j2Var.f = null;
                j2Var.g = null;
                jVar.E.n(i);
                jVar.p0(false, new com.amazon.aps.iva.o0.l(obj, intValue));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, int i2) {
            super(3);
            this.h = i;
            this.i = i2;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var, "<anonymous parameter 1>", u2Var, "<anonymous parameter 2>");
            dVar2.b(this.h, this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i, int i2, int i3) {
            super(3);
            this.h = i;
            this.i = i2;
            this.j = i3;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var, "<anonymous parameter 1>", u2Var, "<anonymous parameter 2>");
            dVar2.a(this.h, this.i, this.j);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: com.amazon.aps.iva.o0.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0551j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0551j(int i) {
            super(3);
            this.h = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            b3 b3Var2 = b3Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
            b3Var2.a(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i) {
            super(3);
            this.h = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var, "<anonymous parameter 1>", u2Var, "<anonymous parameter 2>");
            for (int i = 0; i < this.h; i++) {
                dVar2.h();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
            super(3);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            u2 u2Var2 = u2Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var, "<anonymous parameter 1>", u2Var2, "rememberManager");
            u2Var2.c(this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.o0.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.amazon.aps.iva.o0.c cVar) {
            super(3);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            b3 b3Var2 = b3Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var, "<anonymous parameter 2>");
            com.amazon.aps.iva.o0.c cVar = this.h;
            com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
            b3Var2.k(b3Var2.c(cVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ j h;
        public final /* synthetic */ m1 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(j jVar, m1 m1Var) {
            super(3);
            this.h = jVar;
            this.i = m1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[LOOP:0: B:9:0x005f->B:29:0x00a1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> r11, com.amazon.aps.iva.o0.b3 r12, com.amazon.aps.iva.o0.u2 r13) {
            /*
                r10 = this;
                r0 = r11
                com.amazon.aps.iva.o0.d r0 = (com.amazon.aps.iva.o0.d) r0
                com.amazon.aps.iva.o0.b3 r12 = (com.amazon.aps.iva.o0.b3) r12
                r4 = r13
                com.amazon.aps.iva.o0.u2 r4 = (com.amazon.aps.iva.o0.u2) r4
                java.lang.String r1 = "<anonymous parameter 0>"
                java.lang.String r3 = "slots"
                java.lang.String r5 = "<anonymous parameter 2>"
                r2 = r12
                com.amazon.aps.iva.d90.a.c(r0, r1, r2, r3, r4, r5)
                com.amazon.aps.iva.o0.m1 r11 = r10.i
                com.amazon.aps.iva.o0.j r13 = r10.h
                r13.getClass()
                com.amazon.aps.iva.o0.z2 r0 = new com.amazon.aps.iva.o0.z2
                r0.<init>()
                com.amazon.aps.iva.o0.b3 r1 = r0.j()
                r1.e()     // Catch: java.lang.Throwable -> Lcb
                com.amazon.aps.iva.o0.k1<java.lang.Object> r2 = r11.a     // Catch: java.lang.Throwable -> Lcb
                com.amazon.aps.iva.o0.i$a$a r3 = com.amazon.aps.iva.o0.i.a.a
                r4 = 0
                r5 = 126665345(0x78cc281, float:2.1179178E-34)
                r1.L(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> Lcb
                com.amazon.aps.iva.o0.b3.t(r1)     // Catch: java.lang.Throwable -> Lcb
                java.lang.Object r2 = r11.b     // Catch: java.lang.Throwable -> Lcb
                r1.M(r2)     // Catch: java.lang.Throwable -> Lcb
                com.amazon.aps.iva.o0.c r2 = r11.e     // Catch: java.lang.Throwable -> Lcb
                java.util.List r12 = r12.x(r2, r1)     // Catch: java.lang.Throwable -> Lcb
                r1.G()     // Catch: java.lang.Throwable -> Lcb
                r1.i()     // Catch: java.lang.Throwable -> Lcb
                r1.j()     // Catch: java.lang.Throwable -> Lcb
                r1.f()
                com.amazon.aps.iva.o0.l1 r1 = new com.amazon.aps.iva.o0.l1
                r1.<init>(r0)
                r2 = r12
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                r5 = 1
                r2 = r2 ^ r5
                if (r2 == 0) goto La8
                int r2 = r12.size()
                r6 = r4
            L5f:
                if (r6 >= r2) goto La4
                java.lang.Object r7 = r12.get(r6)
                com.amazon.aps.iva.o0.c r7 = (com.amazon.aps.iva.o0.c) r7
                boolean r8 = r0.k(r7)
                if (r8 == 0) goto L9c
                int r7 = r0.d(r7)
                int[] r8 = r0.b
                int r8 = com.amazon.aps.iva.ab.x.q(r7, r8)
                int r7 = r7 + r5
                int r9 = r0.c
                if (r7 >= r9) goto L83
                int[] r9 = r0.b
                int r7 = com.amazon.aps.iva.ab.x.h(r7, r9)
                goto L86
            L83:
                java.lang.Object[] r7 = r0.d
                int r7 = r7.length
            L86:
                int r7 = r7 - r8
                if (r7 <= 0) goto L8b
                r7 = r5
                goto L8c
            L8b:
                r7 = r4
            L8c:
                if (r7 == 0) goto L95
                java.lang.Object[] r7 = r0.d
                int r8 = r8 + 0
                r7 = r7[r8]
                goto L96
            L95:
                r7 = r3
            L96:
                boolean r7 = r7 instanceof com.amazon.aps.iva.o0.j2
                if (r7 == 0) goto L9c
                r7 = r5
                goto L9d
            L9c:
                r7 = r4
            L9d:
                if (r7 == 0) goto La1
                r2 = r5
                goto La5
            La1:
                int r6 = r6 + 1
                goto L5f
            La4:
                r2 = r4
            La5:
                if (r2 == 0) goto La8
                r4 = r5
            La8:
                if (r4 == 0) goto Lc3
                com.amazon.aps.iva.o0.b0 r2 = new com.amazon.aps.iva.o0.b0
                com.amazon.aps.iva.o0.o0 r3 = r13.g
                r2.<init>(r3, r11)
                com.amazon.aps.iva.o0.b3 r0 = r0.j()
                com.amazon.aps.iva.o0.j2.a.a(r0, r12, r2)     // Catch: java.lang.Throwable -> Lbe
                com.amazon.aps.iva.kb0.q r12 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> Lbe
                r0.f()
                goto Lc3
            Lbe:
                r11 = move-exception
                r0.f()
                throw r11
            Lc3:
                com.amazon.aps.iva.o0.g0 r12 = r13.b
                r12.i(r11, r1)
                com.amazon.aps.iva.kb0.q r11 = com.amazon.aps.iva.kb0.q.a
                return r11
            Lcb:
                r11 = move-exception
                r1.f()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, c2> {
        public final /* synthetic */ h2<?>[] h;
        public final /* synthetic */ c2 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(h2<?>[] h2VarArr, c2 c2Var) {
            super(2);
            this.h = h2VarArr;
            this.i = c2Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final c2 invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            num.intValue();
            iVar2.s(-948105361);
            e0.b bVar = e0.a;
            h2<?>[] h2VarArr = this.h;
            com.amazon.aps.iva.yb0.j.f(h2VarArr, "values");
            c2 c2Var = this.i;
            com.amazon.aps.iva.yb0.j.f(c2Var, "parentScope");
            iVar2.s(-300354947);
            com.amazon.aps.iva.v0.c cVar = com.amazon.aps.iva.v0.c.e;
            cVar.getClass();
            c.a aVar = new c.a(cVar);
            for (h2<?> h2Var : h2VarArr) {
                iVar2.s(680845765);
                boolean z = h2Var.c;
                k0<?> k0Var = h2Var.a;
                if (!z) {
                    com.amazon.aps.iva.yb0.j.f(k0Var, "key");
                    if (c2Var.containsKey(k0Var)) {
                        iVar2.G();
                    }
                }
                com.amazon.aps.iva.yb0.j.d(k0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                aVar.put(k0Var, k0Var.a(h2Var.b, iVar2));
                iVar2.G();
            }
            com.amazon.aps.iva.v0.c build = aVar.build();
            e0.b bVar2 = e0.a;
            iVar2.G();
            iVar2.G();
            return build;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Object h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Object obj) {
            super(3);
            this.h = obj;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            u2 u2Var2 = u2Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var, "<anonymous parameter 1>", u2Var2, "rememberManager");
            u2Var2.e((v2) this.h);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ Object h;
        public final /* synthetic */ int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Object obj, int i) {
            super(3);
            this.h = obj;
            this.i = i;
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            b3 b3Var2 = b3Var;
            u2 u2Var2 = u2Var;
            com.amazon.aps.iva.d90.a.c(dVar, "<anonymous parameter 0>", b3Var2, "slots", u2Var2, "rememberManager");
            Object obj = this.h;
            if (obj instanceof v2) {
                u2Var2.e((v2) obj);
            }
            Object F = b3Var2.F(this.i, obj);
            if (F instanceof v2) {
                u2Var2.b((v2) F);
            } else if (F instanceof j2) {
                j2 j2Var = (j2) F;
                l2 l2Var = j2Var.b;
                if (l2Var != null) {
                    l2Var.l(j2Var);
                }
                j2Var.b = null;
                j2Var.f = null;
                j2Var.g = null;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
        public static final r h = new r();

        static {
        }

        public r() {
            super(3);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.d<?> dVar, b3 b3Var, u2 u2Var) {
            com.amazon.aps.iva.o0.d<?> dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "applier");
            com.amazon.aps.iva.yb0.j.f(b3Var, "<anonymous parameter 1>");
            com.amazon.aps.iva.yb0.j.f(u2Var, "<anonymous parameter 2>");
            Object e = dVar2.e();
            com.amazon.aps.iva.yb0.j.d(e, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((com.amazon.aps.iva.o0.g) e).e();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public j(com.amazon.aps.iva.o0.a aVar, g0 g0Var, z2 z2Var, HashSet hashSet, ArrayList arrayList, ArrayList arrayList2, o0 o0Var) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "parentContext");
        com.amazon.aps.iva.yb0.j.f(o0Var, "composition");
        this.a = aVar;
        this.b = g0Var;
        this.c = z2Var;
        this.d = hashSet;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = o0Var;
        this.h = new o3(0);
        this.k = new com.amazon.aps.iva.e0.f();
        this.m = new com.amazon.aps.iva.e0.f();
        this.r = new ArrayList();
        this.s = new com.amazon.aps.iva.e0.f();
        this.t = com.amazon.aps.iva.v0.c.e;
        this.u = new com.amazon.aps.iva.p0.e(new SparseArray(10));
        this.w = new com.amazon.aps.iva.e0.f();
        this.y = -1;
        this.B = new com.amazon.aps.iva.o0.m(this);
        this.C = new o3(0);
        y2 g2 = z2Var.g();
        g2.c();
        this.E = g2;
        z2 z2Var2 = new z2();
        this.F = z2Var2;
        b3 j = z2Var2.j();
        j.f();
        this.G = j;
        y2 g3 = this.F.g();
        try {
            com.amazon.aps.iva.o0.c a2 = g3.a(0);
            g3.c();
            this.K = a2;
            this.L = new ArrayList();
            this.P = new o3(0);
            this.S = true;
            this.T = new com.amazon.aps.iva.e0.f();
            this.U = new o3(0);
            this.V = -1;
            this.W = -1;
            this.X = -1;
        } catch (Throwable th) {
            g3.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x000c, B:5:0x0012, B:6:0x0017, B:14:0x002e, B:15:0x003b, B:9:0x001d), top: B:21:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(com.amazon.aps.iva.o0.j r6, com.amazon.aps.iva.o0.k1 r7, com.amazon.aps.iva.o0.c2 r8, java.lang.Object r9) {
        /*
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r6.y(r0, r7)
            r6.H(r9)
            int r1 = r6.N
            r2 = 0
            r6.N = r0     // Catch: java.lang.Throwable -> L62
            boolean r0 = r6.M     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L17
            com.amazon.aps.iva.o0.b3 r0 = r6.G     // Catch: java.lang.Throwable -> L62
            com.amazon.aps.iva.o0.b3.t(r0)     // Catch: java.lang.Throwable -> L62
        L17:
            boolean r0 = r6.M     // Catch: java.lang.Throwable -> L62
            r3 = 1
            if (r0 == 0) goto L1d
            goto L2b
        L1d:
            com.amazon.aps.iva.o0.y2 r0 = r6.E     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.e()     // Catch: java.lang.Throwable -> L62
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r0, r8)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r0 == 0) goto L3b
            com.amazon.aps.iva.p0.e r4 = r6.u     // Catch: java.lang.Throwable -> L62
            com.amazon.aps.iva.o0.y2 r5 = r6.E     // Catch: java.lang.Throwable -> L62
            int r5 = r5.g     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r4.b     // Catch: java.lang.Throwable -> L62
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L62
            r4.put(r5, r8)     // Catch: java.lang.Throwable -> L62
        L3b:
            com.amazon.aps.iva.o0.u1 r4 = com.amazon.aps.iva.o0.e0.h     // Catch: java.lang.Throwable -> L62
            r5 = 202(0xca, float:2.83E-43)
            r6.w0(r4, r5, r2, r8)     // Catch: java.lang.Throwable -> L62
            boolean r8 = r6.M     // Catch: java.lang.Throwable -> L62
            boolean r8 = r6.v     // Catch: java.lang.Throwable -> L62
            r6.v = r0     // Catch: java.lang.Throwable -> L62
            com.amazon.aps.iva.o0.x r0 = new com.amazon.aps.iva.o0.x     // Catch: java.lang.Throwable -> L62
            r0.<init>(r7, r9)     // Catch: java.lang.Throwable -> L62
            r7 = 316014703(0x12d6006f, float:1.3505406E-27)
            com.amazon.aps.iva.v0.a r7 = com.amazon.aps.iva.v0.b.c(r7, r0, r3)     // Catch: java.lang.Throwable -> L62
            com.amazon.aps.iva.ab.x.U(r6, r7)     // Catch: java.lang.Throwable -> L62
            r6.v = r8     // Catch: java.lang.Throwable -> L62
            r6.U(r2)
            r6.N = r1
            r6.U(r2)
            return
        L62:
            r7 = move-exception
            r6.U(r2)
            r6.N = r1
            r6.U(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.K(com.amazon.aps.iva.o0.j, com.amazon.aps.iva.o0.k1, com.amazon.aps.iva.o0.c2, java.lang.Object):void");
    }

    public static final void d0(b3 b3Var, com.amazon.aps.iva.o0.d<Object> dVar, int i2) {
        boolean z;
        while (true) {
            int i3 = b3Var.s;
            if ((i2 > i3 && i2 < b3Var.g) || (i3 == 0 && i2 == 0)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                b3Var.H();
                if (b3Var.s(b3Var.s)) {
                    dVar.h();
                }
                b3Var.i();
            } else {
                return;
            }
        }
    }

    public static final int t0(j jVar, int i2, boolean z, int i3) {
        boolean z2;
        boolean z3;
        int i4;
        a aVar;
        boolean z4;
        y2 y2Var = jVar.E;
        int[] iArr = y2Var.b;
        int i5 = i2 * 5;
        int i6 = 1;
        if ((iArr[i5 + 1] & 134217728) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i7 = iArr[i5];
            Object l2 = y2Var.l(i2, iArr);
            g0 g0Var = jVar.b;
            if (i7 == 126665345 && (l2 instanceof k1)) {
                k1 k1Var = (k1) l2;
                Object g2 = jVar.E.g(i2, 0);
                com.amazon.aps.iva.o0.c a2 = jVar.E.a(i2);
                int h2 = jVar.E.h(i2) + i2;
                ArrayList arrayList = jVar.r;
                e0.b bVar = e0.a;
                ArrayList arrayList2 = new ArrayList();
                int d2 = e0.d(i2, arrayList);
                if (d2 < 0) {
                    d2 = -(d2 + 1);
                }
                while (d2 < arrayList.size()) {
                    a1 a1Var = (a1) arrayList.get(d2);
                    if (a1Var.b >= h2) {
                        break;
                    }
                    arrayList2.add(a1Var);
                    d2++;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    a1 a1Var2 = (a1) arrayList2.get(i8);
                    arrayList3.add(new com.amazon.aps.iva.kb0.j(a1Var2.a, a1Var2.c));
                }
                m1 m1Var = new m1(k1Var, g2, jVar.g, jVar.c, a2, arrayList3, jVar.Q(i2));
                g0Var.b(m1Var);
                jVar.o0();
                jVar.m0(new n(jVar, m1Var));
                if (z) {
                    jVar.g0();
                    jVar.i0();
                    jVar.f0();
                    if (!jVar.E.i(i2)) {
                        i6 = jVar.E.k(i2);
                    }
                    if (i6 <= 0) {
                        return 0;
                    }
                    jVar.n0(i3, i6);
                    return 0;
                }
                return jVar.E.k(i2);
            } else if (i7 == 206 && com.amazon.aps.iva.yb0.j.a(l2, e0.k)) {
                Object g3 = jVar.E.g(i2, 0);
                if (g3 instanceof a) {
                    aVar = (a) g3;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (j jVar2 : aVar.b.d) {
                        z2 z2Var = jVar2.c;
                        if (z2Var.c > 0 && com.amazon.aps.iva.ab.x.g(0, z2Var.b)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            ArrayList arrayList4 = new ArrayList();
                            jVar2.J = arrayList4;
                            y2 g4 = z2Var.g();
                            try {
                                jVar2.E = g4;
                                List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list = jVar2.e;
                                jVar2.e = arrayList4;
                                jVar2.s0(0);
                                jVar2.i0();
                                if (jVar2.R) {
                                    jVar2.m0(e0.b);
                                    if (jVar2.R) {
                                        jVar2.p0(false, e0.c);
                                        jVar2.R = false;
                                    }
                                }
                                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                                jVar2.e = list;
                            } finally {
                                g4.c();
                            }
                        }
                        g0Var.m(jVar2.g);
                    }
                }
                return jVar.E.k(i2);
            } else {
                return jVar.E.k(i2);
            }
        } else if (com.amazon.aps.iva.ab.x.g(i2, iArr)) {
            int h3 = jVar.E.h(i2) + i2;
            int i9 = i2 + 1;
            int i10 = 0;
            while (i9 < h3) {
                boolean i11 = jVar.E.i(i9);
                if (i11) {
                    jVar.g0();
                    jVar.P.c(jVar.E.j(i9));
                }
                if (!i11 && !z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i11) {
                    i4 = 0;
                } else {
                    i4 = i3 + i10;
                }
                i10 += t0(jVar, i9, z3, i4);
                if (i11) {
                    jVar.g0();
                    jVar.q0();
                }
                i9 += jVar.E.h(i9);
            }
            return i10;
        } else {
            return jVar.E.k(i2);
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void A() {
        boolean z;
        if (this.l == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 a0 = a0();
            if (a0 != null) {
                a0.a |= 16;
            }
            if (this.r.isEmpty()) {
                v0();
                return;
            } else {
                l0();
                return;
            }
        }
        e0.c("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }

    public final void A0(h2<?>[] h2VarArr) {
        c2 J0;
        boolean a2;
        com.amazon.aps.iva.yb0.j.f(h2VarArr, "values");
        c2 P = P();
        y0(MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, e0.g);
        y0(MediaError.DetailedErrorCode.MEDIAKEYS_WEBCRYPTO, e0.i);
        o oVar = new o(h2VarArr, P);
        com.amazon.aps.iva.yb0.h0.e(2, oVar);
        c2 c2Var = (c2) oVar.invoke(this, 1);
        U(false);
        if (this.M) {
            J0 = J0(P, c2Var);
            this.H = true;
            a2 = false;
        } else {
            y2 y2Var = this.E;
            Object g2 = y2Var.g(y2Var.g, 0);
            com.amazon.aps.iva.yb0.j.d(g2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            c2 c2Var2 = (c2) g2;
            y2 y2Var2 = this.E;
            Object g3 = y2Var2.g(y2Var2.g, 1);
            com.amazon.aps.iva.yb0.j.d(g3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            c2 c2Var3 = (c2) g3;
            if (h() && com.amazon.aps.iva.yb0.j.a(c2Var3, c2Var)) {
                this.l = this.E.o() + this.l;
                a2 = false;
                J0 = c2Var2;
            } else {
                J0 = J0(P, c2Var);
                a2 = true ^ com.amazon.aps.iva.yb0.j.a(J0, c2Var2);
            }
        }
        if (a2 && !this.M) {
            ((SparseArray) this.u.b).put(this.E.g, J0);
        }
        this.w.e(this.v ? 1 : 0);
        this.v = a2;
        this.I = J0;
        w0(e0.h, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 0, J0);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final <V, T> void B(V v, com.amazon.aps.iva.xb0.p<? super T, ? super V, com.amazon.aps.iva.kb0.q> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "block");
        c cVar = new c(pVar, v);
        if (this.M) {
            this.L.add(cVar);
            return;
        }
        i0();
        f0();
        m0(cVar);
    }

    public final void B0(Object obj, boolean z) {
        if (z) {
            y2 y2Var = this.E;
            if (y2Var.j <= 0) {
                if (com.amazon.aps.iva.ab.x.m(y2Var.g, y2Var.b)) {
                    y2Var.q();
                    return;
                }
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            return;
        }
        if (obj != null && this.E.e() != obj) {
            p0(false, new d0(obj));
        }
        this.E.q();
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void C(i2 i2Var) {
        j2 j2Var;
        if (i2Var instanceof j2) {
            j2Var = (j2) i2Var;
        } else {
            j2Var = null;
        }
        if (j2Var != null) {
            j2Var.a |= 1;
        }
    }

    public final void C0() {
        z2 z2Var = this.c;
        this.E = z2Var.g();
        w0(null, 100, 0, null);
        g0 g0Var = this.b;
        g0Var.n();
        this.t = g0Var.e();
        boolean z = this.v;
        e0.b bVar = e0.a;
        this.w.e(z ? 1 : 0);
        this.v = H(this.t);
        this.I = null;
        if (!this.p) {
            this.p = g0Var.d();
        }
        Set<Object> set = (Set) com.amazon.aps.iva.cq.b.f0(this.t, com.amazon.aps.iva.z0.a.a);
        if (set != null) {
            set.add(z2Var);
            g0Var.k(set);
        }
        w0(null, g0Var.f(), 0, null);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final int D() {
        return this.N;
    }

    public final boolean D0(j2 j2Var, Object obj) {
        com.amazon.aps.iva.yb0.j.f(j2Var, "scope");
        com.amazon.aps.iva.o0.c cVar = j2Var.c;
        if (cVar == null) {
            return false;
        }
        z2 z2Var = this.E.a;
        com.amazon.aps.iva.yb0.j.f(z2Var, "slots");
        int d2 = z2Var.d(cVar);
        if (!this.D || d2 < this.E.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int d3 = e0.d(d2, arrayList);
        com.amazon.aps.iva.p0.c cVar2 = null;
        if (d3 < 0) {
            int i2 = -(d3 + 1);
            if (obj != null) {
                cVar2 = new com.amazon.aps.iva.p0.c();
                cVar2.add(obj);
            }
            arrayList.add(i2, new a1(j2Var, d2, cVar2));
        } else if (obj == null) {
            ((a1) arrayList.get(d3)).c = null;
        } else {
            com.amazon.aps.iva.p0.c<Object> cVar3 = ((a1) arrayList.get(d3)).c;
            if (cVar3 != null) {
                cVar3.add(obj);
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final b E() {
        a aVar;
        y0(206, e0.k);
        if (this.M) {
            b3.t(this.G);
        }
        Object e0 = e0();
        if (e0 instanceof a) {
            aVar = (a) e0;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new a(new b(this.N, this.p));
            K0(aVar);
        }
        c2 P = P();
        b bVar = aVar.b;
        bVar.getClass();
        com.amazon.aps.iva.yb0.j.f(P, "scope");
        bVar.e.setValue(P);
        U(false);
        return aVar.b;
    }

    public final void E0(int i2, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i2 == 207 && !com.amazon.aps.iva.yb0.j.a(obj2, i.a.a)) {
                this.N = obj2.hashCode() ^ Integer.rotateLeft(this.N, 3);
            } else {
                this.N = i2 ^ Integer.rotateLeft(this.N, 3);
            }
        } else if (obj instanceof Enum) {
            this.N = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.N, 3);
        } else {
            this.N = obj.hashCode() ^ Integer.rotateLeft(this.N, 3);
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void F() {
        U(false);
    }

    public final void F0(int i2, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i2 == 207 && !com.amazon.aps.iva.yb0.j.a(obj2, i.a.a)) {
                G0(obj2.hashCode());
            } else {
                G0(i2);
            }
        } else if (obj instanceof Enum) {
            G0(((Enum) obj).ordinal());
        } else {
            G0(obj.hashCode());
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void G() {
        U(false);
    }

    public final void G0(int i2) {
        this.N = Integer.rotateRight(Integer.hashCode(i2) ^ this.N, 3);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean H(Object obj) {
        if (!com.amazon.aps.iva.yb0.j.a(e0(), obj)) {
            K0(obj);
            return true;
        }
        return false;
    }

    public final void H0(int i2, int i3) {
        if (L0(i2) != i3) {
            if (i2 < 0) {
                HashMap<Integer, Integer> hashMap = this.o;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.o = hashMap;
                }
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i4 = this.E.c;
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, 0, i4, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void I(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "effect");
        m0(new l(aVar));
    }

    public final void I0(int i2, int i3) {
        int L0 = L0(i2);
        if (L0 != i3) {
            int i4 = i3 - L0;
            o3 o3Var = this.h;
            int size = ((ArrayList) o3Var.a).size() - 1;
            while (i2 != -1) {
                int L02 = L0(i2) + i4;
                H0(i2, L02);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        b2 b2Var = (b2) ((ArrayList) o3Var.a).get(i5);
                        if (b2Var != null && b2Var.b(i2, L02)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.E.i;
                } else if (!this.E.i(i2)) {
                    i2 = this.E.m(i2);
                } else {
                    return;
                }
            }
        }
    }

    public final void J() {
        L();
        ((ArrayList) this.h.a).clear();
        this.k.a = 0;
        this.m.a = 0;
        this.s.a = 0;
        this.w.a = 0;
        ((SparseArray) this.u.b).clear();
        y2 y2Var = this.E;
        if (!y2Var.f) {
            y2Var.c();
        }
        b3 b3Var = this.G;
        if (!b3Var.t) {
            b3Var.f();
        }
        this.L.clear();
        O();
        this.N = 0;
        this.z = 0;
        this.q = false;
        this.M = false;
        this.x = false;
        this.D = false;
        this.y = -1;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.amazon.aps.iva.v0.c$a, com.amazon.aps.iva.s0.f] */
    public final c2 J0(c2 c2Var, c2 c2Var2) {
        ?? a2 = c2Var.a();
        a2.putAll(c2Var2);
        com.amazon.aps.iva.v0.c build = a2.build();
        y0(204, e0.j);
        H(build);
        H(c2Var2);
        U(false);
        return build;
    }

    public final void K0(Object obj) {
        boolean z = this.M;
        Set<v2> set = this.d;
        if (z) {
            this.G.M(obj);
            if (obj instanceof v2) {
                m0(new p(obj));
                set.add(obj);
                return;
            }
            return;
        }
        y2 y2Var = this.E;
        int q2 = (y2Var.k - com.amazon.aps.iva.ab.x.q(y2Var.i, y2Var.b)) - 1;
        if (obj instanceof v2) {
            set.add(obj);
        }
        p0(true, new q(obj, q2));
    }

    public final void L() {
        this.i = null;
        this.j = 0;
        this.l = 0;
        this.Q = 0;
        this.N = 0;
        this.q = false;
        this.R = false;
        this.T.a = 0;
        ((ArrayList) this.C.a).clear();
        this.n = null;
        this.o = null;
    }

    public final int L0(int i2) {
        int i3;
        Integer num;
        if (i2 < 0) {
            HashMap<Integer, Integer> hashMap = this.o;
            if (hashMap != null && (num = hashMap.get(Integer.valueOf(i2))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.n;
        if (iArr != null && (i3 = iArr[i2]) >= 0) {
            return i3;
        }
        return this.E.k(i2);
    }

    public final void M(com.amazon.aps.iva.p0.b bVar, com.amazon.aps.iva.v0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "invalidationsRequested");
        if (this.e.isEmpty()) {
            S(bVar, aVar);
        } else {
            e0.c("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    public final int N(int i2, int i3, int i4) {
        boolean z;
        Object b2;
        if (i2 != i3) {
            y2 y2Var = this.E;
            int[] iArr = y2Var.b;
            int i5 = i2 * 5;
            int i6 = 0;
            if ((iArr[i5 + 1] & 536870912) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object l2 = y2Var.l(i2, iArr);
                if (l2 != null) {
                    i6 = l2 instanceof Enum ? ((Enum) l2).ordinal() : l2 instanceof k1 ? 126665345 : l2.hashCode();
                }
            } else {
                i6 = iArr[i5];
                if (i6 == 207 && (b2 = y2Var.b(i2, iArr)) != null && !com.amazon.aps.iva.yb0.j.a(b2, i.a.a)) {
                    i6 = b2.hashCode();
                }
            }
            if (i6 == 126665345) {
                return i6;
            }
            return Integer.rotateLeft(N(this.E.m(i2), i3, i4), 3) ^ i6;
        }
        return i4;
    }

    public final void O() {
        e0.f(this.G.t);
        z2 z2Var = new z2();
        this.F = z2Var;
        b3 j = z2Var.j();
        j.f();
        this.G = j;
    }

    public final c2 P() {
        c2 c2Var = this.I;
        if (c2Var != null) {
            return c2Var;
        }
        return Q(this.E.i);
    }

    public final c2 Q(int i2) {
        boolean z;
        Object obj;
        Object obj2;
        if (this.M && this.H) {
            int i3 = this.G.s;
            while (i3 > 0) {
                b3 b3Var = this.G;
                if (b3Var.b[b3Var.n(i3) * 5] == 202) {
                    b3 b3Var2 = this.G;
                    int n2 = b3Var2.n(i3);
                    int[] iArr = b3Var2.b;
                    int i4 = n2 * 5;
                    int i5 = iArr[i4 + 1];
                    if ((536870912 & i5) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        obj = b3Var2.c[com.amazon.aps.iva.ab.x.F(i5 >> 30) + iArr[i4 + 4]];
                    } else {
                        obj = null;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(obj, e0.h)) {
                        b3 b3Var3 = this.G;
                        int n3 = b3Var3.n(i3);
                        if (com.amazon.aps.iva.ab.x.l(n3, b3Var3.b)) {
                            obj2 = b3Var3.c[b3Var3.d(n3, b3Var3.b)];
                        } else {
                            obj2 = i.a.a;
                        }
                        com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        c2 c2Var = (c2) obj2;
                        this.I = c2Var;
                        return c2Var;
                    }
                }
                i3 = this.G.z(i3);
            }
        }
        if (this.E.c > 0) {
            while (i2 > 0) {
                y2 y2Var = this.E;
                int[] iArr2 = y2Var.b;
                if (iArr2[i2 * 5] == 202 && com.amazon.aps.iva.yb0.j.a(y2Var.l(i2, iArr2), e0.h)) {
                    c2 c2Var2 = (c2) ((SparseArray) this.u.b).get(i2);
                    if (c2Var2 == null) {
                        y2 y2Var2 = this.E;
                        Object b2 = y2Var2.b(i2, y2Var2.b);
                        com.amazon.aps.iva.yb0.j.d(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        c2Var2 = (c2) b2;
                    }
                    this.I = c2Var2;
                    return c2Var2;
                }
                i2 = this.E.m(i2);
            }
        }
        c2 c2Var3 = this.t;
        this.I = c2Var3;
        return c2Var3;
    }

    public final void R() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.b.o(this);
            ((ArrayList) this.C.a).clear();
            this.r.clear();
            this.e.clear();
            ((SparseArray) this.u.b).clear();
            this.a.clear();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r4.size() <= 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        com.amazon.aps.iva.lb0.s.a0(r4, new com.amazon.aps.iva.o0.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        r9.j = 0;
        r9.D = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        C0();
        r10 = e0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r10 == r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r11 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        K0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        r0 = r9.B;
        r3 = com.amazon.aps.iva.cq.b.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        r3.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
        y0(com.google.android.gms.cast.MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, com.amazon.aps.iva.o0.e0.f);
        com.amazon.aps.iva.ab.x.U(r9, r11);
        U(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r9.v == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        if (r10 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
        if (com.amazon.aps.iva.yb0.j.a(r10, com.amazon.aps.iva.o0.i.a.a) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        y0(com.google.android.gms.cast.MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, com.amazon.aps.iva.o0.e0.f);
        com.amazon.aps.iva.yb0.h0.e(2, r10);
        com.amazon.aps.iva.ab.x.U(r9, (com.amazon.aps.iva.xb0.p) r10);
        U(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
        u0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
        r3.l(r3.d - 1);
        Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r9.D = false;
        r4.clear();
        r10 = com.amazon.aps.iva.kb0.q.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(com.amazon.aps.iva.p0.b r10, com.amazon.aps.iva.v0.a r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.S(com.amazon.aps.iva.p0.b, com.amazon.aps.iva.v0.a):void");
    }

    public final void T(int i2, int i3) {
        if (i2 > 0 && i2 != i3) {
            T(this.E.m(i2), i3);
            if (this.E.i(i2)) {
                this.P.c(this.E.j(i2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    public final void U(boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        ?? r4;
        boolean z7;
        HashSet hashSet;
        b2 b2Var;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        Object obj2;
        if (this.M) {
            b3 b3Var = this.G;
            int i7 = b3Var.s;
            int i8 = b3Var.b[b3Var.n(i7) * 5];
            b3 b3Var2 = this.G;
            int n2 = b3Var2.n(i7);
            int[] iArr = b3Var2.b;
            int i9 = n2 * 5;
            int i10 = iArr[i9 + 1];
            if ((536870912 & i10) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                obj = b3Var2.c[com.amazon.aps.iva.ab.x.F(i10 >> 30) + iArr[i9 + 4]];
            } else {
                obj = null;
            }
            b3 b3Var3 = this.G;
            int n3 = b3Var3.n(i7);
            if (com.amazon.aps.iva.ab.x.l(n3, b3Var3.b)) {
                obj2 = b3Var3.c[b3Var3.d(n3, b3Var3.b)];
            } else {
                obj2 = i.a.a;
            }
            F0(i8, obj, obj2);
        } else {
            y2 y2Var = this.E;
            int i11 = y2Var.i;
            int[] iArr2 = y2Var.b;
            int i12 = iArr2[i11 * 5];
            Object l2 = y2Var.l(i11, iArr2);
            y2 y2Var2 = this.E;
            F0(i12, l2, y2Var2.b(i11, y2Var2.b));
        }
        int i13 = this.l;
        b2 b2Var2 = this.i;
        ArrayList arrayList2 = this.r;
        if (b2Var2 != null) {
            List<d1> list = b2Var2.a;
            if (list.size() > 0) {
                ArrayList arrayList3 = b2Var2.d;
                com.amazon.aps.iva.yb0.j.f(arrayList3, "<this>");
                HashSet hashSet2 = new HashSet(arrayList3.size());
                int size = arrayList3.size();
                for (int i14 = 0; i14 < size; i14++) {
                    hashSet2.add(arrayList3.get(i14));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList3.size();
                int size3 = list.size();
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i15 < size3) {
                    d1 d1Var = list.get(i15);
                    boolean contains = hashSet2.contains(d1Var);
                    int i18 = b2Var2.b;
                    if (!contains) {
                        n0(b2Var2.a(d1Var) + i18, d1Var.d);
                        int i19 = d1Var.c;
                        b2Var2.b(i19, 0);
                        y2 y2Var3 = this.E;
                        hashSet = hashSet2;
                        this.Q = i19 - (y2Var3.g - this.Q);
                        y2Var3.n(i19);
                        s0(this.E.g);
                        e0.b bVar = e0.a;
                        h0(false);
                        o0();
                        m0(bVar);
                        int i20 = this.Q;
                        y2 y2Var4 = this.E;
                        this.Q = com.amazon.aps.iva.ab.x.k(y2Var4.g, y2Var4.b) + i20;
                        this.E.o();
                        e0.a(i19, this.E.h(i19) + i19, arrayList2);
                    } else {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(d1Var)) {
                            if (i16 < size2) {
                                d1 d1Var2 = (d1) arrayList3.get(i16);
                                HashMap<Integer, y0> hashMap = b2Var2.e;
                                if (d1Var2 != d1Var) {
                                    int a2 = b2Var2.a(d1Var2);
                                    linkedHashSet2.add(d1Var2);
                                    if (a2 != i17) {
                                        b2Var = b2Var2;
                                        y0 y0Var = hashMap.get(Integer.valueOf(d1Var2.c));
                                        if (y0Var != null) {
                                            i6 = y0Var.c;
                                        } else {
                                            i6 = d1Var2.d;
                                        }
                                        arrayList = arrayList3;
                                        int i21 = a2 + i18;
                                        int i22 = i18 + i17;
                                        if (i6 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i23 = this.Y;
                                            if (i23 > 0) {
                                                i3 = size2;
                                                i4 = size3;
                                                if (this.W == i21 - i23 && this.X == i22 - i23) {
                                                    this.Y = i23 + i6;
                                                }
                                            } else {
                                                i3 = size2;
                                                i4 = size3;
                                            }
                                            g0();
                                            this.W = i21;
                                            this.X = i22;
                                            this.Y = i6;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i3 = size2;
                                            i4 = size3;
                                        }
                                        if (a2 > i17) {
                                            Collection<y0> values = hashMap.values();
                                            com.amazon.aps.iva.yb0.j.e(values, "groupInfos.values");
                                            for (y0 y0Var2 : values) {
                                                int i24 = y0Var2.b;
                                                if (a2 <= i24 && i24 < a2 + i6) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                if (z10) {
                                                    y0Var2.b = (i24 - a2) + i17;
                                                } else {
                                                    if (i17 <= i24 && i24 < a2) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (z11) {
                                                        y0Var2.b = i24 + i6;
                                                    }
                                                }
                                            }
                                        } else if (i17 > a2) {
                                            Collection<y0> values2 = hashMap.values();
                                            com.amazon.aps.iva.yb0.j.e(values2, "groupInfos.values");
                                            for (y0 y0Var3 : values2) {
                                                int i25 = y0Var3.b;
                                                if (a2 <= i25 && i25 < a2 + i6) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    y0Var3.b = (i25 - a2) + i17;
                                                } else {
                                                    if (a2 + 1 <= i25 && i25 < i17) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (z9) {
                                                        y0Var3.b = i25 - i6;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b2Var = b2Var2;
                                        arrayList = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i3 = size2;
                                        i4 = size3;
                                    }
                                } else {
                                    b2Var = b2Var2;
                                    arrayList = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i3 = size2;
                                    i4 = size3;
                                    i15++;
                                }
                                i16++;
                                com.amazon.aps.iva.yb0.j.f(d1Var2, "keyInfo");
                                y0 y0Var4 = hashMap.get(Integer.valueOf(d1Var2.c));
                                if (y0Var4 != null) {
                                    i5 = y0Var4.c;
                                } else {
                                    i5 = d1Var2.d;
                                }
                                i17 += i5;
                                hashSet2 = hashSet;
                                b2Var2 = b2Var;
                                arrayList3 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i3;
                                size3 = i4;
                            } else {
                                hashSet2 = hashSet;
                            }
                        }
                    }
                    i15++;
                    hashSet2 = hashSet;
                }
                g0();
                if (list.size() > 0) {
                    y2 y2Var5 = this.E;
                    this.Q = y2Var5.h - (y2Var5.g - this.Q);
                    y2Var5.p();
                }
            }
        }
        int i26 = this.j;
        while (true) {
            y2 y2Var6 = this.E;
            if (y2Var6.j > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && y2Var6.g != y2Var6.h) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                break;
            }
            int i27 = y2Var6.g;
            s0(i27);
            e0.b bVar2 = e0.a;
            h0(false);
            o0();
            m0(bVar2);
            int i28 = this.Q;
            y2 y2Var7 = this.E;
            this.Q = com.amazon.aps.iva.ab.x.k(y2Var7.g, y2Var7.b) + i28;
            n0(i26, this.E.o());
            e0.a(i27, this.E.g, arrayList2);
        }
        boolean z13 = this.M;
        int i29 = -1;
        if (z13) {
            ArrayList arrayList4 = this.L;
            if (z) {
                arrayList4.add(this.U.b());
                i13 = 1;
            }
            y2 y2Var8 = this.E;
            int i30 = y2Var8.j;
            if (i30 > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                y2Var8.j = i30 - 1;
                b3 b3Var4 = this.G;
                int i31 = b3Var4.s;
                b3Var4.i();
                if (this.E.j > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    int i32 = (-2) - i31;
                    this.G.j();
                    this.G.f();
                    com.amazon.aps.iva.o0.c cVar = this.K;
                    if (arrayList4.isEmpty()) {
                        z zVar = new z(this.F, cVar);
                        h0(false);
                        o0();
                        m0(zVar);
                        r4 = 0;
                    } else {
                        ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(arrayList4);
                        arrayList4.clear();
                        i0();
                        f0();
                        a0 a0Var = new a0(this.F, cVar, Z0);
                        r4 = 0;
                        h0(false);
                        o0();
                        m0(a0Var);
                    }
                    this.M = r4;
                    if (this.c.c == 0) {
                        z7 = true;
                    } else {
                        z7 = r4;
                    }
                    if (!z7) {
                        H0(i32, r4);
                        I0(i32, i13);
                    }
                }
            } else {
                throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
        } else {
            if (z) {
                q0();
            }
            int i33 = this.E.i;
            com.amazon.aps.iva.e0.f fVar = this.T;
            int i34 = fVar.a;
            if (i34 > 0) {
                i2 = ((int[]) fVar.b)[i34 - 1];
            } else {
                i2 = -1;
            }
            if (i2 <= i33) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (i34 > 0) {
                    i29 = ((int[]) fVar.b)[i34 - 1];
                }
                if (i29 == i33) {
                    fVar.d();
                    p0(false, e0.c);
                }
                int i35 = this.E.i;
                if (i13 != L0(i35)) {
                    I0(i35, i13);
                }
                if (z) {
                    i13 = 1;
                }
                this.E.d();
                g0();
            } else {
                e0.c("Missed recording an endGroup".toString());
                throw null;
            }
        }
        b2 b2Var3 = (b2) this.h.b();
        if (b2Var3 != null && !z13) {
            b2Var3.c++;
        }
        this.i = b2Var3;
        this.j = this.k.d() + i13;
        this.l = this.m.d() + i13;
    }

    public final void V() {
        boolean z = false;
        U(false);
        j2 a0 = a0();
        if (a0 != null) {
            int i2 = a0.a;
            if ((i2 & 1) != 0) {
                z = true;
            }
            if (z) {
                a0.a = i2 | 2;
            }
        }
    }

    public final void W() {
        boolean z = false;
        U(false);
        U(false);
        int d2 = this.w.d();
        e0.b bVar = e0.a;
        if (d2 != 0) {
            z = true;
        }
        this.v = z;
        this.I = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.o0.j2 X() {
        /*
            r12 = this;
            com.amazon.aps.iva.o0.o3 r0 = r12.C
            java.lang.Object r1 = r0.a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L16
            java.lang.Object r0 = r0.b()
            com.amazon.aps.iva.o0.j2 r0 = (com.amazon.aps.iva.o0.j2) r0
            goto L17
        L16:
            r0 = r3
        L17:
            if (r0 != 0) goto L1a
            goto L20
        L1a:
            int r1 = r0.a
            r1 = r1 & (-9)
            r0.a = r1
        L20:
            r1 = 0
            if (r0 == 0) goto L66
            int r4 = r12.A
            com.amazon.aps.iva.p0.a r5 = r0.f
            if (r5 == 0) goto L5b
            int r6 = r0.a
            r6 = r6 & 16
            if (r6 == 0) goto L31
            r6 = r2
            goto L32
        L31:
            r6 = r1
        L32:
            if (r6 != 0) goto L5b
            java.lang.Object[] r6 = r5.b
            int[] r7 = r5.c
            int r8 = r5.a
            r9 = r1
        L3b:
            if (r9 >= r8) goto L52
            r10 = r6[r9]
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Any"
            com.amazon.aps.iva.yb0.j.d(r10, r11)
            r10 = r7[r9]
            if (r10 == r4) goto L4a
            r10 = r2
            goto L4b
        L4a:
            r10 = r1
        L4b:
            if (r10 == 0) goto L4f
            r6 = r2
            goto L53
        L4f:
            int r9 = r9 + 1
            goto L3b
        L52:
            r6 = r1
        L53:
            if (r6 == 0) goto L5b
            com.amazon.aps.iva.o0.k2 r6 = new com.amazon.aps.iva.o0.k2
            r6.<init>(r0, r4, r5)
            goto L5c
        L5b:
            r6 = r3
        L5c:
            if (r6 == 0) goto L66
            com.amazon.aps.iva.o0.o r4 = new com.amazon.aps.iva.o0.o
            r4.<init>(r6, r12)
            r12.m0(r4)
        L66:
            if (r0 == 0) goto La0
            int r4 = r0.a
            r5 = r4 & 16
            if (r5 == 0) goto L70
            r5 = r2
            goto L71
        L70:
            r5 = r1
        L71:
            if (r5 != 0) goto La0
            r4 = r4 & r2
            if (r4 == 0) goto L77
            goto L78
        L77:
            r2 = r1
        L78:
            if (r2 != 0) goto L7e
            boolean r2 = r12.p
            if (r2 == 0) goto La0
        L7e:
            com.amazon.aps.iva.o0.c r2 = r0.c
            if (r2 != 0) goto L99
            boolean r2 = r12.M
            if (r2 == 0) goto L8f
            com.amazon.aps.iva.o0.b3 r2 = r12.G
            int r3 = r2.s
            com.amazon.aps.iva.o0.c r2 = r2.b(r3)
            goto L97
        L8f:
            com.amazon.aps.iva.o0.y2 r2 = r12.E
            int r3 = r2.i
            com.amazon.aps.iva.o0.c r2 = r2.a(r3)
        L97:
            r0.c = r2
        L99:
            int r2 = r0.a
            r2 = r2 & (-5)
            r0.a = r2
            r3 = r0
        La0:
            r12.U(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.X():com.amazon.aps.iva.o0.j2");
    }

    public final void Y() {
        boolean z = false;
        U(false);
        this.b.c();
        U(false);
        if (this.R) {
            p0(false, e0.c);
            this.R = false;
        }
        i0();
        if (((ArrayList) this.h.a).isEmpty()) {
            if (this.T.a == 0) {
                z = true;
            }
            if (z) {
                L();
                this.E.c();
                return;
            }
            e0.c("Missed recording an endGroup()".toString());
            throw null;
        }
        e0.c("Start/end imbalance".toString());
        throw null;
    }

    public final void Z(boolean z, b2 b2Var) {
        this.h.c(this.i);
        this.i = b2Var;
        this.k.e(this.j);
        if (z) {
            this.j = 0;
        }
        this.m.e(this.l);
        this.l = 0;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean a(boolean z) {
        Object e0 = e0();
        if ((e0 instanceof Boolean) && z == ((Boolean) e0).booleanValue()) {
            return false;
        }
        K0(Boolean.valueOf(z));
        return true;
    }

    public final j2 a0() {
        if (this.z == 0) {
            o3 o3Var = this.C;
            if (!((ArrayList) o3Var.a).isEmpty()) {
                Object obj = o3Var.a;
                return (j2) ((ArrayList) obj).get(((ArrayList) obj).size() - 1);
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean b(float f2) {
        boolean z;
        Object e0 = e0();
        if (e0 instanceof Float) {
            if (f2 == ((Number) e0).floatValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        K0(Float.valueOf(f2));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0() {
        /*
            r3 = this;
            boolean r0 = r3.v
            r1 = 1
            if (r0 != 0) goto L1e
            com.amazon.aps.iva.o0.j2 r0 = r3.a0()
            r2 = 0
            if (r0 == 0) goto L19
            int r0 = r0.a
            r0 = r0 & 4
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 != r1) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.b0():boolean");
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean c(int i2) {
        Object e0 = e0();
        if ((e0 instanceof Integer) && i2 == ((Number) e0).intValue()) {
            return false;
        }
        K0(Integer.valueOf(i2));
        return true;
    }

    public final void c0(ArrayList arrayList) {
        z2 z2Var;
        com.amazon.aps.iva.o0.c cVar;
        int i2;
        List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list;
        z2 z2Var2;
        z2 z2Var3;
        z2 z2Var4 = this.c;
        List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list2 = this.f;
        List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list3 = this.e;
        try {
            this.e = list2;
            m0(e0.e);
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                com.amazon.aps.iva.kb0.j jVar = (com.amazon.aps.iva.kb0.j) arrayList.get(i3);
                m1 m1Var = (m1) jVar.b;
                m1 m1Var2 = (m1) jVar.c;
                com.amazon.aps.iva.o0.c cVar2 = m1Var.e;
                z2 z2Var5 = m1Var.d;
                int d2 = z2Var5.d(cVar2);
                com.amazon.aps.iva.yb0.b0 b0Var = new com.amazon.aps.iva.yb0.b0();
                i0();
                m0(new com.amazon.aps.iva.o0.p(b0Var, cVar2));
                if (m1Var2 == null) {
                    if (com.amazon.aps.iva.yb0.j.a(z2Var5, this.F)) {
                        O();
                    }
                    y2 g2 = z2Var5.g();
                    g2.n(d2);
                    this.Q = d2;
                    ArrayList arrayList2 = new ArrayList();
                    k0(null, null, null, com.amazon.aps.iva.lb0.z.b, new com.amazon.aps.iva.o0.q(this, arrayList2, g2, m1Var));
                    if (!arrayList2.isEmpty()) {
                        m0(new com.amazon.aps.iva.o0.r(b0Var, arrayList2));
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    g2.c();
                    z2Var2 = z2Var4;
                    i2 = size;
                } else {
                    l1 j = this.b.j(m1Var2);
                    if (j == null || (z2Var = j.a) == null) {
                        z2Var = m1Var2.d;
                    }
                    if (j != null && (z2Var3 = j.a) != null) {
                        cVar = z2Var3.b();
                    } else {
                        cVar = m1Var2.e;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    y2 g3 = z2Var.g();
                    i2 = size;
                    e0.b(g3, arrayList3, z2Var.d(cVar));
                    com.amazon.aps.iva.kb0.q qVar2 = com.amazon.aps.iva.kb0.q.a;
                    g3.c();
                    if (!arrayList3.isEmpty()) {
                        m0(new s(b0Var, arrayList3));
                        if (com.amazon.aps.iva.yb0.j.a(z2Var5, z2Var4)) {
                            int d3 = z2Var4.d(cVar2);
                            H0(d3, L0(d3) + arrayList3.size());
                        }
                    }
                    m0(new t(j, this, m1Var2, m1Var));
                    y2 g4 = z2Var.g();
                    y2 y2Var = this.E;
                    int[] iArr = this.n;
                    this.n = null;
                    this.E = g4;
                    int d4 = z2Var.d(cVar);
                    g4.n(d4);
                    this.Q = d4;
                    ArrayList arrayList4 = new ArrayList();
                    List<com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.o0.d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list4 = this.e;
                    try {
                        this.e = arrayList4;
                        z2Var2 = z2Var4;
                        list = list4;
                        try {
                            k0(m1Var2.c, m1Var.c, Integer.valueOf(g4.g), m1Var2.f, new u(this, m1Var));
                            this.e = list;
                            if (!arrayList4.isEmpty()) {
                                m0(new v(b0Var, arrayList4));
                            }
                            this.E = y2Var;
                            this.n = iArr;
                            g4.c();
                        } catch (Throwable th) {
                            th = th;
                            this.e = list;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        list = list4;
                    }
                }
                m0(e0.b);
                i3++;
                size = i2;
                z2Var4 = z2Var2;
            }
            m0(w.h);
            this.Q = 0;
            com.amazon.aps.iva.kb0.q qVar3 = com.amazon.aps.iva.kb0.q.a;
            this.e = list3;
        } catch (Throwable th3) {
            this.e = list3;
            throw th3;
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean d(long j) {
        Object e0 = e0();
        if ((e0 instanceof Long) && j == ((Number) e0).longValue()) {
            return false;
        }
        K0(Long.valueOf(j));
        return true;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean e() {
        return this.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final Object e0() {
        i.a.C0550a c0550a;
        int i2;
        boolean z = this.M;
        i.a.C0550a c0550a2 = i.a.a;
        if (z) {
            if (!(!this.q)) {
                e0.c("A call to createNode(), emitNode() or useNode() expected".toString());
                throw null;
            }
            return c0550a2;
        }
        y2 y2Var = this.E;
        if (y2Var.j <= 0 && (i2 = y2Var.k) < y2Var.l) {
            y2Var.k = i2 + 1;
            c0550a = y2Var.d[i2];
        } else {
            c0550a = c0550a2;
        }
        if (!this.x) {
            return c0550a;
        }
        return c0550a2;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void f(boolean z) {
        boolean z2;
        int i2;
        if (this.l == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!this.M) {
                if (!z) {
                    v0();
                    return;
                }
                y2 y2Var = this.E;
                int i3 = y2Var.g;
                int i4 = y2Var.h;
                int i5 = i3;
                while (i5 < i4) {
                    if (this.E.i(i5)) {
                        Object j = this.E.j(i5);
                        if (j instanceof com.amazon.aps.iva.o0.g) {
                            m0(new f(j));
                        }
                    }
                    y2 y2Var2 = this.E;
                    g gVar = new g(this, i5);
                    y2Var2.getClass();
                    int q2 = com.amazon.aps.iva.ab.x.q(i5, y2Var2.b);
                    i5++;
                    z2 z2Var = y2Var2.a;
                    if (i5 < z2Var.c) {
                        i2 = com.amazon.aps.iva.ab.x.h(i5, z2Var.b);
                    } else {
                        i2 = z2Var.e;
                    }
                    for (int i6 = q2; i6 < i2; i6++) {
                        gVar.invoke(Integer.valueOf(i6 - q2), y2Var2.d[i6]);
                    }
                }
                e0.a(i3, i4, this.r);
                this.E.n(i3);
                this.E.p();
                return;
            }
            return;
        }
        e0.c("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }

    public final void f0() {
        o3 o3Var = this.P;
        if (!((ArrayList) o3Var.a).isEmpty()) {
            int size = ((ArrayList) o3Var.a).size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = ((ArrayList) o3Var.a).get(i2);
            }
            m0(new y(objArr));
            ((ArrayList) o3Var.a).clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.amazon.aps.iva.o0.j] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object[]] */
    @Override // com.amazon.aps.iva.o0.i
    public final j g(int i2) {
        i.a.C0550a c0550a;
        j2 j2Var;
        int i3;
        a1 a1Var = null;
        boolean z = false;
        w0(null, i2, 0, null);
        boolean z2 = this.M;
        o3 o3Var = this.C;
        o0 o0Var = this.g;
        if (z2) {
            com.amazon.aps.iva.yb0.j.d(o0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            j2 j2Var2 = new j2((i0) o0Var);
            o3Var.c(j2Var2);
            K0(j2Var2);
            j2Var2.e = this.A;
            j2Var2.a &= -17;
        } else {
            ArrayList arrayList = this.r;
            int d2 = e0.d(this.E.i, arrayList);
            if (d2 >= 0) {
                a1Var = (a1) arrayList.remove(d2);
            }
            y2 y2Var = this.E;
            int i4 = y2Var.j;
            i.a.C0550a c0550a2 = i.a.a;
            if (i4 <= 0 && (i3 = y2Var.k) < y2Var.l) {
                y2Var.k = i3 + 1;
                c0550a = y2Var.d[i3];
            } else {
                c0550a = c0550a2;
            }
            if (com.amazon.aps.iva.yb0.j.a(c0550a, c0550a2)) {
                com.amazon.aps.iva.yb0.j.d(o0Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                j2Var = new j2((i0) o0Var);
                K0(j2Var);
            } else {
                com.amazon.aps.iva.yb0.j.d(c0550a, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                j2Var = (j2) c0550a;
            }
            if (a1Var != null) {
                z = true;
            }
            if (z) {
                j2Var.a |= 8;
            } else {
                j2Var.a &= -9;
            }
            o3Var.c(j2Var);
            j2Var.e = this.A;
            j2Var.a &= -17;
        }
        return this;
    }

    public final void g0() {
        int i2 = this.Y;
        this.Y = 0;
        if (i2 > 0) {
            int i3 = this.V;
            if (i3 >= 0) {
                this.V = -1;
                h hVar = new h(i3, i2);
                i0();
                f0();
                m0(hVar);
                return;
            }
            int i4 = this.W;
            this.W = -1;
            int i5 = this.X;
            this.X = -1;
            i iVar = new i(i4, i5, i2);
            i0();
            f0();
            m0(iVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.o0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r3 = this;
            boolean r0 = r3.M
            r1 = 0
            if (r0 != 0) goto L25
            boolean r0 = r3.x
            if (r0 != 0) goto L25
            boolean r0 = r3.v
            if (r0 != 0) goto L25
            com.amazon.aps.iva.o0.j2 r0 = r3.a0()
            r2 = 1
            if (r0 == 0) goto L21
            int r0 = r0.a
            r0 = r0 & 8
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 != 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.h():boolean");
    }

    public final void h0(boolean z) {
        int i2;
        boolean z2;
        if (z) {
            i2 = this.E.i;
        } else {
            i2 = this.E.g;
        }
        int i3 = i2 - this.Q;
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i3 > 0) {
                m0(new C0551j(i3));
                this.Q = i2;
                return;
            }
            return;
        }
        e0.c("Tried to seek backward".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final Object i(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "key");
        return com.amazon.aps.iva.cq.b.f0(P(), g2Var);
    }

    public final void i0() {
        int i2 = this.O;
        if (i2 > 0) {
            this.O = 0;
            m0(new k(i2));
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final com.amazon.aps.iva.o0.d<?> j() {
        return this.a;
    }

    public final boolean j0(com.amazon.aps.iva.p0.b<j2, com.amazon.aps.iva.p0.c<Object>> bVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(bVar, "invalidationsRequested");
        if (this.e.isEmpty()) {
            if (bVar.c > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !(!this.r.isEmpty())) {
                return false;
            }
            S(bVar, null);
            return !this.e.isEmpty();
        }
        e0.c("Expected applyChanges() to have been called".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final com.amazon.aps.iva.ob0.g k() {
        return this.b.g();
    }

    public final <R> R k0(o0 o0Var, o0 o0Var2, Integer num, List<com.amazon.aps.iva.kb0.j<j2, com.amazon.aps.iva.p0.c<Object>>> list, com.amazon.aps.iva.xb0.a<? extends R> aVar) {
        R r2;
        int i2;
        boolean z = this.S;
        boolean z2 = this.D;
        int i3 = this.j;
        try {
            this.S = false;
            this.D = true;
            this.j = 0;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                com.amazon.aps.iva.kb0.j<j2, com.amazon.aps.iva.p0.c<Object>> jVar = list.get(i4);
                j2 j2Var = jVar.b;
                com.amazon.aps.iva.p0.c<Object> cVar = jVar.c;
                if (cVar != null) {
                    Object[] objArr = cVar.c;
                    int i5 = cVar.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        Object obj = objArr[i6];
                        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        D0(j2Var, obj);
                    }
                } else {
                    D0(j2Var, null);
                }
            }
            if (o0Var != null) {
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = -1;
                }
                r2 = (R) o0Var.h(o0Var2, i2, aVar);
                if (r2 == null) {
                }
                return r2;
            }
            r2 = aVar.invoke();
            return r2;
        } finally {
            this.S = z;
            this.D = z2;
            this.j = i3;
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final c2 l() {
        return P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r9.b < r3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[LOOP:5: B:28:0x0066->B:45:0x00a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.l0():void");
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void m() {
        if (this.q) {
            this.q = false;
            if (!this.M) {
                y2 y2Var = this.E;
                Object j = y2Var.j(y2Var.i);
                this.P.c(j);
                if (this.x && (j instanceof com.amazon.aps.iva.o0.g)) {
                    i0();
                    f0();
                    m0(r.h);
                    return;
                }
                return;
            }
            e0.c("useNode() called while inserting".toString());
            throw null;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final void m0(com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.o0.d<?>, ? super b3, ? super u2, com.amazon.aps.iva.kb0.q> qVar) {
        this.e.add(qVar);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void n(Object obj) {
        K0(obj);
    }

    public final void n0(int i2, int i3) {
        boolean z;
        if (i3 > 0) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.V == i2) {
                    this.Y += i3;
                    return;
                }
                g0();
                this.V = i2;
                this.Y = i3;
                return;
            }
            e0.c(("Invalid remove index " + i2).toString());
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void o() {
        U(true);
    }

    public final void o0() {
        int i2;
        y2 y2Var = this.E;
        if (y2Var.c > 0) {
            int i3 = y2Var.i;
            com.amazon.aps.iva.e0.f fVar = this.T;
            int i4 = fVar.a;
            if (i4 > 0) {
                i2 = ((int[]) fVar.b)[i4 - 1];
            } else {
                i2 = -2;
            }
            if (i2 != i3) {
                if (!this.R && this.S) {
                    p0(false, e0.d);
                    this.R = true;
                }
                if (i3 > 0) {
                    com.amazon.aps.iva.o0.c a2 = y2Var.a(i3);
                    fVar.e(i3);
                    p0(false, new m(a2));
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void p() {
        this.p = true;
    }

    public final void p0(boolean z, com.amazon.aps.iva.xb0.q<? super com.amazon.aps.iva.o0.d<?>, ? super b3, ? super u2, com.amazon.aps.iva.kb0.q> qVar) {
        h0(z);
        m0(qVar);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final j2 q() {
        return a0();
    }

    public final void q0() {
        o3 o3Var = this.P;
        if (!((ArrayList) o3Var.a).isEmpty()) {
            o3Var.b();
        } else {
            this.O++;
        }
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void r() {
        if (this.x && this.E.i == this.y) {
            this.y = -1;
            this.x = false;
        }
        U(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0(int r7, int r8, int r9) {
        /*
            r6 = this;
            com.amazon.aps.iva.o0.y2 r0 = r6.E
            com.amazon.aps.iva.o0.e0$b r1 = com.amazon.aps.iva.o0.e0.a
            if (r7 != r8) goto L7
            goto L1c
        L7:
            if (r7 == r9) goto L6c
            if (r8 != r9) goto Ld
            goto L6c
        Ld:
            int r1 = r0.m(r7)
            if (r1 != r8) goto L16
            r9 = r8
            goto L6c
        L16:
            int r1 = r0.m(r8)
            if (r1 != r7) goto L1e
        L1c:
            r9 = r7
            goto L6c
        L1e:
            int r1 = r0.m(r7)
            int r2 = r0.m(r8)
            if (r1 != r2) goto L2d
            int r9 = r0.m(r7)
            goto L6c
        L2d:
            r1 = 0
            r2 = r7
            r3 = r1
        L30:
            if (r2 <= 0) goto L3b
            if (r2 == r9) goto L3b
            int r2 = r0.m(r2)
            int r3 = r3 + 1
            goto L30
        L3b:
            r2 = r8
            r4 = r1
        L3d:
            if (r2 <= 0) goto L48
            if (r2 == r9) goto L48
            int r2 = r0.m(r2)
            int r4 = r4 + 1
            goto L3d
        L48:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4c:
            if (r2 >= r9) goto L55
            int r5 = r0.m(r5)
            int r2 = r2 + 1
            goto L4c
        L55:
            int r4 = r4 - r3
            r9 = r8
        L57:
            if (r1 >= r4) goto L60
            int r9 = r0.m(r9)
            int r1 = r1 + 1
            goto L57
        L60:
            if (r5 == r9) goto L6b
            int r5 = r0.m(r5)
            int r9 = r0.m(r9)
            goto L60
        L6b:
            r9 = r5
        L6c:
            if (r7 <= 0) goto L7e
            if (r7 == r9) goto L7e
            boolean r1 = r0.i(r7)
            if (r1 == 0) goto L79
            r6.q0()
        L79:
            int r7 = r0.m(r7)
            goto L6c
        L7e:
            r6.T(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o0.j.r0(int, int, int):void");
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void s(int i2) {
        w0(null, i2, 0, null);
    }

    public final void s0(int i2) {
        t0(this, i2, false, 0);
        g0();
    }

    @Override // com.amazon.aps.iva.o0.i
    public final Object t() {
        return e0();
    }

    @Override // com.amazon.aps.iva.o0.i
    public final z2 u() {
        return this.c;
    }

    public final void u0() {
        Object obj;
        if (this.r.isEmpty()) {
            this.l = this.E.o() + this.l;
            return;
        }
        y2 y2Var = this.E;
        int f2 = y2Var.f();
        int i2 = y2Var.g;
        int i3 = y2Var.h;
        int[] iArr = y2Var.b;
        if (i2 < i3) {
            obj = y2Var.l(i2, iArr);
        } else {
            obj = null;
        }
        Object e2 = y2Var.e();
        E0(f2, obj, e2);
        B0(null, com.amazon.aps.iva.ab.x.m(y2Var.g, iArr));
        l0();
        y2Var.d();
        F0(f2, obj, e2);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final boolean v(Object obj) {
        if (e0() != obj) {
            K0(obj);
            return true;
        }
        return false;
    }

    public final void v0() {
        int i2;
        y2 y2Var = this.E;
        int i3 = y2Var.i;
        if (i3 >= 0) {
            i2 = com.amazon.aps.iva.ab.x.p(i3, y2Var.b);
        } else {
            i2 = 0;
        }
        this.l = i2;
        this.E.p();
    }

    @Override // com.amazon.aps.iva.o0.i
    public final <T> void w(com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.e0.f fVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "factory");
        if (this.q) {
            this.q = false;
            if (this.M) {
                int i2 = ((int[]) this.k.b)[fVar.a - 1];
                b3 b3Var = this.G;
                com.amazon.aps.iva.o0.c b2 = b3Var.b(b3Var.s);
                this.l++;
                this.L.add(new d(aVar, b2, i2));
                this.U.c(new e(i2, b2));
                return;
            }
            e0.c("createNode() can only be called when inserting".toString());
            throw null;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final void w0(Object obj, int i2, int i3, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        b2 b2Var;
        Object valueOf;
        Object obj3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int p2;
        Object obj4;
        Object obj5 = obj;
        if (!this.q) {
            E0(i2, obj5, obj2);
            if (i3 != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z6 = this.M;
            i.a.C0550a c0550a = i.a.a;
            if (z6) {
                this.E.j++;
                b3 b3Var = this.G;
                int i6 = b3Var.r;
                i.a.C0550a c0550a2 = obj5;
                i.a.C0550a c0550a3 = obj5;
                if (z) {
                    b3Var.L(c0550a, i2, c0550a, true);
                } else if (obj2 != null) {
                    if (obj5 == null) {
                        c0550a2 = c0550a;
                    }
                    b3Var.L(c0550a2, i2, obj2, false);
                } else {
                    if (obj5 == null) {
                        c0550a3 = c0550a;
                    }
                    b3Var.L(c0550a3, i2, c0550a, false);
                }
                b2 b2Var2 = this.i;
                if (b2Var2 != null) {
                    int i7 = (-2) - i6;
                    d1 d1Var = new d1(-1, i2, i7, -1);
                    b2Var2.e.put(Integer.valueOf(i7), new y0(-1, this.j - b2Var2.b, 0));
                    b2Var2.d.add(d1Var);
                }
                Z(z, null);
                return;
            }
            if (i3 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && this.x) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.i == null) {
                int f2 = this.E.f();
                if (!z3 && f2 == i2) {
                    y2 y2Var = this.E;
                    int i8 = y2Var.g;
                    if (i8 < y2Var.h) {
                        obj4 = y2Var.l(i8, y2Var.b);
                    } else {
                        obj4 = null;
                    }
                    if (com.amazon.aps.iva.yb0.j.a(obj5, obj4)) {
                        B0(obj2, z);
                    }
                }
                y2 y2Var2 = this.E;
                y2Var2.getClass();
                ArrayList arrayList = new ArrayList();
                if (y2Var2.j <= 0) {
                    int i9 = y2Var2.g;
                    while (i9 < y2Var2.h) {
                        int i10 = i9 * 5;
                        int[] iArr = y2Var2.b;
                        int i11 = iArr[i10];
                        Object l2 = y2Var2.l(i9, iArr);
                        if (com.amazon.aps.iva.ab.x.m(i9, iArr)) {
                            p2 = 1;
                        } else {
                            p2 = com.amazon.aps.iva.ab.x.p(i9, iArr);
                        }
                        arrayList.add(new d1(l2, i11, i9, p2));
                        i9 += iArr[i10 + 3];
                    }
                }
                this.i = new b2(arrayList, this.j);
            }
            b2 b2Var3 = this.i;
            if (b2Var3 != null) {
                if (obj5 != null) {
                    valueOf = new c1(Integer.valueOf(i2), obj5);
                } else {
                    valueOf = Integer.valueOf(i2);
                }
                HashMap hashMap = (HashMap) b2Var3.f.getValue();
                e0.b bVar = e0.a;
                LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
                if (linkedHashSet != null && (obj3 = com.amazon.aps.iva.lb0.x.u0(linkedHashSet)) != null) {
                    LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap.get(valueOf);
                    if (linkedHashSet2 != null) {
                        linkedHashSet2.remove(obj3);
                        if (linkedHashSet2.isEmpty()) {
                            hashMap.remove(valueOf);
                        }
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    obj3 = null;
                }
                d1 d1Var2 = (d1) obj3;
                HashMap<Integer, y0> hashMap2 = b2Var3.e;
                ArrayList arrayList2 = b2Var3.d;
                int i12 = b2Var3.b;
                if (!z3 && d1Var2 != null) {
                    arrayList2.add(d1Var2);
                    this.j = b2Var3.a(d1Var2) + i12;
                    int i13 = d1Var2.c;
                    y0 y0Var = hashMap2.get(Integer.valueOf(i13));
                    if (y0Var != null) {
                        i5 = y0Var.a;
                    } else {
                        i5 = -1;
                    }
                    int i14 = b2Var3.c;
                    int i15 = i5 - i14;
                    if (i5 > i14) {
                        Collection<y0> values = hashMap2.values();
                        com.amazon.aps.iva.yb0.j.e(values, "groupInfos.values");
                        for (y0 y0Var2 : values) {
                            int i16 = y0Var2.a;
                            if (i16 == i5) {
                                y0Var2.a = i14;
                            } else {
                                if (i14 <= i16 && i16 < i5) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    y0Var2.a = i16 + 1;
                                }
                            }
                        }
                    } else if (i14 > i5) {
                        Collection<y0> values2 = hashMap2.values();
                        com.amazon.aps.iva.yb0.j.e(values2, "groupInfos.values");
                        for (y0 y0Var3 : values2) {
                            int i17 = y0Var3.a;
                            if (i17 == i5) {
                                y0Var3.a = i14;
                            } else {
                                if (i5 + 1 <= i17 && i17 < i14) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    y0Var3.a = i17 - 1;
                                }
                            }
                        }
                    }
                    y2 y2Var3 = this.E;
                    this.Q = i13 - (y2Var3.g - this.Q);
                    y2Var3.n(i13);
                    if (i15 > 0) {
                        c0 c0Var = new c0(i15);
                        h0(false);
                        o0();
                        m0(c0Var);
                    }
                    B0(obj2, z);
                } else {
                    this.E.j++;
                    this.M = true;
                    this.I = null;
                    if (this.G.t) {
                        b3 j = this.F.j();
                        this.G = j;
                        j.H();
                        this.H = false;
                        this.I = null;
                    }
                    this.G.e();
                    b3 b3Var2 = this.G;
                    int i18 = b3Var2.r;
                    i.a.C0550a c0550a4 = obj5;
                    if (z) {
                        b3Var2.L(c0550a, i2, c0550a, true);
                    } else if (obj2 != null) {
                        if (obj5 == null) {
                            c0550a4 = c0550a;
                        }
                        b3Var2.L(c0550a4, i2, obj2, false);
                    } else {
                        i.a.C0550a c0550a5 = obj5;
                        if (obj5 == null) {
                            c0550a5 = c0550a;
                        }
                        b3Var2.L(c0550a5, i2, c0550a, false);
                    }
                    this.K = this.G.b(i18);
                    int i19 = (-2) - i18;
                    d1 d1Var3 = new d1(-1, i2, i19, -1);
                    hashMap2.put(Integer.valueOf(i19), new y0(-1, this.j - i12, 0));
                    arrayList2.add(d1Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = this.j;
                    }
                    b2Var = new b2(arrayList3, i4);
                    Z(z, b2Var);
                    return;
                }
            }
            b2Var = null;
            Z(z, b2Var);
            return;
        }
        e0.c("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void x(Object obj) {
        if (this.E.f() == 207 && !com.amazon.aps.iva.yb0.j.a(this.E.e(), obj) && this.y < 0) {
            this.y = this.E.g;
            this.x = true;
        }
        w0(null, 207, 0, obj);
    }

    public final void x0() {
        w0(null, -127, 0, null);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void y(int i2, Object obj) {
        w0(obj, i2, 0, null);
    }

    public final void y0(int i2, u1 u1Var) {
        w0(u1Var, i2, 0, null);
    }

    @Override // com.amazon.aps.iva.o0.i
    public final void z() {
        w0(null, 125, 2, null);
        this.q = true;
    }

    public final void z0() {
        w0(null, 125, 1, null);
        this.q = true;
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class a implements v2 {
        public final b b;

        public a(b bVar) {
            this.b = bVar;
        }

        @Override // com.amazon.aps.iva.o0.v2
        public final void onAbandoned() {
            this.b.q();
        }

        @Override // com.amazon.aps.iva.o0.v2
        public final void onForgotten() {
            this.b.q();
        }

        @Override // com.amazon.aps.iva.o0.v2
        public final void onRemembered() {
        }
    }
}
