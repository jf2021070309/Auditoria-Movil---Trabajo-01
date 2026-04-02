package com.amazon.aps.iva.vj;

import com.amazon.aps.iva.qj.u;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
/* compiled from: SessionHeartbeatInteractor.kt */
/* loaded from: classes.dex */
public final class i {
    public static final u a(SessionState sessionState) {
        j.f(sessionState, "<this>");
        return new u(sessionState.getRenewInSeconds(), sessionState.getNoNetworkRetryIntervalInSeconds(), sessionState.getNoNetworkTimeoutInSeconds(), sessionState.getMaximumPauseInSeconds(), sessionState.getSessionExpirationInSeconds(), sessionState.getEndOfVideoUnloadSeconds(), Long.valueOf(System.currentTimeMillis()), 64);
    }
}
