package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.p;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Animatable.kt */
/* loaded from: classes.dex */
public final class b<T, V extends p> {
    public final l1<T, V> a;
    public final T b;
    public final l<T, V> c;
    public final com.amazon.aps.iva.o0.y1 d;
    public final com.amazon.aps.iva.o0.y1 e;
    public final q0 f;
    public final V g;
    public final V h;
    public final V i;
    public final V j;

    /* compiled from: Animatable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ b<T, V> h;
        public final /* synthetic */ T i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T, V> bVar, T t, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(1, dVar);
            this.h = bVar;
            this.i = t;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.h, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            b<T, V> bVar = this.h;
            l<T, V> lVar = bVar.c;
            lVar.d.d();
            lVar.e = Long.MIN_VALUE;
            bVar.d.setValue(Boolean.FALSE);
            Object a = b.a(bVar, this.i);
            bVar.c.c.setValue(a);
            bVar.e.setValue(a);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public b(T t, l1<T, V> l1Var, T t2, String str) {
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        com.amazon.aps.iva.yb0.j.f(str, "label");
        this.a = l1Var;
        this.b = t2;
        this.c = new l<>(l1Var, t, null, 60);
        this.d = com.amazon.aps.iva.cq.b.c0(Boolean.FALSE);
        this.e = com.amazon.aps.iva.cq.b.c0(t);
        this.f = new q0();
        new u0(0.0f, 0.0f, t2, 3);
        V invoke = l1Var.a().invoke(t);
        int b = invoke.b();
        for (int i = 0; i < b; i++) {
            invoke.e(Float.NEGATIVE_INFINITY, i);
        }
        this.g = invoke;
        V invoke2 = this.a.a().invoke(t);
        int b2 = invoke2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            invoke2.e(Float.POSITIVE_INFINITY, i2);
        }
        this.h = invoke2;
        this.i = invoke;
        this.j = invoke2;
    }

    public static final Object a(b bVar, Object obj) {
        V v = bVar.g;
        V v2 = bVar.i;
        boolean a2 = com.amazon.aps.iva.yb0.j.a(v2, v);
        V v3 = bVar.j;
        if (!a2 || !com.amazon.aps.iva.yb0.j.a(v3, bVar.h)) {
            l1<T, V> l1Var = bVar.a;
            V invoke = l1Var.a().invoke(obj);
            int b = invoke.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (invoke.a(i) < v2.a(i) || invoke.a(i) > v3.a(i)) {
                    invoke.e(com.amazon.aps.iva.aq.j.i(invoke.a(i), v2.a(i), v3.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return l1Var.b().invoke(invoke);
            }
            return obj;
        }
        return obj;
    }

    public static Object b(b bVar, Object obj, j jVar, com.amazon.aps.iva.ob0.d dVar) {
        T invoke = bVar.a.b().invoke(bVar.c.d);
        Object c = bVar.c();
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        l1<T, V> l1Var = bVar.a;
        com.amazon.aps.iva.yb0.j.f(l1Var, "typeConverter");
        com.amazon.aps.iva.z.a aVar = new com.amazon.aps.iva.z.a(bVar, invoke, new z0(jVar, l1Var, c, obj, l1Var.a().invoke(invoke)), bVar.c.e, null, null);
        o0 o0Var = o0.Default;
        q0 q0Var = bVar.f;
        q0Var.getClass();
        return com.amazon.aps.iva.e.z.p(new r0(o0Var, q0Var, aVar, null), dVar);
    }

    public final T c() {
        return this.c.getValue();
    }

    public final Object d(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        a aVar = new a(this, t, null);
        o0 o0Var = o0.Default;
        q0 q0Var = this.f;
        q0Var.getClass();
        Object p = com.amazon.aps.iva.e.z.p(new r0(o0Var, q0Var, aVar, null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public /* synthetic */ b(Object obj, m1 m1Var, Object obj2, int i) {
        this(obj, m1Var, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : null);
    }
}
