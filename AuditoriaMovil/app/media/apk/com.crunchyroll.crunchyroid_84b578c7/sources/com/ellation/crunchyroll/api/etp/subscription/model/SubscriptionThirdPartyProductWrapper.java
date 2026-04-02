package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: SubscriptionProduct.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionThirdPartyProductWrapper;", "", "isInGrace", "", "isOnHold", "isAutoRenewable", "effectiveDate", "Ljava/util/Date;", "inGraceExpirationDate", "expirationDate", "_source", "", "product", "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;", "(ZZZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;)V", "getEffectiveDate", "()Ljava/util/Date;", "getExpirationDate", "getInGraceExpirationDate", "()Z", "getProduct", "()Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;", FirebaseAnalytics.Param.SOURCE, "Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", "getSource", "()Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProductSource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionThirdPartyProductWrapper {
    public static final int $stable = 8;
    @SerializedName(FirebaseAnalytics.Param.SOURCE)
    private final String _source;
    @SerializedName("effective_date")
    private final Date effectiveDate;
    @SerializedName("expiration_date")
    private final Date expirationDate;
    @SerializedName("in_grace_expiration_date")
    private final Date inGraceExpirationDate;
    @SerializedName("auto_renew")
    private final boolean isAutoRenewable;
    @SerializedName("in_grace")
    private final boolean isInGrace;
    @SerializedName("on_hold")
    private final boolean isOnHold;
    @SerializedName("product")
    private final SubscriptionProduct product;

    public SubscriptionThirdPartyProductWrapper(boolean z, boolean z2, boolean z3, Date date, Date date2, Date date3, String str, SubscriptionProduct subscriptionProduct) {
        j.f(date, "effectiveDate");
        j.f(date2, "inGraceExpirationDate");
        j.f(date3, "expirationDate");
        j.f(subscriptionProduct, "product");
        this.isInGrace = z;
        this.isOnHold = z2;
        this.isAutoRenewable = z3;
        this.effectiveDate = date;
        this.inGraceExpirationDate = date2;
        this.expirationDate = date3;
        this._source = str;
        this.product = subscriptionProduct;
    }

    private final String component7() {
        return this._source;
    }

    public static /* synthetic */ SubscriptionThirdPartyProductWrapper copy$default(SubscriptionThirdPartyProductWrapper subscriptionThirdPartyProductWrapper, boolean z, boolean z2, boolean z3, Date date, Date date2, Date date3, String str, SubscriptionProduct subscriptionProduct, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        Date date4;
        Date date5;
        Date date6;
        String str2;
        SubscriptionProduct subscriptionProduct2;
        if ((i & 1) != 0) {
            z4 = subscriptionThirdPartyProductWrapper.isInGrace;
        } else {
            z4 = z;
        }
        if ((i & 2) != 0) {
            z5 = subscriptionThirdPartyProductWrapper.isOnHold;
        } else {
            z5 = z2;
        }
        if ((i & 4) != 0) {
            z6 = subscriptionThirdPartyProductWrapper.isAutoRenewable;
        } else {
            z6 = z3;
        }
        if ((i & 8) != 0) {
            date4 = subscriptionThirdPartyProductWrapper.effectiveDate;
        } else {
            date4 = date;
        }
        if ((i & 16) != 0) {
            date5 = subscriptionThirdPartyProductWrapper.inGraceExpirationDate;
        } else {
            date5 = date2;
        }
        if ((i & 32) != 0) {
            date6 = subscriptionThirdPartyProductWrapper.expirationDate;
        } else {
            date6 = date3;
        }
        if ((i & 64) != 0) {
            str2 = subscriptionThirdPartyProductWrapper._source;
        } else {
            str2 = str;
        }
        if ((i & 128) != 0) {
            subscriptionProduct2 = subscriptionThirdPartyProductWrapper.product;
        } else {
            subscriptionProduct2 = subscriptionProduct;
        }
        return subscriptionThirdPartyProductWrapper.copy(z4, z5, z6, date4, date5, date6, str2, subscriptionProduct2);
    }

    public final boolean component1() {
        return this.isInGrace;
    }

    public final boolean component2() {
        return this.isOnHold;
    }

    public final boolean component3() {
        return this.isAutoRenewable;
    }

    public final Date component4() {
        return this.effectiveDate;
    }

    public final Date component5() {
        return this.inGraceExpirationDate;
    }

    public final Date component6() {
        return this.expirationDate;
    }

    public final SubscriptionProduct component8() {
        return this.product;
    }

    public final SubscriptionThirdPartyProductWrapper copy(boolean z, boolean z2, boolean z3, Date date, Date date2, Date date3, String str, SubscriptionProduct subscriptionProduct) {
        j.f(date, "effectiveDate");
        j.f(date2, "inGraceExpirationDate");
        j.f(date3, "expirationDate");
        j.f(subscriptionProduct, "product");
        return new SubscriptionThirdPartyProductWrapper(z, z2, z3, date, date2, date3, str, subscriptionProduct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionThirdPartyProductWrapper)) {
            return false;
        }
        SubscriptionThirdPartyProductWrapper subscriptionThirdPartyProductWrapper = (SubscriptionThirdPartyProductWrapper) obj;
        if (this.isInGrace == subscriptionThirdPartyProductWrapper.isInGrace && this.isOnHold == subscriptionThirdPartyProductWrapper.isOnHold && this.isAutoRenewable == subscriptionThirdPartyProductWrapper.isAutoRenewable && j.a(this.effectiveDate, subscriptionThirdPartyProductWrapper.effectiveDate) && j.a(this.inGraceExpirationDate, subscriptionThirdPartyProductWrapper.inGraceExpirationDate) && j.a(this.expirationDate, subscriptionThirdPartyProductWrapper.expirationDate) && j.a(this._source, subscriptionThirdPartyProductWrapper._source) && j.a(this.product, subscriptionThirdPartyProductWrapper.product)) {
            return true;
        }
        return false;
    }

    public final Date getEffectiveDate() {
        return this.effectiveDate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final Date getInGraceExpirationDate() {
        return this.inGraceExpirationDate;
    }

    public final SubscriptionProduct getProduct() {
        return this.product;
    }

    public final SubscriptionProductSource getSource() {
        return SubscriptionProductSource.Companion.from(this._source);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z = this.isInGrace;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.isOnHold;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.isAutoRenewable;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int hashCode2 = this.effectiveDate.hashCode();
        int hashCode3 = (this.expirationDate.hashCode() + ((this.inGraceExpirationDate.hashCode() + ((hashCode2 + ((i4 + i) * 31)) * 31)) * 31)) * 31;
        String str = this._source;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.product.hashCode() + ((hashCode3 + hashCode) * 31);
    }

    public final boolean isAutoRenewable() {
        return this.isAutoRenewable;
    }

    public final boolean isInGrace() {
        return this.isInGrace;
    }

    public final boolean isOnHold() {
        return this.isOnHold;
    }

    public String toString() {
        boolean z = this.isInGrace;
        boolean z2 = this.isOnHold;
        boolean z3 = this.isAutoRenewable;
        Date date = this.effectiveDate;
        Date date2 = this.inGraceExpirationDate;
        Date date3 = this.expirationDate;
        String str = this._source;
        SubscriptionProduct subscriptionProduct = this.product;
        return "SubscriptionThirdPartyProductWrapper(isInGrace=" + z + ", isOnHold=" + z2 + ", isAutoRenewable=" + z3 + ", effectiveDate=" + date + ", inGraceExpirationDate=" + date2 + ", expirationDate=" + date3 + ", _source=" + str + ", product=" + subscriptionProduct + ")";
    }
}
