package com.ellation.crunchyroll.cast.session;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ve0.e;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.c;
import com.amazon.aps.iva.ye.d;
import com.amazon.aps.iva.ye.j;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: SessionManagerEmpty.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/SessionManagerEmpty;", "Lcom/amazon/aps/iva/ye/j;", "", "contentId", "", "isCastingContent", "assetId", "isCastingVideo", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "sessionManagerListener", "Lcom/amazon/aps/iva/kb0/q;", "removeSessionManagerListener", "addSessionManagerListener", "endCastingSession", "isCastConnecting", "Z", "()Z", "isCastConnected", "isTryingToCast", "Lcom/amazon/aps/iva/ye/b;", "castSession", "Lcom/amazon/aps/iva/ye/b;", "getCastSession", "()Lcom/amazon/aps/iva/ye/b;", "Lcom/amazon/aps/iva/ve0/u0;", "Lcom/amazon/aps/iva/ye/c;", "castStateFlow", "Lcom/amazon/aps/iva/ve0/u0;", "getCastStateFlow", "()Lcom/amazon/aps/iva/ve0/u0;", "Lcom/amazon/aps/iva/ve0/f;", "Lcom/amazon/aps/iva/ye/d;", "castStateChangeEventFlow", "Lcom/amazon/aps/iva/ve0/f;", "getCastStateChangeEventFlow", "()Lcom/amazon/aps/iva/ve0/f;", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SessionManagerEmpty implements j {
    public static final int $stable = 8;
    private final b castSession;
    private final boolean isCastConnected;
    private final boolean isCastConnecting;
    private final boolean isTryingToCast;
    private final u0<c> castStateFlow = x.e(c.DISCONNECTED);
    private final f<d> castStateChangeEventFlow = e.b;

    @Override // com.amazon.aps.iva.ye.j
    public void addSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
    }

    @Override // com.amazon.aps.iva.ye.j
    public void endCastingSession() {
    }

    @Override // com.amazon.aps.iva.ye.f
    public b getCastSession() {
        return this.castSession;
    }

    @Override // com.amazon.aps.iva.ye.f
    public f<d> getCastStateChangeEventFlow() {
        return this.castStateChangeEventFlow;
    }

    @Override // com.amazon.aps.iva.ye.f
    public u0<c> getCastStateFlow() {
        return this.castStateFlow;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isCastConnected() {
        return this.isCastConnected;
    }

    public boolean isCastConnecting() {
        return this.isCastConnecting;
    }

    public boolean isCastingContent(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        return false;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isCastingVideo(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        return false;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isTryingToCast() {
        return this.isTryingToCast;
    }

    @Override // com.amazon.aps.iva.ye.j
    public void removeSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
    }
}
