package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class w {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f4388b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f4389c = new HashMap(4);

    /* renamed from: d  reason: collision with root package name */
    private final Object f4390d = new Object();

    public w(m mVar) {
        this.a = mVar;
        this.f4388b = mVar.B();
    }

    public String a(String str) {
        String P;
        synchronized (this.f4390d) {
            com.applovin.impl.mediation.a.a aVar = this.f4389c.get(str);
            P = aVar != null ? aVar.P() : null;
        }
        return P;
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f4390d) {
            v vVar = this.f4388b;
            vVar.b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + aVar);
            this.f4389c.put(aVar.getAdUnitId(), aVar);
        }
    }

    public void b(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f4390d) {
            String adUnitId = aVar.getAdUnitId();
            com.applovin.impl.mediation.a.a aVar2 = this.f4389c.get(adUnitId);
            if (aVar == aVar2) {
                v vVar = this.f4388b;
                vVar.b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar2);
                this.f4389c.remove(adUnitId);
            } else {
                v vVar2 = this.f4388b;
                vVar2.b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + aVar + " , since it could have already been updated with a new ad: " + aVar2);
            }
        }
    }
}
