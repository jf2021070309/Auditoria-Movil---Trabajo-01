package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class Purchase {
    public final String a;
    public final String b;
    public final com.amazon.aps.iva.if0.c c;

    public Purchase(String str, String str2) throws com.amazon.aps.iva.if0.b {
        this.a = str;
        this.b = str2;
        this.c = new com.amazon.aps.iva.if0.c(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.if0.c cVar = this.c;
        if (cVar.has("productIds")) {
            com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.e(); i++) {
                    arrayList.add(optJSONArray.n(i));
                }
            }
        } else if (cVar.has("productId")) {
            arrayList.add(cVar.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        com.amazon.aps.iva.if0.c cVar = this.c;
        return cVar.optString("token", cVar.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.b, purchase.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
