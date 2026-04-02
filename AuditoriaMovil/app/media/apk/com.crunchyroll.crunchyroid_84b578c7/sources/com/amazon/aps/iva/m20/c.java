package com.amazon.aps.iva.m20;

import android.view.View;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.ui.transitions.FadeTransition;
/* compiled from: UpsellCarouselLayout.kt */
/* loaded from: classes2.dex */
public final class c extends FadeTransition<Integer> {
    public final /* synthetic */ UpsellCarouselLayout a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UpsellCarouselLayout upsellCarouselLayout) {
        super(0.5f, 1.0f);
        this.a = upsellCarouselLayout;
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewIn(Object obj) {
        com.amazon.aps.iva.n20.a b1 = UpsellCarouselLayout.b1(this.a, ((Number) obj).intValue());
        if (b1 != null) {
            return b1.getItemContent();
        }
        return null;
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public final View provideViewOut(Object obj) {
        com.amazon.aps.iva.n20.a b1 = UpsellCarouselLayout.b1(this.a, ((Number) obj).intValue());
        if (b1 != null) {
            return b1.getItemContent();
        }
        return null;
    }
}
