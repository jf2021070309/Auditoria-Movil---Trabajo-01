package com.amazon.aps.iva.e40;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.p;
import com.amazon.aps.iva.cx.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f20.e;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.ph.a;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.t;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.billingnotifications.card.BillingNotificationCard;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.application.a;
import com.google.android.gms.cast.MediaTrack;
import java.text.DateFormat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PremiumMembershipFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/e40/a;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/e40/n;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.qy.a implements n {
    public final v c = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_progress_container);
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.settings_membership_hime_image);
    public final v e = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_title);
    public final v f = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_subscription_manage_title);
    public final v g = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_subscription_renewal_info_title);
    public final v h = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_billing_price);
    public final v i = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_subscription_date_title);
    public final v j = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_subscription_date);
    public final v k = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_manage_container);
    public final v l = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_manage_label);
    public final v m = com.amazon.aps.iva.xw.g.f(this, R.id.upgrade_subscription_subtitle);
    public final v n = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_upgrade);
    public final v o = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_upgrade_subscription_button);
    public final v p = com.amazon.aps.iva.xw.g.f(this, R.id.settings_premium_membership_billing_notification_card);
    public final com.amazon.aps.iva.ez.f q = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.g40.g.class, new d());
    public final com.amazon.aps.iva.cx.d r;
    public final com.amazon.aps.iva.kb0.m s;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] u = {q.a(a.class, "progress", "getProgress()Landroid/view/View;", 0), q.a(a.class, "himeImage", "getHimeImage()Landroid/widget/ImageView;", 0), q.a(a.class, "subscriptionTitle", "getSubscriptionTitle()Landroid/widget/TextView;", 0), q.a(a.class, "subscriptionManageTitle", "getSubscriptionManageTitle()Landroid/widget/TextView;", 0), q.a(a.class, "subscriptionRenewalInfoTitle", "getSubscriptionRenewalInfoTitle()Landroid/widget/TextView;", 0), q.a(a.class, "subscriptionPrice", "getSubscriptionPrice()Landroid/widget/TextView;", 0), q.a(a.class, "subscriptionDateTitle", "getSubscriptionDateTitle()Landroid/widget/TextView;", 0), q.a(a.class, "subscriptionDate", "getSubscriptionDate()Landroid/widget/TextView;", 0), q.a(a.class, "manageButton", "getManageButton()Landroid/view/View;", 0), q.a(a.class, "manageButtonTextView", "getManageButtonTextView()Landroid/widget/TextView;", 0), q.a(a.class, "upgradeSubscriptionSubtitle", "getUpgradeSubscriptionSubtitle()Landroid/widget/TextView;", 0), q.a(a.class, "upgradeSubscriptionContainer", "getUpgradeSubscriptionContainer()Landroid/view/View;", 0), q.a(a.class, "upgradeSubscriptionButton", "getUpgradeSubscriptionButton()Landroid/view/View;", 0), q.a(a.class, "billingNotificationCard", "getBillingNotificationCard()Lcom/crunchyroll/billingnotifications/card/BillingNotificationCard;", 0), q.a(a.class, "viewModel", "getViewModel()Lcom/ellation/crunchyroll/presentation/settings/membership/premium/viewmodel/PremiumMembershipViewModelImpl;", 0)};
    public static final C0215a t = new C0215a();

    /* compiled from: PremiumMembershipFragment.kt */
    /* renamed from: com.amazon.aps.iva.e40.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0215a {
    }

    /* compiled from: PremiumMembershipFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C0215a c0215a = a.t;
            ((i) a.this.s.getValue()).X1(booleanValue);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: PremiumMembershipFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public c() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [com.amazon.aps.iva.e40.b] */
        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            C0215a c0215a = a.t;
            a aVar = a.this;
            aVar.getClass();
            com.amazon.aps.iva.g40.g gVar = (com.amazon.aps.iva.g40.g) aVar.q.getValue(aVar, a.u[14]);
            Resources resources = aVar.getResources();
            com.amazon.aps.iva.yb0.j.e(resources, "resources");
            DateFormat dateInstance = DateFormat.getDateInstance(3);
            com.amazon.aps.iva.yb0.j.e(dateInstance, "getDateInstance(DateFormat.SHORT)");
            com.amazon.aps.iva.e40.d dVar = new com.amazon.aps.iva.e40.d(resources, dateInstance);
            com.amazon.aps.iva.ve.d dVar2 = ((d0) com.ellation.crunchyroll.application.e.a()).p.c;
            final com.amazon.aps.iva.ct.k a = com.ellation.crunchyroll.application.f.a(null, 3);
            ?? r12 = new t(a) { // from class: com.amazon.aps.iva.e40.b
                @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                public final Object get() {
                    return Boolean.valueOf(((com.amazon.aps.iva.ct.j) this.receiver).getHasPremiumBenefit());
                }
            };
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.fs.d dVar3 = new com.amazon.aps.iva.fs.d();
            com.amazon.aps.iva.cx.d dVar4 = aVar.r;
            com.amazon.aps.iva.yb0.j.f(dVar4, "experimentObjectConfig");
            com.amazon.aps.iva.yb0.j.f(dVar2, "billingStatusProvider");
            com.amazon.aps.iva.f40.b bVar = new com.amazon.aps.iva.f40.b(cVar, dVar3, dVar4, dVar2, dVar4, r12);
            Context requireContext = aVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            ((d0) com.ellation.crunchyroll.application.e.a()).i.getClass();
            com.amazon.aps.iva.j20.a aVar2 = new com.amazon.aps.iva.j20.a(requireContext);
            Context requireContext2 = aVar.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
            com.amazon.aps.iva.b30.h hVar = ((d0) com.ellation.crunchyroll.application.e.a()).i.r;
            com.amazon.aps.iva.yb0.j.f(hVar, "subscriptionProductStore");
            com.amazon.aps.iva.s20.h hVar2 = new com.amazon.aps.iva.s20.h(requireContext2, hVar);
            com.amazon.aps.iva.xh.b a2 = a.C0616a.a(((d0) com.ellation.crunchyroll.application.e.a()).i, a.this, null, null, null, null, 30);
            com.amazon.aps.iva.yb0.j.f(a2, "upgradeFlowRouter");
            return new m(aVar, gVar, dVar, bVar, aVar2, hVar2, a2);
        }
    }

    /* compiled from: PremiumMembershipFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.g40.g> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.g40.g invoke(p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            androidx.fragment.app.h requireActivity = a.this.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            com.amazon.aps.iva.f20.e a = e.a.a(requireActivity);
            com.amazon.aps.iva.rs.f c = a.c();
            SubscriptionProcessorService subscriptionProcessorService = com.ellation.crunchyroll.application.e.c().getSubscriptionProcessorService();
            com.amazon.aps.iva.yb0.j.f(subscriptionProcessorService, "subscriptionProcessorService");
            h hVar = new h(subscriptionProcessorService);
            com.amazon.aps.iva.e40.c cVar = new com.amazon.aps.iva.e40.c(a);
            com.amazon.aps.iva.ve.d dVar = ((d0) com.ellation.crunchyroll.application.e.a()).p.c;
            com.amazon.aps.iva.ve.m mVar = ((d0) com.ellation.crunchyroll.application.e.a()).p.d;
            com.amazon.aps.iva.ct.k a2 = com.ellation.crunchyroll.application.f.a(null, 3);
            com.amazon.aps.iva.ts.a aVar = com.amazon.aps.iva.ts.b.e;
            com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
            if (aVar2 != null) {
                Object c2 = aVar2.c().c(s.class, "user_account_migration");
                if (c2 != null) {
                    return new com.amazon.aps.iva.g40.g(c, hVar, mVar, dVar, a2, (s) c2, aVar, cVar);
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.UserAccountMigrationConfigImpl");
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
    }

    public a() {
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.cx.d.class, "billing_notifications");
            if (c2 != null) {
                this.r = (com.amazon.aps.iva.cx.d) c2;
                this.s = com.amazon.aps.iva.kb0.f.b(new c());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.BillingNotificationsConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void F7() {
        View findViewById = requireView().findViewById(R.id.settings_premium_membership_restriction);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireView().findViewBy…m_membership_restriction)");
        findViewById.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void G3() {
        ((View) this.n.getValue(this, u[11])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void Ga(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionPrice");
        ((TextView) this.h.getValue(this, u[5])).setText(str);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void Gh() {
        ((View) this.n.getValue(this, u[11])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void J7(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionRenewalInfo");
        ((TextView) this.g.getValue(this, u[4])).setText(str);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void Lc(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "dateTitle");
        ((TextView) this.i.getValue(this, u[6])).setText(str);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void S3(com.amazon.aps.iva.a30.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "skuInfo");
        View findViewById = requireView().findViewById(R.id.settings_premium_membership_funimation);
        com.amazon.aps.iva.yb0.j.e(findViewById, "funMembershipView");
        findViewById.setVisibility(0);
        ((TextView) requireView().findViewById(R.id.settings_premium_membership_funimation_title)).setText(getString(R.string.settings_premium_membership_title, getString(aVar.getTitleResId())));
        ((ImageView) requireView().findViewById(R.id.settings_premium_membership_funimation_hime)).setImageResource(aVar.getImageResId());
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void T7(int i) {
        ((ImageView) this.d.getValue(this, u[1])).setImageResource(i);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void Xh(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "date");
        ((TextView) this.j.getValue(this, u[7])).setText(str);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void a() {
        ((View) this.c.getValue(this, u[0])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void b() {
        ((View) this.c.getValue(this, u[0])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void db(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionName");
        ((TextView) this.f.getValue(this, u[3])).setText(getString(R.string.settings_premium_membership_manage_title, str));
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void k8(String str, List<String> list) {
        com.amazon.aps.iva.yb0.j.f(str, MediaTrack.ROLE_SUBTITLE);
        com.amazon.aps.iva.yb0.j.f(list, "tierTitles");
        ((TextView) this.m.getValue(this, u[10])).setText(m0.d(str, Typeface.DEFAULT_BOLD, list));
    }

    @Override // com.amazon.aps.iva.e40.n
    public final void o9(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "subscriptionName");
        ((TextView) this.e.getValue(this, u[2])).setText(getString(R.string.settings_premium_membership_title, str));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_premium_membership, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = u;
        ((View) this.k.getValue(this, lVarArr[8])).setOnClickListener(new com.amazon.aps.iva.c8.s(this, 21));
        ((View) this.o.getValue(this, lVarArr[12])).setOnClickListener(new com.amazon.aps.iva.c8.e(this, 20));
        BillingNotificationCard billingNotificationCard = (BillingNotificationCard) this.p.getValue(this, lVarArr[13]);
        b bVar = new b();
        billingNotificationCard.getClass();
        billingNotificationCard.d = bVar;
        com.amazon.aps.iva.me.h h = ((d0) com.ellation.crunchyroll.application.e.a()).p.h();
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        androidx.fragment.app.h requireActivity2 = requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity2, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        h.a(requireActivity, (com.amazon.aps.iva.u70.j) requireActivity2);
        androidx.fragment.app.h requireActivity3 = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity3, "requireActivity()");
        h.c(requireActivity3);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((i) this.s.getValue());
    }

    @Override // com.amazon.aps.iva.e40.n
    public final boolean x9() {
        ConstraintLayout a = ((BillingNotificationCard) this.p.getValue(this, u[13])).c.a();
        com.amazon.aps.iva.yb0.j.e(a, "binding.root");
        if (a.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
