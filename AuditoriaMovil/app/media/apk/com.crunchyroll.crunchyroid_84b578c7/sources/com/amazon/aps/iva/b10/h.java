package com.amazon.aps.iva.b10;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: DownloadNotificationsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.download.notification.DownloadNotificationsManager$updateNotificationForRemoveStarted$1", f = "DownloadNotificationsManager.kt", l = {168}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f i;
    public final /* synthetic */ String j;

    /* compiled from: DownloadNotificationsManager.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ f h;
        public final /* synthetic */ PlayableAsset i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, PlayableAsset playableAsset) {
            super(0);
            this.h = fVar;
            this.i = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            this.h.c.a(new k(((Episode) this.i).getSeasonId(), l.DISMISSIBLE));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(2, dVar);
        this.i = fVar;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new h(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((h) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        f fVar = this.i;
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
            if (playableAsset instanceof Episode) {
                Episode episode = (Episode) playableAsset;
                int m7 = fVar.b.m7(playableAsset.getParentId(), episode.getSeasonId());
                if (m7 != 0 && m7 != 1) {
                    fVar.f.i(episode, new a(fVar, playableAsset));
                } else {
                    fVar.b(playableAsset);
                }
            } else {
                fVar.b(playableAsset);
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
