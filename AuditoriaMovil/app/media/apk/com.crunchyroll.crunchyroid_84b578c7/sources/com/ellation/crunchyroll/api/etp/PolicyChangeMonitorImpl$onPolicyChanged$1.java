package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareState;
import kotlin.Metadata;
/* compiled from: PolicyChangeMonitorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.ellation.crunchyroll.api.etp.PolicyChangeMonitorImpl$onPolicyChanged$1", f = "PolicyChangeMonitorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PolicyChangeMonitorImpl$onPolicyChanged$1 extends i implements p<g0, d<? super q>, Object> {
    int label;
    final /* synthetic */ PolicyChangeMonitorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyChangeMonitorImpl$onPolicyChanged$1(PolicyChangeMonitorImpl policyChangeMonitorImpl, d<? super PolicyChangeMonitorImpl$onPolicyChanged$1> dVar) {
        super(2, dVar);
        this.this$0 = policyChangeMonitorImpl;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new PolicyChangeMonitorImpl$onPolicyChanged$1(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((PolicyChangeMonitorImpl$onPolicyChanged$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        LifecycleAwareState lifecycleAwareState;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            lifecycleAwareState = this.this$0.policyChangeState;
            q qVar = q.a;
            lifecycleAwareState.b(qVar);
            return qVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
