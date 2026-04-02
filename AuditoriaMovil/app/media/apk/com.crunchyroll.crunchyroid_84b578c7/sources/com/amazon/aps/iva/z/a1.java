package com.amazon.aps.iva.z;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.p3;
import java.util.ListIterator;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Transition.kt */
/* loaded from: classes.dex */
public final class a1<S> {
    public final n0<S> a;
    public final String b;
    public final com.amazon.aps.iva.o0.y1 c;
    public final com.amazon.aps.iva.o0.y1 d;
    public final com.amazon.aps.iva.o0.x1 e;
    public final com.amazon.aps.iva.o0.x1 f;
    public final com.amazon.aps.iva.o0.y1 g;
    public final com.amazon.aps.iva.y0.u<a1<S>.d<?, ?>> h;
    public final com.amazon.aps.iva.y0.u<a1<?>> i;
    public final com.amazon.aps.iva.o0.y1 j;
    public long k;
    public final com.amazon.aps.iva.o0.q0 l;

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public final class a<T, V extends p> {
        public final l1<T, V> a;
        public final String b;
        public final com.amazon.aps.iva.o0.y1 c;
        public final /* synthetic */ a1<S> d;

        /* compiled from: Transition.kt */
        /* renamed from: com.amazon.aps.iva.z.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0904a<T, V extends p> implements p3<T> {
            public final a1<S>.d<T, V> b;
            public com.amazon.aps.iva.xb0.l<? super b<S>, ? extends z<T>> c;
            public com.amazon.aps.iva.xb0.l<? super S, ? extends T> d;
            public final /* synthetic */ a1<S>.a<T, V> e;

            public C0904a(a aVar, a1<S>.d<T, V> dVar, com.amazon.aps.iva.xb0.l<? super b<S>, ? extends z<T>> lVar, com.amazon.aps.iva.xb0.l<? super S, ? extends T> lVar2) {
                com.amazon.aps.iva.yb0.j.f(lVar, "transitionSpec");
                this.e = aVar;
                this.b = dVar;
                this.c = lVar;
                this.d = lVar2;
            }

            public final void f(b<S> bVar) {
                com.amazon.aps.iva.yb0.j.f(bVar, "segment");
                T invoke = this.d.invoke(bVar.a());
                boolean e = this.e.d.e();
                a1<S>.d<T, V> dVar = this.b;
                if (e) {
                    dVar.k(this.d.invoke(bVar.c()), invoke, this.c.invoke(bVar));
                } else {
                    dVar.n(invoke, this.c.invoke(bVar));
                }
            }

            @Override // com.amazon.aps.iva.o0.p3
            public final T getValue() {
                f(this.e.d.c());
                return this.b.getValue();
            }
        }

        public a(a1 a1Var, m1 m1Var, String str) {
            com.amazon.aps.iva.yb0.j.f(m1Var, "typeConverter");
            com.amazon.aps.iva.yb0.j.f(str, "label");
            this.d = a1Var;
            this.a = m1Var;
            this.b = str;
            this.c = com.amazon.aps.iva.cq.b.c0(null);
        }

        public final C0904a a(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
            com.amazon.aps.iva.yb0.j.f(lVar, "transitionSpec");
            com.amazon.aps.iva.o0.y1 y1Var = this.c;
            C0904a c0904a = (C0904a) y1Var.getValue();
            a1<S> a1Var = this.d;
            if (c0904a == null) {
                c0904a = new C0904a(this, new d(a1Var, lVar2.invoke(a1Var.b()), com.amazon.aps.iva.cq.b.J(this.a, lVar2.invoke(a1Var.b())), this.a, this.b), lVar, lVar2);
                y1Var.setValue(c0904a);
                a1<S>.d<T, V> dVar = c0904a.b;
                com.amazon.aps.iva.yb0.j.f(dVar, "animation");
                a1Var.h.add(dVar);
            }
            c0904a.d = lVar2;
            c0904a.c = lVar;
            c0904a.f(a1Var.c());
            return c0904a;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public interface b<S> {
        S a();

        default boolean b(Enum r2, Enum r3) {
            if (com.amazon.aps.iva.yb0.j.a(r2, c()) && com.amazon.aps.iva.yb0.j.a(r3, a())) {
                return true;
            }
            return false;
        }

        S c();
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class c<S> implements b<S> {
        public final S a;
        public final S b;

        public c(S s, S s2) {
            this.a = s;
            this.b = s2;
        }

        @Override // com.amazon.aps.iva.z.a1.b
        public final S a() {
            return this.b;
        }

        @Override // com.amazon.aps.iva.z.a1.b
        public final S c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.c())) {
                    if (com.amazon.aps.iva.yb0.j.a(this.b, bVar.a())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            S s = this.a;
            if (s != null) {
                i = s.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            S s2 = this.b;
            if (s2 != null) {
                i2 = s2.hashCode();
            }
            return i3 + i2;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public final class d<T, V extends p> implements p3<T> {
        public final l1<T, V> b;
        public final com.amazon.aps.iva.o0.y1 c;
        public final com.amazon.aps.iva.o0.y1 d;
        public final com.amazon.aps.iva.o0.y1 e;
        public final com.amazon.aps.iva.o0.y1 f;
        public final com.amazon.aps.iva.o0.x1 g;
        public final com.amazon.aps.iva.o0.y1 h;
        public final com.amazon.aps.iva.o0.y1 i;
        public V j;
        public final u0 k;
        public final /* synthetic */ a1<S> l;

        public d(a1 a1Var, T t, V v, l1<T, V> l1Var, String str) {
            com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
            com.amazon.aps.iva.yb0.j.f(str, "label");
            this.l = a1Var;
            this.b = l1Var;
            com.amazon.aps.iva.o0.y1 c0 = com.amazon.aps.iva.cq.b.c0(t);
            this.c = c0;
            T t2 = null;
            com.amazon.aps.iva.o0.y1 c02 = com.amazon.aps.iva.cq.b.c0(k.c(0.0f, null, 7));
            this.d = c02;
            this.e = com.amazon.aps.iva.cq.b.c0(new z0((z) c02.getValue(), l1Var, t, c0.getValue(), v));
            this.f = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
            int i = com.amazon.aps.iva.o0.b.a;
            this.g = new com.amazon.aps.iva.o0.x1(0L);
            this.h = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
            this.i = com.amazon.aps.iva.cq.b.c0(t);
            this.j = v;
            Float f = a2.a.get(l1Var);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = l1Var.a().invoke(t);
                int b = invoke.b();
                for (int i2 = 0; i2 < b; i2++) {
                    invoke.e(floatValue, i2);
                }
                t2 = this.b.b().invoke(invoke);
            }
            this.k = k.c(0.0f, t2, 3);
        }

        public static void g(d dVar, Object obj, boolean z, int i) {
            j jVar;
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            Object obj2 = obj;
            if ((i & 2) != 0) {
                z = false;
            }
            if (z) {
                if (((z) dVar.d.getValue()) instanceof u0) {
                    jVar = (z) dVar.d.getValue();
                } else {
                    jVar = dVar.k;
                }
            } else {
                jVar = (z) dVar.d.getValue();
            }
            dVar.e.setValue(new z0(jVar, dVar.b, obj2, dVar.c.getValue(), dVar.j));
            a1<S> a1Var = dVar.l;
            a1Var.g.setValue(Boolean.TRUE);
            if (a1Var.e()) {
                ListIterator<a1<S>.d<?, ?>> listIterator = a1Var.h.listIterator();
                long j = 0;
                while (true) {
                    com.amazon.aps.iva.y0.b0 b0Var = (com.amazon.aps.iva.y0.b0) listIterator;
                    if (b0Var.hasNext()) {
                        d dVar2 = (d) b0Var.next();
                        j = Math.max(j, dVar2.f().h);
                        long j2 = a1Var.k;
                        dVar2.i.setValue(dVar2.f().f(j2));
                        dVar2.j = dVar2.f().b(j2);
                    } else {
                        a1Var.g.setValue(Boolean.FALSE);
                        return;
                    }
                }
            }
        }

        public final z0<T, V> f() {
            return (z0) this.e.getValue();
        }

        @Override // com.amazon.aps.iva.o0.p3
        public final T getValue() {
            return this.i.getValue();
        }

        public final void k(T t, T t2, z<T> zVar) {
            com.amazon.aps.iva.yb0.j.f(zVar, "animationSpec");
            this.c.setValue(t2);
            this.d.setValue(zVar);
            if (com.amazon.aps.iva.yb0.j.a(f().c, t) && com.amazon.aps.iva.yb0.j.a(f().d, t2)) {
                return;
            }
            g(this, t, false, 2);
        }

        public final void n(T t, z<T> zVar) {
            com.amazon.aps.iva.yb0.j.f(zVar, "animationSpec");
            com.amazon.aps.iva.o0.y1 y1Var = this.c;
            boolean a = com.amazon.aps.iva.yb0.j.a(y1Var.getValue(), t);
            com.amazon.aps.iva.o0.y1 y1Var2 = this.h;
            if (!a || ((Boolean) y1Var2.getValue()).booleanValue()) {
                y1Var.setValue(t);
                this.d.setValue(zVar);
                com.amazon.aps.iva.o0.y1 y1Var3 = this.f;
                g(this, null, !((Boolean) y1Var3.getValue()).booleanValue(), 1);
                Boolean bool = Boolean.FALSE;
                y1Var3.setValue(bool);
                this.g.w(this.l.e.m());
                y1Var2.setValue(bool);
            }
        }
    }

    /* compiled from: Transition.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.Transition$animateTo$1$1", f = "Transition.kt", l = {435}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ a1<S> j;

        /* compiled from: Transition.kt */
        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ a1<S> h;
            public final /* synthetic */ float i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a1<S> a1Var, float f) {
                super(1);
                this.h = a1Var;
                this.i = f;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Long l) {
                long longValue = l.longValue();
                a1<S> a1Var = this.h;
                if (!a1Var.e()) {
                    a1Var.f(longValue / 1, this.i);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a1<S> a1Var, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.j = a1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.j, dVar);
            eVar.i = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.se0.g0 g0Var;
            a aVar;
            com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    g0Var = (com.amazon.aps.iva.se0.g0) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0Var = (com.amazon.aps.iva.se0.g0) this.i;
            }
            do {
                aVar = new a(this.j, w0.d(g0Var.getCoroutineContext()));
                this.i = g0Var;
                this.h = 1;
            } while (com.amazon.aps.iva.o0.j1.b(aVar, this) != aVar2);
            return aVar2;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ a1<S> h;
        public final /* synthetic */ S i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a1<S> a1Var, S s, int i) {
            super(2);
            this.h = a1Var;
            this.i = s;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            this.h.a(this.i, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Long> {
        public final /* synthetic */ a1<S> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a1<S> a1Var) {
            super(0);
            this.h = a1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Long invoke() {
            a1<S> a1Var = this.h;
            ListIterator<a1<S>.d<?, ?>> listIterator = a1Var.h.listIterator();
            long j = 0;
            while (true) {
                com.amazon.aps.iva.y0.b0 b0Var = (com.amazon.aps.iva.y0.b0) listIterator;
                if (!b0Var.hasNext()) {
                    break;
                }
                j = Math.max(j, ((d) b0Var.next()).f().h);
            }
            ListIterator<a1<?>> listIterator2 = a1Var.i.listIterator();
            while (true) {
                com.amazon.aps.iva.y0.b0 b0Var2 = (com.amazon.aps.iva.y0.b0) listIterator2;
                if (b0Var2.hasNext()) {
                    j = Math.max(j, ((Number) ((a1) b0Var2.next()).l.getValue()).longValue());
                } else {
                    return Long.valueOf(j);
                }
            }
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ a1<S> h;
        public final /* synthetic */ S i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a1<S> a1Var, S s, int i) {
            super(2);
            this.h = a1Var;
            this.i = s;
            this.j = i;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            num.intValue();
            int I = com.amazon.aps.iva.ff0.b.I(this.j | 1);
            this.h.h(this.i, iVar, I);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a1() {
        throw null;
    }

    public a1(n0<S> n0Var, String str) {
        this.a = n0Var;
        this.b = str;
        this.c = com.amazon.aps.iva.cq.b.c0(b());
        this.d = com.amazon.aps.iva.cq.b.c0(new c(b(), b()));
        int i = com.amazon.aps.iva.o0.b.a;
        this.e = new com.amazon.aps.iva.o0.x1(0L);
        this.f = new com.amazon.aps.iva.o0.x1(Long.MIN_VALUE);
        this.g = com.amazon.aps.iva.cq.b.c0(Boolean.TRUE);
        this.h = new com.amazon.aps.iva.y0.u<>();
        this.i = new com.amazon.aps.iva.y0.u<>();
        this.j = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
        this.l = com.amazon.aps.iva.cq.b.M(new g(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (((java.lang.Boolean) r6.g.getValue()).booleanValue() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(S r7, com.amazon.aps.iva.o0.i r8, int r9) {
        /*
            r6 = this;
            r0 = -1493585151(0xffffffffa6f9b301, float:-1.7326365E-15)
            com.amazon.aps.iva.o0.j r8 = r8.g(r0)
            r0 = r9 & 14
            if (r0 != 0) goto L16
            boolean r0 = r8.H(r7)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r9
            goto L17
        L16:
            r0 = r9
        L17:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L27
            boolean r1 = r8.H(r6)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r0 & 91
            r2 = 18
            if (r1 != r2) goto L38
            boolean r1 = r8.h()
            if (r1 != 0) goto L34
            goto L38
        L34:
            r8.A()
            goto L97
        L38:
            com.amazon.aps.iva.o0.e0$b r1 = com.amazon.aps.iva.o0.e0.a
            boolean r1 = r6.e()
            if (r1 != 0) goto L97
            r1 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r6.h(r7, r8, r0)
            java.lang.Object r0 = r6.b()
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r7, r0)
            r1 = 0
            if (r0 == 0) goto L72
            com.amazon.aps.iva.o0.x1 r0 = r6.f
            long r2 = r0.m()
            r4 = -9223372036854775808
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = r1
        L62:
            if (r0 != 0) goto L72
            com.amazon.aps.iva.o0.y1 r0 = r6.g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L97
        L72:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r8.s(r0)
            boolean r0 = r8.H(r6)
            java.lang.Object r2 = r8.e0()
            if (r0 != 0) goto L86
            com.amazon.aps.iva.o0.i$a$a r0 = com.amazon.aps.iva.o0.i.a.a
            if (r2 != r0) goto L8f
        L86:
            com.amazon.aps.iva.z.a1$e r2 = new com.amazon.aps.iva.z.a1$e
            r0 = 0
            r2.<init>(r6, r0)
            r8.K0(r2)
        L8f:
            r8.U(r1)
            com.amazon.aps.iva.xb0.p r2 = (com.amazon.aps.iva.xb0.p) r2
            com.amazon.aps.iva.o0.x0.c(r6, r2, r8)
        L97:
            com.amazon.aps.iva.o0.j2 r8 = r8.X()
            if (r8 != 0) goto L9e
            goto La5
        L9e:
            com.amazon.aps.iva.z.a1$f r0 = new com.amazon.aps.iva.z.a1$f
            r0.<init>(r6, r7, r9)
            r8.d = r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.a1.a(java.lang.Object, com.amazon.aps.iva.o0.i, int):void");
    }

    public final S b() {
        return (S) this.a.a.getValue();
    }

    public final b<S> c() {
        return (b) this.d.getValue();
    }

    public final S d() {
        return (S) this.c.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [V extends com.amazon.aps.iva.z.p, com.amazon.aps.iva.z.p] */
    public final void f(long j, float f2) {
        long j2;
        com.amazon.aps.iva.o0.x1 x1Var = this.f;
        int i = (x1Var.m() > Long.MIN_VALUE ? 1 : (x1Var.m() == Long.MIN_VALUE ? 0 : -1));
        n0<S> n0Var = this.a;
        if (i == 0) {
            x1Var.w(j);
            n0Var.b.setValue(Boolean.TRUE);
        }
        this.g.setValue(Boolean.FALSE);
        com.amazon.aps.iva.o0.x1 x1Var2 = this.e;
        x1Var2.w(j - x1Var.m());
        ListIterator<a1<S>.d<?, ?>> listIterator = this.h.listIterator();
        boolean z = true;
        while (true) {
            com.amazon.aps.iva.y0.b0 b0Var = (com.amazon.aps.iva.y0.b0) listIterator;
            if (b0Var.hasNext()) {
                d dVar = (d) b0Var.next();
                boolean booleanValue = ((Boolean) dVar.f.getValue()).booleanValue();
                com.amazon.aps.iva.o0.y1 y1Var = dVar.f;
                if (!booleanValue) {
                    long m = x1Var2.m();
                    int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    com.amazon.aps.iva.o0.x1 x1Var3 = dVar.g;
                    if (i2 > 0) {
                        float m2 = ((float) (m - x1Var3.m())) / f2;
                        if (!Float.isNaN(m2)) {
                            j2 = m2;
                        } else {
                            throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f2 + ",playTimeNanos: " + m + ", offsetTimeNanos: " + x1Var3.m()).toString());
                        }
                    } else {
                        j2 = dVar.f().h;
                    }
                    dVar.i.setValue(dVar.f().f(j2));
                    dVar.j = dVar.f().b(j2);
                    if (dVar.f().c(j2)) {
                        y1Var.setValue(Boolean.TRUE);
                        x1Var3.w(0L);
                    }
                }
                if (!((Boolean) y1Var.getValue()).booleanValue()) {
                    z = false;
                }
            } else {
                ListIterator<a1<?>> listIterator2 = this.i.listIterator();
                while (true) {
                    com.amazon.aps.iva.y0.b0 b0Var2 = (com.amazon.aps.iva.y0.b0) listIterator2;
                    if (!b0Var2.hasNext()) {
                        break;
                    }
                    a1 a1Var = (a1) b0Var2.next();
                    if (!com.amazon.aps.iva.yb0.j.a(a1Var.d(), a1Var.b())) {
                        a1Var.f(x1Var2.m(), f2);
                    }
                    if (!com.amazon.aps.iva.yb0.j.a(a1Var.d(), a1Var.b())) {
                        z = false;
                    }
                }
                if (z) {
                    x1Var.w(Long.MIN_VALUE);
                    n0Var.a.setValue(d());
                    x1Var2.w(0L);
                    n0Var.b.setValue(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [V extends com.amazon.aps.iva.z.p, com.amazon.aps.iva.z.p] */
    public final void g(Object obj, long j, Object obj2) {
        this.f.w(Long.MIN_VALUE);
        n0<S> n0Var = this.a;
        n0Var.b.setValue(Boolean.FALSE);
        if (!e() || !com.amazon.aps.iva.yb0.j.a(b(), obj) || !com.amazon.aps.iva.yb0.j.a(d(), obj2)) {
            n0Var.a.setValue(obj);
            this.c.setValue(obj2);
            this.j.setValue(Boolean.TRUE);
            this.d.setValue(new c(obj, obj2));
        }
        ListIterator<a1<?>> listIterator = this.i.listIterator();
        while (true) {
            com.amazon.aps.iva.y0.b0 b0Var = (com.amazon.aps.iva.y0.b0) listIterator;
            if (!b0Var.hasNext()) {
                break;
            }
            a1 a1Var = (a1) b0Var.next();
            com.amazon.aps.iva.yb0.j.d(a1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (a1Var.e()) {
                a1Var.g(a1Var.b(), j, a1Var.d());
            }
        }
        ListIterator<a1<S>.d<?, ?>> listIterator2 = this.h.listIterator();
        while (true) {
            com.amazon.aps.iva.y0.b0 b0Var2 = (com.amazon.aps.iva.y0.b0) listIterator2;
            if (b0Var2.hasNext()) {
                d dVar = (d) b0Var2.next();
                dVar.i.setValue(dVar.f().f(j));
                dVar.j = dVar.f().b(j);
            } else {
                this.k = j;
                return;
            }
        }
    }

    public final void h(S s, com.amazon.aps.iva.o0.i iVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        com.amazon.aps.iva.o0.j g2 = iVar.g(-583974681);
        if ((i & 14) == 0) {
            if (g2.H(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (g2.H(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && g2.h()) {
            g2.A();
        } else {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            if (!e() && !com.amazon.aps.iva.yb0.j.a(d(), s)) {
                this.d.setValue(new c(d(), s));
                this.a.a.setValue(d());
                this.c.setValue(s);
                if (this.f.m() != Long.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.g.setValue(Boolean.TRUE);
                }
                ListIterator<a1<S>.d<?, ?>> listIterator = this.h.listIterator();
                while (true) {
                    com.amazon.aps.iva.y0.b0 b0Var = (com.amazon.aps.iva.y0.b0) listIterator;
                    if (!b0Var.hasNext()) {
                        break;
                    }
                    ((d) b0Var.next()).h.setValue(Boolean.TRUE);
                }
            }
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        }
        j2 X = g2.X();
        if (X != null) {
            X.d = new h(this, s, i);
        }
    }
}
