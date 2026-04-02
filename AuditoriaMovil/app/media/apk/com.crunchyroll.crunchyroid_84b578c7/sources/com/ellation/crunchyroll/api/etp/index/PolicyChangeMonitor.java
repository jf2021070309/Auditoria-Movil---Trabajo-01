package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import kotlin.Metadata;
/* compiled from: PolicyChangeMonitor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\b\u001a\u00020\u0005H&J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH&¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "", "Lcom/amazon/aps/iva/i5/o;", "owner", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onPolicyChange", "observePolicyChange", "onMaturitySettingsChanged", "", "countryCode", "onLocationUpdated", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface PolicyChangeMonitor {
    void observePolicyChange(o oVar, a<q> aVar);

    void onLocationUpdated(String str);

    void onMaturitySettingsChanged();
}
