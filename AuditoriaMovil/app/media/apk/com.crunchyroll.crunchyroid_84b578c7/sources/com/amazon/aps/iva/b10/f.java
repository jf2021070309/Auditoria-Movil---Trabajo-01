package com.amazon.aps.iva.b10;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.download.notification.SummaryNotificationHandlerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadNotificationsManager.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final InternalDownloadsManager b;
    public final com.ellation.crunchyroll.presentation.download.notification.b c;
    public final g0 d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final p f;
    public final com.amazon.aps.iva.b10.a g;

    /* compiled from: DownloadNotificationsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.download.notification.DownloadNotificationsManager$onDownloadCancelled$1", f = "DownloadNotificationsManager.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            f fVar = f.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                InternalDownloadsManager internalDownloadsManager = fVar.b;
                this.h = 1;
                obj = internalDownloadsManager.h(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            PlayableAsset playableAsset = (PlayableAsset) obj;
            if (playableAsset != null) {
                fVar.b(playableAsset);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadNotificationsManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.download.notification.DownloadNotificationsManager$updateNotification$1", f = "DownloadNotificationsManager.kt", l = {142}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ e0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.j = e0Var;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            e0 e0Var = this.j;
            f fVar = f.this;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                InternalDownloadsManager internalDownloadsManager = fVar.b;
                String e = e0Var.e();
                this.h = 1;
                obj = internalDownloadsManager.h(e, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            PlayableAsset playableAsset = (PlayableAsset) obj;
            if (playableAsset != null) {
                f.a(fVar, e0Var, playableAsset);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public f(Context context, DownloadsManagerImpl downloadsManagerImpl, o oVar, com.amazon.aps.iva.sv.d dVar, com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "coroutineScope");
        com.amazon.aps.iva.yb0.j.f(aVar, "isUserLoggedIn");
        this.b = downloadsManagerImpl;
        this.c = oVar;
        this.d = dVar;
        this.e = aVar;
        this.f = new SummaryNotificationHandlerImpl(context, downloadsManagerImpl);
        this.g = new com.amazon.aps.iva.b10.b(context);
    }

    public static final void a(f fVar, e0 e0Var, PlayableAsset playableAsset) {
        l lVar;
        l lVar2;
        fVar.getClass();
        boolean z = playableAsset instanceof Episode;
        com.ellation.crunchyroll.presentation.download.notification.b bVar = fVar.c;
        if (z) {
            Episode episode = (Episode) playableAsset;
            String seasonId = episode.getSeasonId();
            com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
            if (!e0Var.m() && !e0Var.l()) {
                lVar2 = l.DISMISSIBLE;
            } else {
                lVar2 = l.NOT_DISMISSIBLE;
            }
            bVar.a(new k(seasonId, lVar2));
            fVar.f.z(episode);
            return;
        }
        String e = e0Var.e();
        if (!e0Var.m() && !e0Var.l()) {
            lVar = l.DISMISSIBLE;
        } else {
            lVar = l.NOT_DISMISSIBLE;
        }
        bVar.a(new k(e, lVar));
        fVar.g.g(e0Var, playableAsset);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void A0(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var);
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
        this.f.m();
        this.c.a(new k("1122", l.DISMISSIBLE));
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void M3(List<? extends e0> list) {
        com.amazon.aps.iva.yb0.j.f(list, "localVideos");
        for (e0 e0Var : list) {
            c(e0Var);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void P5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new a(str, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void T3() {
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void V4(List<? extends PlayableAsset> list) {
        com.amazon.aps.iva.yb0.j.f(list, "playableAssets");
        for (PlayableAsset playableAsset : list) {
            b(playableAsset);
        }
    }

    public final void b(PlayableAsset playableAsset) {
        boolean z = playableAsset instanceof Episode;
        com.ellation.crunchyroll.presentation.download.notification.b bVar = this.c;
        if (z) {
            Episode episode = (Episode) playableAsset;
            bVar.c(episode.getSeasonId(), true);
            this.f.p(episode.getSeasonId());
            return;
        }
        bVar.c(playableAsset.getId(), true);
        this.g.h(playableAsset.getId());
    }

    public final void c(e0 e0Var) {
        if (this.e.invoke().booleanValue()) {
            com.amazon.aps.iva.se0.i.d(this.d, null, null, new b(e0Var, null), 3);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void c3(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new h(this, str, null), 3);
    }

    @Override // com.amazon.aps.iva.b10.e
    public final void f() {
        this.g.f();
        this.f.f();
        this.c.b();
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void f7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s3(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        this.f.D();
        this.c.c("1122", false);
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new g(this, e0Var, null), 3);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void s8(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        c(e0Var);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void t3() {
        new Handler(Looper.getMainLooper()).postDelayed(new com.amazon.aps.iva.v1.p(this, 8), 500L);
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void u7(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void v5(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((e0) it.next());
        }
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
        for (PlayableAsset playableAsset : list) {
            b(playableAsset);
        }
    }

    @Override // com.ellation.crunchyroll.downloading.g0
    public final void z3(e0 e0Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "localVideo");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        c(e0Var);
    }
}
