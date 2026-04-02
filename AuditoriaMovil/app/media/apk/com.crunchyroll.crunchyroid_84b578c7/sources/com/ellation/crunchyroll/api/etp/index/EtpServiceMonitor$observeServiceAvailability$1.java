package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: EtpServiceAvailabilityMonitor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "available", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpServiceMonitor$observeServiceAvailability$1 extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
    final /* synthetic */ a<q> $onAvailable;
    final /* synthetic */ a<q> $onUnavailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpServiceMonitor$observeServiceAvailability$1(a<q> aVar, a<q> aVar2) {
        super(1);
        this.$onAvailable = aVar;
        this.$onUnavailable = aVar2;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Boolean bool) {
        invoke2(bool);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        j.e(bool, "available");
        if (bool.booleanValue()) {
            this.$onAvailable.invoke();
        } else {
            this.$onUnavailable.invoke();
        }
    }
}
