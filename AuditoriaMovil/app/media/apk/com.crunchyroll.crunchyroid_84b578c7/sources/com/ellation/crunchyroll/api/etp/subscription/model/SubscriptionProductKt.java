package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SubscriptionProduct.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"getOrderedSubscriptions", "", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductWrapper;", "getOrderedThirdPartySubscriptions", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionThirdPartyProductWrapper;", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionProductKt {
    public static final List<SubscriptionProductWrapper> getOrderedSubscriptions(List<SubscriptionProductWrapper> list) {
        j.f(list, "<this>");
        return x.T0(list, new Comparator() { // from class: com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductKt$getOrderedSubscriptions$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return f1.t(Long.valueOf(((SubscriptionProductWrapper) t2).getEffectiveDate().getTime()), Long.valueOf(((SubscriptionProductWrapper) t).getEffectiveDate().getTime()));
            }
        });
    }

    public static final List<SubscriptionThirdPartyProductWrapper> getOrderedThirdPartySubscriptions(List<SubscriptionThirdPartyProductWrapper> list) {
        j.f(list, "<this>");
        return x.T0(list, new Comparator() { // from class: com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductKt$getOrderedThirdPartySubscriptions$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return f1.t(Long.valueOf(((SubscriptionThirdPartyProductWrapper) t2).getEffectiveDate().getTime()), Long.valueOf(((SubscriptionThirdPartyProductWrapper) t).getEffectiveDate().getTime()));
            }
        });
    }
}
