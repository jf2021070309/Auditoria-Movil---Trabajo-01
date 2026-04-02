package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ct.d;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import kotlin.Metadata;
/* compiled from: PolicyChangeMonitorImpl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/PolicyChangeMonitorImpl;", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "Lcom/amazon/aps/iva/kb0/q;", "onPolicyChanged", "Lcom/amazon/aps/iva/i5/o;", "owner", "Lkotlin/Function0;", "onPolicyChange", "observePolicyChange", "onMaturitySettingsChanged", "", "countryCode", "onLocationUpdated", "Lcom/amazon/aps/iva/se0/g0;", "scope", "Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/ob0/g;", "dispatcher", "Lcom/amazon/aps/iva/ob0/g;", "Lcom/ellation/crunchyroll/mvp/lifecycle/LifecycleAwareState;", "policyChangeState", "Lcom/ellation/crunchyroll/mvp/lifecycle/LifecycleAwareState;", "Ljava/lang/String;", "Lcom/amazon/aps/iva/ct/d;", "benefitsMonitor", "Lcom/ellation/crunchyroll/application/d;", "appLifecycle", "<init>", "(Lcom/amazon/aps/iva/ct/d;Lcom/ellation/crunchyroll/application/d;Lcom/amazon/aps/iva/se0/g0;Lcom/amazon/aps/iva/ob0/g;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PolicyChangeMonitorImpl implements PolicyChangeMonitor {
    public static final int $stable = 8;
    private String countryCode;
    private final g dispatcher;
    private final LifecycleAwareState<q> policyChangeState;
    private final g0 scope;

    /* compiled from: PolicyChangeMonitorImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.ellation.crunchyroll.api.etp.PolicyChangeMonitorImpl$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class AnonymousClass1 extends i implements a<q> {
        public AnonymousClass1(Object obj) {
            super(0, obj, PolicyChangeMonitorImpl.class, "onPolicyChanged", "onPolicyChanged()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ q invoke() {
            invoke2();
            return q.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PolicyChangeMonitorImpl) this.receiver).onPolicyChanged();
        }
    }

    public PolicyChangeMonitorImpl(d dVar, com.ellation.crunchyroll.application.d dVar2, g0 g0Var, g gVar) {
        j.f(dVar, "benefitsMonitor");
        j.f(dVar2, "appLifecycle");
        j.f(g0Var, "scope");
        j.f(gVar, "dispatcher");
        this.scope = g0Var;
        this.dispatcher = gVar;
        this.policyChangeState = new LifecycleAwareState<>();
        dVar.a(dVar2, new AnonymousClass1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPolicyChanged() {
        com.amazon.aps.iva.se0.i.d(this.scope, this.dispatcher, null, new PolicyChangeMonitorImpl$onPolicyChanged$1(this, null), 2);
    }

    @Override // com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor
    public void observePolicyChange(o oVar, a<q> aVar) {
        j.f(oVar, "owner");
        j.f(aVar, "onPolicyChange");
        this.policyChangeState.a(oVar.getLifecycle(), new PolicyChangeMonitorImpl$observePolicyChange$1(aVar));
    }

    @Override // com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor
    public void onLocationUpdated(String str) {
        String str2 = this.countryCode;
        if (str2 != null && !j.a(str2, str)) {
            onPolicyChanged();
        }
        this.countryCode = str;
    }

    @Override // com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor
    public void onMaturitySettingsChanged() {
        onPolicyChanged();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PolicyChangeMonitorImpl(com.amazon.aps.iva.ct.d r1, com.ellation.crunchyroll.application.d r2, com.amazon.aps.iva.se0.g0 r3, com.amazon.aps.iva.ob0.g r4, int r5, com.amazon.aps.iva.yb0.e r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            com.ellation.crunchyroll.application.d r2 = com.ellation.crunchyroll.application.d.a.a()
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto Le
            com.amazon.aps.iva.se0.d1 r3 = com.amazon.aps.iva.se0.d1.b
        Le:
            r5 = r5 & 8
            if (r5 == 0) goto L16
            com.amazon.aps.iva.ye0.c r4 = com.amazon.aps.iva.se0.r0.a
            com.amazon.aps.iva.se0.t1 r4 = com.amazon.aps.iva.xe0.k.a
        L16:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.PolicyChangeMonitorImpl.<init>(com.amazon.aps.iva.ct.d, com.ellation.crunchyroll.application.d, com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.g, int, com.amazon.aps.iva.yb0.e):void");
    }
}
