package com.ellation.crunchyroll.api.etp.externalparteners.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: VerifyPurchaseResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/externalparteners/model/VerifyPurchaseResponse;", "", "purchaseType", "", "promotionType", "promotionCode", "paymentState", "Lcom/ellation/crunchyroll/api/etp/externalparteners/model/PurchasePaymentState;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/externalparteners/model/PurchasePaymentState;)V", "getPaymentState", "()Lcom/ellation/crunchyroll/api/etp/externalparteners/model/PurchasePaymentState;", "getPromotionCode", "()Ljava/lang/String;", "getPromotionType", "getPurchaseType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VerifyPurchaseResponse {
    public static final int $stable = 0;
    @SerializedName("payment_state")
    private final PurchasePaymentState paymentState;
    @SerializedName("promotion_code")
    private final String promotionCode;
    @SerializedName("promotion_type")
    private final String promotionType;
    @SerializedName("purchase_type")
    private final String purchaseType;

    public VerifyPurchaseResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ VerifyPurchaseResponse copy$default(VerifyPurchaseResponse verifyPurchaseResponse, String str, String str2, String str3, PurchasePaymentState purchasePaymentState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPurchaseResponse.purchaseType;
        }
        if ((i & 2) != 0) {
            str2 = verifyPurchaseResponse.promotionType;
        }
        if ((i & 4) != 0) {
            str3 = verifyPurchaseResponse.promotionCode;
        }
        if ((i & 8) != 0) {
            purchasePaymentState = verifyPurchaseResponse.paymentState;
        }
        return verifyPurchaseResponse.copy(str, str2, str3, purchasePaymentState);
    }

    public final String component1() {
        return this.purchaseType;
    }

    public final String component2() {
        return this.promotionType;
    }

    public final String component3() {
        return this.promotionCode;
    }

    public final PurchasePaymentState component4() {
        return this.paymentState;
    }

    public final VerifyPurchaseResponse copy(String str, String str2, String str3, PurchasePaymentState purchasePaymentState) {
        return new VerifyPurchaseResponse(str, str2, str3, purchasePaymentState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPurchaseResponse)) {
            return false;
        }
        VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) obj;
        if (j.a(this.purchaseType, verifyPurchaseResponse.purchaseType) && j.a(this.promotionType, verifyPurchaseResponse.promotionType) && j.a(this.promotionCode, verifyPurchaseResponse.promotionCode) && this.paymentState == verifyPurchaseResponse.paymentState) {
            return true;
        }
        return false;
    }

    public final PurchasePaymentState getPaymentState() {
        return this.paymentState;
    }

    public final String getPromotionCode() {
        return this.promotionCode;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final String getPurchaseType() {
        return this.purchaseType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.purchaseType;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.promotionType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.promotionCode;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        PurchasePaymentState purchasePaymentState = this.paymentState;
        if (purchasePaymentState != null) {
            i = purchasePaymentState.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this.purchaseType;
        String str2 = this.promotionType;
        String str3 = this.promotionCode;
        PurchasePaymentState purchasePaymentState = this.paymentState;
        StringBuilder b = a.b("VerifyPurchaseResponse(purchaseType=", str, ", promotionType=", str2, ", promotionCode=");
        b.append(str3);
        b.append(", paymentState=");
        b.append(purchasePaymentState);
        b.append(")");
        return b.toString();
    }

    public VerifyPurchaseResponse(String str, String str2, String str3, PurchasePaymentState purchasePaymentState) {
        this.purchaseType = str;
        this.promotionType = str2;
        this.promotionCode = str3;
        this.paymentState = purchasePaymentState;
    }

    public /* synthetic */ VerifyPurchaseResponse(String str, String str2, String str3, PurchasePaymentState purchasePaymentState, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : purchasePaymentState);
    }
}
