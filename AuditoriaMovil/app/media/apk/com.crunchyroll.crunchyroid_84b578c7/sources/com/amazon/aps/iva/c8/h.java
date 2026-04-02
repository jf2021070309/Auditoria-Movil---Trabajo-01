package com.amazon.aps.iva.c8;

import android.view.View;
import com.amazon.aps.iva.el.b0;
import com.amazon.aps.iva.h50.g;
import com.amazon.aps.iva.i10.a;
import com.amazon.aps.iva.ll.c;
import com.amazon.aps.iva.n10.j;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.ru.b;
import com.amazon.aps.iva.se.d;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x20.a;
import com.amazon.aps.iva.yu.e;
import com.amazon.aps.iva.z00.a;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.crunchyroll.restrictedstate.UserRestrictedStateActivity;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarLayout;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.presentation.legalinfo.AppLegalInfoLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.SubscriptionSuccessActivity;
import com.ellation.crunchyroll.presentation.showpage.similar.SimilarShowsLayout;
import com.ellation.crunchyroll.presentation.signing.signup.SignUpFlowActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                androidx.media3.ui.c cVar = androidx.media3.ui.c.this;
                l0 l0Var = cVar.C0;
                if (l0Var != null && l0Var.V(29)) {
                    u0 i2 = cVar.C0.i();
                    l0 l0Var2 = cVar.C0;
                    int i3 = g0.a;
                    l0Var2.D(i2.a().d(1).o(1, false).b());
                    cVar.g.b[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
                    cVar.l.dismiss();
                    return;
                }
                return;
            case 1:
                DefaultInAppMessageViewWrapper.b((DefaultInAppMessageViewWrapper) obj, view);
                return;
            case 2:
                CancellationCompleteActivity cancellationCompleteActivity = (CancellationCompleteActivity) obj;
                int i4 = CancellationCompleteActivity.n;
                com.amazon.aps.iva.yb0.j.f(cancellationCompleteActivity, "this$0");
                ((com.amazon.aps.iva.ne.f) cancellationCompleteActivity.l.getValue()).m();
                return;
            case 3:
                com.amazon.aps.iva.se.d dVar = (com.amazon.aps.iva.se.d) obj;
                d.a aVar = com.amazon.aps.iva.se.d.g;
                com.amazon.aps.iva.yb0.j.f(dVar, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.se.e) dVar.f.getValue()).P(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 4:
                com.amazon.aps.iva.qi.c.b1((com.amazon.aps.iva.qi.c) obj);
                return;
            case 5:
                InternalPlayerViewLayout internalPlayerViewLayout = (InternalPlayerViewLayout) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = InternalPlayerViewLayout.P;
                com.amazon.aps.iva.yb0.j.f(internalPlayerViewLayout, "this$0");
                b0 b0Var = internalPlayerViewLayout.D;
                if (b0Var != null) {
                    b0Var.G4();
                    return;
                }
                return;
            case 6:
                com.amazon.aps.iva.ll.c cVar2 = (com.amazon.aps.iva.ll.c) obj;
                c.a aVar2 = com.amazon.aps.iva.ll.c.q;
                com.amazon.aps.iva.yb0.j.f(cVar2, "this$0");
                cVar2.hi().a();
                return;
            case 7:
                ProfileActivationActivityLegacy profileActivationActivityLegacy = (ProfileActivationActivityLegacy) obj;
                int i5 = ProfileActivationActivityLegacy.m;
                com.amazon.aps.iva.yb0.j.f(profileActivationActivityLegacy, "this$0");
                profileActivationActivityLegacy.mi().getPresenter().L();
                return;
            case 8:
                UserRestrictedStateActivity userRestrictedStateActivity = (UserRestrictedStateActivity) obj;
                int i6 = UserRestrictedStateActivity.m;
                com.amazon.aps.iva.yb0.j.f(userRestrictedStateActivity, "this$0");
                ((com.amazon.aps.iva.en.d) userRestrictedStateActivity.l.getValue()).e();
                return;
            case 9:
                CrOwnershipVerificationActivity crOwnershipVerificationActivity = (CrOwnershipVerificationActivity) obj;
                CrOwnershipVerificationActivity.a aVar3 = CrOwnershipVerificationActivity.o;
                com.amazon.aps.iva.yb0.j.f(crOwnershipVerificationActivity, "this$0");
                ((com.amazon.aps.iva.jo.e) crOwnershipVerificationActivity.n.getValue()).E2(crOwnershipVerificationActivity.mi().b.getEmail());
                return;
            case 10:
                CastOverlayToolbarLayout.b1((CastOverlayToolbarLayout) obj, view);
                return;
            case 11:
                com.amazon.aps.iva.du.e eVar = (com.amazon.aps.iva.du.e) obj;
                int i7 = com.amazon.aps.iva.du.e.e;
                com.amazon.aps.iva.yb0.j.f(eVar, "this$0");
                com.amazon.aps.iva.du.j jVar = eVar.c;
                EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = jVar.d;
                if (eventDispatcher != null) {
                    eventDispatcher.notify(new com.amazon.aps.iva.du.n(jVar));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("eventDispatcher");
                    throw null;
                }
            case 12:
                com.amazon.aps.iva.ru.b bVar = (com.amazon.aps.iva.ru.b) obj;
                b.a aVar4 = com.amazon.aps.iva.ru.b.m;
                com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
                bVar.gi().getPresenter().v2();
                return;
            case 13:
                com.amazon.aps.iva.yu.e eVar2 = (com.amazon.aps.iva.yu.e) obj;
                e.a aVar5 = com.amazon.aps.iva.yu.e.h;
                com.amazon.aps.iva.yb0.j.f(eVar2, "this$0");
                eVar2.ei().getPresenter().U();
                return;
            case 14:
                com.amazon.aps.iva.z00.a aVar6 = (com.amazon.aps.iva.z00.a) obj;
                a.C0907a c0907a = com.amazon.aps.iva.z00.a.i;
                com.amazon.aps.iva.yb0.j.f(aVar6, "this$0");
                aVar6.setFragmentResult("ON_ENABLE_MATURE_CONTENT_CLICKED", (PlayableAsset) aVar6.h.getValue(aVar6, com.amazon.aps.iva.z00.a.j[4]));
                aVar6.dismiss();
                return;
            case 15:
                com.amazon.aps.iva.i10.a aVar7 = (com.amazon.aps.iva.i10.a) obj;
                a.C0349a c0349a = com.amazon.aps.iva.i10.a.x;
                com.amazon.aps.iva.yb0.j.f(aVar7, "this$0");
                aVar7.ei().y2();
                return;
            case 16:
                com.amazon.aps.iva.n10.j jVar2 = (com.amazon.aps.iva.n10.j) obj;
                j.a aVar8 = com.amazon.aps.iva.n10.j.q;
                com.amazon.aps.iva.yb0.j.f(jVar2, "this$0");
                jVar2.requireActivity().getOnBackPressedDispatcher().c();
                return;
            case 17:
                AppLegalInfoLayout appLegalInfoLayout = (AppLegalInfoLayout) obj;
                int i8 = AppLegalInfoLayout.c;
                com.amazon.aps.iva.yb0.j.f(appLegalInfoLayout, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "view");
                appLegalInfoLayout.b.C1(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 18:
                com.amazon.aps.iva.x20.a aVar9 = (com.amazon.aps.iva.x20.a) obj;
                a.C0837a c0837a = com.amazon.aps.iva.x20.a.e;
                com.amazon.aps.iva.yb0.j.f(aVar9, "this$0");
                ((com.amazon.aps.iva.x20.b) aVar9.d.getValue()).j(com.amazon.aps.iva.ab.r.p(((com.amazon.aps.iva.v60.f) aVar9.c.getValue(aVar9, com.amazon.aps.iva.x20.a.f[0])).b.getButtonTextView(), null));
                return;
            case 19:
                SubscriptionSuccessActivity subscriptionSuccessActivity = (SubscriptionSuccessActivity) obj;
                SubscriptionSuccessActivity.a aVar10 = SubscriptionSuccessActivity.n;
                com.amazon.aps.iva.yb0.j.f(subscriptionSuccessActivity, "this$0");
                subscriptionSuccessActivity.finish();
                return;
            case 20:
                SimilarShowsLayout.G((SimilarShowsLayout) obj);
                return;
            case 21:
                SignUpFlowActivity signUpFlowActivity = (SignUpFlowActivity) obj;
                SignUpFlowActivity.a aVar11 = SignUpFlowActivity.I;
                com.amazon.aps.iva.yb0.j.f(signUpFlowActivity, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.v40.c) signUpFlowActivity.F.getValue()).l6(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 22:
                com.amazon.aps.iva.h50.g gVar = (com.amazon.aps.iva.h50.g) obj;
                g.a aVar12 = com.amazon.aps.iva.h50.g.i;
                com.amazon.aps.iva.yb0.j.f(gVar, "this$0");
                ((com.amazon.aps.iva.h50.h) gVar.h.getValue()).S4(new com.amazon.aps.iva.fs.b(com.amazon.aps.iva.js.b0.BOTTOM, gVar.di().getContentDescription().toString()));
                return;
            default:
                com.amazon.aps.iva.xb0.a aVar13 = (com.amazon.aps.iva.xb0.a) obj;
                int i9 = com.amazon.aps.iva.m70.c.d;
                com.amazon.aps.iva.yb0.j.f(aVar13, "$onRetry");
                aVar13.invoke();
                return;
        }
    }
}
