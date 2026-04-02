package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w extends a {
    private final com.applovin.impl.a.c a;
    private final AppLovinAdLoadListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.c = appLovinAdLoadListener;
        this.a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        d("Failed to resolve VAST wrapper due to error code " + i);
        if (i != -1009) {
            com.applovin.impl.a.i.a(this.a, this.c, i == -1001 ? com.applovin.impl.a.d.TIMED_OUT : com.applovin.impl.a.d.GENERAL_WRAPPER_ERROR, i, this.b);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String a = com.applovin.impl.a.i.a(this.a);
        if (StringUtils.isValidString(a)) {
            a("Resolving VAST ad with depth " + this.a.a() + " at " + a);
            try {
                this.b.Q().a(new t<com.applovin.impl.sdk.utils.p>(com.applovin.impl.sdk.network.c.a(this.b).a(a).b("GET").a((c.a) com.applovin.impl.sdk.utils.p.a).a(((Integer) this.b.a(com.applovin.impl.sdk.c.b.el)).intValue()).b(((Integer) this.b.a(com.applovin.impl.sdk.c.b.em)).intValue()).c(false).a(), this.b) { // from class: com.applovin.impl.sdk.e.w.1
                    @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                    public void a(int i, String str, com.applovin.impl.sdk.utils.p pVar) {
                        d("Unable to resolve VAST wrapper. Server returned " + i);
                        w.this.a(i);
                    }

                    @Override // com.applovin.impl.sdk.e.t, com.applovin.impl.sdk.network.b.c
                    public void a(com.applovin.impl.sdk.utils.p pVar, int i) {
                        this.b.Q().a(q.a(pVar, w.this.a, w.this.c, w.this.b));
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
