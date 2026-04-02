package com.amazon.aps.iva.z20;

import com.amazon.aps.iva.a30.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import java.util.Iterator;
import java.util.List;
/* compiled from: OfflineAccessGateFormatter.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final Product a(List<Product> list) {
        Object obj;
        boolean z;
        j.f(list, "<this>");
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Product product = (Product) obj;
                if (!j.a(product.getSku(), com.amazon.aps.iva.a30.a.ANNUAL_FAN_PACK.getSku()) && !j.a(product.getSku(), com.amazon.aps.iva.a30.a.SUPER_FAN_PACK.getSku())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Product) obj;
    }

    public static final int b(Product product) {
        a.C0100a c0100a = com.amazon.aps.iva.a30.a.Companion;
        String sku = product.getSku();
        c0100a.getClass();
        return a.C0100a.a(sku).getTitleResId();
    }
}
