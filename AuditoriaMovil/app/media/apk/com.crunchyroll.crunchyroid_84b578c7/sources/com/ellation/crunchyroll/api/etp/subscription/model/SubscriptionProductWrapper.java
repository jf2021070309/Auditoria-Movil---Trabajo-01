package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: SubscriptionProduct.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductWrapper;", "", "isCancelled", "", "effectiveDate", "Ljava/util/Date;", "_source", "", "product", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;", "(ZLjava/util/Date;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;)V", "getEffectiveDate", "()Ljava/util/Date;", "()Z", "getProduct", "()Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;", FirebaseAnalytics.Param.SOURCE, "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", "getSource", "()Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionProductWrapper {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.SOURCE)
    private final String _source;
    @SerializedName("effective_date")
    private final Date effectiveDate;
    @SerializedName("is_cancelled")
    private final boolean isCancelled;
    @SerializedName("product")
    private final SubscriptionProduct product;

    public SubscriptionProductWrapper(boolean z, Date date, String str, SubscriptionProduct subscriptionProduct) {
        j.f(date, "effectiveDate");
        j.f(subscriptionProduct, "product");
        this.isCancelled = z;
        this.effectiveDate = date;
        this._source = str;
        this.product = subscriptionProduct;
    }

    private final String component3() {
        return this._source;
    }

    public static /* synthetic */ SubscriptionProductWrapper copy$default(SubscriptionProductWrapper subscriptionProductWrapper, boolean z, Date date, String str, SubscriptionProduct subscriptionProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            z = subscriptionProductWrapper.isCancelled;
        }
        if ((i & 2) != 0) {
            date = subscriptionProductWrapper.effectiveDate;
        }
        if ((i & 4) != 0) {
            str = subscriptionProductWrapper._source;
        }
        if ((i & 8) != 0) {
            subscriptionProduct = subscriptionProductWrapper.product;
        }
        return subscriptionProductWrapper.copy(z, date, str, subscriptionProduct);
    }

    public final boolean component1() {
        return this.isCancelled;
    }

    public final Date component2() {
        return this.effectiveDate;
    }

    public final SubscriptionProduct component4() {
        return this.product;
    }

    public final SubscriptionProductWrapper copy(boolean z, Date date, String str, SubscriptionProduct subscriptionProduct) {
        j.f(date, "effectiveDate");
        j.f(subscriptionProduct, "product");
        return new SubscriptionProductWrapper(z, date, str, subscriptionProduct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionProductWrapper)) {
            return false;
        }
        SubscriptionProductWrapper subscriptionProductWrapper = (SubscriptionProductWrapper) obj;
        if (this.isCancelled == subscriptionProductWrapper.isCancelled && j.a(this.effectiveDate, subscriptionProductWrapper.effectiveDate) && j.a(this._source, subscriptionProductWrapper._source) && j.a(this.product, subscriptionProductWrapper.product)) {
            return true;
        }
        return false;
    }

    public final Date getEffectiveDate() {
        return this.effectiveDate;
    }

    public final SubscriptionProduct getProduct() {
        return this.product;
    }

    public final SubscriptionProductSource getSource() {
        return SubscriptionProductSource.Companion.from(this._source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        int hashCode;
        boolean z = this.isCancelled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode2 = (this.effectiveDate.hashCode() + (r0 * 31)) * 31;
        String str = this._source;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.product.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final boolean isCancelled() {
        return this.isCancelled;
    }

    public String toString() {
        boolean z = this.isCancelled;
        Date date = this.effectiveDate;
        String str = this._source;
        SubscriptionProduct subscriptionProduct = this.product;
        return "SubscriptionProductWrapper(isCancelled=" + z + ", effectiveDate=" + date + ", _source=" + str + ", product=" + subscriptionProduct + ")";
    }
}
