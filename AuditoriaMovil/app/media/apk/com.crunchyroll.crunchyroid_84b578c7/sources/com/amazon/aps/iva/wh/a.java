package com.amazon.aps.iva.wh;

import com.amazon.aps.iva.rs.m;
import com.amazon.aps.iva.rs.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.externalparteners.model.PurchasePaymentState;
import java.io.Serializable;
/* compiled from: CrPlusPurchase.kt */
/* loaded from: classes.dex */
public final class a implements Serializable {
    public final p b;
    public final String c;
    public final String d;
    public final m e;
    public final PurchasePaymentState f;

    public a(p pVar, String str, String str2, m mVar, PurchasePaymentState purchasePaymentState) {
        j.f(pVar, "billingPurchase");
        this.b = pVar;
        this.c = str;
        this.d = str2;
        this.e = mVar;
        this.f = purchasePaymentState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && this.f == aVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.b.hashCode() * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        m mVar = this.e;
        if (mVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        PurchasePaymentState purchasePaymentState = this.f;
        if (purchasePaymentState != null) {
            i = purchasePaymentState.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "CrPlusPurchase(billingPurchase=" + this.b + ", promoCode=" + this.c + ", promotionType=" + this.d + ", introductoryOffer=" + this.e + ", paymentState=" + this.f + ")";
    }
}
