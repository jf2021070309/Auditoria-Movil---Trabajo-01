package com.amazon.aps.iva.ks;

import com.amazon.aps.iva.js.g0;
/* compiled from: SkuProperty.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.is.a {
    private final String skuId;
    private final String skuTitle;
    private final g0 skuType = null;

    public s(String str, String str2) {
        this.skuId = str;
        this.skuTitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.skuId, sVar.skuId) && com.amazon.aps.iva.yb0.j.a(this.skuTitle, sVar.skuTitle) && this.skuType == sVar.skuType) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.skuId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.skuTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        g0 g0Var = this.skuType;
        if (g0Var != null) {
            i = g0Var.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        String str = this.skuId;
        String str2 = this.skuTitle;
        g0 g0Var = this.skuType;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("SkuProperty(skuId=", str, ", skuTitle=", str2, ", skuType=");
        b.append(g0Var);
        b.append(")");
        return b.toString();
    }
}
