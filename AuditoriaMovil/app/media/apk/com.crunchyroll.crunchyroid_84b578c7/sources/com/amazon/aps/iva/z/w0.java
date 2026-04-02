package com.amazon.aps.iva.z;

import com.amazon.aps.iva.a1.h;
import com.google.firebase.analytics.FirebaseAnalytics;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SuspendAnimation.kt */
/* loaded from: classes.dex */
public final class w0 {

    /* compiled from: SuspendAnimation.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
    /* loaded from: classes.dex */
    public static final class a<T, V extends p> extends com.amazon.aps.iva.qb0.c {
        public l h;
        public f i;
        public com.amazon.aps.iva.xb0.l j;
        public com.amazon.aps.iva.yb0.d0 k;
        public /* synthetic */ Object l;
        public int m;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.m |= Integer.MIN_VALUE;
            return w0.b(null, null, 0L, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TV; */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<i<T, V>> h;
        public final /* synthetic */ T i;
        public final /* synthetic */ f<T, V> j;
        public final /* synthetic */ p k;
        public final /* synthetic */ l<T, V> l;
        public final /* synthetic */ float m;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i<T, V>, com.amazon.aps.iva.kb0.q> n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcom/amazon/aps/iva/yb0/d0<Lcom/amazon/aps/iva/z/i<TT;TV;>;>;TT;Lcom/amazon/aps/iva/z/f<TT;TV;>;TV;Lcom/amazon/aps/iva/z/l<TT;TV;>;FLcom/amazon/aps/iva/xb0/l<-Lcom/amazon/aps/iva/z/i<TT;TV;>;Lcom/amazon/aps/iva/kb0/q;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.yb0.d0 d0Var, Object obj, f fVar, p pVar, l lVar, float f, com.amazon.aps.iva.xb0.l lVar2) {
            super(1);
            this.h = d0Var;
            this.i = obj;
            this.j = fVar;
            this.k = pVar;
            this.l = lVar;
            this.m = f;
            this.n = lVar2;
        }

        /* JADX WARN: Type inference failed for: r13v2, types: [com.amazon.aps.iva.z.i, T] */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Long l) {
            long longValue = l.longValue();
            T t = this.i;
            f<T, V> fVar = this.j;
            ?? iVar = new i(t, fVar.e(), this.k, longValue, fVar.g(), longValue, new x0(this.l));
            w0.c(iVar, longValue, this.m, this.j, this.l, this.n);
            this.h.b = iVar;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ l<T, V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l<T, V> lVar) {
            super(0);
            this.h = lVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.g = false;
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.yb0.d0<i<T, V>> h;
        public final /* synthetic */ float i;
        public final /* synthetic */ f<T, V> j;
        public final /* synthetic */ l<T, V> k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<i<T, V>, com.amazon.aps.iva.kb0.q> l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.amazon.aps.iva.yb0.d0<i<T, V>> d0Var, float f, f<T, V> fVar, l<T, V> lVar, com.amazon.aps.iva.xb0.l<? super i<T, V>, com.amazon.aps.iva.kb0.q> lVar2) {
            super(1);
            this.h = d0Var;
            this.i = f;
            this.j = fVar;
            this.k = lVar;
            this.l = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Long l) {
            long longValue = l.longValue();
            T t = this.h.b;
            com.amazon.aps.iva.yb0.j.c(t);
            w0.c((i) t, longValue, this.i, this.j, this.k, this.l);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final Object a(float f, float f2, float f3, j<Float> jVar, com.amazon.aps.iva.xb0.p<? super Float, ? super Float, com.amazon.aps.iva.kb0.q> pVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        m1 m1Var = n1.a;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        p pVar2 = (p) m1Var.a.invoke(new Float(f3));
        if (pVar2 == null) {
            pVar2 = com.amazon.aps.iva.e.z.J((p) m1Var.a.invoke(f4));
        }
        p pVar3 = pVar2;
        Object b2 = b(new l(m1Var, f4, pVar3, 56), new z0(jVar, m1Var, f4, f5, pVar3), Long.MIN_VALUE, new v0(pVar, m1Var), dVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (b2 != aVar) {
            b2 = com.amazon.aps.iva.kb0.q.a;
        }
        if (b2 == aVar) {
            return b2;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb A[Catch: CancellationException -> 0x0045, TryCatch #2 {CancellationException -> 0x0045, blocks: (B:16:0x003f, B:36:0x00d6, B:38:0x00eb, B:40:0x0114, B:41:0x0119), top: B:66:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.amazon.aps.iva.z.i, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends com.amazon.aps.iva.z.p> java.lang.Object b(com.amazon.aps.iva.z.l<T, V> r24, com.amazon.aps.iva.z.f<T, V> r25, long r26, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.z.i<T, V>, com.amazon.aps.iva.kb0.q> r28, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r29) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z.w0.b(com.amazon.aps.iva.z.l, com.amazon.aps.iva.z.f, long, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final <T, V extends p> void c(i<T, V> iVar, long j, float f, f<T, V> fVar, l<T, V> lVar, com.amazon.aps.iva.xb0.l<? super i<T, V>, com.amazon.aps.iva.kb0.q> lVar2) {
        boolean z;
        long j2;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j2 = fVar.d();
        } else {
            j2 = ((float) (j - iVar.c)) / f;
        }
        iVar.g = j;
        iVar.e.setValue(fVar.f(j2));
        V b2 = fVar.b(j2);
        com.amazon.aps.iva.yb0.j.f(b2, "<set-?>");
        iVar.f = b2;
        if (fVar.c(j2)) {
            iVar.h = iVar.g;
            iVar.i.setValue(Boolean.FALSE);
        }
        e(iVar, lVar);
        lVar2.invoke(iVar);
    }

    public static final float d(com.amazon.aps.iva.ob0.g gVar) {
        float f;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(gVar, "<this>");
        int i = com.amazon.aps.iva.a1.h.b0;
        com.amazon.aps.iva.a1.h hVar = (com.amazon.aps.iva.a1.h) gVar.get(h.a.b);
        if (hVar != null) {
            f = hVar.t();
        } else {
            f = 1.0f;
        }
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends p> void e(i<T, V> iVar, l<T, V> lVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "state");
        lVar.c.setValue(iVar.a());
        V v = lVar.d;
        V v2 = iVar.f;
        com.amazon.aps.iva.yb0.j.f(v, "<this>");
        com.amazon.aps.iva.yb0.j.f(v2, FirebaseAnalytics.Param.SOURCE);
        int b2 = v.b();
        for (int i = 0; i < b2; i++) {
            v.e(v2.a(i), i);
        }
        lVar.f = iVar.h;
        lVar.e = iVar.g;
        lVar.g = ((Boolean) iVar.i.getValue()).booleanValue();
    }
}
