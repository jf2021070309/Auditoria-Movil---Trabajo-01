package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.oy.d;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SyncStatusUpdateProviderImpl.kt */
/* loaded from: classes2.dex */
public final class i0 implements g0, com.amazon.aps.iva.fg.f {
    public final InternalDownloadsManager b;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q>, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.se0.g0 d;
    public final com.amazon.aps.iva.wu.a e;
    public com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> f;

    /* compiled from: SyncStatusUpdateProviderImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.SyncStatusUpdateProviderImpl$notifyListener$1", f = "SyncStatusUpdateProviderImpl.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {

        /* compiled from: SyncStatusUpdateProviderImpl.kt */
        /* renamed from: com.ellation.crunchyroll.downloading.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0965a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0965a(com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar) {
                super(1);
                this.h = lVar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
                this.h.invoke(Boolean.valueOf(bool.booleanValue()));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            i0 i0Var = i0.this;
            com.amazon.aps.iva.xb0.l<? super Boolean, com.amazon.aps.iva.kb0.q> lVar = i0Var.f;
            if (lVar != null) {
                i0Var.c.invoke(new C0965a(lVar));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SyncStatusUpdateProviderImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.SyncStatusUpdateProviderImpl$triggerSyncUpdate$1", f = "SyncStatusUpdateProviderImpl.kt", l = {39}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* compiled from: SyncStatusUpdateProviderImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends String>, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ i0 h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i0 i0Var) {
                super(1);
                this.h = i0Var;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(List<? extends String> list) {
                List<? extends String> list2 = list;
                com.amazon.aps.iva.yb0.j.f(list2, "seasonQueue");
                if (list2.isEmpty()) {
                    this.h.b();
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            i0 i0Var = i0.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                InternalDownloadsManager internalDownloadsManager = i0Var.b;
                this.h = 1;
                obj = internalDownloadsManager.h(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            PlayableAsset playableAsset = (PlayableAsset) obj;
            if (playableAsset instanceof Episode) {
                Episode episode = (Episode) playableAsset;
                i0Var.b.c7(episode.getParentId(), episode.getSeasonId(), new a(i0Var));
            } else {
                i0Var.b();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public i0(InternalDownloadsManager internalDownloadsManager, com.amazon.aps.iva.sv.f fVar, com.amazon.aps.iva.xe0.d dVar) {
        com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        this.b = internalDownloadsManager;
        this.c = fVar;
        this.d = dVar;
        this.e = bVar;
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J3(com.amazon.aps.iva.nw.g gVar) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void J7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void L0() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        c(str);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.amazon.aps.iva.fg.f
    public final void a(d.b bVar) {
        this.f = bVar;
        InternalDownloadsManager internalDownloadsManager = this.b;
        if (bVar == null) {
            internalDownloadsManager.removeEventListener(this);
            return;
        }
        internalDownloadsManager.addEventListener(this);
        b();
    }

    public final void b() {
        com.amazon.aps.iva.se0.i.d(this.d, this.e.c(), null, new a(null), 2);
    }

    public final void c(String str) {
        com.amazon.aps.iva.se0.i.d(this.d, this.e.a(), null, new b(str, null), 2);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var.e());
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void x6(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void y7(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z1(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        c(e0Var.e());
    }
}
