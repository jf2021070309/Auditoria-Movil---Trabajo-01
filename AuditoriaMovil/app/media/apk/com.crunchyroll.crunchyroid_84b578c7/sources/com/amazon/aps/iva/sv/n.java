package com.amazon.aps.iva.sv;

import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadsInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class n implements g2 {
    public final com.amazon.aps.iva.se0.g0 a;
    public final com.amazon.aps.iva.se0.g0 b;
    public final InternalDownloadsManager c;
    public final BulkDownloadsManager d;
    public final com.amazon.aps.iva.wu.a e;

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$cancelDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.c.F8(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$checkBulkDownloadStatus$2", f = "DownloadsInteractorImpl.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.hg.f>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.hg.g j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.hg.f> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                BulkDownloadsManager bulkDownloadsManager = n.this.d;
                this.h = 1;
                obj = bulkDownloadsManager.m0(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$pauseDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.c.g(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$removeDownload$1", f = "DownloadsInteractorImpl.kt", l = {146}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                this.h = 1;
                if (n.this.c.R3(new String[]{this.j}, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$removeRelatedDubs$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.hg.g i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.i = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((e) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.d.K0(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$renewDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.c.N0(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$resumeDownload$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PlayableAsset playableAsset, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.c.S0(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$start$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.hg.g i;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> j;

        /* compiled from: DownloadsInteractorImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ n h;
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> i;
            public final /* synthetic */ com.amazon.aps.iva.hg.g j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n nVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.hg.g gVar) {
                super(0);
                this.h = nVar;
                this.i = lVar;
                this.j = gVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final com.amazon.aps.iva.kb0.q invoke() {
                n nVar = this.h;
                com.amazon.aps.iva.se0.i.d(nVar.a, nVar.e.c(), null, new w(this.i, this.j, null), 2);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(2, dVar);
            this.i = gVar;
            this.j = lVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new h(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n nVar = n.this;
            BulkDownloadsManager bulkDownloadsManager = nVar.d;
            com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar = this.j;
            com.amazon.aps.iva.hg.g gVar = this.i;
            bulkDownloadsManager.w2(gVar, new a(nVar, lVar, gVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsInteractorImpl$stopRelatedDubs$1", f = "DownloadsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public final /* synthetic */ com.amazon.aps.iva.hg.g i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(2, dVar);
            this.i = gVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new i(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((i) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            n.this.d.y(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public n(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.sv.c cVar, InternalDownloadsManager internalDownloadsManager, BulkDownloadsManager bulkDownloadsManager, com.amazon.aps.iva.wu.a aVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "lifecycleCoroutineScope");
        this.a = g0Var;
        this.b = cVar;
        this.c = internalDownloadsManager;
        this.d = bulkDownloadsManager;
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void K0(com.amazon.aps.iva.hg.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new e(gVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void N0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new f(str, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void S0(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new g(playableAsset, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void T0(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.hg.g, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new h(gVar, lVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void U0(PlayableAsset playableAsset, com.amazon.aps.iva.r00.j jVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new v(this, playableAsset, jVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void V0(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.u00.f fVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new a0(this, gVar, fVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void W0(String str, com.amazon.aps.iva.r00.n nVar) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new p(this, str, nVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void X0(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.u00.l lVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "toDownload");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new o(this, gVar, lVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void Y0(PlayableAsset playableAsset, String str, com.amazon.aps.iva.r00.m mVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.a(), null, new r(this, playableAsset, str, mVar, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void Z0(PlayableAsset playableAsset, com.amazon.aps.iva.r00.h hVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.xg.a k0 = com.amazon.aps.iva.ab.x.k0(playableAsset);
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new y(this, k0, hVar, playableAsset, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void a1(com.amazon.aps.iva.hg.g gVar, String str, com.amazon.aps.iva.u00.h hVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.yb0.j.f(str, "audioLocale");
        this.d.l2(gVar, str, new t(this, hVar));
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void b1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new a(str, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void g(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new c(str, null), 2);
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void h(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new d(str, null), 2);
    }

    @Override // com.amazon.aps.iva.fg.b
    public final Object m0(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.hg.f> dVar) {
        return com.amazon.aps.iva.se0.i.g(dVar, this.e.b(), new b(gVar, null));
    }

    @Override // com.amazon.aps.iva.sv.g2
    public final void y(com.amazon.aps.iva.hg.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        com.amazon.aps.iva.se0.i.d(this.b, this.e.b(), null, new i(gVar, null), 2);
    }
}
