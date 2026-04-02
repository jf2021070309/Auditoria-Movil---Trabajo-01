package com.amazon.aps.iva.ui;

import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.vi.a;
import com.amazon.aps.iva.yb0.j;
import com.google.ads.AdSize;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: R extends com.amazon.aps.iva.vi.a
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: ViewModelNavigator.kt */
/* loaded from: classes.dex */
public final class c<R extends com.amazon.aps.iva.vi.a> extends f0 implements com.amazon.aps.iva.ui.b<R> {
    public final p b;
    public final l0 c;
    public final com.amazon.aps.iva.ti.a d;
    public final com.amazon.aps.iva.ti.a e;

    /* compiled from: ViewModelNavigator.kt */
    @e(c = "com.crunchyroll.mvvm.navigation.ViewModelNavigator$navigate$1", f = "ViewModelNavigator.kt", l = {AdSize.PORTRAIT_AD_HEIGHT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements com.amazon.aps.iva.xb0.p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<R> i;
        public final /* synthetic */ R j;
        public final /* synthetic */ com.amazon.aps.iva.ui.a k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<R> cVar, R r, com.amazon.aps.iva.ui.a aVar, d<? super a> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = r;
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new a(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            c<R> cVar = this.i;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                l0 l0Var = cVar.c;
                this.h = 1;
                if (l0Var.a(this.j, this) == aVar) {
                    return aVar;
                }
            }
            cVar.b.d(this.k, "navigation_payload_input");
            return q.a;
        }
    }

    /* compiled from: ViewModelNavigator.kt */
    @e(c = "com.crunchyroll.mvvm.navigation.ViewModelNavigator$navigateUp$1", f = "ViewModelNavigator.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements com.amazon.aps.iva.xb0.p<g0, d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<R> i;
        public final /* synthetic */ com.amazon.aps.iva.ui.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<R> cVar, com.amazon.aps.iva.ui.a aVar, d<? super b> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final d<q> create(Object obj, d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, d<? super q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            c<R> cVar = this.i;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                l0 l0Var = cVar.c;
                com.amazon.aps.iva.vi.d dVar = com.amazon.aps.iva.vi.d.a;
                this.h = 1;
                if (l0Var.a(dVar, this) == aVar) {
                    return aVar;
                }
            }
            cVar.d.d(this.j);
            return q.a;
        }
    }

    public /* synthetic */ c() {
        throw null;
    }

    public c(p pVar, com.amazon.aps.iva.ui.a aVar) {
        j.f(pVar, "savedStateHandle");
        this.b = pVar;
        this.c = t.g(0, 0, null, 7);
        if (aVar != null) {
            pVar.d(aVar, "navigation_payload_input");
        }
        com.amazon.aps.iva.ti.a t = x.t(pVar, "navigation_payload_result", null, w.D(this));
        this.d = t;
        this.e = t;
    }

    @Override // com.amazon.aps.iva.ui.b
    public final <T extends com.amazon.aps.iva.ui.a> T T5() {
        T t = (T) this.b.b("navigation_payload_input");
        j.d(t, "null cannot be cast to non-null type T of com.crunchyroll.mvvm.navigation.ViewModelNavigator.requireInput");
        return t;
    }

    @Override // com.amazon.aps.iva.ui.b
    public final com.amazon.aps.iva.ti.a Y4() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.ui.b
    public final void v1(com.amazon.aps.iva.vi.a aVar, com.amazon.aps.iva.ui.a aVar2) {
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(this, aVar, aVar2, null), 3);
    }

    @Override // com.amazon.aps.iva.ui.b
    public final void w7(com.amazon.aps.iva.ui.a aVar) {
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new b(this, aVar, null), 3);
    }
}
