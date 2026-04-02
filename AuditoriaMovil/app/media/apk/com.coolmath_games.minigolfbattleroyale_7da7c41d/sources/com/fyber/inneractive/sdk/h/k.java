package com.fyber.inneractive.sdk.h;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.h.y;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public final class k {
    public InneractiveAdRequest a;
    com.fyber.inneractive.sdk.config.a.s b;
    public a c;
    final String d;
    public volatile boolean e = false;
    public final z f;

    /* loaded from: classes.dex */
    public interface a {
        void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar);

        void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.j.e eVar, InneractiveErrorCode inneractiveErrorCode);
    }

    public k(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.a.s sVar, a aVar) {
        this.a = inneractiveAdRequest;
        this.d = str;
        this.c = aVar;
        this.b = sVar;
        z zVar = new z(new r<com.fyber.inneractive.sdk.j.e>() { // from class: com.fyber.inneractive.sdk.h.k.1
            @Override // com.fyber.inneractive.sdk.h.r
            public final /* synthetic */ void a(com.fyber.inneractive.sdk.j.e eVar, Exception exc, boolean z) {
                InneractiveErrorCode inneractiveErrorCode;
                InneractiveErrorCode a2;
                com.fyber.inneractive.sdk.j.a a3;
                com.fyber.inneractive.sdk.j.e eVar2 = eVar;
                if (exc == null) {
                    k kVar = k.this;
                    if (kVar.c != null) {
                        if (kVar.e) {
                            IAlog.a("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                            return;
                        }
                        com.fyber.inneractive.sdk.config.t a4 = com.fyber.inneractive.sdk.config.a.a(eVar2.p);
                        kVar.a.setSelectedUnitConfig(a4);
                        if (a4 == null) {
                            a2 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                        } else {
                            a2 = eVar2.a(kVar.a, kVar.b);
                        }
                        com.fyber.inneractive.sdk.config.a.e a5 = com.fyber.inneractive.sdk.config.a.e.a(eVar2);
                        try {
                            a5.b = Long.valueOf(IAConfigManager.k());
                        } catch (NumberFormatException unused) {
                            IAlog.b("invalid publisherId", new Object[0]);
                        }
                        kVar.b.a(a5);
                        if (a2 == null) {
                            kVar.c.a(kVar.a, eVar2);
                            return;
                        }
                        if (a4 == null || a2 == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                            IAlog.e("%sGot configuration mismatch!", IAlog.a(kVar));
                            IAConfigManager.i();
                        }
                        if (eVar2 != null && a2 != null && (a3 = com.fyber.inneractive.sdk.j.a.a(eVar2.i)) != null) {
                            new com.fyber.inneractive.sdk.d.a(eVar2, kVar.a, a3 == com.fyber.inneractive.sdk.j.a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", kVar.b.b()).a(new InneractiveInfrastructureError(a2, eVar2.B));
                        }
                        kVar.a(a2, eVar2);
                        return;
                    }
                    return;
                }
                if (!(exc instanceof aj)) {
                    if (!(exc instanceof FileNotFoundException) && (exc instanceof v)) {
                        inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                    } else {
                        inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
                    }
                } else if (((aj) exc).a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
                k kVar2 = k.this;
                if (kVar2.c != null) {
                    if (kVar2.e) {
                        IAlog.a("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                    } else {
                        kVar2.a(inneractiveErrorCode, eVar2);
                    }
                }
            }
        }, this.a, this.b);
        this.f = zVar;
        zVar.f = new y.a() { // from class: com.fyber.inneractive.sdk.h.k.2
            @Override // com.fyber.inneractive.sdk.h.y.a
            public final void a(String str2) {
                char c;
                int hashCode = str2.hashCode();
                if (hashCode == -1392135285) {
                    if (str2.equals("sdkInitNetworkRequest")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 740780854) {
                    if (hashCode == 1745989196 && str2.equals("sdkParsedResponse")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str2.equals("sdkGotServerResponse")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    com.fyber.inneractive.sdk.f.c.a().a(k.this.d).b();
                } else if (c == 1) {
                    com.fyber.inneractive.sdk.f.c.a().a(k.this.d).c();
                } else if (c != 2) {
                } else {
                    com.fyber.inneractive.sdk.f.c.a().a(k.this.d).d();
                }
            }
        };
    }

    public final void a(InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.j.e eVar) {
        a aVar;
        if (this.e || (aVar = this.c) == null) {
            return;
        }
        aVar.a(this.a, eVar, inneractiveErrorCode);
    }
}
