package com.ellation.crunchyroll.feed;

import android.content.Intent;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vx.w;
import com.amazon.aps.iva.vx.x;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeFeedPresenter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/feed/HomeFeedPresenterImpl;", "Lcom/ellation/crunchyroll/feed/HomeFeedPresenter;", "Lcom/amazon/aps/iva/wy/b;", "Lcom/amazon/aps/iva/vx/w;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/vx/m;", "home-feed_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HomeFeedPresenterImpl extends com.amazon.aps.iva.wy.b<w> implements HomeFeedPresenter, EventDispatcher<com.amazon.aps.iva.vx.m> {
    public final x b;
    public final com.amazon.aps.iva.vx.h c;
    public final com.amazon.aps.iva.n60.b d;
    public final com.ellation.crunchyroll.watchlist.a e;
    public final boolean f;
    public final com.amazon.aps.iva.oh.g g;
    public final com.amazon.aps.iva.bh.c h;
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.vx.m> i;
    public boolean j;
    public boolean k;

    /* compiled from: HomeFeedPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<q, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "$this$observeEvent");
            HomeFeedPresenterImpl.this.c.b();
            return q.a;
        }
    }

    /* compiled from: HomeFeedPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.xx.l>>, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.xx.l>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.xx.l>> gVar2 = gVar;
            HomeFeedPresenterImpl homeFeedPresenterImpl = HomeFeedPresenterImpl.this;
            gVar2.c(new com.ellation.crunchyroll.feed.c(homeFeedPresenterImpl));
            gVar2.e(new g(homeFeedPresenterImpl));
            gVar2.b(new h(homeFeedPresenterImpl));
            return q.a;
        }
    }

    /* compiled from: HomeFeedPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public c(x xVar) {
            super(0, xVar, x.class, "reloadFeed", "reloadFeed()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((x) this.receiver).M5();
            return q.a;
        }
    }

    /* compiled from: HomeFeedPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class d implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(b bVar) {
            this.a = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFeedPresenterImpl(w wVar, x xVar, com.amazon.aps.iva.vx.i iVar, com.amazon.aps.iva.n60.b bVar, com.ellation.crunchyroll.watchlist.a aVar, boolean z, com.amazon.aps.iva.oh.g gVar, com.amazon.aps.iva.bh.c cVar) {
        super(wVar, new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(wVar, "view");
        com.amazon.aps.iva.yb0.j.f(cVar, "markAsWatchedMessageView");
        this.b = xVar;
        this.c = iVar;
        this.d = bVar;
        this.e = aVar;
        this.f = z;
        this.g = gVar;
        this.h = cVar;
        this.i = new EventDispatcher.EventDispatcherImpl<>();
        this.j = true;
        this.k = true;
    }

    @Override // com.amazon.aps.iva.b60.i
    public final void U0(com.amazon.aps.iva.b60.j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        boolean isResumed = getView().isResumed();
        x xVar = this.b;
        if (isResumed) {
            xVar.Z7();
        }
        xVar.v3(jVar);
    }

    @Override // com.ellation.crunchyroll.feed.HomeFeedPresenter
    public final void Z0() {
        this.b.M5();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(com.amazon.aps.iva.vx.m mVar) {
        com.amazon.aps.iva.vx.m mVar2 = mVar;
        com.amazon.aps.iva.yb0.j.f(mVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.i.addEventListener(mVar2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.i.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.i.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.vx.m, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.i.notify(lVar);
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
        this.b.i1();
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        x xVar = this.b;
        com.amazon.aps.iva.ez.e.a(xVar.w4(), getView(), new a());
        xVar.Y3().e(getView(), new d(new b()));
        this.e.a(this, getView());
        if (this.f) {
            getView().D2();
        }
    }

    @Override // com.ellation.crunchyroll.ui.recycler.OnLoadMoreScrollListener
    public final void onLoadMore() {
        this.b.e4();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        this.c.onNewIntent(intent);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        x xVar = this.b;
        this.d.b(new c(xVar));
        if (this.j) {
            this.j = false;
            return;
        }
        xVar.Q6();
        xVar.Z7();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(com.amazon.aps.iva.vx.m mVar) {
        com.amazon.aps.iva.vx.m mVar2 = mVar;
        com.amazon.aps.iva.yb0.j.f(mVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.i.removeEventListener(mVar2);
    }
}
