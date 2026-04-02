package com.ellation.crunchyroll.api.etp.subscription.model;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Product.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/subscription/model/BenefitPackage;", "Ljava/io/Serializable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "benefitsKeys", "", "(Ljava/lang/String;Ljava/util/List;)V", "getBenefitsKeys", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BenefitPackage implements Serializable {
    public static final int $stable = 8;
    @SerializedName("benefits")
    private final List<String> benefitsKeys;
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public BenefitPackage(String str, List<String> list) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(list, "benefitsKeys");
        this.name = str;
        this.benefitsKeys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BenefitPackage copy$default(BenefitPackage benefitPackage, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = benefitPackage.name;
        }
        if ((i & 2) != 0) {
            list = benefitPackage.benefitsKeys;
        }
        return benefitPackage.copy(str, list);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.benefitsKeys;
    }

    public final BenefitPackage copy(String str, List<String> list) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        j.f(list, "benefitsKeys");
        return new BenefitPackage(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitPackage)) {
            return false;
        }
        BenefitPackage benefitPackage = (BenefitPackage) obj;
        if (j.a(this.name, benefitPackage.name) && j.a(this.benefitsKeys, benefitPackage.benefitsKeys)) {
            return true;
        }
        return false;
    }

    public final List<String> getBenefitsKeys() {
        return this.benefitsKeys;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.benefitsKeys.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        String str = this.name;
        List<String> list = this.benefitsKeys;
        return "BenefitPackage(name=" + str + ", benefitsKeys=" + list + ")";
    }
}
