package com.amazon.aps.iva.c8;

import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.a40.a;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.e40.a;
import com.amazon.aps.iva.ue.f;
import com.amazon.aps.iva.vt.b;
import com.amazon.aps.iva.x30.a0;
import com.amazon.aps.iva.z00.b;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
import com.crunchyroll.billingnotifications.ingrace.InGraceNotificationActivity;
import com.crunchyroll.emailverification.banner.EmailVerificationBannerLayout;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.commenting.comments.pendingstate.banner.PendingStateBannerLayout;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
import com.ellation.crunchyroll.presentation.downloads.empty.DownloadsEmptyLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
import com.ellation.widgets.switcher.SwitcherLayout;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                t.a((t) obj, view);
                return;
            case 1:
                ((com.amazon.aps.iva.e8.c) obj).lambda$onCreate$0(view);
                return;
            case 2:
                EmailMandatoryActivity emailMandatoryActivity = (EmailMandatoryActivity) obj;
                int i2 = EmailMandatoryActivity.o;
                com.amazon.aps.iva.yb0.j.f(emailMandatoryActivity, "this$0");
                com.amazon.aps.iva.yd.l a = emailMandatoryActivity.k.a();
                String email = emailMandatoryActivity.mi().c.getEmail();
                boolean isChecked = emailMandatoryActivity.mi().d.isChecked();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                a.i2(email, isChecked, com.amazon.aps.iva.ab.r.p(view, emailMandatoryActivity.mi().b.getText()));
                return;
            case 3:
                InGraceNotificationActivity inGraceNotificationActivity = (InGraceNotificationActivity) obj;
                int i3 = InGraceNotificationActivity.o;
                com.amazon.aps.iva.yb0.j.f(inGraceNotificationActivity, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.qe.e) inGraceNotificationActivity.n.getValue()).d2(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 4:
                com.amazon.aps.iva.ue.f fVar = (com.amazon.aps.iva.ue.f) obj;
                f.a aVar = com.amazon.aps.iva.ue.f.h;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.ue.h) fVar.g.getValue()).P(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 5:
                EmailVerificationBannerLayout.G((EmailVerificationBannerLayout) obj, view);
                return;
            case 6:
                PlayerToolbar playerToolbar = (PlayerToolbar) obj;
                int i4 = PlayerToolbar.d;
                com.amazon.aps.iva.yb0.j.f(playerToolbar, "this$0");
                com.amazon.aps.iva.cl.c cVar = playerToolbar.b;
                if (cVar != null) {
                    com.amazon.aps.iva.cl.b bVar = cVar.e;
                    if (bVar != null) {
                        bVar.f1();
                        return;
                    }
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            case 7:
                AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = (AcceptTermsAndPrivacyPolicyActivity) obj;
                int i5 = AcceptTermsAndPrivacyPolicyActivity.n;
                com.amazon.aps.iva.yb0.j.f(acceptTermsAndPrivacyPolicyActivity, "this$0");
                acceptTermsAndPrivacyPolicyActivity.mi().getPresenter().a();
                return;
            case 8:
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = (UserMigrationWelcomeActivity) obj;
                UserMigrationWelcomeActivity.a aVar2 = UserMigrationWelcomeActivity.n;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                com.amazon.aps.iva.ko.k pi = userMigrationWelcomeActivity.pi();
                TextView textView = ((com.amazon.aps.iva.p000do.e) userMigrationWelcomeActivity.oi().b.f).b;
                com.amazon.aps.iva.yb0.j.e(textView, "binding.layoutFnFreeNoCr…ubscriptionButtonTextView");
                pi.j(com.amazon.aps.iva.ab.r.p(textView, null));
                return;
            case 9:
                com.amazon.aps.iva.vt.b bVar2 = (com.amazon.aps.iva.vt.b) obj;
                b.a aVar3 = com.amazon.aps.iva.vt.b.m;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                bVar2.hi().getPresenter().p4();
                return;
            case 10:
                com.amazon.aps.iva.du.e eVar = (com.amazon.aps.iva.du.e) obj;
                int i6 = com.amazon.aps.iva.du.e.e;
                com.amazon.aps.iva.yb0.j.f(eVar, "this$0");
                boolean z = eVar.d.l.k;
                com.amazon.aps.iva.du.j jVar = eVar.c;
                EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = jVar.d;
                if (eventDispatcher != null) {
                    eventDispatcher.notify(new com.amazon.aps.iva.du.k(jVar, z));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("eventDispatcher");
                    throw null;
                }
            case 11:
                com.amazon.aps.iva.ju.a aVar4 = (com.amazon.aps.iva.ju.a) obj;
                int i7 = PendingStateBannerLayout.c;
                com.amazon.aps.iva.yb0.j.f(aVar4, "$presenter");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                aVar4.D0(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 12:
                HomeFeedScreenView.X7((HomeFeedScreenView) obj);
                return;
            case 13:
                com.amazon.aps.iva.ey.a.b1((com.amazon.aps.iva.ey.a) obj);
                return;
            case 14:
                com.amazon.aps.iva.z00.b bVar3 = (com.amazon.aps.iva.z00.b) obj;
                b.a aVar5 = com.amazon.aps.iva.z00.b.k;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                bVar3.dismiss();
                return;
            case 15:
                DownloadsEmptyLayout.b1((DownloadsEmptyLayout) obj);
                return;
            case 16:
                com.amazon.aps.iva.e20.b bVar4 = (com.amazon.aps.iva.e20.b) obj;
                b.a aVar6 = com.amazon.aps.iva.e20.b.e;
                com.amazon.aps.iva.yb0.j.f(bVar4, "this$0");
                bVar4.di().Q();
                return;
            case 17:
                CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = CancellationRescueActivity.s;
                com.amazon.aps.iva.yb0.j.f(cancellationRescueActivity, "this$0");
                com.amazon.aps.iva.k20.l ni = cancellationRescueActivity.ni();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ni.l0(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 18:
                UpsellV2Activity upsellV2Activity = (UpsellV2Activity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = UpsellV2Activity.s;
                com.amazon.aps.iva.yb0.j.f(upsellV2Activity, "this$0");
                com.amazon.aps.iva.j30.n oi = upsellV2Activity.oi();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                oi.B1(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 19:
                com.amazon.aps.iva.w30.a aVar7 = (com.amazon.aps.iva.w30.a) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr3 = com.amazon.aps.iva.w30.a.e;
                com.amazon.aps.iva.yb0.j.f(aVar7, "this$0");
                com.amazon.aps.iva.w30.b bVar5 = aVar7.d;
                a0 a0Var = bVar5.b;
                if (a0Var != null) {
                    com.amazon.aps.iva.s30.d dVar = bVar5.c;
                    if (dVar != null) {
                        a0Var.W5(dVar.b);
                        return;
                    } else {
                        com.amazon.aps.iva.yb0.j.m("item");
                        throw null;
                    }
                }
                return;
            case 20:
                com.amazon.aps.iva.a40.a aVar8 = (com.amazon.aps.iva.a40.a) obj;
                a.C0101a c0101a = com.amazon.aps.iva.a40.a.j;
                com.amazon.aps.iva.yb0.j.f(aVar8, "this$0");
                ((com.amazon.aps.iva.a40.f) aVar8.h.getValue()).U3(aVar8.di().getPassword(), aVar8.fi().getPassword());
                return;
            case 21:
                com.amazon.aps.iva.e40.a aVar9 = (com.amazon.aps.iva.e40.a) obj;
                a.C0215a c0215a = com.amazon.aps.iva.e40.a.t;
                com.amazon.aps.iva.yb0.j.f(aVar9, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.e40.i) aVar9.s.getValue()).k4(com.amazon.aps.iva.ab.r.p(view, ((TextView) aVar9.l.getValue(aVar9, com.amazon.aps.iva.e40.a.u[9])).getText().toString()));
                return;
            case 22:
                com.amazon.aps.iva.t40.c cVar2 = (com.amazon.aps.iva.t40.c) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr4 = com.amazon.aps.iva.t40.c.w;
                com.amazon.aps.iva.yb0.j.f(cVar2, "this$0");
                cVar2.onBackPressed();
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                StartupActivity startupActivity = (StartupActivity) obj;
                int i8 = StartupActivity.r;
                com.amazon.aps.iva.yb0.j.f(startupActivity, "this$0");
                startupActivity.mi().A();
                return;
            case 24:
                com.amazon.aps.iva.p50.c cVar3 = (com.amazon.aps.iva.p50.c) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr5 = com.amazon.aps.iva.p50.c.e;
                com.amazon.aps.iva.yb0.j.f(cVar3, "this$0");
                ((com.amazon.aps.iva.p50.h) cVar3.c.getValue()).e();
                return;
            default:
                SwitcherLayout switcherLayout = (SwitcherLayout) obj;
                int i9 = SwitcherLayout.i;
                com.amazon.aps.iva.yb0.j.f(switcherLayout, "this$0");
                if (switcherLayout.f) {
                    com.amazon.aps.iva.v70.a aVar10 = switcherLayout.d;
                    if (aVar10 != null) {
                        com.amazon.aps.iva.v70.d dVar2 = switcherLayout.e;
                        if (dVar2 != null) {
                            aVar10.h5(dVar2.b);
                            com.amazon.aps.iva.v70.c cVar4 = switcherLayout.c;
                            cVar4.getView().K6();
                            cVar4.getView().C3();
                            cVar4.getView().Ub();
                            return;
                        }
                        com.amazon.aps.iva.yb0.j.m("switcherUiModel");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("onSwitcherItemChangedListener");
                    throw null;
                }
                return;
        }
    }
}
