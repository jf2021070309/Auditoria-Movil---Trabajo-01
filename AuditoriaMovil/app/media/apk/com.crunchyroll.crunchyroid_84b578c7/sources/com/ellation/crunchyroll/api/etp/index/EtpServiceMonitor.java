package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import kotlin.Metadata;
/* compiled from: EtpServiceAvailabilityMonitor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J,\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpServiceMonitor;", "Lcom/ellation/crunchyroll/api/etp/index/EtpServiceAvailabilityMonitor;", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "newIndex", "Lcom/amazon/aps/iva/kb0/q;", "onIndexRefresh", "Lcom/amazon/aps/iva/i5/o;", "owner", "Lkotlin/Function0;", "onAvailable", "onUnavailable", "observeServiceAvailability", "", "forceServiceUnavailable", "Z", "Lcom/amazon/aps/iva/i5/v;", "serviceAvailableLiveData", "Lcom/amazon/aps/iva/i5/v;", "<init>", "(Z)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpServiceMonitor implements EtpServiceAvailabilityMonitor {
    public static final int $stable = 8;
    private final boolean forceServiceUnavailable;
    private final v<Boolean> serviceAvailableLiveData = new v<>();

    public EtpServiceMonitor(boolean z) {
        this.forceServiceUnavailable = z;
    }

    @Override // com.ellation.crunchyroll.api.etp.index.EtpServiceAvailabilityMonitor
    public void observeServiceAvailability(o oVar, a<q> aVar, a<q> aVar2) {
        j.f(oVar, "owner");
        j.f(aVar, "onAvailable");
        j.f(aVar2, "onUnavailable");
        this.serviceAvailableLiveData.e(oVar, new EtpServiceMonitor$sam$androidx_lifecycle_Observer$0(new EtpServiceMonitor$observeServiceAvailability$1(aVar, aVar2)));
    }

    public final void onIndexRefresh(EtpIndex etpIndex) {
        j.f(etpIndex, "newIndex");
        if (this.forceServiceUnavailable) {
            this.serviceAvailableLiveData.i(Boolean.FALSE);
        } else {
            this.serviceAvailableLiveData.i(Boolean.valueOf(etpIndex.isServiceAvailable()));
        }
    }
}
