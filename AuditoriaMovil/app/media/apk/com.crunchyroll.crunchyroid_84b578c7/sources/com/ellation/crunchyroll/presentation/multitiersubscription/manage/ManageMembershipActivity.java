package com.ellation.crunchyroll.presentation.multitiersubscription.manage;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.g;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.t20.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.manage.cta.ManageMembershipCtaButton;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ManageMembershipActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/manage/ManageMembershipActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/t20/q;", "Lcom/amazon/aps/iva/h20/e;", "<init>", "()V", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ManageMembershipActivity extends com.amazon.aps.iva.i60.b implements q, com.amazon.aps.iva.h20.e {
    public static final /* synthetic */ int m = 0;
    public final com.amazon.aps.iva.kb0.e k = f.a(g.NONE, new e(this));
    public final m l = f.b(new a());

    /* compiled from: ManageMembershipActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.t20.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.t20.a invoke() {
            int i = com.amazon.aps.iva.t20.a.a;
            ManageMembershipActivity manageMembershipActivity = ManageMembershipActivity.this;
            j.f(manageMembershipActivity, "activity");
            return new com.amazon.aps.iva.t20.b(manageMembershipActivity);
        }
    }

    /* compiled from: ManageMembershipActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.t20.d dVar) {
            super(1, dVar, com.amazon.aps.iva.t20.d.class, "onTierItemSelected", "onTierItemSelected(I)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
            ((com.amazon.aps.iva.t20.d) this.receiver).k(num.intValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<com.amazon.aps.iva.u20.c, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.u20.c cVar, com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.u20.c cVar2 = cVar;
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            j.f(cVar2, "manageMembershipCtaType");
            j.f(bVar2, "clickedView");
            int i = ManageMembershipActivity.m;
            ManageMembershipActivity.this.ni().getPresenter().s6(cVar2, bVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ManageMembershipActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            j.f(view, "it");
            int i = ManageMembershipActivity.m;
            ManageMembershipActivity manageMembershipActivity = ManageMembershipActivity.this;
            com.amazon.aps.iva.t20.e presenter = manageMembershipActivity.ni().getPresenter();
            TextView textView = manageMembershipActivity.mi().e;
            j.e(textView, "binding.manageMembershipGooglePlay");
            presenter.r6(r.p(textView, this.i));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v60.c> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v60.c invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_manage_membership, (ViewGroup) null, false);
            int i = R.id.manage_membership_alternative_flow;
            SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout = (SubscriptionAlternativeFlowLayout) z.u(R.id.manage_membership_alternative_flow, inflate);
            if (subscriptionAlternativeFlowLayout != null) {
                i = R.id.manage_membership_cta;
                ManageMembershipCtaButton manageMembershipCtaButton = (ManageMembershipCtaButton) z.u(R.id.manage_membership_cta, inflate);
                if (manageMembershipCtaButton != null) {
                    i = R.id.manage_membership_error;
                    FrameLayout frameLayout = (FrameLayout) z.u(R.id.manage_membership_error, inflate);
                    if (frameLayout != null) {
                        i = R.id.manage_membership_google_play;
                        TextView textView = (TextView) z.u(R.id.manage_membership_google_play, inflate);
                        if (textView != null) {
                            i = R.id.manage_membership_progress;
                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.manage_membership_progress, inflate);
                            if (frameLayout2 != null) {
                                i = R.id.toolbar;
                                if (((Toolbar) z.u(R.id.toolbar, inflate)) != null) {
                                    i = R.id.toolbar_divider;
                                    if (z.u(R.id.toolbar_divider, inflate) != null) {
                                        i = R.id.upsell_tiers_carousel;
                                        UpsellCarouselLayout upsellCarouselLayout = (UpsellCarouselLayout) z.u(R.id.upsell_tiers_carousel, inflate);
                                        if (upsellCarouselLayout != null) {
                                            i = R.id.upsell_tiers_carousel_container;
                                            if (((ScrollView) z.u(R.id.upsell_tiers_carousel_container, inflate)) != null) {
                                                i = R.id.upsell_tiers_tab_indicator;
                                                TabDotsIndicatorView tabDotsIndicatorView = (TabDotsIndicatorView) z.u(R.id.upsell_tiers_tab_indicator, inflate);
                                                if (tabDotsIndicatorView != null) {
                                                    return new com.amazon.aps.iva.v60.c((ConstraintLayout) inflate, subscriptionAlternativeFlowLayout, manageMembershipCtaButton, frameLayout, textView, frameLayout2, upsellCarouselLayout, tabDotsIndicatorView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void I(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        FrameLayout frameLayout = mi().d;
        j.e(frameLayout, "binding.manageMembershipError");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void P(List<com.amazon.aps.iva.n20.f> list) {
        j.f(list, "tiers");
        mi().g.P(list);
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void R9(String str, String str2) {
        j.f(str, "selectedSku");
        j.f(str2, "activeSubscriptionSku");
        mi().c.b1(str, str2);
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void X(int i) {
        mi().h.setSize(i);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        FrameLayout frameLayout = mi().f;
        j.e(frameLayout, "binding.manageMembershipProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        FrameLayout frameLayout = mi().f;
        j.e(frameLayout, "binding.manageMembershipProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void dd(int i) {
        mi().h.a(i);
    }

    @Override // com.amazon.aps.iva.t20.q
    public final void l(int i) {
        mi().g.setCurrentItem(i);
    }

    public final com.amazon.aps.iva.v60.c mi() {
        return (com.amazon.aps.iva.v60.c) this.k.getValue();
    }

    public final com.amazon.aps.iva.t20.a ni() {
        return (com.amazon.aps.iva.t20.a) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        mi().g.setItemSelectedListener(new b(ni().getPresenter()));
        mi().b.b1(ni().a(), this);
        String string = getString(R.string.manage_membership_more_subscription_google_play);
        j.e(string, "getString(R.string.manag…subscription_google_play)");
        mi().c.setOnClickListener(new c());
        TextView textView = mi().e;
        j.e(textView, "binding.manageMembershipGooglePlay");
        String string2 = getString(R.string.manage_membership_more_subscription, string);
        j.e(string2, "getString(\n             …tedText\n                )");
        SpannableString spannableString = new SpannableString(m0.b(com.amazon.aps.iva.d3.a.getColor(this, R.color.primary), string2, string));
        m0.a(spannableString, string, false, new d(string));
        r0.b(textView, spannableString);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.t20.d> setupPresenters() {
        return l1.H(ni().getPresenter());
    }
}
