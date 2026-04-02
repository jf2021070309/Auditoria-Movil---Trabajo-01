package com.amazon.aps.iva.i5;

import android.annotation.SuppressLint;
import com.amazon.aps.iva.se0.r0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: CoroutineLiveData.kt */
/* loaded from: classes.dex */
public final class t<T> implements s<T> {
    public final androidx.lifecycle.c<T> a;
    public final com.amazon.aps.iva.ob0.g b;

    /* compiled from: CoroutineLiveData.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ t<T> i;
        public final /* synthetic */ T j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t<T> tVar, T t, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = tVar;
            this.j = t;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            t<T> tVar = this.i;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                androidx.lifecycle.c<T> cVar = tVar.a;
                this.h = 1;
                if (cVar.m(this) == aVar) {
                    return aVar;
                }
            }
            tVar.a.k(this.j);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public t(androidx.lifecycle.c<T> cVar, com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "target");
        com.amazon.aps.iva.yb0.j.f(gVar, "context");
        this.a = cVar;
        com.amazon.aps.iva.ye0.c cVar2 = r0.a;
        this.b = gVar.plus(com.amazon.aps.iva.xe0.k.a.C());
    }

    @Override // com.amazon.aps.iva.i5.s
    @SuppressLint({"NullSafeMutableLiveData"})
    public final Object a(T t, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object g = com.amazon.aps.iva.se0.i.g(dVar, this.b, new a(this, t, null));
        if (g == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return g;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
