package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.p3;
/* compiled from: SelectionMagnifier.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> j;
    public final /* synthetic */ com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> k;

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.c> {
        public final /* synthetic */ p3<com.amazon.aps.iva.e1.c> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3<com.amazon.aps.iva.e1.c> p3Var) {
            super(0);
            this.h = p3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.e1.c invoke() {
            com.amazon.aps.iva.z.n nVar = p.a;
            return new com.amazon.aps.iva.e1.c(this.h.getValue().a);
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.e1.c> {
        public final /* synthetic */ com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> b;
        public final /* synthetic */ com.amazon.aps.iva.se0.g0 c;

        public b(com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> bVar, com.amazon.aps.iva.se0.g0 g0Var) {
            this.b = bVar;
            this.c = g0Var;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.e1.c cVar, com.amazon.aps.iva.ob0.d dVar) {
            boolean z;
            long j = cVar.a;
            com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> bVar = this.b;
            if (com.amazon.aps.iva.e1.d.h(bVar.c().a) && com.amazon.aps.iva.e1.d.h(j)) {
                if (com.amazon.aps.iva.e1.c.d(bVar.c().a) == com.amazon.aps.iva.e1.c.d(j)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    com.amazon.aps.iva.se0.i.d(this.c, null, null, new t(bVar, j, null), 3);
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            Object d = bVar.d(new com.amazon.aps.iva.e1.c(j), dVar);
            if (d != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return com.amazon.aps.iva.kb0.q.a;
            }
            return d;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p3<com.amazon.aps.iva.e1.c> p3Var, com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> bVar, com.amazon.aps.iva.ob0.d<? super s> dVar) {
        super(2, dVar);
        this.j = p3Var;
        this.k = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        s sVar = new s(this.j, this.k, dVar);
        sVar.i = obj;
        return sVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((s) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.ve0.j0 m0 = com.amazon.aps.iva.cq.b.m0(new a(this.j));
            b bVar = new b(this.k, (com.amazon.aps.iva.se0.g0) this.i);
            this.h = 1;
            if (m0.c(bVar, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
