package com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade;

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
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i20.e;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q20.a;
import com.amazon.aps.iva.s20.s;
import com.amazon.aps.iva.s20.z;
import com.amazon.aps.iva.wy.k;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.presentation.multitiersubscription.alreadypremium.SubscriptionAlreadyPremiumLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alternativeflow.SubscriptionAlternativeFlowLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.carouselv2.UpsellCarouselLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.disclaimer.CrPlusLegalDisclaimerTextView;
import com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import com.ellation.toolbar.ToolbarDivider;
import com.ellation.widgets.tabs.TabDotsIndicatorView;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UpgradeActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/extendedupgrade/UpgradeActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/s20/s;", "Lcom/amazon/aps/iva/h20/e;", "<init>", "()V", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpgradeActivity extends com.amazon.aps.iva.i60.b implements s, com.amazon.aps.iva.h20.e {
    public static final /* synthetic */ l<Object>[] r = {q.a(UpgradeActivity.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/extendedupgrade/UpgradeViewModelImpl;", 0), q.a(UpgradeActivity.class, "productsViewModel", "getProductsViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscription/viewmodel/CrPlusSubscriptionProductsViewModel;", 0)};
    public final m k = com.amazon.aps.iva.kb0.f.b(new a());
    public final com.amazon.aps.iva.xw.a l = com.amazon.aps.iva.xw.b.b(this, new b());
    public final m m = com.amazon.aps.iva.kb0.f.b(h.h);
    public final m n = com.amazon.aps.iva.kb0.f.b(i.h);
    public final com.amazon.aps.iva.ez.a o = new com.amazon.aps.iva.ez.a(z.class, new f(this), new j());
    public final com.amazon.aps.iva.ez.a p = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.d30.e.class, new g(this), new e());
    public final m q = com.amazon.aps.iva.kb0.f.b(new d());

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v60.d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v60.d invoke() {
            View inflate = UpgradeActivity.this.getLayoutInflater().inflate(R.layout.activity_upgrade, (ViewGroup) null, false);
            int i = R.id.close_button;
            ImageView imageView = (ImageView) com.amazon.aps.iva.e.z.u(R.id.close_button, inflate);
            if (imageView != null) {
                i = R.id.error;
                FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.error, inflate);
                if (frameLayout != null) {
                    i = R.id.legal_disclaimer;
                    CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView = (CrPlusLegalDisclaimerTextView) com.amazon.aps.iva.e.z.u(R.id.legal_disclaimer, inflate);
                    if (crPlusLegalDisclaimerTextView != null) {
                        i = R.id.progress;
                        FrameLayout frameLayout2 = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.progress, inflate);
                        if (frameLayout2 != null) {
                            i = R.id.subscription_alternative_flow;
                            SubscriptionAlternativeFlowLayout subscriptionAlternativeFlowLayout = (SubscriptionAlternativeFlowLayout) com.amazon.aps.iva.e.z.u(R.id.subscription_alternative_flow, inflate);
                            if (subscriptionAlternativeFlowLayout != null) {
                                i = R.id.subscription_button;
                                CrPlusSubscriptionButton crPlusSubscriptionButton = (CrPlusSubscriptionButton) com.amazon.aps.iva.e.z.u(R.id.subscription_button, inflate);
                                if (crPlusSubscriptionButton != null) {
                                    i = R.id.tiers_carousel;
                                    UpsellCarouselLayout upsellCarouselLayout = (UpsellCarouselLayout) com.amazon.aps.iva.e.z.u(R.id.tiers_carousel, inflate);
                                    if (upsellCarouselLayout != null) {
                                        i = R.id.tiers_carousel_container;
                                        ScrollView scrollView = (ScrollView) com.amazon.aps.iva.e.z.u(R.id.tiers_carousel_container, inflate);
                                        if (scrollView != null) {
                                            i = R.id.tiers_tab_indicator;
                                            TabDotsIndicatorView tabDotsIndicatorView = (TabDotsIndicatorView) com.amazon.aps.iva.e.z.u(R.id.tiers_tab_indicator, inflate);
                                            if (tabDotsIndicatorView != null) {
                                                i = R.id.toolbar_divider;
                                                ToolbarDivider toolbarDivider = (ToolbarDivider) com.amazon.aps.iva.e.z.u(R.id.toolbar_divider, inflate);
                                                if (toolbarDivider != null) {
                                                    i = R.id.toolbar_title;
                                                    if (((TextView) com.amazon.aps.iva.e.z.u(R.id.toolbar_title, inflate)) != null) {
                                                        i = R.id.upgrade_already_premium_layout;
                                                        SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout = (SubscriptionAlreadyPremiumLayout) com.amazon.aps.iva.e.z.u(R.id.upgrade_already_premium_layout, inflate);
                                                        if (subscriptionAlreadyPremiumLayout != null) {
                                                            i = R.id.upgrade_restriction_layout;
                                                            View u = com.amazon.aps.iva.e.z.u(R.id.upgrade_restriction_layout, inflate);
                                                            if (u != null) {
                                                                int i2 = R.id.cr_plus_upgrade_restriction_hime;
                                                                ImageView imageView2 = (ImageView) com.amazon.aps.iva.e.z.u(R.id.cr_plus_upgrade_restriction_hime, u);
                                                                if (imageView2 != null) {
                                                                    TextView textView = (TextView) com.amazon.aps.iva.e.z.u(R.id.cr_plus_upgrade_restriction_text, u);
                                                                    if (textView != null) {
                                                                        return new com.amazon.aps.iva.v60.d((ConstraintLayout) inflate, imageView, frameLayout, crPlusLegalDisclaimerTextView, frameLayout2, subscriptionAlternativeFlowLayout, crPlusSubscriptionButton, upsellCarouselLayout, scrollView, tabDotsIndicatorView, toolbarDivider, subscriptionAlreadyPremiumLayout, new com.amazon.aps.iva.vf.b((ConstraintLayout) u, imageView2, textView, 2));
                                                                    }
                                                                    i2 = R.id.cr_plus_upgrade_restriction_text;
                                                                }
                                                                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
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

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            com.amazon.aps.iva.yb0.j.f(mVar, "$this$onBackPressedCallback");
            l<Object>[] lVarArr = UpgradeActivity.r;
            UpgradeActivity upgradeActivity = UpgradeActivity.this;
            upgradeActivity.oi().a();
            upgradeActivity.finish();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.s20.i iVar) {
            super(1, iVar, com.amazon.aps.iva.s20.i.class, "onTierItemSelected", "onTierItemSelected(I)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
            ((com.amazon.aps.iva.s20.i) this.receiver).k(num.intValue());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s20.i> {
        public d() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r0 == null) goto L20;
         */
        @Override // com.amazon.aps.iva.xb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.s20.i invoke() {
            /*
                r10 = this;
                com.amazon.aps.iva.fc0.l<java.lang.Object>[] r0 = com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity.r
                com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity r2 = com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity.this
                r2.getClass()
                com.amazon.aps.iva.fc0.l<java.lang.Object>[] r0 = com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity.r
                r1 = 0
                r0 = r0[r1]
                com.amazon.aps.iva.ez.a r1 = r2.o
                com.amazon.aps.iva.i5.f0 r0 = r1.getValue(r2, r0)
                r3 = r0
                com.amazon.aps.iva.s20.z r3 = (com.amazon.aps.iva.s20.z) r3
                android.content.Intent r0 = r2.getIntent()
                android.os.Bundle r0 = r0.getExtras()
                if (r0 == 0) goto L36
                int r1 = android.os.Build.VERSION.SDK_INT
                r4 = 33
                if (r1 < r4) goto L2a
                java.io.Serializable r0 = com.amazon.aps.iva.d2.u.e(r0)
                goto L32
            L2a:
                java.lang.String r1 = "UPGRADE_EXTRA_SUCCESS_SCREEN_TYPE"
                java.io.Serializable r0 = r0.getSerializable(r1)
                com.amazon.aps.iva.xh.a r0 = (com.amazon.aps.iva.xh.a) r0
            L32:
                com.amazon.aps.iva.xh.a r0 = (com.amazon.aps.iva.xh.a) r0
                if (r0 != 0) goto L38
            L36:
                com.amazon.aps.iva.xh.a r0 = com.amazon.aps.iva.xh.a.CR_PLUS
            L38:
                android.content.Intent r1 = r2.getIntent()
                android.os.Bundle r1 = r1.getExtras()
                r4 = 0
                if (r1 == 0) goto L4a
                java.lang.String r5 = "UPGRADE_EXTRA_REDIRECT_URL"
                java.lang.String r1 = r1.getString(r5)
                goto L4b
            L4a:
                r1 = r4
            L4b:
                r5 = 2
                com.amazon.aps.iva.g30.g r0 = com.amazon.aps.iva.g30.g.a.a(r2, r0, r1, r5)
                com.amazon.aps.iva.kb0.m r1 = r2.m
                java.lang.Object r1 = r1.getValue()
                r5 = r1
                com.amazon.aps.iva.i20.e r5 = (com.amazon.aps.iva.i20.e) r5
                com.amazon.aps.iva.kb0.m r1 = r2.n
                java.lang.Object r1 = r1.getValue()
                r6 = r1
                com.amazon.aps.iva.s20.b r6 = (com.amazon.aps.iva.s20.b) r6
                com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.a r7 = new com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.a
                r7.<init>(r2)
                com.amazon.aps.iva.f20.i r1 = com.amazon.aps.iva.f20.i.a.a
                if (r1 == 0) goto L85
                com.amazon.aps.iva.ct.j r1 = r1.g()
                boolean r8 = r1.getHasPremiumBenefit()
                java.lang.String r1 = "subscriptionAnalytics"
                com.amazon.aps.iva.yb0.j.f(r5, r1)
                java.lang.String r1 = "upgradeAnalytics"
                com.amazon.aps.iva.yb0.j.f(r6, r1)
                com.amazon.aps.iva.s20.n r9 = new com.amazon.aps.iva.s20.n
                r1 = r9
                r4 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r9
            L85:
                java.lang.String r0 = "dependencies"
                com.amazon.aps.iva.yb0.j.m(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity.d.invoke():java.lang.Object");
        }
    }

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.d30.e> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.d30.e invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            UpgradeActivity upgradeActivity = UpgradeActivity.this;
            com.amazon.aps.iva.rs.f c = UpgradeActivity.mi(upgradeActivity).c();
            com.amazon.aps.iva.b30.a a = e.a.a(upgradeActivity).a();
            com.amazon.aps.iva.rs.l d = e.a.a(upgradeActivity).d(upgradeActivity);
            com.amazon.aps.iva.f20.i iVar = i.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.f20.h o = iVar.o();
                com.amazon.aps.iva.i20.e eVar = (com.amazon.aps.iva.i20.e) upgradeActivity.m.getValue();
                Bundle extras = upgradeActivity.getIntent().getExtras();
                return new com.amazon.aps.iva.d30.e(c, a, d, o, (extras == null || (r0 = extras.getString("UPGRADE_EXTRA_PRESELECTED_SKU")) == null) ? "crunchyroll.google.fanpack.monthly" : "crunchyroll.google.fanpack.monthly", new com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.b(upgradeActivity), eVar, 32);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.h hVar) {
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

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i20.e> {
        public static final h h = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i20.e invoke() {
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.SUBSCRIPTION_TIERS_MENU;
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            return e.a.a(aVar);
        }
    }

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s20.b> {
        public static final i h = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.s20.b invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.UPGRADE_MENU;
            com.amazon.aps.iva.yb0.j.f(aVar, "screen");
            return new com.amazon.aps.iva.s20.c(aVar, null);
        }
    }

    /* compiled from: UpgradeActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, z> {
        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(p pVar) {
            String str;
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            l<Object>[] lVarArr = UpgradeActivity.r;
            UpgradeActivity upgradeActivity = UpgradeActivity.this;
            upgradeActivity.getClass();
            com.amazon.aps.iva.d30.d dVar = (com.amazon.aps.iva.d30.d) upgradeActivity.p.getValue(upgradeActivity, UpgradeActivity.r[1]);
            Resources resources = upgradeActivity.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            com.amazon.aps.iva.j30.i iVar = new com.amazon.aps.iva.j30.i(a.C0634a.a(resources), com.amazon.aps.iva.j30.a.a);
            com.amazon.aps.iva.f20.i iVar2 = i.a.a;
            if (iVar2 != null) {
                SubscriptionProcessorService subscriptionProcessorService = iVar2.getSubscriptionProcessorService();
                com.amazon.aps.iva.f20.i iVar3 = i.a.a;
                if (iVar3 != null) {
                    com.amazon.aps.iva.ct.j g = iVar3.g();
                    Bundle extras = upgradeActivity.getIntent().getExtras();
                    if (extras != null) {
                        str = extras.getString("UPGRADE_EXTRA_PRESELECTED_SKU");
                    } else {
                        str = null;
                    }
                    return new z(dVar, iVar, subscriptionProcessorService, g, str);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public static final com.amazon.aps.iva.f20.e mi(UpgradeActivity upgradeActivity) {
        upgradeActivity.getClass();
        return e.a.a(upgradeActivity);
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void H0(com.amazon.aps.iva.e30.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "ctaButtonUiModel");
        ni().g.b1(aVar);
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void H3() {
        ConstraintLayout a2 = ni().m.a();
        com.amazon.aps.iva.yb0.j.e(a2, "binding.upgradeRestrictionLayout.root");
        a2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void I(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        FrameLayout frameLayout = ni().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.error");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.p20.a
    public final void M0() {
        setResult(-1);
        finish();
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void P(List<com.amazon.aps.iva.n20.f> list) {
        com.amazon.aps.iva.yb0.j.f(list, "tiers");
        ni().h.P(list);
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void X(int i2) {
        ni().j.setSize(i2);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void a() {
        FrameLayout frameLayout = ni().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.progress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.ni.q
    public final void b() {
        FrameLayout frameLayout = ni().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.progress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void l(int i2) {
        ni().h.setCurrentItem(i2);
    }

    public final com.amazon.aps.iva.v60.d ni() {
        return (com.amazon.aps.iva.v60.d) this.k.getValue();
    }

    public final com.amazon.aps.iva.s20.i oi() {
        return (com.amazon.aps.iva.s20.i) this.q.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = ni().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        ni().b.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 15));
        ni().g.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 17));
        ni().i.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.amazon.aps.iva.s20.a
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = UpgradeActivity.r;
                UpgradeActivity upgradeActivity = UpgradeActivity.this;
                com.amazon.aps.iva.yb0.j.f(upgradeActivity, "this$0");
                upgradeActivity.ni().k.G(i3);
            }
        });
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
            ni().h.setItemSelectedListener(new c(oi()));
            ni().f.b1((com.amazon.aps.iva.d30.d) this.p.getValue(this, r[1]), this);
            getOnBackPressedDispatcher().a(this, this.l);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void q5() {
        SubscriptionAlreadyPremiumLayout subscriptionAlreadyPremiumLayout = ni().l;
        com.amazon.aps.iva.yb0.j.e(subscriptionAlreadyPremiumLayout, "binding.upgradeAlreadyPremiumLayout");
        subscriptionAlreadyPremiumLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(oi());
    }

    @Override // com.amazon.aps.iva.s20.s
    public final void w0(com.amazon.aps.iva.b30.c cVar, com.amazon.aps.iva.e30.a aVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "product");
        com.amazon.aps.iva.yb0.j.f(aVar, "ctaModel");
        CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView = ni().d;
        String string = getString(aVar.b);
        com.amazon.aps.iva.yb0.j.e(string, "getString(ctaModel.text)");
        Locale locale = Locale.getDefault();
        com.amazon.aps.iva.yb0.j.e(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        com.amazon.aps.iva.f20.i iVar = i.a.a;
        if (iVar != null) {
            com.amazon.aps.iva.xb0.q<Context, com.amazon.aps.iva.wy.h, com.amazon.aps.iva.ls.a, com.amazon.aps.iva.mh.j> q = iVar.q();
            CrPlusLegalDisclaimerTextView crPlusLegalDisclaimerTextView2 = ni().d;
            com.amazon.aps.iva.yb0.j.e(crPlusLegalDisclaimerTextView2, "binding.legalDisclaimer");
            crPlusLegalDisclaimerTextView.U2(upperCase, cVar, q.invoke(this, crPlusLegalDisclaimerTextView2, com.amazon.aps.iva.ls.a.PRODUCT_UPSELL_SUBSCRIPTION));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
