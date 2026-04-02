package com.amazon.aps.iva.ye;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
/* compiled from: SessionManagerProvider.kt */
/* loaded from: classes.dex */
public interface j extends f {
    void addSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener);

    void endCastingSession();

    void removeSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener);
}
