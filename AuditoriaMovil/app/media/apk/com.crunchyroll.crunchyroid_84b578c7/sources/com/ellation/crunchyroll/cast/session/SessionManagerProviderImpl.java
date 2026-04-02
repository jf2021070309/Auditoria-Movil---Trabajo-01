package com.ellation.crunchyroll.cast.session;

import android.content.Context;
import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ve0.f0;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.ye.b;
import com.amazon.aps.iva.ye.c;
import com.amazon.aps.iva.ye.d;
import com.amazon.aps.iva.ye.j;
import com.ellation.crunchyroll.cast.PlayServicesStatusCheckerInternal;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import kotlin.Metadata;
/* compiled from: SessionManagerProviderImpl.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006."}, d2 = {"Lcom/ellation/crunchyroll/cast/session/SessionManagerProviderImpl;", "Lcom/amazon/aps/iva/ye/j;", "", "contentId", "", "isCastingContent", "assetId", "isCastingVideo", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "sessionManagerListener", "Lcom/amazon/aps/iva/kb0/q;", "removeSessionManagerListener", "addSessionManagerListener", "endCastingSession", "Lcom/google/android/gms/cast/framework/SessionManager;", "sessionManager", "Lcom/google/android/gms/cast/framework/SessionManager;", "isCastApiAvailable", "Z", "Lcom/amazon/aps/iva/ve0/g0;", "Lcom/amazon/aps/iva/ye/c;", "castStateFlow", "Lcom/amazon/aps/iva/ve0/g0;", "getCastStateFlow", "()Lcom/amazon/aps/iva/ve0/g0;", "Lcom/amazon/aps/iva/ve0/f0;", "Lcom/amazon/aps/iva/ye/d;", "castStateChangeEventFlow", "Lcom/amazon/aps/iva/ve0/f0;", "getCastStateChangeEventFlow", "()Lcom/amazon/aps/iva/ve0/f0;", "Lcom/amazon/aps/iva/ye/b;", "getCastSession", "()Lcom/amazon/aps/iva/ye/b;", "castSession", "isCastConnected", "()Z", "isCastConnecting", "isTryingToCast", "Landroid/content/Context;", "context", "Lcom/amazon/aps/iva/se0/g0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lcom/amazon/aps/iva/se0/g0;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SessionManagerProviderImpl implements j {
    private final f0<d> castStateChangeEventFlow;
    private final g0<c> castStateFlow;
    private final boolean isCastApiAvailable;
    private final SessionManager sessionManager;

    /* compiled from: SessionManagerProviderImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/gms/cast/framework/CastSession;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.cast.session.SessionManagerProviderImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends l implements a<CastSession> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.aps.iva.xb0.a
        public final CastSession invoke() {
            return SessionManagerProviderImpl.this.sessionManager.getCurrentCastSession();
        }
    }

    public SessionManagerProviderImpl(Context context, com.amazon.aps.iva.se0.g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(g0Var, "coroutineScope");
        SessionManager sessionManager = CastContext.getSharedInstance(context).getSessionManager();
        com.amazon.aps.iva.yb0.j.e(sessionManager, "getSharedInstance(context).sessionManager");
        this.sessionManager = sessionManager;
        this.isCastApiAvailable = PlayServicesStatusCheckerInternal.Holder.get().isCastApiAvailable();
        this.castStateFlow = x.e(c.DISCONNECTED);
        this.castStateChangeEventFlow = t.g(0, 0, null, 7);
        sessionManager.addSessionManagerListener(new CastStateListener(getCastStateFlow(), getCastStateChangeEventFlow(), g0Var, new AnonymousClass1()));
    }

    @Override // com.amazon.aps.iva.ye.j
    public void addSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
        this.sessionManager.addSessionManagerListener(sessionManagerListener, CastSession.class);
    }

    @Override // com.amazon.aps.iva.ye.j
    public void endCastingSession() {
        this.sessionManager.endCurrentSession(true);
    }

    @Override // com.amazon.aps.iva.ye.f
    public b getCastSession() {
        CastSession currentCastSession = this.sessionManager.getCurrentCastSession();
        if (currentCastSession != null) {
            return CastSessionWrapperInternal.Companion.create(currentCastSession);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isCastConnected() {
        b castSession = getCastSession();
        if (castSession != null) {
            return castSession.isConnected();
        }
        return false;
    }

    public boolean isCastConnecting() {
        b castSession = getCastSession();
        if (castSession != null) {
            return castSession.isConnecting();
        }
        return false;
    }

    public boolean isCastingContent(String str) {
        String str2;
        PlayableAsset metadataPlayableAsset;
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        if (this.isCastApiAvailable && isCastConnected()) {
            b castSession = getCastSession();
            if (castSession != null && (metadataPlayableAsset = castSession.getMetadataPlayableAsset()) != null) {
                str2 = metadataPlayableAsset.getParentId();
            } else {
                str2 = null;
            }
            if (com.amazon.aps.iva.yb0.j.a(str2, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isCastingVideo(String str) {
        String str2;
        PlayableAsset metadataPlayableAsset;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        if (this.isCastApiAvailable && isCastConnected()) {
            b castSession = getCastSession();
            if (castSession != null && (metadataPlayableAsset = castSession.getMetadataPlayableAsset()) != null) {
                str2 = metadataPlayableAsset.getId();
            } else {
                str2 = null;
            }
            if (com.amazon.aps.iva.yb0.j.a(str2, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ye.f
    public boolean isTryingToCast() {
        if (!isCastConnecting() && !isCastConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ye.j
    public void removeSessionManagerListener(SessionManagerListener<CastSession> sessionManagerListener) {
        com.amazon.aps.iva.yb0.j.f(sessionManagerListener, "sessionManagerListener");
        this.sessionManager.removeSessionManagerListener(sessionManagerListener, CastSession.class);
    }

    @Override // com.amazon.aps.iva.ye.f
    public f0<d> getCastStateChangeEventFlow() {
        return this.castStateChangeEventFlow;
    }

    @Override // com.amazon.aps.iva.ye.f
    public g0<c> getCastStateFlow() {
        return this.castStateFlow;
    }

    public /* synthetic */ SessionManagerProviderImpl(Context context, com.amazon.aps.iva.se0.g0 g0Var, int i, e eVar) {
        this(context, (i & 2) != 0 ? z.j() : g0Var);
    }
}
