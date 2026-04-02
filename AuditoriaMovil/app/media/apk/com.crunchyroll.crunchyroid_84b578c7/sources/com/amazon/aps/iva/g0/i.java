package com.amazon.aps.iva.g0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.s1.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: BringIntoViewResponder.kt */
/* loaded from: classes.dex */
public final class i extends com.amazon.aps.iva.g0.a implements c {
    public h q;
    public final com.amazon.aps.iva.t1.j r;

    /* compiled from: BringIntoViewResponder.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super j1>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ q j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> k;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> l;

        /* compiled from: BringIntoViewResponder.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {170}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.g0.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0282a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ i i;
            public final /* synthetic */ q j;
            public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> k;

            /* compiled from: BringIntoViewResponder.kt */
            /* renamed from: com.amazon.aps.iva.g0.i$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0283a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> {
                public final /* synthetic */ i b;
                public final /* synthetic */ q c;
                public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0283a(i iVar, q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar) {
                    super(0, j.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.b = iVar;
                    this.c = qVar;
                    this.d = aVar;
                }

                @Override // com.amazon.aps.iva.xb0.a
                public final com.amazon.aps.iva.e1.e invoke() {
                    return i.u1(this.b, this.c, this.d);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0282a(i iVar, q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar, com.amazon.aps.iva.ob0.d<? super C0282a> dVar) {
                super(2, dVar);
                this.i = iVar;
                this.j = qVar;
                this.k = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0282a(this.i, this.j, this.k, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0282a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    i iVar = this.i;
                    h hVar = iVar.q;
                    C0283a c0283a = new C0283a(iVar, this.j, this.k);
                    this.h = 1;
                    if (hVar.l(c0283a, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: BringIntoViewResponder.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {179}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public int h;
            public final /* synthetic */ i i;
            public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
                super(2, dVar);
                this.i = iVar;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
                return new b(this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.p
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                int i = this.h;
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    i iVar = this.i;
                    iVar.getClass();
                    c cVar = (c) iVar.l(com.amazon.aps.iva.g0.b.a);
                    if (cVar == null) {
                        cVar = iVar.o;
                    }
                    q t1 = iVar.t1();
                    if (t1 == null) {
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    this.h = 1;
                    if (cVar.Z(t1, this.j, this) == aVar) {
                        return aVar;
                    }
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar2, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = qVar;
            this.k = aVar;
            this.l = aVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, this.l, dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super j1> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            g0 g0Var = (g0) this.h;
            i iVar = i.this;
            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new C0282a(iVar, this.j, this.k, null), 3);
            return com.amazon.aps.iva.se0.i.d(g0Var, null, null, new b(iVar, this.l, null), 3);
        }
    }

    /* compiled from: BringIntoViewResponder.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> {
        public final /* synthetic */ q i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar) {
            super(0);
            this.i = qVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.e1.e invoke() {
            i iVar = i.this;
            com.amazon.aps.iva.e1.e u1 = i.u1(iVar, this.i, this.j);
            if (u1 != null) {
                return iVar.q.p(u1);
            }
            return null;
        }
    }

    public i(h hVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(hVar, "responder");
        this.q = hVar;
        com.amazon.aps.iva.t1.i<c> iVar = com.amazon.aps.iva.g0.b.a;
        com.amazon.aps.iva.t1.j jVar = new com.amazon.aps.iva.t1.j(iVar);
        if (iVar == jVar.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jVar.b.setValue(this);
            this.r = jVar;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final com.amazon.aps.iva.e1.e u1(i iVar, q qVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.e1.e eVar;
        q t1 = iVar.t1();
        if (t1 == null) {
            return null;
        }
        if (!qVar.l()) {
            qVar = null;
        }
        if (qVar == null || (eVar = (com.amazon.aps.iva.e1.e) aVar.invoke()) == null) {
            return null;
        }
        com.amazon.aps.iva.e1.e f = t1.f(qVar, false);
        return eVar.d(com.amazon.aps.iva.e1.d.d(f.a, f.b));
    }

    @Override // com.amazon.aps.iva.t1.f
    public final com.amazon.aps.iva.ab.a P() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.g0.c
    public final Object Z(q qVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e1.e> aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object p = z.p(new a(qVar, aVar, new b(qVar, aVar), null), dVar);
        if (p == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return p;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
