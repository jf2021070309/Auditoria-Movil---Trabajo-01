package com.ellation.crunchyroll.watchlist;

import com.amazon.aps.iva.b60.i;
import com.amazon.aps.iva.b60.j;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: WatchlistChangeRegister.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/watchlist/WatchlistChangeRegisterImpl;", "Lcom/ellation/crunchyroll/watchlist/a;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/b60/i;", "<init>", "()V", "watchlist_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class WatchlistChangeRegisterImpl implements com.ellation.crunchyroll.watchlist.a, EventDispatcher<i> {
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<i> b = new EventDispatcher.EventDispatcherImpl<>();

    /* compiled from: WatchlistChangeRegister.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<i, q> {
        public final /* synthetic */ j h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(1);
            this.h = jVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(i iVar) {
            i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$notify");
            iVar2.U0(this.h);
            return q.a;
        }
    }

    @Override // com.ellation.crunchyroll.watchlist.a
    public final void a(final i iVar, o oVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        this.b.addEventListener(iVar);
        oVar.getLifecycle().addObserver(new g() { // from class: com.ellation.crunchyroll.watchlist.WatchlistChangeRegisterImpl$register$1
            @Override // com.amazon.aps.iva.i5.g
            public final void onDestroy(o oVar2) {
                com.amazon.aps.iva.yb0.j.f(oVar2, "owner");
                WatchlistChangeRegisterImpl watchlistChangeRegisterImpl = WatchlistChangeRegisterImpl.this;
                watchlistChangeRegisterImpl.getClass();
                i iVar2 = iVar;
                com.amazon.aps.iva.yb0.j.f(iVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                watchlistChangeRegisterImpl.b.removeEventListener(iVar2);
            }
        });
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(i iVar) {
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.addEventListener(iVar2);
    }

    @Override // com.ellation.crunchyroll.watchlist.a
    public final void b(j jVar) {
        notify(new a(jVar));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.b.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.b.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super i, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.b.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(i iVar) {
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b.removeEventListener(iVar2);
    }
}
