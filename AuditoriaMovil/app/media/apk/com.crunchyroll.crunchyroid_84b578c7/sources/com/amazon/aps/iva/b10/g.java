package com.amazon.aps.iva.b10;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Movie;
/* compiled from: DownloadNotificationsManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.download.notification.DownloadNotificationsManager$updateMovieProgressNotification$1", f = "DownloadNotificationsManager.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ f i;
    public final /* synthetic */ e0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, e0 e0Var, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = fVar;
        this.j = e0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        e0 e0Var = this.j;
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
            String e = e0Var.e();
            this.h = 1;
            obj = internalDownloadsManager.getMovie(e, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Movie movie = (Movie) obj;
        if (movie != null) {
            f.a(fVar, e0Var, movie);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
