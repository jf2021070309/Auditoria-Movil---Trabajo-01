package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {
    private final List<com.applovin.impl.mediation.a.f> a;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f3402c;

    /* renamed from: com.applovin.impl.mediation.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075a extends com.applovin.impl.sdk.e.a {
        private final com.applovin.impl.mediation.a.f a;

        /* renamed from: c  reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.f> f3404c;

        /* renamed from: d  reason: collision with root package name */
        private final Activity f3405d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private C0075a(com.applovin.impl.mediation.a.f r3, java.util.List<com.applovin.impl.mediation.a.f> r4, com.applovin.impl.sdk.m r5, android.app.Activity r6) {
            /*
                r2 = this;
                java.lang.String r0 = "TaskSequentialInitAdapter:"
                java.lang.StringBuilder r0 = e.a.d.a.a.y(r0)
                java.lang.String r1 = r3.O()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 1
                r2.<init>(r0, r5, r1)
                r2.f3405d = r6
                r2.a = r3
                r2.f3404c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.b.a.C0075a.<init>(com.applovin.impl.mediation.a.f, java.util.List, com.applovin.impl.sdk.m, android.app.Activity):void");
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder y = e.a.d.a.a.y("Auto-initing ");
            y.append(this.a);
            y.append("...");
            a(y.toString());
            this.f4020b.D().a(this.a, this.f3405d, new Runnable() { // from class: com.applovin.impl.mediation.b.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    C0075a c0075a = C0075a.this;
                    StringBuilder y2 = e.a.d.a.a.y("Initialization task for adapter '");
                    y2.append(C0075a.this.a.P());
                    y2.append("' finished");
                    c0075a.a(y2.toString());
                    int indexOf = C0075a.this.f3404c.indexOf(C0075a.this.a);
                    if (indexOf >= C0075a.this.f3404c.size() - 1) {
                        C0075a.this.a("Finished initializing adapters");
                        return;
                    }
                    com.applovin.impl.mediation.a.f fVar = (com.applovin.impl.mediation.a.f) C0075a.this.f3404c.get(indexOf + 1);
                    C0075a.this.f4020b.S().a(new C0075a(fVar, C0075a.this.f3404c, C0075a.this.f4020b, C0075a.this.f3405d), o.a.MAIN, fVar.aa());
                }
            });
        }
    }

    public a(List<com.applovin.impl.mediation.a.f> list, Activity activity, m mVar) {
        super("TaskAutoInitAdapters", mVar, true);
        this.a = list;
        this.f3402c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.a.size() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Auto-initing ");
                sb.append(this.a.size());
                sb.append(" adapters");
                sb.append(this.f4020b.J().a() ? " in test mode" : "");
                sb.append("...");
                a(sb.toString());
                if (TextUtils.isEmpty(this.f4020b.t())) {
                    this.f4020b.c(AppLovinMediationProvider.MAX);
                } else if (!this.f4020b.f()) {
                    v.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f4020b.t());
                }
                if (this.f3402c == null) {
                    v.i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance. Please make sure to update the top Activity using `updateActivity().\n**********\n");
                }
                if (((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.a.W)).booleanValue()) {
                    com.applovin.impl.mediation.a.f fVar = this.a.get(0);
                    this.f4020b.S().a(new C0075a(fVar, this.a, this.f4020b, this.f3402c), o.a.MAIN, fVar.aa());
                    return;
                }
                for (final com.applovin.impl.mediation.a.f fVar2 : this.a) {
                    this.f4020b.S().b().schedule(new Runnable() { // from class: com.applovin.impl.mediation.b.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            a aVar = a.this;
                            StringBuilder y = e.a.d.a.a.y("Auto-initing adapter: ");
                            y.append(fVar2);
                            aVar.a(y.toString());
                            a.this.f4020b.D().a(fVar2, a.this.f3402c);
                        }
                    }, fVar2.aa(), TimeUnit.MILLISECONDS);
                }
            }
        } catch (Throwable th) {
            a("Failed to auto-init adapters", th);
        }
    }
}
