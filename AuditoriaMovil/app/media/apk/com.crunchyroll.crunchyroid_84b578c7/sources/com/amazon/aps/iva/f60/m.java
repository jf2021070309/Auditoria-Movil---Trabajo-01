package com.amazon.aps.iva.f60;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.model.Panel;
import java.io.Serializable;
/* compiled from: CardWatchlistItemToggleViewModel.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.ez.b implements l, g0 {
    public final r b;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d c;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<Panel>>> d;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<Panel>>> e;

    /* compiled from: CardWatchlistItemToggleViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.watchlisttoggle.CardWatchlistItemToggleViewModelImpl$addToWatchlist$1", f = "CardWatchlistItemToggleViewModel.kt", l = {40}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public v h;
        public m i;
        public int j;
        public /* synthetic */ Object k;
        public final /* synthetic */ Panel m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Panel panel, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.m = panel;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.m, dVar);
            aVar.k = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r7.j
                com.ellation.crunchyroll.model.Panel r2 = r7.m
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 != r3) goto L19
                com.amazon.aps.iva.f60.m r0 = r7.i
                com.amazon.aps.iva.i5.v r1 = r7.h
                java.lang.Object r3 = r7.k
                com.ellation.crunchyroll.model.Panel r3 = (com.ellation.crunchyroll.model.Panel) r3
                com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.lang.Throwable -> L17
                goto L51
            L17:
                r8 = move-exception
                goto L4d
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                com.amazon.aps.iva.ab.x.i0(r8)
                java.lang.Object r8 = r7.k
                com.amazon.aps.iva.se0.g0 r8 = (com.amazon.aps.iva.se0.g0) r8
                com.amazon.aps.iva.f60.m r8 = com.amazon.aps.iva.f60.m.this
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.model.Panel>>> r1 = r8.d
                com.amazon.aps.iva.ez.h.d(r1)
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<com.ellation.crunchyroll.model.Panel>>> r1 = r8.d
                com.amazon.aps.iva.f60.r r4 = r8.b     // Catch: java.lang.Throwable -> L49
                java.lang.String r5 = com.amazon.aps.iva.xw.f0.a(r2)     // Catch: java.lang.Throwable -> L49
                r7.k = r2     // Catch: java.lang.Throwable -> L49
                r7.h = r1     // Catch: java.lang.Throwable -> L49
                r7.i = r8     // Catch: java.lang.Throwable -> L49
                r7.j = r3     // Catch: java.lang.Throwable -> L49
                java.lang.Object r3 = r4.l(r5, r7)     // Catch: java.lang.Throwable -> L49
                if (r3 != r0) goto L46
                return r0
            L46:
                r0 = r8
                r3 = r2
                goto L51
            L49:
                r0 = move-exception
                r6 = r0
                r0 = r8
                r8 = r6
            L4d:
                com.amazon.aps.iva.kb0.k$a r3 = com.amazon.aps.iva.ab.x.H(r8)
            L51:
                java.lang.Throwable r8 = com.amazon.aps.iva.kb0.k.a(r3)
                if (r8 != 0) goto L58
                goto L64
            L58:
                boolean r3 = r8 instanceof com.ellation.crunchyroll.api.etp.error.ConflictException     // Catch: java.lang.Throwable -> L5f
                if (r3 == 0) goto L5e
                r3 = r2
                goto L64
            L5e:
                throw r8     // Catch: java.lang.Throwable -> L5f
            L5f:
                r8 = move-exception
                com.amazon.aps.iva.kb0.k$a r3 = com.amazon.aps.iva.ab.x.H(r8)
            L64:
                com.amazon.aps.iva.ez.g r8 = com.amazon.aps.iva.f60.m.N8(r0, r3, r2)
                com.amazon.aps.iva.ez.d r0 = new com.amazon.aps.iva.ez.d
                r0.<init>(r8)
                r1.k(r0)
                com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f60.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CardWatchlistItemToggleViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.watchlisttoggle.CardWatchlistItemToggleViewModelImpl$removeFromWatchlist$1", f = "CardWatchlistItemToggleViewModel.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public v h;
        public m i;
        public int j;
        public /* synthetic */ Object k;
        public final /* synthetic */ Panel m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Panel panel, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.m = panel;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            b bVar = new b(this.m, dVar);
            bVar.k = obj;
            return bVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<Panel>>> vVar;
            m mVar;
            Throwable th;
            Serializable serializable;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.j;
            Panel panel = this.m;
            if (i != 0) {
                if (i == 1) {
                    mVar = this.i;
                    vVar = this.h;
                    serializable = (Panel) this.k;
                    try {
                        x.i0(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        serializable = x.H(th);
                        vVar.k(new com.amazon.aps.iva.ez.d<>(m.N8(mVar, serializable, panel)));
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.k;
                m mVar2 = m.this;
                com.amazon.aps.iva.ez.h.d(mVar2.e);
                vVar = mVar2.e;
                try {
                    r rVar = mVar2.b;
                    String a = f0.a(panel);
                    this.k = panel;
                    this.h = vVar;
                    this.i = mVar2;
                    this.j = 1;
                    if (rVar.s(a, this) == aVar) {
                        return aVar;
                    }
                    mVar = mVar2;
                    serializable = panel;
                } catch (Throwable th3) {
                    mVar = mVar2;
                    th = th3;
                    serializable = x.H(th);
                    vVar.k(new com.amazon.aps.iva.ez.d<>(m.N8(mVar, serializable, panel)));
                    return com.amazon.aps.iva.kb0.q.a;
                }
            }
            vVar.k(new com.amazon.aps.iva.ez.d<>(m.N8(mVar, serializable, panel)));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar) {
        super(sVar);
        com.amazon.aps.iva.yb0.j.f(sVar, "watchlistItemToggleInteractor");
        this.b = sVar;
        this.c = z.j();
        this.d = new v<>();
        this.e = new v<>();
    }

    public static final com.amazon.aps.iva.ez.g N8(m mVar, Serializable serializable, Panel panel) {
        mVar.getClass();
        Throwable a2 = com.amazon.aps.iva.kb0.k.a(serializable);
        if (a2 == null) {
            return new g.c(serializable, null);
        }
        if (serializable instanceof k.a) {
            serializable = panel;
        }
        return new g.a(serializable, a2);
    }

    @Override // com.amazon.aps.iva.f60.l
    public final v A5() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.c.b;
    }

    @Override // com.amazon.aps.iva.f60.l
    public final v o8() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        z.l(this, null);
    }

    @Override // com.amazon.aps.iva.f60.l
    public final void r5(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.se0.i.d(this, null, null, new a(panel, null), 3);
    }

    @Override // com.amazon.aps.iva.f60.l
    public final void z8(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.se0.i.d(this, null, null, new b(panel, null), 3);
    }
}
