package com.ellation.crunchyroll.cast.session;

import android.content.Context;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.ye.i;
import com.amazon.aps.iva.ye.j;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: SessionManagerProviderHolder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t\"\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0007R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/cast/session/SessionManagerProviderHolder;", "", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/ye/i;", "playServicesStatusChecker", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/ye/j;", "createSessionManager", "", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "sessionManagerListeners", "Lcom/amazon/aps/iva/kb0/q;", "init", "(Landroid/content/Context;Lcom/amazon/aps/iva/ye/i;Lcom/amazon/aps/iva/xb0/a;[Lcom/google/android/gms/cast/framework/SessionManagerListener;)V", "get", "sessionManagerProvider", "Lcom/amazon/aps/iva/ye/j;", "<init>", "()V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SessionManagerProviderHolder {
    private static j sessionManagerProvider;
    public static final SessionManagerProviderHolder INSTANCE = new SessionManagerProviderHolder();
    public static final int $stable = 8;

    private SessionManagerProviderHolder() {
    }

    public static final j get() {
        j jVar = sessionManagerProvider;
        if (jVar != null) {
            return jVar;
        }
        com.amazon.aps.iva.yb0.j.m("sessionManagerProvider");
        throw null;
    }

    public static final void init(Context context, i iVar, a<? extends j> aVar, SessionManagerListener<CastSession>... sessionManagerListenerArr) {
        j sessionManagerEmpty;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(iVar, "playServicesStatusChecker");
        com.amazon.aps.iva.yb0.j.f(aVar, "createSessionManager");
        com.amazon.aps.iva.yb0.j.f(sessionManagerListenerArr, "sessionManagerListeners");
        if (iVar.isCastApiAvailable()) {
            sessionManagerEmpty = aVar.invoke();
            for (SessionManagerListener<CastSession> sessionManagerListener : sessionManagerListenerArr) {
                sessionManagerEmpty.addSessionManagerListener(sessionManagerListener);
            }
        } else {
            sessionManagerEmpty = new SessionManagerEmpty();
        }
        sessionManagerProvider = sessionManagerEmpty;
    }

    public static /* synthetic */ void init$default(Context context, i iVar, a aVar, SessionManagerListener[] sessionManagerListenerArr, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = new SessionManagerProviderHolder$init$1(context);
        }
        init(context, iVar, aVar, sessionManagerListenerArr);
    }
}
