package com.ellation.crunchyroll.cast.castlistener;

import com.amazon.aps.iva.af.a;
import com.amazon.aps.iva.i5.n;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.j;
import com.crunchyroll.cast.castlistener.VideoCastController;
import com.ellation.crunchyroll.cast.controller.UIMediaControllerDecorator;
import com.ellation.crunchyroll.cast.session.CastSessionListener;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: VideoCastControllerImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005H\u0096\u0001J\t\u0010\r\u001a\u00020\u0006H\u0096\u0001J\u001d\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000eH\u0096\u0001J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005H\u0096\u0001J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ellation/crunchyroll/cast/castlistener/VideoCastControllerImpl;", "Lcom/crunchyroll/cast/castlistener/VideoCastController;", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient$ProgressListener;", "Lcom/amazon/aps/iva/i5/n;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/af/a;", "Lcom/amazon/aps/iva/kb0/q;", "stopCasting", "Lcom/amazon/aps/iva/ye/b;", "session", "onCastSessionStarted", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addEventListener", "clear", "Lkotlin/Function1;", "action", "notify", "removeEventListener", "castSession", "", "playheadMs", "onConnectedToCast", "progressMs", "durationMs", "onProgressUpdated", "dispose", "Lcom/amazon/aps/iva/ye/j;", "sessionManagerProvider", "Lcom/amazon/aps/iva/ye/j;", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;", "uiMediaController", "Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;", "Ljava/lang/Long;", "Lcom/ellation/crunchyroll/cast/session/CastSessionListener;", "castSessionListener", "Lcom/ellation/crunchyroll/cast/session/CastSessionListener;", "", "getListenerCount", "()I", "listenerCount", "<init>", "(Lcom/amazon/aps/iva/ye/j;Lcom/ellation/crunchyroll/cast/controller/UIMediaControllerDecorator;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class VideoCastControllerImpl implements VideoCastController, RemoteMediaClient.ProgressListener, n, EventDispatcher<a> {
    private final CastSessionListener castSessionListener;
    private Long playheadMs;
    private final j sessionManagerProvider;
    private final UIMediaControllerDecorator uiMediaController;

    public VideoCastControllerImpl(j jVar, UIMediaControllerDecorator uIMediaControllerDecorator) {
        com.amazon.aps.iva.yb0.j.f(jVar, "sessionManagerProvider");
        com.amazon.aps.iva.yb0.j.f(uIMediaControllerDecorator, "uiMediaController");
        this.sessionManagerProvider = jVar;
        this.uiMediaController = uIMediaControllerDecorator;
        CastSessionListener castSessionListener = new CastSessionListener(new VideoCastControllerImpl$castSessionListener$1(this), new VideoCastControllerImpl$castSessionListener$2(this), new VideoCastControllerImpl$castSessionListener$3(this));
        this.castSessionListener = castSessionListener;
        jVar.addSessionManagerListener(castSessionListener);
        uIMediaControllerDecorator.addEventListener(new a() { // from class: com.ellation.crunchyroll.cast.castlistener.VideoCastControllerImpl.1
            @Override // com.amazon.aps.iva.af.a
            public void onCastMetadataUpdated(PlayableAsset playableAsset, long j) {
                VideoCastControllerImpl.this.playheadMs = Long.valueOf(com.amazon.aps.iva.gr.n.z(j));
            }

            @Override // com.amazon.aps.iva.af.a
            public void onCastSessionStarted() {
            }

            @Override // com.amazon.aps.iva.af.a
            public void onCastSessionStarting() {
            }

            @Override // com.amazon.aps.iva.af.a
            public void onCastSessionStopped(Long l) {
            }

            @Override // com.amazon.aps.iva.af.a
            public void onConnectedToCast(b bVar) {
                com.amazon.aps.iva.yb0.j.f(bVar, "session");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCastSessionStarted(b bVar) {
        this.uiMediaController.notify(VideoCastControllerImpl$onCastSessionStarted$1.INSTANCE);
        bVar.addProgressListener(this, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopCasting() {
        this.uiMediaController.notify(new VideoCastControllerImpl$stopCasting$1(this));
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void addEventListener(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.uiMediaController.addEventListener(aVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void clear() {
        this.uiMediaController.clear();
    }

    @Override // com.crunchyroll.cast.castlistener.VideoCastController
    public void dispose() {
        this.sessionManagerProvider.removeSessionManagerListener(this.castSessionListener);
        this.uiMediaController.dispose();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public int getListenerCount() {
        return this.uiMediaController.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void notify(l<? super a, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.uiMediaController.notify(lVar);
    }

    public void onConnectedToCast(b bVar, long j) {
        com.amazon.aps.iva.yb0.j.f(bVar, "castSession");
        this.playheadMs = Long.valueOf(j);
        this.uiMediaController.notify(new VideoCastControllerImpl$onConnectedToCast$1(bVar));
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public void onProgressUpdated(long j, long j2) {
        this.playheadMs = Long.valueOf(j);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public void removeEventListener(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.uiMediaController.removeEventListener(aVar);
    }
}
