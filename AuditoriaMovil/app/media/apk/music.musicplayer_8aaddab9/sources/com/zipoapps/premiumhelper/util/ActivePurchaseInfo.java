package com.zipoapps.premiumhelper.util;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinEventParameters;
import e.j.d.a0.a;
import e.j.d.c0.e0;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class ActivePurchaseInfo {
    private final long purchaseTime;
    private final String purchaseToken;
    private final String sku;
    private final e0 status;

    public ActivePurchaseInfo(String str, String str2, long j2, e0 e0Var) {
        j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        j.e(str2, "purchaseToken");
        this.sku = str;
        this.purchaseToken = str2;
        this.purchaseTime = j2;
        this.status = e0Var;
    }

    public static /* synthetic */ ActivePurchaseInfo copy$default(ActivePurchaseInfo activePurchaseInfo, String str, String str2, long j2, e0 e0Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activePurchaseInfo.sku;
        }
        if ((i2 & 2) != 0) {
            str2 = activePurchaseInfo.purchaseToken;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j2 = activePurchaseInfo.purchaseTime;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            e0Var = activePurchaseInfo.status;
        }
        return activePurchaseInfo.copy(str, str3, j3, e0Var);
    }

    public final String component1() {
        return this.sku;
    }

    public final String component2() {
        return this.purchaseToken;
    }

    public final long component3() {
        return this.purchaseTime;
    }

    public final e0 component4() {
        return this.status;
    }

    public final ActivePurchaseInfo copy(String str, String str2, long j2, e0 e0Var) {
        j.e(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        j.e(str2, "purchaseToken");
        return new ActivePurchaseInfo(str, str2, j2, e0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivePurchaseInfo) {
            ActivePurchaseInfo activePurchaseInfo = (ActivePurchaseInfo) obj;
            return j.a(this.sku, activePurchaseInfo.sku) && j.a(this.purchaseToken, activePurchaseInfo.purchaseToken) && this.purchaseTime == activePurchaseInfo.purchaseTime && this.status == activePurchaseInfo.status;
        }
        return false;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSku() {
        return this.sku;
    }

    public final e0 getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = (a.a(this.purchaseTime) + e.a.d.a.a.x(this.purchaseToken, this.sku.hashCode() * 31, 31)) * 31;
        e0 e0Var = this.status;
        return a + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("ActivePurchaseInfo(sku=");
        y.append(this.sku);
        y.append(", purchaseToken=");
        y.append(this.purchaseToken);
        y.append(", purchaseTime=");
        y.append(this.purchaseTime);
        y.append(", status=");
        y.append(this.status);
        y.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return y.toString();
    }
}
