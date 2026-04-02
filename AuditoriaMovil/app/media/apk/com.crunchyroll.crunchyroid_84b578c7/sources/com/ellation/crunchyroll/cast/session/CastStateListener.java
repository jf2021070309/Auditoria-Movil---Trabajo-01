package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.c;
import com.amazon.aps.iva.ye.d;
import com.amazon.aps.iva.ye.e;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: SessionManagerProviderImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0018\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastStateListener;", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/Session;", "Lcom/amazon/aps/iva/ye/e;", "type", "Lcom/amazon/aps/iva/kb0/q;", "notify", "Lcom/google/android/gms/cast/framework/CastSession;", "Lcom/amazon/aps/iva/ye/c;", "toState", "p0", "", "p1", "onSessionEnded", "onSessionEnding", "onSessionResumeFailed", "", "onSessionResumed", "", "onSessionResuming", "onSessionStartFailed", "onSessionStarted", "onSessionStarting", "onSessionSuspended", "Lcom/amazon/aps/iva/ve0/g0;", "stateFlow", "Lcom/amazon/aps/iva/ve0/g0;", "Lcom/amazon/aps/iva/ve0/f0;", "Lcom/amazon/aps/iva/ye/d;", "eventsFlow", "Lcom/amazon/aps/iva/ve0/f0;", "Lcom/amazon/aps/iva/se0/g0;", "coroutineScope", "Lcom/amazon/aps/iva/se0/g0;", "Lkotlin/Function0;", "castSession", "Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/ve0/g0;Lcom/amazon/aps/iva/ve0/f0;Lcom/amazon/aps/iva/se0/g0;Lcom/amazon/aps/iva/xb0/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class CastStateListener implements SessionManagerListener<Session> {
    private final a<CastSession> castSession;
    private final g0 coroutineScope;
    private final f0<d> eventsFlow;
    private final com.amazon.aps.iva.ve0.g0<c> stateFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public CastStateListener(com.amazon.aps.iva.ve0.g0<c> g0Var, f0<d> f0Var, g0 g0Var2, a<? extends CastSession> aVar) {
        j.f(g0Var, "stateFlow");
        j.f(f0Var, "eventsFlow");
        j.f(g0Var2, "coroutineScope");
        j.f(aVar, "castSession");
        this.stateFlow = g0Var;
        this.eventsFlow = f0Var;
        this.coroutineScope = g0Var2;
        this.castSession = aVar;
        g0Var.setValue(toState((CastSession) aVar.invoke()));
    }

    private final void notify(e eVar) {
        i.d(this.coroutineScope, null, null, new CastStateListener$notify$1(this, eVar, null), 3);
        this.stateFlow.setValue(toState(this.castSession.invoke()));
    }

    private final c toState(CastSession castSession) {
        if (castSession == null) {
            return c.DISCONNECTED;
        }
        if (castSession.isConnected()) {
            return c.CONNECTED;
        }
        if (castSession.isConnecting()) {
            return c.CONNECTING;
        }
        return c.DISCONNECTED;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnded(Session session, int i) {
        j.f(session, "p0");
        notify(e.SESSION_ENDED);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnding(Session session) {
        j.f(session, "p0");
        notify(e.SESSION_ENDING);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumeFailed(Session session, int i) {
        j.f(session, "p0");
        notify(e.SESSION_RESUME_FAILED);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumed(Session session, boolean z) {
        j.f(session, "p0");
        notify(e.SESSION_RESUMED);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResuming(Session session, String str) {
        j.f(session, "p0");
        j.f(str, "p1");
        notify(e.SESSION_RESUMING);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStartFailed(Session session, int i) {
        j.f(session, "p0");
        notify(e.SESSION_START_FAILED);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarted(Session session, String str) {
        j.f(session, "p0");
        j.f(str, "p1");
        notify(e.SESSION_STARTED);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarting(Session session) {
        j.f(session, "p0");
        notify(e.SESSION_STARTING);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionSuspended(Session session, int i) {
        j.f(session, "p0");
        notify(e.SESSION_SUSPENDED);
    }
}
