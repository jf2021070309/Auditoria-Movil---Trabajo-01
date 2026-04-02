package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.utils.a {
    private final com.applovin.impl.sdk.a a;
    private final r b;
    private InterfaceC0012a c;
    private com.applovin.impl.mediation.a.c d;
    private int e;
    private boolean f;

    /* renamed from: com.applovin.impl.mediation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0012a {
        void a(com.applovin.impl.mediation.a.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(k kVar) {
        this.b = kVar.z();
        this.a = kVar.ad();
    }

    public void a() {
        this.b.b("AdActivityObserver", "Cancelling...");
        this.a.b(this);
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = false;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, InterfaceC0012a interfaceC0012a) {
        r rVar = this.b;
        rVar.b("AdActivityObserver", "Starting for ad " + cVar.getAdUnitId() + "...");
        a();
        this.c = interfaceC0012a;
        this.d = cVar;
        this.a.a(this);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f) {
            this.f = true;
        }
        this.e++;
        this.b.b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.e);
    }

    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f) {
            this.e--;
            this.b.b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.e);
            if (this.e <= 0) {
                this.b.b("AdActivityObserver", "Last ad Activity destroyed");
                if (this.c != null) {
                    this.b.b("AdActivityObserver", "Invoking callback...");
                    this.c.a(this.d);
                }
                a();
            }
        }
    }
}
