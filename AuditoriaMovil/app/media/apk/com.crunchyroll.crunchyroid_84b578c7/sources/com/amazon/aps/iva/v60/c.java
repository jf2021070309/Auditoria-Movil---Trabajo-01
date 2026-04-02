package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.cta.ManageMembershipCtaButton;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
/* compiled from: ActivityManageMembershipBinding.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final SubscriptionAlternativeFlowLayout b;
    public final ManageMembershipCtaButton c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final UpsellCarouselLayout g;
    public final TabDotsIndicatorView h;

    public c(ConstraintLayout constraintLayout, SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout, ManageMembershipCtaButton manageMembershipCtaButton, FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, UpsellCarouselLayout upsellCarouselLayout, TabDotsIndicatorView tabDotsIndicatorView) {
        this.a = constraintLayout;
        this.b = subscriptionAlternativeFlowLayout;
        this.c = manageMembershipCtaButton;
        this.d = frameLayout;
        this.e = textView;
        this.f = frameLayout2;
        this.g = upsellCarouselLayout;
        this.h = tabDotsIndicatorView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
