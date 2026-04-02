package com.amazon.aps.iva.yo;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadingMatureFlowPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<d> implements com.amazon.aps.iva.ng.a {
    public final com.amazon.aps.iva.fp.d b;
    public final com.amazon.aps.iva.lg.a c;
    public l<? super PlayableAsset, q> d;

    /* compiled from: DownloadingMatureFlowPresenter.kt */
    @e(c = "com.crunchyroll.watchscreen.screen.downloading.mature.DownloadingMatureFlowPresenterImpl$onCreate$1", f = "DownloadingMatureFlowPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g<? extends PlayableAsset>, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        /* compiled from: DownloadingMatureFlowPresenter.kt */
        /* renamed from: com.amazon.aps.iva.yo.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0895a extends com.amazon.aps.iva.yb0.l implements l<PlayableAsset, q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0895a(b bVar) {
                super(1);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(PlayableAsset playableAsset) {
                PlayableAsset playableAsset2 = playableAsset;
                b bVar = this.h;
                if (playableAsset2 != null) {
                    bVar.d.invoke(playableAsset2);
                }
                bVar.d = com.amazon.aps.iva.yo.a.h;
                return q.a;
            }
        }

        /* compiled from: DownloadingMatureFlowPresenter.kt */
        /* renamed from: com.amazon.aps.iva.yo.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0896b extends com.amazon.aps.iva.yb0.l implements l<Throwable, q> {
            public final /* synthetic */ b h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0896b(b bVar) {
                super(1);
                this.h = bVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                j.f(th, "it");
                this.h.d = com.amazon.aps.iva.yo.c.h;
                return q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g<? extends PlayableAsset> gVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            g gVar = (g) this.h;
            b bVar = b.this;
            gVar.e(new C0895a(bVar));
            gVar.b(new C0896b(bVar));
            return q.a;
        }
    }

    /* compiled from: DownloadingMatureFlowPresenter.kt */
    /* renamed from: com.amazon.aps.iva.yo.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0897b extends com.amazon.aps.iva.yb0.i implements l<PlayableAsset, q> {
        public C0897b(com.amazon.aps.iva.fp.d dVar) {
            super(1, dVar, com.amazon.aps.iva.fp.d.class, "onEnableMatureContent", "onEnableMatureContent(Lcom/ellation/crunchyroll/model/PlayableAsset;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(PlayableAsset playableAsset) {
            ((com.amazon.aps.iva.fp.d) this.receiver).onEnableMatureContent(playableAsset);
            return q.a;
        }
    }

    /* compiled from: DownloadingMatureFlowPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements l<PlayableAsset, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(PlayableAsset playableAsset) {
            j.f(playableAsset, "it");
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.amazon.aps.iva.fp.d dVar, com.amazon.aps.iva.lg.a aVar, d dVar2) {
        super(dVar2, new com.amazon.aps.iva.wy.j[0]);
        j.f(dVar2, "view");
        this.b = dVar;
        this.c = aVar;
        this.d = c.h;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.fp.d dVar = this.b;
        com.amazon.aps.iva.dg.b.A(x.O(getView()), new a0(dVar.getMatureFlowStatus(), new a(null)));
        this.c.b(new C0897b(dVar));
    }

    @Override // com.amazon.aps.iva.ng.a
    public final void y4(PlayableAsset playableAsset, com.amazon.aps.iva.r00.c cVar, com.amazon.aps.iva.pg.b bVar) {
        j.f(playableAsset, "matureAsset");
        j.f(bVar, "accessReason");
        this.d = cVar;
        this.c.a(playableAsset);
    }
}
