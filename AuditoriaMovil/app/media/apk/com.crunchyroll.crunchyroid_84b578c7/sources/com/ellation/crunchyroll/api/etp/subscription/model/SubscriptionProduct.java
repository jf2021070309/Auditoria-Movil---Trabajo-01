package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SubscriptionProduct.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/SubscriptionProduct;", "", "sku", "", "(Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscriptionProduct {
    public static final int $stable = 0;
    @SerializedName("sku")
    private final String sku;

    public SubscriptionProduct(String str) {
        j.f(str, "sku");
        this.sku = str;
    }

    public static /* synthetic */ SubscriptionProduct copy$default(SubscriptionProduct subscriptionProduct, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionProduct.sku;
        }
        return subscriptionProduct.copy(str);
    }

    public final String component1() {
        return this.sku;
    }

    public final SubscriptionProduct copy(String str) {
        j.f(str, "sku");
        return new SubscriptionProduct(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SubscriptionProduct) && j.a(this.sku, ((SubscriptionProduct) obj).sku)) {
            return true;
        }
        return false;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return this.sku.hashCode();
    }

    public String toString() {
        return e.e("SubscriptionProduct(sku=", this.sku, ")");
    }
}
