package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Product.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/Product;", "Ljava/io/Serializable;", "sku", "", FirebaseAnalytics.Param.SOURCE, "tier", "benefitPackage", "Lcom/ellation/crunchyroll/api/etp/subscription/model/BenefitPackage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/subscription/model/BenefitPackage;)V", "getBenefitPackage", "()Lcom/ellation/crunchyroll/api/etp/subscription/model/BenefitPackage;", "getSku", "()Ljava/lang/String;", "getSource", "getTier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Product implements Serializable {
    public static final int $stable = 8;
    @SerializedName("benefit_package")
    private final BenefitPackage benefitPackage;
    @SerializedName("sku")
    private final String sku;
    @SerializedName(FirebaseAnalytics.Param.SOURCE)
    private final String source;
    @SerializedName("tier")
    private final String tier;

    public Product(String str, String str2, String str3, BenefitPackage benefitPackage) {
        j.f(str, "sku");
        j.f(str2, FirebaseAnalytics.Param.SOURCE);
        j.f(str3, "tier");
        j.f(benefitPackage, "benefitPackage");
        this.sku = str;
        this.source = str2;
        this.tier = str3;
        this.benefitPackage = benefitPackage;
    }

    public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, BenefitPackage benefitPackage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = product.sku;
        }
        if ((i & 2) != 0) {
            str2 = product.source;
        }
        if ((i & 4) != 0) {
            str3 = product.tier;
        }
        if ((i & 8) != 0) {
            benefitPackage = product.benefitPackage;
        }
        return product.copy(str, str2, str3, benefitPackage);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.source;
    }

    public final String component3() {
        return this.tier;
    }

    public final BenefitPackage component4() {
        return this.benefitPackage;
    }

    public final Product copy(String str, String str2, String str3, BenefitPackage benefitPackage) {
        j.f(str, "sku");
        j.f(str2, FirebaseAnalytics.Param.SOURCE);
        j.f(str3, "tier");
        j.f(benefitPackage, "benefitPackage");
        return new Product(str, str2, str3, benefitPackage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        if (j.a(this.sku, product.sku) && j.a(this.source, product.source) && j.a(this.tier, product.tier) && j.a(this.benefitPackage, product.benefitPackage)) {
            return true;
        }
        return false;
    }

    public final BenefitPackage getBenefitPackage() {
        return this.benefitPackage;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTier() {
        return this.tier;
    }

    public int hashCode() {
        return this.benefitPackage.hashCode() + a.b(this.tier, a.b(this.source, this.sku.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.sku;
        String str2 = this.source;
        String str3 = this.tier;
        BenefitPackage benefitPackage = this.benefitPackage;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("Product(sku=", str, ", source=", str2, ", tier=");
        b.append(str3);
        b.append(", benefitPackage=");
        b.append(benefitPackage);
        b.append(")");
        return b.toString();
    }
}
