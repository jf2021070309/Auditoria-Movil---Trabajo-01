package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import kotlin.Metadata;
/* compiled from: EtpServiceAvailabilityMonitor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpServiceAvailabilityMonitor;", "", "Lcom/amazon/aps/iva/i5/o;", "owner", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onAvailable", "onUnavailable", "observeServiceAvailability", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpServiceAvailabilityMonitor {
    void observeServiceAvailability(o oVar, a<q> aVar, a<q> aVar2);
}
