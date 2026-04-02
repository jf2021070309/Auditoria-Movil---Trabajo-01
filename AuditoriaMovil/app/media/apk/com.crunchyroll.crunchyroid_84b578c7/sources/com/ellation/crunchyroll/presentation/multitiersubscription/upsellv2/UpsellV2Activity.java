package com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.g30.g;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.j30.e0;
import com.amazon.aps.iva.j30.n;
import com.amazon.aps.iva.j30.o;
import com.amazon.aps.iva.j30.z;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q20.a;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.disclaimer.CrPlusLegalDisclaimerTextView;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import com.ellation.toolbar.ToolbarDivider;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UpsellV2Activity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/upsellv2/UpsellV2Activity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/j30/z;", "Lcom/amazon/aps/iva/h20/e;", "<init>", "()V", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpsellV2Activity extends com.amazon.aps.iva.i60.b implements z, com.amazon.aps.iva.h20.e {
    public static final /* synthetic */ l<Object>[] s = {q.a(UpsellV2Activity.class, "upsellV2ViewModel", "getUpsellV2ViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/upsellv2/UpsellV2ViewModelImpl;", 0), q.a(UpsellV2Activity.class, "productsViewModel", "getProductsViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscription/viewmodel/CrPlusSubscriptionProductsViewModel;", 0)};
    public final m k = com.amazon.aps.iva.kb0.f.b(new a());
    public final m l = com.amazon.aps.iva.kb0.f.b(i.h);
    public final m m = com.amazon.aps.iva.kb0.f.b(j.h);
    public final com.amazon.aps.iva.ez.a n = new com.amazon.aps.iva.ez.a(e0.class, new g(this), new k());
    public final com.amazon.aps.iva.ez.a o = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.d30.e.class, new h(this), new f());
    public final m p = com.amazon.aps.iva.kb0.f.b(new b());
    public final m q = com.amazon.aps.iva.kb0.f.b(new e());
    public final com.amazon.aps.iva.xw.a r = com.amazon.aps.iva.xw.b.b(this, new c());

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v60.e> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v60.e invoke() {
            View inflate = UpsellV2Activity.this.getLayoutInflater().inflate(R.layout.activity_upsell_v2, (ViewGroup) null, false);
            int i = R.id.upsell_close_button;
            ImageView imageView = (ImageView) com.amazon.aps.iva.e.z.u(R.id.upsell_close_button, inflate);
            if (imageView != null) {
                i = R.id.upsell_legal_disclaimer;
                CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView = (CrPlusLegalDisclaimerTextView) com.amazon.aps.iva.e.z.u(R.id.upsell_legal_disclaimer, inflate);
                if (crPlusLegalDisclaimerTextView != null) {
                    i = R.id.upsell_skip_for_now_button;
                    TextView textView = (TextView) com.amazon.aps.iva.e.z.u(R.id.upsell_skip_for_now_button, inflate);
                    if (textView != null) {
                        i = R.id.upsell_subscription_button;
                        CrPlusSubscriptionButton crPlusSubscriptionButton = (CrPlusSubscriptionButton) com.amazon.aps.iva.e.z.u(R.id.upsell_subscription_button, inflate);
                        if (crPlusSubscriptionButton != null) {
                            i = R.id.upsell_subtitle;
                            TextView textView2 = (TextView) com.amazon.aps.iva.e.z.u(R.id.upsell_subtitle, inflate);
                            if (textView2 != null) {
                                i = R.id.upsell_tiers_carousel;
                                UpsellCarouselLayout upsellCarouselLayout = (UpsellCarouselLayout) com.amazon.aps.iva.e.z.u(R.id.upsell_tiers_carousel, inflate);
                                if (upsellCarouselLayout != null) {
                                    i = R.id.upsell_tiers_carousel_container;
                                    ScrollView scrollView = (ScrollView) com.amazon.aps.iva.e.z.u(R.id.upsell_tiers_carousel_container, inflate);
                                    if (scrollView != null) {
                                        i = R.id.upsell_tiers_tab_indicator;
                                        TabDotsIndicatorView tabDotsIndicatorView = (TabDotsIndicatorView) com.amazon.aps.iva.e.z.u(R.id.upsell_tiers_tab_indicator, inflate);
                                        if (tabDotsIndicatorView != null) {
                                            i = R.id.upsell_title;
                                            if (((TextView) com.amazon.aps.iva.e.z.u(R.id.upsell_title, inflate)) != null) {
                                                i = R.id.upsell_toolbar_divider;
                                                ToolbarDivider toolbarDivider = (ToolbarDivider) com.amazon.aps.iva.e.z.u(R.id.upsell_toolbar_divider, inflate);
                                                if (toolbarDivider != null) {
                                                    i = R.id.upsell_v2_error;
                                                    FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.upsell_v2_error, inflate);
                                                    if (frameLayout != null) {
                                                        i = R.id.upsell_v2_progress;
                                                        FrameLayout frameLayout2 = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.upsell_v2_progress, inflate);
                                                        if (frameLayout2 != null) {
                                                            i = R.id.upsell_v2_subscription_alternative_flow;
                                                            SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout = (SubscriptionAlternativeFlowLayout) com.amazon.aps.iva.e.z.u(R.id.upsell_v2_subscription_alternative_flow, inflate);
                                                            if (subscriptionAlternativeFlowLayout != null) {
                                                                return new com.amazon.aps.iva.v60.e((ConstraintLayout) inflate, imageView, crPlusLegalDisclaimerTextView, textView, crPlusSubscriptionButton, textView2, upsellCarouselLayout, scrollView, tabDotsIndicatorView, toolbarDivider, frameLayout, frameLayout2, subscriptionAlternativeFlowLayout);
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
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.j30.g> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.j30.g invoke() {
            Intent intent = UpsellV2Activity.this.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            return new com.amazon.aps.iva.j30.g(intent.getIntExtra("CTA_BUTTON_TEXT", 0), intent.getIntExtra("CTA_BUTTON_TEXT_WITH_INTO_OFFER", 0), intent.getBooleanExtra("ALLOW_SKIPPING_SUBSCRIPTION", false));
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            l<Object>[] lVarArr = UpsellV2Activity.s;
            UpsellV2Activity upsellV2Activity = UpsellV2Activity.this;
            upsellV2Activity.oi().a();
            upsellV2Activity.setResult(50);
            upsellV2Activity.finish();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
        public d(n nVar) {
            super(1, nVar, n.class, "onTierItemSelected", "onTierItemSelected(I)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
            ((n) this.receiver).k(num.intValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<n> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final n invoke() {
            UpsellV2Activity upsellV2Activity = UpsellV2Activity.this;
            com.amazon.aps.iva.j30.g gVar = (com.amazon.aps.iva.j30.g) upsellV2Activity.p.getValue();
            e0 e0Var = (e0) upsellV2Activity.n.getValue(upsellV2Activity, UpsellV2Activity.s[0]);
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.f20.b h = iVar.h();
                com.amazon.aps.iva.f20.i iVar2 = i.a.a;
                if (iVar2 != null) {
                    com.amazon.aps.iva.xh.b e = iVar2.e(upsellV2Activity);
                    com.amazon.aps.iva.g30.g a = g.a.a(upsellV2Activity, null, null, 14);
                    com.amazon.aps.iva.j30.c cVar = (com.amazon.aps.iva.j30.c) upsellV2Activity.m.getValue();
                    com.amazon.aps.iva.i20.e eVar = (com.amazon.aps.iva.i20.e) upsellV2Activity.l.getValue();
                    com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.a aVar = new com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.a(upsellV2Activity);
                    com.amazon.aps.iva.f20.i iVar3 = i.a.a;
                    if (iVar3 != null) {
                        com.amazon.aps.iva.xb0.a<Boolean> a2 = iVar3.a();
                        com.amazon.aps.iva.f20.i iVar4 = i.a.a;
                        if (iVar4 != null) {
                            com.amazon.aps.iva.xb0.a<Boolean> s = iVar4.s();
                            com.amazon.aps.iva.yb0.j.f(gVar, "input");
                            com.amazon.aps.iva.yb0.j.f(h, "authenticationRouter");
                            com.amazon.aps.iva.yb0.j.f(e, "upgradeFlowRouter");
                            com.amazon.aps.iva.yb0.j.f(cVar, "upsellV2Analytics");
                            com.amazon.aps.iva.yb0.j.f(eVar, "subscriptionAnalytics");
                            com.amazon.aps.iva.yb0.j.f(a2, "isUserLoggedIn");
                            com.amazon.aps.iva.yb0.j.f(s, "hasAnySubscriptions");
                            return new o(upsellV2Activity, gVar, e0Var, h, e, a, cVar, eVar, aVar, a2, s);
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.d30.e> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.d30.e invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            UpsellV2Activity upsellV2Activity = UpsellV2Activity.this;
            com.amazon.aps.iva.rs.f c = UpsellV2Activity.mi(upsellV2Activity).c();
            com.amazon.aps.iva.b30.a a = e.a.a(upsellV2Activity).a();
            com.amazon.aps.iva.rs.l d = e.a.a(upsellV2Activity).d(upsellV2Activity);
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                return new com.amazon.aps.iva.d30.e(c, a, d, iVar.o(), null, new com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.b(upsellV2Activity), (com.amazon.aps.iva.i20.e) upsellV2Activity.l.getValue(), 48);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i20.e> {
        public static final i h = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i20.e invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.SUBSCRIPTION_TIERS_MENU;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            return e.a.a(aVar);
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.j30.c> {
        public static final j h = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.j30.c invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.SUBSCRIPTION_TIERS_MENU;
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            return new com.amazon.aps.iva.j30.d(aVar);
        }
    }

    /* compiled from: UpsellV2Activity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, e0> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            l<Object>[] lVarArr = UpsellV2Activity.s;
            UpsellV2Activity upsellV2Activity = UpsellV2Activity.this;
            upsellV2Activity.getClass();
            l<?> lVar = UpsellV2Activity.s[1];
            Resources resources = upsellV2Activity.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            return new e0((com.amazon.aps.iva.d30.d) upsellV2Activity.o.getValue(upsellV2Activity, lVar), (com.amazon.aps.iva.j30.g) upsellV2Activity.p.getValue(), new com.amazon.aps.iva.j30.i(a.C0634a.a(resources), com.amazon.aps.iva.j30.a.a));
        }
    }

    public static final com.amazon.aps.iva.f20.e mi(UpsellV2Activity upsellV2Activity) {
        upsellV2Activity.getClass();
        return e.a.a(upsellV2Activity);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void Bd(int i2) {
        ni().f.setText(getResources().getQuantityString(R.plurals.cr_plus_upsell_menu_days_duration, i2, Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void Dc() {
        TextView textView = ni().f;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.upsellSubtitle");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void Eh() {
        TextView textView = ni().f;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.upsellSubtitle");
        textView.setVisibility(4);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void H0(com.amazon.aps.iva.e30.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "ctaButtonUiModel");
        ni().e.b1(aVar);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void I(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        FrameLayout frameLayout = ni().k;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.upsellV2Error");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final com.amazon.aps.iva.fs.b Ke() {
        return r.p(ni().e.getButtonTextView(), null);
    }

    @Override // com.amazon.aps.iva.p20.a
    public final void M0() {
        setResult(-1);
        finish();
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void P(List<com.amazon.aps.iva.n20.f> list) {
        com.amazon.aps.iva.yb0.j.f(list, "tiers");
        ni().g.P(list);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void X(int i2) {
        ni().i.setSize(i2);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        FrameLayout frameLayout = ni().l;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.upsellV2Progress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        FrameLayout frameLayout = ni().l;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.upsellV2Progress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.c3.i, com.amazon.aps.iva.sn.e
    public final void closeScreen() {
        setResult(50);
        finish();
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void k3() {
        TextView textView = ni().d;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.upsellSkipForNowButton");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void l(int i2) {
        ni().g.setCurrentItem(i2);
    }

    public final com.amazon.aps.iva.v60.e ni() {
        return (com.amazon.aps.iva.v60.e) this.k.getValue();
    }

    public final n oi() {
        return (n) this.q.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = ni().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        ni().b.setOnClickListener(new com.amazon.aps.iva.c8.r(this, 16));
        ni().d.setOnClickListener(new s(this, 18));
        ni().e.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 19));
        ni().h.setOnScrollChangeListener(new com.amazon.aps.iva.k20.a(this, 1));
        com.amazon.aps.iva.f20.i iVar = i.a.a;
        com.amazon.aps.iva.vw.a aVar = null;
        if (iVar != null) {
            com.amazon.aps.iva.f20.b h2 = iVar.h();
            Intent intent = getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("experiment", com.amazon.aps.iva.vw.a.class);
                } else {
                    obj = (com.amazon.aps.iva.vw.a) extras.getSerializable("experiment");
                }
                aVar = (com.amazon.aps.iva.vw.a) obj;
            }
            h2.b(this, aVar);
            ni().g.setItemSelectedListener(new d(oi()));
            ni().m.b1((com.amazon.aps.iva.d30.d) this.o.getValue(this, s[1]), this);
            getOnBackPressedDispatcher().a(this, this.r);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void s9() {
        TextView textView = ni().d;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.upsellSkipForNowButton");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(oi());
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void td(int i2) {
        ni().f.setText(getResources().getQuantityString(R.plurals.cr_plus_upsell_menu_months_duration, i2, Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.j30.z
    public final void w0(com.amazon.aps.iva.b30.c cVar, com.amazon.aps.iva.e30.a aVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "product");
        com.amazon.aps.iva.yb0.j.f(aVar, "ctaModel");
        CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView = ni().c;
        String string = getString(aVar.b);
        com.amazon.aps.iva.yb0.j.e(string, "getString(ctaModel.text)");
        Locale locale = Locale.getDefault();
        com.amazon.aps.iva.yb0.j.e(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        com.amazon.aps.iva.f20.i iVar = i.a.a;
        if (iVar != null) {
            com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> q = iVar.q();
            CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView2 = ni().c;
            com.amazon.aps.iva.yb0.j.e(crPlusLegalDisclaimerTextView2, "binding.upsellLegalDisclaimer");
            crPlusLegalDisclaimerTextView.U2(upperCase, cVar, q.invoke(this, crPlusLegalDisclaimerTextView2, com.amazon.aps.iva.ls.a.PRODUCT_UPSELL_SUBSCRIPTION));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
