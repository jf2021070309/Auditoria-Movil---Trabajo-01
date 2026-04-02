package com.applovin.impl.mediation;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
/* loaded from: classes.dex */
public class c {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3442b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3443c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.e f3444d;

    /* loaded from: classes.dex */
    public interface a {
        void c(com.applovin.impl.mediation.a.c cVar);
    }

    public c(m mVar, a aVar) {
        this.a = mVar;
        this.f3442b = mVar.B();
        this.f3443c = aVar;
    }

    public void a() {
        this.f3442b.b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        com.applovin.impl.sdk.utils.e eVar = this.f3444d;
        if (eVar != null) {
            eVar.a();
            this.f3444d = null;
        }
    }

    public void a(final com.applovin.impl.mediation.a.c cVar, long j2) {
        v vVar = this.f3442b;
        vVar.b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j2 + "ms...");
        this.f3444d = com.applovin.impl.sdk.utils.e.a(j2, this.a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.this.f3442b.b("AdHiddenCallbackTimeoutManager", "Timing out...");
                c.this.f3443c.c(cVar);
            }
        });
    }
}
