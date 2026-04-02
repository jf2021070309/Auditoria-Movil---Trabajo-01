package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: PolicyChangeMonitorImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "it", "invoke", "(Lcom/amazon/aps/iva/kb0/q;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PolicyChangeMonitorImpl$observePolicyChange$1 extends l implements com.amazon.aps.iva.xb0.l<q, q> {
    final /* synthetic */ a<q> $onPolicyChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolicyChangeMonitorImpl$observePolicyChange$1(a<q> aVar) {
        super(1);
        this.$onPolicyChange = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(q qVar) {
        invoke2(qVar);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(q qVar) {
        j.f(qVar, "it");
        this.$onPolicyChange.invoke();
    }
}
