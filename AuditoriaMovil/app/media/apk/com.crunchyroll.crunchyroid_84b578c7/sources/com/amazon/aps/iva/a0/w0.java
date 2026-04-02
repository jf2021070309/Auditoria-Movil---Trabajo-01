package com.amazon.aps.iva.a0;

import android.view.View;
import com.amazon.aps.iva.o0.p3;
/* compiled from: Magnifier.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", f = "Magnifier.kt", l = {363}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ r1 j;
    public final /* synthetic */ f1 k;
    public final /* synthetic */ View l;
    public final /* synthetic */ com.amazon.aps.iva.o2.c m;
    public final /* synthetic */ float n;
    public final /* synthetic */ com.amazon.aps.iva.ve0.f0<com.amazon.aps.iva.kb0.q> o;
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q>> p;
    public final /* synthetic */ p3<Boolean> q;
    public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> r;
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c>> s;
    public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> t;
    public final /* synthetic */ p3<Float> u;

    /* compiled from: Magnifier.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1$1", f = "Magnifier.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ q1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1 q1Var, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.h = q1Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.h, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.kb0.q qVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(qVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            this.h.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Magnifier.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ q1 h;
        public final /* synthetic */ com.amazon.aps.iva.o2.c i;
        public final /* synthetic */ p3<Boolean> j;
        public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> k;
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c>> l;
        public final /* synthetic */ com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> m;
        public final /* synthetic */ p3<Float> n;
        public final /* synthetic */ com.amazon.aps.iva.yb0.c0 o;
        public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q>> p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q1 q1Var, com.amazon.aps.iva.o2.c cVar, p3<Boolean> p3Var, p3<com.amazon.aps.iva.e1.c> p3Var2, p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c>> p3Var3, com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> q1Var2, p3<Float> p3Var4, com.amazon.aps.iva.yb0.c0 c0Var, p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q>> p3Var5) {
            super(0);
            this.h = q1Var;
            this.i = cVar;
            this.j = p3Var;
            this.k = p3Var2;
            this.l = p3Var3;
            this.m = q1Var2;
            this.n = p3Var4;
            this.o = c0Var;
            this.p = p3Var5;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            long j;
            boolean booleanValue = this.j.getValue().booleanValue();
            q1 q1Var = this.h;
            if (booleanValue) {
                long j2 = this.k.getValue().a;
                com.amazon.aps.iva.o2.c cVar = this.i;
                long j3 = this.l.getValue().invoke(cVar).a;
                if (com.amazon.aps.iva.e1.d.h(j3)) {
                    j = com.amazon.aps.iva.e1.c.f(this.m.getValue().a, j3);
                } else {
                    j = com.amazon.aps.iva.e1.c.d;
                }
                q1Var.b(j2, j, this.n.getValue().floatValue());
                long a = q1Var.a();
                com.amazon.aps.iva.yb0.c0 c0Var = this.o;
                if (!com.amazon.aps.iva.o2.j.a(a, c0Var.b)) {
                    c0Var.b = a;
                    com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q> value = this.p.getValue();
                    if (value != null) {
                        value.invoke(new com.amazon.aps.iva.o2.g(cVar.j(com.amazon.aps.iva.o2.k.b(a))));
                    }
                }
            } else {
                q1Var.dismiss();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(r1 r1Var, f1 f1Var, View view, com.amazon.aps.iva.o2.c cVar, float f, com.amazon.aps.iva.ve0.f0<com.amazon.aps.iva.kb0.q> f0Var, p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q>> p3Var, p3<Boolean> p3Var2, p3<com.amazon.aps.iva.e1.c> p3Var3, p3<? extends com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.o2.c, com.amazon.aps.iva.e1.c>> p3Var4, com.amazon.aps.iva.o0.q1<com.amazon.aps.iva.e1.c> q1Var, p3<Float> p3Var5, com.amazon.aps.iva.ob0.d<? super w0> dVar) {
        super(2, dVar);
        this.j = r1Var;
        this.k = f1Var;
        this.l = view;
        this.m = cVar;
        this.n = f;
        this.o = f0Var;
        this.p = p3Var;
        this.q = p3Var2;
        this.r = p3Var3;
        this.s = p3Var4;
        this.t = q1Var;
        this.u = p3Var5;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        w0 w0Var = new w0(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, dVar);
        w0Var.i = obj;
        return w0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((w0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        q1 q1Var;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                q1Var = (q1) this.i;
                try {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } catch (Throwable th) {
                    th = th;
                    q1Var.dismiss();
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.i;
            r1 r1Var = this.j;
            f1 f1Var = this.k;
            View view = this.l;
            com.amazon.aps.iva.o2.c cVar = this.m;
            q1 a2 = r1Var.a(f1Var, view, cVar, this.n);
            com.amazon.aps.iva.yb0.c0 c0Var = new com.amazon.aps.iva.yb0.c0();
            long a3 = a2.a();
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.o2.g, com.amazon.aps.iva.kb0.q> value = this.p.getValue();
            if (value != null) {
                value.invoke(new com.amazon.aps.iva.o2.g(cVar.j(com.amazon.aps.iva.o2.k.b(a3))));
            }
            c0Var.b = a3;
            com.amazon.aps.iva.dg.b.A(g0Var, new com.amazon.aps.iva.ve0.a0(this.o, new a(a2, null)));
            try {
                com.amazon.aps.iva.ve0.j0 m0 = com.amazon.aps.iva.cq.b.m0(new b(a2, this.m, this.q, this.r, this.s, this.t, this.u, c0Var, this.p));
                this.i = a2;
                this.h = 1;
                Object c = m0.c(com.amazon.aps.iva.we0.n.b, this);
                if (c != aVar) {
                    c = com.amazon.aps.iva.kb0.q.a;
                }
                if (c == aVar) {
                    return aVar;
                }
                q1Var = a2;
            } catch (Throwable th2) {
                th = th2;
                q1Var = a2;
                q1Var.dismiss();
                throw th;
            }
        }
        q1Var.dismiss();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
