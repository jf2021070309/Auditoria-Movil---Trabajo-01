package com.ellation.crunchyroll.api.etp.subscription;

import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.t;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.model.ApiCollection;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionThirdPartyProductWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SubscriptionProcessorService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0005JA\u0010\u000f\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\f0\u00022\b\b\u0003\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/SubscriptionProcessorService;", "", "Lcom/ellation/crunchyroll/api/etp/model/ApiCollection;", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductWrapper;", "getUserSubscription", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionThirdPartyProductWrapper;", "getUserThirdPartySubscription", "Lcom/ellation/crunchyroll/api/etp/subscription/model/Benefit;", "getUserBenefits", "", FirebaseAnalytics.Param.SOURCE, "", "", "Lcom/ellation/crunchyroll/api/etp/subscription/model/Product;", "getProducts", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SubscriptionProcessorService {

    /* compiled from: SubscriptionProcessorService.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getProducts$default(SubscriptionProcessorService subscriptionProcessorService, String str, d dVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "google-play";
                }
                return subscriptionProcessorService.getProducts(str, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProducts");
        }
    }

    @f("subs/v2/products")
    Object getProducts(@t("source") String str, d<? super ApiCollection<Map<String, Map<String, List<Product>>>>> dVar);

    @f("subs/v1/subscriptions/{account_id}/benefits")
    Object getUserBenefits(d<? super ApiCollection<Benefit>> dVar);

    @f("subs/v1/subscriptions/{account_id}/products")
    Object getUserSubscription(d<? super ApiCollection<SubscriptionProductWrapper>> dVar);

    @f("subs/v1/subscriptions/{account_id}/third_party_products")
    Object getUserThirdPartySubscription(d<? super ApiCollection<SubscriptionThirdPartyProductWrapper>> dVar);
}
