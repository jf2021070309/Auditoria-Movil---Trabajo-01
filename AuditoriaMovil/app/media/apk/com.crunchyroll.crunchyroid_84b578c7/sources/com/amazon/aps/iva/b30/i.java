package com.amazon.aps.iva.b30;

import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import com.google.gson.Gson;
/* compiled from: SubscriptionProductStore.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.xe.a<Product> {
    public i(com.amazon.aps.iva.ya0.f fVar, Gson gson) {
        super(Product.class, fVar, "subscription_products", gson);
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Product product) {
        Product product2 = product;
        com.amazon.aps.iva.yb0.j.f(product2, "<this>");
        return String.valueOf(product2.hashCode());
    }
}
