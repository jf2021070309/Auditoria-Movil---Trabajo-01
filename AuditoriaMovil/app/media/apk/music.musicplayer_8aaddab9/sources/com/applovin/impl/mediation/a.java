package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {
    private final com.applovin.impl.sdk.a a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3322b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0072a f3323c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f3324d;

    /* renamed from: e  reason: collision with root package name */
    private int f3325e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3326f;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0072a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    public a(m mVar) {
        this.f3322b = mVar.B();
        this.a = mVar.ae();
    }

    public void a() {
        this.f3322b.b("AdActivityObserver", "Cancelling...");
        this.a.b(this);
        this.f3323c = null;
        this.f3324d = null;
        this.f3325e = 0;
        this.f3326f = false;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0072a interfaceC0072a) {
        v vVar = this.f3322b;
        StringBuilder y = e.a.d.a.a.y("Starting for ad ");
        y.append(cVar.getAdUnitId());
        y.append("...");
        vVar.b("AdActivityObserver", y.toString());
        a();
        this.f3323c = interfaceC0072a;
        this.f3324d = cVar;
        this.a.a(this);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f3326f) {
            this.f3326f = true;
        }
        this.f3325e++;
        this.f3322b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f3325e);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f3326f) {
            this.f3325e--;
            this.f3322b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f3325e);
            if (this.f3325e <= 0) {
                this.f3322b.b("AdActivityObserver", "Last ad Activity destroyed");
                if (this.f3323c != null) {
                    this.f3322b.b("AdActivityObserver", "Invoking callback...");
                    this.f3323c.a(this.f3324d);
                }
                a();
            }
        }
    }
}
