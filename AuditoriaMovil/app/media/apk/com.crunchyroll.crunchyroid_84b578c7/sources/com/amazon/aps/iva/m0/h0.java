package com.amazon.aps.iva.m0;
/* compiled from: Button.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {509}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.c0.k i;
    public final /* synthetic */ com.amazon.aps.iva.y0.u<com.amazon.aps.iva.c0.j> j;

    /* compiled from: Button.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.c0.j> {
        public final /* synthetic */ com.amazon.aps.iva.y0.u<com.amazon.aps.iva.c0.j> b;

        public a(com.amazon.aps.iva.y0.u<com.amazon.aps.iva.c0.j> uVar) {
            this.b = uVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.c0.j jVar, com.amazon.aps.iva.ob0.d dVar) {
            com.amazon.aps.iva.c0.j jVar2 = jVar;
            boolean z = jVar2 instanceof com.amazon.aps.iva.c0.g;
            com.amazon.aps.iva.y0.u<com.amazon.aps.iva.c0.j> uVar = this.b;
            if (z) {
                uVar.add(jVar2);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.h) {
                uVar.remove(((com.amazon.aps.iva.c0.h) jVar2).a);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.d) {
                uVar.add(jVar2);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.e) {
                uVar.remove(((com.amazon.aps.iva.c0.e) jVar2).a);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.o) {
                uVar.add(jVar2);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.p) {
                uVar.remove(((com.amazon.aps.iva.c0.p) jVar2).a);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.n) {
                uVar.remove(((com.amazon.aps.iva.c0.n) jVar2).a);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.amazon.aps.iva.c0.k kVar, com.amazon.aps.iva.y0.u<com.amazon.aps.iva.c0.j> uVar, com.amazon.aps.iva.ob0.d<? super h0> dVar) {
        super(2, dVar);
        this.i = kVar;
        this.j = uVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h0(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.ve0.l0 c = this.i.c();
            a aVar2 = new a(this.j);
            this.h = 1;
            c.getClass();
            if (com.amazon.aps.iva.ve0.l0.l(c, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
