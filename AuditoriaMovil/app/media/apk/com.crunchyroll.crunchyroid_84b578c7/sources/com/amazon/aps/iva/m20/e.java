package com.amazon.aps.iva.m20;

import android.view.View;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.ui.transitions.ColorTransition;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class e extends ColorTransition<Integer> {
    public final /* synthetic */ UpsellCarouselLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(UpsellCarouselLayout upsellCarouselLayout, String str, String str2) {
        super(str, str2);
        this.a = upsellCarouselLayout;
        com.amazon.aps.iva.yb0.j.e(str, "getString(0 + CommonResources.color.cr_honey_gold)");
        com.amazon.aps.iva.yb0.j.e(str2, "getString(0 + CommonReso….color.cr_silver_chalice)");
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewIn(Object obj) {
        com.amazon.aps.iva.n20.a b1 = UpsellCarouselLayout.b1(this.a, ((Number) obj).intValue());
        if (b1 != null) {
            return b1.getBadge();
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewOut(Object obj) {
        com.amazon.aps.iva.n20.a b1 = UpsellCarouselLayout.b1(this.a, ((Number) obj).intValue());
        if (b1 != null) {
            return b1.getBadge();
        }
        return null;
    }
}
