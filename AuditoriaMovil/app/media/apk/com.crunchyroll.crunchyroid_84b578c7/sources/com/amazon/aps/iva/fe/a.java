package com.amazon.aps.iva.fe;

import android.view.View;
import com.amazon.aps.iva.cp.a;
import com.amazon.aps.iva.l20.a;
import com.amazon.aps.iva.qv.c;
import com.amazon.aps.iva.yu.e;
import com.amazon.aps.iva.z00.a;
import com.amazon.aps.iva.z20.d;
import com.crunchyroll.auth.otpview.a;
import com.crunchyroll.auth.screen.OtpActivity;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.crunchyroll.restrictedstate.UserRestrictedStateActivity;
import com.crunchyroll.sortandfilters.currentfilters.CurrentFiltersLayout;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.ellation.crunchyroll.presentation.forgotpassword.ForgotPasswordActivity;
import com.ellation.crunchyroll.presentation.legalinfo.AppLegalInfoLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.alreadypremium.SubscriptionAlreadyPremiumLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade.UpgradeActivity;
import com.ellation.crunchyroll.presentation.search.result.summary.c;
import com.ellation.crunchyroll.presentation.settings.donotsell.SettingsDoNotSellActivity;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
import com.ellation.widgets.overflow.OverflowButton;
import java.util.ArrayList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.wy.h c;

    public /* synthetic */ a(com.amazon.aps.iva.wy.h hVar, int i) {
        this.b = i;
        this.c = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        com.amazon.aps.iva.wy.h hVar = this.c;
        switch (i) {
            case 0:
                OtpActivity otpActivity = (OtpActivity) hVar;
                int i2 = OtpActivity.n;
                com.amazon.aps.iva.yb0.j.f(otpActivity, "this$0");
                com.crunchyroll.auth.otpview.a otpTextState = otpActivity.mi().h.getOtpTextState();
                com.amazon.aps.iva.yb0.j.d(otpTextState, "null cannot be cast to non-null type com.crunchyroll.auth.otpview.OtpTextLayoutState.Filled");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((i) otpActivity.k.e.getValue()).I0(((a.C0951a) otpTextState).a, com.amazon.aps.iva.ab.r.p(view, otpActivity.mi().b.getText()));
                return;
            case 1:
                ProfileActivationActivityLegacy profileActivationActivityLegacy = (ProfileActivationActivityLegacy) hVar;
                int i3 = ProfileActivationActivityLegacy.m;
                com.amazon.aps.iva.yb0.j.f(profileActivationActivityLegacy, "this$0");
                com.amazon.aps.iva.qm.o presenter = profileActivationActivityLegacy.mi().getPresenter();
                com.amazon.aps.iva.cm.b bVar = profileActivationActivityLegacy.l;
                if (bVar != null) {
                    presenter.J4(bVar.g.getText());
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("binding");
                    throw null;
                }
            case 2:
                UserRestrictedStateActivity userRestrictedStateActivity = (UserRestrictedStateActivity) hVar;
                int i4 = UserRestrictedStateActivity.m;
                com.amazon.aps.iva.yb0.j.f(userRestrictedStateActivity, "this$0");
                com.amazon.aps.iva.en.d dVar = (com.amazon.aps.iva.en.d) userRestrictedStateActivity.l.getValue();
                Object[] objArr = new Object[1];
                String str = userRestrictedStateActivity.mi().c;
                if (!com.amazon.aps.iva.oe0.q.i0(str, "@", false)) {
                    str = "";
                }
                objArr[0] = str;
                String string = userRestrictedStateActivity.getString(R.string.customer_support_url, objArr);
                com.amazon.aps.iva.yb0.j.e(string, "getString(\n             …email()\n                )");
                String string2 = userRestrictedStateActivity.getString(R.string.help_page_open_fallback_dialog_message);
                com.amazon.aps.iva.yb0.j.e(string2, "getString(\n             …message\n                )");
                String string3 = userRestrictedStateActivity.getString(R.string.need_help);
                com.amazon.aps.iva.yb0.j.e(string3, "getString(FeatureResources.string.need_help)");
                dVar.t5(string, string2, string3);
                return;
            case 3:
                CurrentFiltersLayout currentFiltersLayout = (CurrentFiltersLayout) hVar;
                int i5 = CurrentFiltersLayout.d;
                com.amazon.aps.iva.yb0.j.f(currentFiltersLayout, "this$0");
                com.amazon.aps.iva.nn.b bVar2 = currentFiltersLayout.b;
                if (bVar2 != null) {
                    com.amazon.aps.iva.yb0.j.e(view, "it");
                    bVar2.b.w0(new com.amazon.aps.iva.nn.a(bVar2, com.amazon.aps.iva.ab.r.p(view, null)));
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            case 4:
                CrOwnershipVerificationActivity crOwnershipVerificationActivity = (CrOwnershipVerificationActivity) hVar;
                CrOwnershipVerificationActivity.a aVar = CrOwnershipVerificationActivity.o;
                com.amazon.aps.iva.yb0.j.f(crOwnershipVerificationActivity, "this$0");
                crOwnershipVerificationActivity.getOnBackPressedDispatcher().c();
                return;
            case 5:
                com.amazon.aps.iva.cp.a aVar2 = (com.amazon.aps.iva.cp.a) hVar;
                a.C0183a c0183a = com.amazon.aps.iva.cp.a.m;
                com.amazon.aps.iva.yb0.j.f(aVar2, "this$0");
                ((com.amazon.aps.iva.cp.e) aVar2.l.getValue()).P2();
                return;
            case 6:
                com.amazon.aps.iva.dt.h hVar2 = (com.amazon.aps.iva.dt.h) hVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.dt.h.g;
                com.amazon.aps.iva.yb0.j.f(hVar2, "this$0");
                com.amazon.aps.iva.dt.i presenter2 = hVar2.getPresenter();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                presenter2.F3(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 7:
                com.amazon.aps.iva.yu.e eVar = (com.amazon.aps.iva.yu.e) hVar;
                e.a aVar3 = com.amazon.aps.iva.yu.e.h;
                com.amazon.aps.iva.yb0.j.f(eVar, "this$0");
                eVar.ei().getPresenter().g6();
                return;
            case 8:
                com.amazon.aps.iva.qv.c cVar = (com.amazon.aps.iva.qv.c) hVar;
                c.a aVar4 = com.amazon.aps.iva.qv.c.f;
                com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
                cVar.ei().getPresenter().g0(cVar.di().d.getText().toString());
                return;
            case 9:
                com.amazon.aps.iva.z00.a aVar5 = (com.amazon.aps.iva.z00.a) hVar;
                a.C0907a c0907a = com.amazon.aps.iva.z00.a.i;
                com.amazon.aps.iva.yb0.j.f(aVar5, "this$0");
                aVar5.dismiss();
                return;
            case 10:
                ForgotPasswordActivity forgotPasswordActivity = (ForgotPasswordActivity) hVar;
                ForgotPasswordActivity.a aVar6 = ForgotPasswordActivity.t;
                com.amazon.aps.iva.yb0.j.f(forgotPasswordActivity, "this$0");
                com.amazon.aps.iva.k10.c ni = forgotPasswordActivity.ni();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ni.c1(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 11:
                com.amazon.aps.iva.p10.b bVar3 = (com.amazon.aps.iva.p10.b) hVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = com.amazon.aps.iva.p10.b.g;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                com.amazon.aps.iva.p10.d dVar2 = bVar3.f;
                com.amazon.aps.iva.p10.a aVar7 = dVar2.d;
                if (aVar7 != null) {
                    dVar2.b.invoke(aVar7);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("subgenreCarouselDataModel");
                    throw null;
                }
            case 12:
                AppLegalInfoLayout appLegalInfoLayout = (AppLegalInfoLayout) hVar;
                int i6 = AppLegalInfoLayout.c;
                com.amazon.aps.iva.yb0.j.f(appLegalInfoLayout, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "view");
                appLegalInfoLayout.b.w5(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 13:
                SubscriptionAlreadyPremiumLayout.b1((SubscriptionAlreadyPremiumLayout) hVar);
                return;
            case 14:
                com.amazon.aps.iva.l20.a aVar8 = (com.amazon.aps.iva.l20.a) hVar;
                a.C0462a c0462a = com.amazon.aps.iva.l20.a.d;
                com.amazon.aps.iva.yb0.j.f(aVar8, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.l20.c) aVar8.c.getValue()).N4(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 15:
                UpgradeActivity upgradeActivity = (UpgradeActivity) hVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr3 = UpgradeActivity.r;
                com.amazon.aps.iva.yb0.j.f(upgradeActivity, "this$0");
                upgradeActivity.oi().c();
                return;
            case 16:
                com.amazon.aps.iva.z20.d dVar3 = (com.amazon.aps.iva.z20.d) hVar;
                d.a aVar9 = com.amazon.aps.iva.z20.d.k;
                com.amazon.aps.iva.yb0.j.f(dVar3, "this$0");
                ((com.amazon.aps.iva.z20.e) dVar3.i.getValue()).e();
                return;
            case 17:
                com.amazon.aps.iva.n30.a aVar10 = (com.amazon.aps.iva.n30.a) hVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr4 = com.amazon.aps.iva.n30.a.i;
                com.amazon.aps.iva.yb0.j.f(aVar10, "this$0");
                ((com.amazon.aps.iva.n30.b) aVar10.h.getValue()).L();
                return;
            case 18:
                com.ellation.crunchyroll.presentation.search.result.summary.c cVar2 = (com.ellation.crunchyroll.presentation.search.result.summary.c) hVar;
                c.a aVar11 = com.ellation.crunchyroll.presentation.search.result.summary.c.u;
                com.amazon.aps.iva.yb0.j.f(cVar2, "this$0");
                cVar2.di().b();
                return;
            case 19:
                SettingsDoNotSellActivity settingsDoNotSellActivity = (SettingsDoNotSellActivity) hVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr5 = SettingsDoNotSellActivity.p;
                com.amazon.aps.iva.yb0.j.f(settingsDoNotSellActivity, "this$0");
                settingsDoNotSellActivity.onBackPressed();
                return;
            case 20:
                SignUpFlowActivity signUpFlowActivity = (SignUpFlowActivity) hVar;
                SignUpFlowActivity.a aVar12 = SignUpFlowActivity.I;
                com.amazon.aps.iva.yb0.j.f(signUpFlowActivity, "this$0");
                ((com.amazon.aps.iva.v40.c) signUpFlowActivity.F.getValue()).G3(signUpFlowActivity.vi().isChecked(), new com.amazon.aps.iva.fs.b(com.amazon.aps.iva.js.b0.CENTER, signUpFlowActivity.wi().getText()));
                return;
            default:
                OverflowButton overflowButton = (OverflowButton) hVar;
                int i7 = OverflowButton.h;
                com.amazon.aps.iva.yb0.j.f(overflowButton, "this$0");
                com.amazon.aps.iva.n70.e eVar2 = overflowButton.b;
                com.amazon.aps.iva.n70.f view2 = eVar2.getView();
                List<com.amazon.aps.iva.n70.b> list = eVar2.b;
                if (list != null) {
                    List<com.amazon.aps.iva.n70.b> list2 = list;
                    ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
                    for (com.amazon.aps.iva.n70.b bVar4 : list2) {
                        arrayList.add(bVar4.a);
                    }
                    view2.Sd(arrayList);
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("menu");
                throw null;
        }
    }
}
