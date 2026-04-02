package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
/* loaded from: classes.dex */
public class x extends a {
    private final com.applovin.impl.a.e a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f4094c;

    public x(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskResolveVastWrapper", mVar);
        this.f4094c = appLovinAdLoadListener;
        this.a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        d("Failed to resolve VAST wrapper due to error code " + i2);
        if (i2 != -1009) {
            com.applovin.impl.a.l.a(this.a, this.f4094c, i2 == -1001 ? com.applovin.impl.a.f.TIMED_OUT : com.applovin.impl.a.f.GENERAL_WRAPPER_ERROR, i2, this.f4020b);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f4094c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String a = com.applovin.impl.a.l.a(this.a);
        if (StringUtils.isValidString(a)) {
            StringBuilder y = e.a.d.a.a.y("Resolving VAST ad with depth ");
            y.append(this.a.a());
            y.append(" at ");
            y.append(a);
            a(y.toString());
            try {
                this.f4020b.S().a(new u<com.applovin.impl.sdk.utils.q>(com.applovin.impl.sdk.network.c.a(this.f4020b).a(a).b("GET").a((c.a) com.applovin.impl.sdk.utils.q.a).a(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.er)).intValue()).b(((Integer) this.f4020b.a(com.applovin.impl.sdk.c.b.es)).intValue()).c(false).a(), this.f4020b) { // from class: com.applovin.impl.sdk.e.x.1
                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(int i2, String str, com.applovin.impl.sdk.utils.q qVar) {
                        d("Unable to resolve VAST wrapper. Server returned " + i2);
                        x.this.a(i2);
                    }

                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(com.applovin.impl.sdk.utils.q qVar, int i2) {
                        this.f4020b.S().a(r.a(qVar, x.this.a, x.this.f4094c, x.this.f4020b));
                    }
                });
                return;
            } catch (Throwable th) {
                a("Unable to resolve VAST wrapper", th);
            }
        } else {
            d("Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }
}
