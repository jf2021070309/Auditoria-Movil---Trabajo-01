package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.b;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: CastSessionListener.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/CastSessionListener;", "", "Lcom/google/android/gms/cast/framework/CastSession;", "session", "Lcom/amazon/aps/iva/kb0/q;", "onSessionStarting", "", "s", "onSessionStarted", "", "i", "onSessionStartFailed", "onSessionEnded", "Lkotlin/Function1;", "Lcom/amazon/aps/iva/ye/b;", "onCastStarting", "Lcom/amazon/aps/iva/xb0/l;", "getOnCastStarting", "()Lcom/amazon/aps/iva/xb0/l;", "onCastStarted", "getOnCastStarted", "Lkotlin/Function0;", "onCastFailedOrEnded", "Lcom/amazon/aps/iva/xb0/a;", "getOnCastFailedOrEnded", "()Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/xb0/l;Lcom/amazon/aps/iva/xb0/a;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastSessionListener implements SessionManagerListener {
    public static final int $stable = 0;
    private final a<q> onCastFailedOrEnded;
    private final l<b, q> onCastStarted;
    private final l<b, q> onCastStarting;

    /* JADX WARN: Multi-variable type inference failed */
    public CastSessionListener(l<? super b, q> lVar, l<? super b, q> lVar2, a<q> aVar) {
        j.f(lVar, "onCastStarting");
        j.f(lVar2, "onCastStarted");
        j.f(aVar, "onCastFailedOrEnded");
        this.onCastStarting = lVar;
        this.onCastStarted = lVar2;
        this.onCastFailedOrEnded = aVar;
    }

    public final a<q> getOnCastFailedOrEnded() {
        return this.onCastFailedOrEnded;
    }

    public final l<b, q> getOnCastStarted() {
        return this.onCastStarted;
    }

    public final l<b, q> getOnCastStarting() {
        return this.onCastStarting;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnding(CastSession castSession) {
        j.f(castSession, "session");
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumeFailed(CastSession castSession, int i) {
        j.f(castSession, "session");
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResumed(CastSession castSession, boolean z) {
        j.f(castSession, "session");
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionResuming(CastSession castSession, String str) {
        j.f(castSession, "session");
        j.f(str, "s");
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionSuspended(CastSession castSession, int i) {
        j.f(castSession, "session");
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionEnded(CastSession castSession, int i) {
        j.f(castSession, "session");
        this.onCastFailedOrEnded.invoke();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStartFailed(CastSession castSession, int i) {
        j.f(castSession, "session");
        this.onCastFailedOrEnded.invoke();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarted(CastSession castSession, String str) {
        j.f(castSession, "session");
        j.f(str, "s");
        this.onCastStarted.invoke(CastSessionWrapperInternal.Companion.create(castSession));
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public void onSessionStarting(CastSession castSession) {
        j.f(castSession, "session");
        this.onCastStarting.invoke(CastSessionWrapperInternal.Companion.create(castSession));
    }
}
