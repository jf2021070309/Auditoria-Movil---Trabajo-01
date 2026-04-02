package com.amazon.aps.iva.fp;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenMatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> {
    public final d b;

    /* compiled from: WatchScreenMatureFlowPresenter.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.mature.WatchScreenMatureFlowPresenterImpl$onCreate$1", f = "WatchScreenMatureFlowPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<Boolean, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ boolean h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Boolean bool, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(Boolean.valueOf(bool.booleanValue()), dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            boolean z = this.h;
            b bVar = b.this;
            if (z) {
                b.q6(bVar).Rg();
            } else {
                b.q6(bVar).d6();
            }
            return q.a;
        }
    }

    /* compiled from: WatchScreenMatureFlowPresenter.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.mature.WatchScreenMatureFlowPresenterImpl$onCreate$2", f = "WatchScreenMatureFlowPresenter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.fp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0255b extends i implements p<g<? extends PlayableAsset>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        /* compiled from: WatchScreenMatureFlowPresenter.kt */
        /* renamed from: com.amazon.aps.iva.fp.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.l<PlayableAsset, q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(PlayableAsset playableAsset) {
                b bVar = this.h;
                b.q6(bVar).M();
                b.q6(bVar).d6();
                b.q6(bVar).showSnackbar(com.amazon.aps.iva.fp.a.b);
                return q.a;
            }
        }

        /* compiled from: WatchScreenMatureFlowPresenter.kt */
        /* renamed from: com.amazon.aps.iva.fp.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0256b extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0256b(b bVar) {
                super(1);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                j.f(th, "it");
                b bVar = this.h;
                b.q6(bVar).showSnackbar(com.amazon.aps.iva.bt.c.b);
                b.q6(bVar).d6();
                return q.a;
            }
        }

        public C0255b(com.amazon.aps.iva.ob0.d<? super C0255b> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0255b c0255b = new C0255b(dVar);
            c0255b.h = obj;
            return c0255b;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g<? extends PlayableAsset> gVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0255b) create(gVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            g gVar = (g) this.h;
            b bVar = b.this;
            gVar.e(new a(bVar));
            gVar.b(new C0256b(bVar));
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d dVar) {
        super(cVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(cVar, "view");
        this.b = dVar;
    }

    public static final /* synthetic */ c q6(b bVar) {
        return bVar.getView();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        d dVar = this.b;
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(dVar.getMatureFlowProcessing(), new a(null)));
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(dVar.getMatureFlowStatus(), new C0255b(null)));
    }

    public final void r6(PlayableAsset playableAsset) {
        this.b.onEnableMatureContent(playableAsset);
    }
}
