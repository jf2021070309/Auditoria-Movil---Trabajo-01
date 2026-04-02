package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alreadypremium.SubscriptionAlreadyPremiumLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.disclaimer.CrPlusLegalDisclaimerTextView;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import com.ellation.toolbar.ToolbarDivider;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
/* compiled from: ActivityUpgradeBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final FrameLayout c;
    public final CrPlusLegalDisclaimerTextView d;
    public final FrameLayout e;
    public final SubscriptionAlternativeFlowLayout f;
    public final CrPlusSubscriptionButton g;
    public final UpsellCarouselLayout h;
    public final ScrollView i;
    public final TabDotsIndicatorView j;
    public final ToolbarDivider k;
    public final SubscriptionAlreadyPremiumLayout l;
    public final com.amazon.aps.iva.vf.b m;

    public d(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView, FrameLayout frameLayout2, SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout, CrPlusSubscriptionButton crPlusSubscriptionButton, UpsellCarouselLayout upsellCarouselLayout, ScrollView scrollView, TabDotsIndicatorView tabDotsIndicatorView, ToolbarDivider toolbarDivider, SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout, com.amazon.aps.iva.vf.b bVar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = frameLayout;
        this.d = crPlusLegalDisclaimerTextView;
        this.e = frameLayout2;
        this.f = subscriptionAlternativeFlowLayout;
        this.g = crPlusSubscriptionButton;
        this.h = upsellCarouselLayout;
        this.i = scrollView;
        this.j = tabDotsIndicatorView;
        this.k = toolbarDivider;
        this.l = subscriptionAlreadyPremiumLayout;
        this.m = bVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
