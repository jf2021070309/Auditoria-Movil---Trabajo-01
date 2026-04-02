package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.disclaimer.CrPlusLegalDisclaimerTextView;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import com.ellation.toolbar.ToolbarDivider;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
/* compiled from: ActivityUpsellV2Binding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final CrPlusLegalDisclaimerTextView c;
    public final TextView d;
    public final CrPlusSubscriptionButton e;
    public final TextView f;
    public final UpsellCarouselLayout g;
    public final ScrollView h;
    public final TabDotsIndicatorView i;
    public final ToolbarDivider j;
    public final FrameLayout k;
    public final FrameLayout l;
    public final SubscriptionAlternativeFlowLayout m;

    public e(ConstraintLayout constraintLayout, ImageView imageView, CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView, TextView textView, CrPlusSubscriptionButton crPlusSubscriptionButton, TextView textView2, UpsellCarouselLayout upsellCarouselLayout, ScrollView scrollView, TabDotsIndicatorView tabDotsIndicatorView, ToolbarDivider toolbarDivider, FrameLayout frameLayout, FrameLayout frameLayout2, SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = crPlusLegalDisclaimerTextView;
        this.d = textView;
        this.e = crPlusSubscriptionButton;
        this.f = textView2;
        this.g = upsellCarouselLayout;
        this.h = scrollView;
        this.i = tabDotsIndicatorView;
        this.j = toolbarDivider;
        this.k = frameLayout;
        this.l = frameLayout2;
        this.m = subscriptionAlternativeFlowLayout;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
