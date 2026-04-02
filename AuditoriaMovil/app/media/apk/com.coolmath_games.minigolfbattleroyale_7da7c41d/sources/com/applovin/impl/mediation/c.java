package com.applovin.impl.mediation;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
/* loaded from: classes.dex */
public class c {
    private final k a;
    private final r b;
    private final a c;
    private com.applovin.impl.sdk.utils.d d;

    /* loaded from: classes.dex */
    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar, a aVar) {
        this.a = kVar;
        this.b = kVar.z();
        this.c = aVar;
    }

    public void a() {
        this.b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        com.applovin.impl.sdk.utils.d dVar = this.d;
        if (dVar != null) {
            dVar.a();
            this.d = null;
        }
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j) {
        r rVar = this.b;
        rVar.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        this.d = com.applovin.impl.sdk.utils.d.a(j, this.a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                c.this.c.c(cVar);
            }
        });
    }
}
