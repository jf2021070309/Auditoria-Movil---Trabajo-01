package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: VideoCastControllerEmpty.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\u001d\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\bH\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/cast/castlistener/VideoCastControllerEmpty;", "Lcom/crunchyroll/cast/castlistener/VideoCastController;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/af/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "addEventListener", "clear", "Lkotlin/Function1;", "action", "notify", "removeEventListener", "Lcom/amazon/aps/iva/ye/b;", "castSession", "", "playheadMs", "onConnectedToCast", "dispose", "", "getListenerCount", "()I", "listenerCount", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VideoCastControllerEmpty implements VideoCastController, EventDispatcher<a> {
    public static final int $stable = 8;
    private final /* synthetic */ EventDispatcher.EventDispatcherImpl<a> $$delegate_0 = new EventDispatcher.EventDispatcherImpl<>();

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void addEventListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.$$delegate_0.addEventListener(aVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void clear() {
        this.$$delegate_0.clear();
    }

    @Override // com.crunchyroll.cast.castlistener.VideoCastController
    public void dispose() {
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public int getListenerCount() {
        return this.$$delegate_0.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void notify(l<? super a, q> lVar) {
        j.f(lVar, "action");
        this.$$delegate_0.notify(lVar);
    }

    public void onConnectedToCast(b bVar, long j) {
        j.f(bVar, "castSession");
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void removeEventListener(a aVar) {
        j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.$$delegate_0.removeEventListener(aVar);
    }
}
