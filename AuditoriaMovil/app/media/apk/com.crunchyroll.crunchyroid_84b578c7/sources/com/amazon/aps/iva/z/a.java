package com.amazon.aps.iva.z;

import java.util.concurrent.CancellationException;
/* compiled from: Animatable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super h<Object, p>>, Object> {
    public l h;
    public com.amazon.aps.iva.yb0.z i;
    public int j;
    public final /* synthetic */ b<Object, p> k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ f<Object, p> m;
    public final /* synthetic */ long n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<b<Object, p>, com.amazon.aps.iva.kb0.q> o;

    /* compiled from: Animatable.kt */
    /* renamed from: com.amazon.aps.iva.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0903a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<i<Object, p>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ b<Object, p> h;
        public final /* synthetic */ l<Object, p> i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<b<Object, p>, com.amazon.aps.iva.kb0.q> j;
        public final /* synthetic */ com.amazon.aps.iva.yb0.z k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0903a(b<Object, p> bVar, l<Object, p> lVar, com.amazon.aps.iva.xb0.l<? super b<Object, p>, com.amazon.aps.iva.kb0.q> lVar2, com.amazon.aps.iva.yb0.z zVar) {
            super(1);
            this.h = bVar;
            this.i = lVar;
            this.j = lVar2;
            this.k = zVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(i<Object, p> iVar) {
            i<Object, p> iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$animate");
            b<Object, p> bVar = this.h;
            w0.e(iVar2, bVar.c);
            Object a = b.a(bVar, iVar2.a());
            boolean a2 = com.amazon.aps.iva.yb0.j.a(a, iVar2.a());
            com.amazon.aps.iva.xb0.l<b<Object, p>, com.amazon.aps.iva.kb0.q> lVar = this.j;
            if (!a2) {
                bVar.c.c.setValue(a);
                this.i.c.setValue(a);
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                iVar2.i.setValue(Boolean.FALSE);
                iVar2.d.invoke();
                this.k.b = true;
            } else if (lVar != null) {
                lVar.invoke(bVar);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<Object, p> bVar, Object obj, f<Object, p> fVar, long j, com.amazon.aps.iva.xb0.l<? super b<Object, p>, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(1, dVar);
        this.k = bVar;
        this.l = obj;
        this.m = fVar;
        this.n = j;
        this.o = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new a(this.k, this.l, this.m, this.n, this.o, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super h<Object, p>> dVar) {
        return ((a) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.yb0.z zVar;
        l lVar;
        g gVar;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.j;
        b<Object, p> bVar = this.k;
        try {
            if (i != 0) {
                if (i == 1) {
                    zVar = this.i;
                    lVar = this.h;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                l<Object, p> lVar2 = bVar.c;
                V v = (V) bVar.a.a().invoke(this.l);
                lVar2.getClass();
                com.amazon.aps.iva.yb0.j.f(v, "<set-?>");
                lVar2.d = v;
                bVar.e.setValue(this.m.g());
                bVar.d.setValue(Boolean.TRUE);
                l<Object, p> lVar3 = bVar.c;
                l lVar4 = new l(lVar3.b, lVar3.getValue(), com.amazon.aps.iva.e.z.n(lVar3.d), lVar3.e, Long.MIN_VALUE, lVar3.g);
                com.amazon.aps.iva.yb0.z zVar2 = new com.amazon.aps.iva.yb0.z();
                f<Object, p> fVar = this.m;
                long j = this.n;
                C0903a c0903a = new C0903a(bVar, lVar4, this.o, zVar2);
                this.h = lVar4;
                this.i = zVar2;
                this.j = 1;
                if (w0.b(lVar4, fVar, j, c0903a, this) == aVar) {
                    return aVar;
                }
                zVar = zVar2;
                lVar = lVar4;
            }
            if (zVar.b) {
                gVar = g.BoundReached;
            } else {
                gVar = g.Finished;
            }
            l<Object, p> lVar5 = bVar.c;
            lVar5.d.d();
            lVar5.e = Long.MIN_VALUE;
            bVar.d.setValue(Boolean.FALSE);
            return new h(lVar, gVar);
        } catch (CancellationException e) {
            l<Object, p> lVar6 = bVar.c;
            lVar6.d.d();
            lVar6.e = Long.MIN_VALUE;
            bVar.d.setValue(Boolean.FALSE);
            throw e;
        }
    }
}
