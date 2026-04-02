package com.kwad.components.ad.reward.model;

import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
/* loaded from: classes.dex */
public enum EcOrderCardStyle {
    SPIKE_AND_COUPON(1),
    SPIKE(2),
    COUPON(3),
    NO_SPIKE_AND_NO_COUPON(4),
    DEFAULT(5);
    
    private int value;

    EcOrderCardStyle(int i) {
        this.value = i;
    }

    public static EcOrderCardStyle createFromAdInfo(AdInfo adInfo) {
        if (com.kwad.components.ad.reward.a.b.k(adInfo) || com.kwad.components.ad.reward.a.b.j(adInfo)) {
            AdProductInfo cy = com.kwad.sdk.core.response.b.a.cy(adInfo);
            boolean hasSpike = cy.hasSpike();
            boolean hasCoupon = cy.hasCoupon();
            return (hasSpike && hasCoupon) ? SPIKE_AND_COUPON : hasSpike ? SPIKE : hasCoupon ? COUPON : cy.hasOriginalPrice() ? NO_SPIKE_AND_NO_COUPON : DEFAULT;
        }
        return null;
    }

    public final int getValue() {
        return this.value;
    }
}
