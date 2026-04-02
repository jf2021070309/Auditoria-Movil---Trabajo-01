package com.fyber.inneractive.sdk.d;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.d.c;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.h.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class i implements j, n {
    InneractiveAdSpot.RequestListener a;
    InneractiveAdRequest b;
    c.a c;
    g d;
    p e;
    public c g;
    InneractiveMediationName h;
    String i;
    String j;
    a k;
    private boolean m = true;
    private boolean n = false;
    private final String l = UUID.randomUUID().toString();
    Set<p> f = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    static /* synthetic */ boolean d(i iVar) {
        iVar.m = false;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.d.n
    public final void a(a aVar) {
        this.k = aVar;
        requestAd(null);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return this.h;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return this.i;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            p pVar = (p) inneractiveUnitController;
            pVar.setAdSpot(this);
            if (this.f.size() > 0) {
                for (InneractiveUnitController inneractiveUnitController2 : new HashSet(this.f)) {
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        removeUnitController(inneractiveUnitController2);
                    }
                }
            }
            this.f.add(pVar);
            if (getAdContent() != null) {
                c();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            p pVar = this.e;
            if (pVar != null && pVar.equals(inneractiveUnitController)) {
                this.e.destroy();
                this.e = null;
            }
            this.f.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.l;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.b;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        g gVar = this.d;
        if (gVar == null) {
            return false;
        }
        boolean z = gVar.f() != null && this.d.f().d();
        if (z && getAdContent() != null) {
            g adContent = getAdContent();
            com.fyber.inneractive.sdk.j.e f = adContent.f();
            if (!this.n && f != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(f.b - System.currentTimeMillis());
                long j = f.c;
                IAlog.b(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", Long.valueOf(minutes), Long.valueOf(j)), new Object[0]);
                n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.IA_AD_EXPIRED, adContent.g(), f, adContent.i().b());
                aVar.a(new n.b().a("time_passed", Long.valueOf(minutes)).a("timeout", Long.valueOf(j)));
                aVar.b(null);
                this.n = true;
            }
        }
        return !z && this.d.d();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final g getAdContent() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            this.h = inneractiveMediationName;
            setMediationName(inneractiveMediationName.getKey());
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i = str;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
        if (str != null) {
            this.j = str;
        }
    }

    @Override // com.fyber.inneractive.sdk.d.j
    public final void a() {
        g gVar;
        g gVar2 = this.d;
        if (gVar2 != null) {
            if (gVar2.a_() && (gVar = this.d) != null && !gVar.j) {
                final com.fyber.inneractive.sdk.j.e f = this.d.f();
                final InneractiveAdRequest g = this.d.g();
                final String arrays = Arrays.toString(Thread.currentThread().getStackTrace());
                com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.d.i.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        IAlog.b("Firing Event 803 - Stack trace - %s", arrays);
                        n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.IA_AD_DESTROYED_WITHOUT_SHOW, g, f, com.fyber.inneractive.sdk.config.a.s.a(i.this.g, i.this.d));
                        aVar.a(new n.b().a("stack_trace", arrays));
                        aVar.b(null);
                    }
                });
            }
            this.d.b();
            this.d = null;
        }
        this.e = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            b();
        } else {
            com.fyber.inneractive.sdk.util.m.a().post(new Runnable() { // from class: com.fyber.inneractive.sdk.d.i.1
                @Override // java.lang.Runnable
                public final void run() {
                    i.this.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        for (p pVar : this.f) {
            pVar.destroy();
        }
        this.f.clear();
        c cVar = this.g;
        if (cVar != null) {
            cVar.a(true);
            this.g = null;
        }
        this.a = null;
        this.h = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return this.b;
    }

    public i() {
        IAlog.b("%sInneractiveAdSpotImpl created with UID: %s", IAlog.a(this), this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        UnitDisplayType unitDisplayType;
        UnitDisplayType h;
        if (inneractiveAdRequest != null && inneractiveAdRequest.getSelectedUnitConfig() != null) {
            if (inneractiveAdRequest.getSelectedUnitConfig().h() != null) {
                h = inneractiveAdRequest.getSelectedUnitConfig().h().a();
            } else if (inneractiveAdRequest.getSelectedUnitConfig().g() != null) {
                h = inneractiveAdRequest.getSelectedUnitConfig().g().h();
            }
            unitDisplayType = h;
            if (inneractiveAdRequest != null || unitDisplayType == null) {
            }
            g gVar = this.d;
            com.fyber.inneractive.sdk.j.e eVar = gVar != null ? gVar.g : null;
            String str = inneractiveAdRequest.d;
            g gVar2 = this.d;
            new com.fyber.inneractive.sdk.f.b(eVar, inneractiveAdRequest, str, unitDisplayType, gVar2 != null ? gVar2.i().b() : null).b();
            return;
        }
        unitDisplayType = null;
        if (inneractiveAdRequest != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        for (p pVar : this.f) {
            if (pVar.supports(this)) {
                this.e = pVar;
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.b("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.a = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        boolean z;
        IAlog.b("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener = this.a;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else if (inneractiveAdRequest == null && this.b == null) {
            IAlog.e("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener2 = this.a;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else {
            (inneractiveAdRequest != null ? inneractiveAdRequest : this.b).d = getLocalUniqueId();
            com.fyber.inneractive.sdk.f.c.a().a(getLocalUniqueId()).a();
            if (this.f.isEmpty()) {
                IAlog.e("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
                if (this.a != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.b;
                    }
                    a(inneractiveAdRequest);
                    this.a.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                }
            } else if (!com.fyber.inneractive.sdk.util.r.a(r.b.Mraid) && !com.fyber.inneractive.sdk.util.r.a(r.b.Video)) {
                IAlog.e("%srequestAd called but mraid kit and the video kit doesn't exist! Cannot continue", IAlog.a(this));
                if (this.a != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.b;
                    }
                    a(inneractiveAdRequest);
                    this.a.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                }
            } else {
                c cVar = this.g;
                if (cVar != null) {
                    cVar.a(inneractiveAdRequest != null || this.b == null);
                }
                if (inneractiveAdRequest != null) {
                    InneractiveAdRequest inneractiveAdRequest2 = this.b;
                    if (inneractiveAdRequest2 != null) {
                        inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest2.getSelectedUnitConfig());
                    }
                    this.b = inneractiveAdRequest;
                    g gVar = this.d;
                    if (gVar != null) {
                        gVar.b();
                        this.m = true;
                    }
                    Iterator<p> it = this.f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() instanceof InneractiveFullscreenUnitController) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        this.b.c = false;
                    }
                }
                this.g = new c();
                if (!TextUtils.isEmpty(this.i)) {
                    this.b.a = this.i;
                }
                if (!TextUtils.isEmpty(this.j)) {
                    this.b.b = this.j;
                }
                if (this.c == null) {
                    this.c = new c.a() { // from class: com.fyber.inneractive.sdk.d.i.2
                        @Override // com.fyber.inneractive.sdk.d.c.a
                        public final void a(InneractiveAdRequest inneractiveAdRequest3, g gVar2) {
                            if (!i.this.m && i.this.e != null && i.this.e.supportsRefresh()) {
                                if (i.this.e.canRefreshAd()) {
                                    i.this.d = gVar2;
                                    i.this.d.a(inneractiveAdRequest3);
                                    if (i.this.k != null) {
                                        i.this.k.onAdRefreshed(i.this);
                                    } else if (i.this.e instanceof InneractiveAdViewUnitController) {
                                        ((InneractiveAdViewUnitController) i.this.e).onAdRefreshed(i.this);
                                    }
                                } else {
                                    IAlog.b("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.a(i.this));
                                    i.this.k.onAdRefreshFailed(i.this, InneractiveErrorCode.CANCELLED);
                                }
                            } else {
                                i.d(i.this);
                                i.this.d = gVar2;
                                i.this.d.a(inneractiveAdRequest3);
                                if (i.this.c()) {
                                    if (i.this.a != null) {
                                        i.this.a.onInneractiveSuccessfulAdRequest(i.this);
                                    }
                                } else {
                                    IAlog.b("%sCannot find appropriate unit controller for unit: %s", IAlog.a(i.this), i.this.d.h());
                                    com.fyber.inneractive.sdk.j.e b = i.this.g != null ? i.this.g.b() : null;
                                    InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                                    a(inneractiveAdRequest3, b, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception("Cannot find appropriate unit controller for unit: " + i.this.d.h())));
                                    i.this.d = null;
                                    return;
                                }
                            }
                            String str = inneractiveAdRequest3.d;
                            com.fyber.inneractive.sdk.f.c.a().a(str).f();
                            com.fyber.inneractive.sdk.f.c.a().a(str).g();
                            i.f(i.this);
                        }

                        @Override // com.fyber.inneractive.sdk.d.c.a
                        public final void a(InneractiveAdRequest inneractiveAdRequest3, com.fyber.inneractive.sdk.j.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
                            if (i.this.a != null) {
                                if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                                    i.this.a(inneractiveAdRequest3);
                                }
                                if (i.this.m) {
                                    i.a(i.this, inneractiveAdRequest3, eVar, inneractiveInfrastructureError);
                                    i.this.a.onInneractiveFailedAdRequest(i.this, inneractiveInfrastructureError.getErrorCode());
                                } else if (i.this.k != null) {
                                    i.this.k.onAdRefreshFailed(i.this, inneractiveInfrastructureError.getErrorCode());
                                }
                            }
                        }
                    };
                }
                IAlog.b("%sFound ad source for request! %s", IAlog.a(this), this.g);
                this.g.a(this.b, this.c);
            }
        }
    }

    static /* synthetic */ void f(i iVar) {
        g gVar;
        if (iVar.b == null || (gVar = iVar.d) == null || gVar.g == 0 || iVar.d.g.r == null) {
            return;
        }
        T t = iVar.d.g;
        InneractiveAdRequest inneractiveAdRequest = iVar.b;
        String str = inneractiveAdRequest.d;
        UnitDisplayType unitDisplayType = iVar.d.g.r;
        g gVar2 = iVar.d;
        new com.fyber.inneractive.sdk.f.b(t, inneractiveAdRequest, str, unitDisplayType, gVar2 == null ? null : gVar2.i().b()).b();
    }

    static /* synthetic */ void a(i iVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            g gVar = iVar.d;
            if (gVar == null || gVar.a_() || iVar.d.isVideoAd()) {
                IAlog.b("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : com.fyber.inneractive.sdk.util.q.a();
                n.a aVar = new n.a(com.fyber.inneractive.sdk.h.l.IA_AD_LOAD_FAILED, inneractiveAdRequest, eVar, com.fyber.inneractive.sdk.config.a.s.a(iVar.g, iVar.d));
                aVar.a(new n.b().a("message", inneractiveInfrastructureError.getErrorCode().toString()).a("description", arrays).a("extra_description", inneractiveInfrastructureError.description()));
                aVar.b(null);
            }
        }
    }
}
