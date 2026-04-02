package com.ellation.crunchyroll.cast.sessionmanagerlistener;

import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.cast.session.CastSessionWrapperImplKt;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: SessionManagerEventHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SessionManagerEventHandler;", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "castSession", "", "p1", "Lcom/amazon/aps/iva/kb0/q;", "onSessionEnded", "session", "onSessionEnding", "onSessionResumeFailed", "", "onSessionResumed", "", "onSessionResuming", "onSessionStartFailed", "onSessionStarted", "onSessionStarting", "onSessionSuspended", "Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "getListener", "()Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;", "<init>", "(Lcom/ellation/crunchyroll/cast/sessionmanagerlistener/SimpleSessionManagerListener;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SessionManagerEventHandler implements SessionManagerListener<CastSession> {
    private final SimpleSessionManagerListener listener;

    public SessionManagerEventHandler(SimpleSessionManagerListener simpleSessionManagerListener) {
        j.f(simpleSessionManagerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = simpleSessionManagerListener;
    }

    public final SimpleSessionManagerListener getListener() {
        return this.listener;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnded(CastSession castSession, int i) {
        j.f(castSession, "castSession");
        this.listener.onSessionEnded(CastSessionWrapperImplKt.toWrapper(castSession), i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnding(CastSession castSession) {
        j.f(castSession, "session");
        this.listener.onSessionEnding(CastSessionWrapperImplKt.toWrapper(castSession));
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumeFailed(CastSession castSession, int i) {
        j.f(castSession, "session");
        this.listener.onSessionResumeFailed(CastSessionWrapperImplKt.toWrapper(castSession), i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumed(CastSession castSession, boolean z) {
        j.f(castSession, "session");
        this.listener.onSessionResumed(CastSessionWrapperImplKt.toWrapper(castSession), z);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResuming(CastSession castSession, String str) {
        j.f(castSession, "session");
        j.f(str, "p1");
        this.listener.onSessionResuming(CastSessionWrapperImplKt.toWrapper(castSession), str);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStartFailed(CastSession castSession, int i) {
        j.f(castSession, "session");
        this.listener.onSessionStartFailed(CastSessionWrapperImplKt.toWrapper(castSession), i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarted(CastSession castSession, String str) {
        j.f(castSession, "session");
        j.f(str, "p1");
        this.listener.onSessionStarted(CastSessionWrapperImplKt.toWrapper(castSession), str);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarting(CastSession castSession) {
        j.f(castSession, "session");
        this.listener.onSessionStarting(CastSessionWrapperImplKt.toWrapper(castSession));
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionSuspended(CastSession castSession, int i) {
        j.f(castSession, "session");
        this.listener.onSessionSuspended(CastSessionWrapperImplKt.toWrapper(castSession), i);
    }
}
