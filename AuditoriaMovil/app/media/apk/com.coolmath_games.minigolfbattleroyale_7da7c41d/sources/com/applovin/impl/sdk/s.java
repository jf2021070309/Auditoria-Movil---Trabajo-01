package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class s {
    private final k a;
    private final r b;
    private final Map<String, com.applovin.impl.mediation.a.a> c = new HashMap(4);
    private final Object d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(k kVar) {
        this.a = kVar;
        this.b = kVar.z();
    }

    public String a(String str) {
        String K;
        synchronized (this.d) {
            com.applovin.impl.mediation.a.a aVar = this.c.get(str);
            K = aVar != null ? aVar.K() : null;
        }
        return K;
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.d) {
            r rVar = this.b;
            rVar.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            this.c.put(aVar.getAdUnitId(), aVar);
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.d) {
            String adUnitId = aVar.getAdUnitId();
            com.applovin.impl.mediation.a.a aVar2 = this.c.get(adUnitId);
            if (aVar == aVar2) {
                r rVar = this.b;
                rVar.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                this.c.remove(adUnitId);
            } else {
                r rVar2 = this.b;
                rVar2.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }
}
