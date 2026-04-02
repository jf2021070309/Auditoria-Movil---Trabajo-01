package com.fyber.inneractive.sdk.d;

import com.fyber.inneractive.sdk.c.c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.e.a;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.h.k;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
/* loaded from: classes.dex */
public final class c implements IAConfigManager.OnConfigurationReadyAndValidListener, a.InterfaceC0043a, k.a {
    protected a a;
    protected InneractiveAdRequest b;
    public com.fyber.inneractive.sdk.h.k c;
    com.fyber.inneractive.sdk.e.a d;
    public com.fyber.inneractive.sdk.config.a.s e;
    private long g = 0;
    private final Runnable f = new Runnable() { // from class: com.fyber.inneractive.sdk.d.c.1
        @Override // java.lang.Runnable
        public final void run() {
            c.a(c.this);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        void a(InneractiveAdRequest inneractiveAdRequest, g gVar);

        void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError);
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, a aVar) {
        this.b = inneractiveAdRequest;
        this.a = aVar;
        if (IAConfigManager.j()) {
            c();
            return;
        }
        IAConfigManager.addListener(this);
        IAConfigManager.i();
    }

    private void b(boolean z) {
        IAConfigManager.removeListener(this);
        com.fyber.inneractive.sdk.h.k kVar = this.c;
        if (kVar != null) {
            kVar.e = true;
            kVar.c = null;
            kVar.f.c = true;
            this.c = null;
        }
        com.fyber.inneractive.sdk.e.a aVar = this.d;
        if (aVar != null && z) {
            aVar.e();
            this.d = null;
        }
        this.b = null;
    }

    public final void a(boolean z) {
        b(z);
        d();
        this.a = null;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (z) {
            c();
        } else {
            a(this.b, b(), exc instanceof com.fyber.inneractive.sdk.h.b ? InneractiveErrorCode.CONNECTION_ERROR : InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
        }
    }

    @Override // com.fyber.inneractive.sdk.h.k.a
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, InneractiveErrorCode inneractiveErrorCode) {
        d();
        if (IAlog.a <= 3) {
            Thread.dumpStack();
        }
        IAlog.a("%sgot onAdRequestFailed! with: %s", IAlog.a(this), inneractiveErrorCode);
        if (this.a != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (eVar != null && eVar.l != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.l + ": " + eVar.m));
            }
            this.a.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    @Override // com.fyber.inneractive.sdk.e.a.InterfaceC0043a
    public final void a() {
        a aVar;
        d();
        IAlog.a("%sgot onAdLoaded!", IAlog.a(this));
        com.fyber.inneractive.sdk.e.a aVar2 = this.d;
        if (aVar2 == null || (aVar = this.a) == null) {
            return;
        }
        aVar.a(this.b, aVar2.f());
    }

    @Override // com.fyber.inneractive.sdk.e.a.InterfaceC0043a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        d();
        IAlog.a("%sgot onFailedLoading! with: %s", IAlog.a(this), inneractiveInfrastructureError);
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this.b, b(), inneractiveInfrastructureError);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.d.c.c():void");
    }

    public final com.fyber.inneractive.sdk.j.e b() {
        com.fyber.inneractive.sdk.e.a aVar = this.d;
        if (aVar == null || aVar.f() == null) {
            return null;
        }
        return this.d.f().f();
    }

    private void d() {
        if (this.g > 0) {
            IAlog.b("%scancel in flight timeout after %d millis", IAlog.a(this), Long.valueOf(System.currentTimeMillis() - this.g));
            com.fyber.inneractive.sdk.util.m.a().removeCallbacks(this.f);
            this.g = 0L;
        }
    }

    private void a(boolean z, com.fyber.inneractive.sdk.j.e eVar) {
        String format;
        String spotId = this.b.getSpotId();
        String a2 = IAConfigManager.n().a("KEY_MISSMATCH_STATS_SPOTS", "");
        if (a2.contains(String.format("-%s-", spotId))) {
            return;
        }
        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.MISSMATCH_SPOTID, this.b, eVar);
        if (z) {
            format = String.format("There is no %s spot ID in current app config", spotId);
        } else {
            format = String.format("spot ID %s is not active in current app config", spotId);
        }
        aVar.a(new n.b().a(IronSourceConstants.EVENTS_ERROR_REASON, format));
        aVar.b(null);
        IAConfigManager.n().b("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", a2, spotId));
    }

    @Override // com.fyber.inneractive.sdk.h.k.a
    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar) {
        IAlog.a("%sonAdDataAvailable: got response data: %s", IAlog.a(this), eVar);
        com.fyber.inneractive.sdk.j.a a2 = com.fyber.inneractive.sdk.j.a.a(eVar.i);
        com.fyber.inneractive.sdk.e.a b = c.a.a.b(a2);
        this.d = b;
        if (b == null) {
            IAlog.d("%sonAdDataAvailable: Cannot find content handler for ad type: %s", IAlog.a(this), a2);
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(inneractiveAdRequest, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                return;
            }
            return;
        }
        IAlog.a("%sonAdDataAvailable: found response loader: %s", IAlog.a(this), this.d);
        this.d.a(this.b, eVar, this.e, this);
    }

    static /* synthetic */ void a(c cVar) {
        IAlog.b("%sin flight timeout reached after %d millis", IAlog.a(cVar), Long.valueOf(System.currentTimeMillis() - cVar.g));
        cVar.a(cVar.b, cVar.b(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        cVar.b(true);
    }
}
