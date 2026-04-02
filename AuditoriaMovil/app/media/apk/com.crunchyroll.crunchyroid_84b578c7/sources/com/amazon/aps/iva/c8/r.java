package com.amazon.aps.iva.c8;

import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.gt.c;
import com.amazon.aps.iva.ue.f;
import com.amazon.aps.iva.vt.b;
import com.amazon.aps.iva.z00.b;
import com.amazon.aps.iva.zz.a;
import com.crunchyroll.billingnotifications.ingrace.InGraceNotificationActivity;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
import com.crunchyroll.sortandfilters.screen.SortAndFilterActivity;
import com.crunchyroll.usermigration.terms.AcceptTermsAndPrivacyPolicyActivity;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.commenting.comments.pendingstate.banner.PendingStateBannerLayout;
import com.ellation.crunchyroll.commenting.entrypoint.CommentsEntryPoint;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
import com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog;
import com.ellation.widgets.switcher.SwitcherLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(Object obj, int i) {
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
                InGraceNotificationActivity inGraceNotificationActivity = (InGraceNotificationActivity) obj;
                int i2 = InGraceNotificationActivity.o;
                com.amazon.aps.iva.yb0.j.f(inGraceNotificationActivity, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.qe.e) inGraceNotificationActivity.n.getValue()).l1(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 2:
                com.amazon.aps.iva.ue.f fVar = (com.amazon.aps.iva.ue.f) obj;
                f.a aVar = com.amazon.aps.iva.ue.f.h;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.ue.h) fVar.g.getValue()).d(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 3:
                PlayerToolbar playerToolbar = (PlayerToolbar) obj;
                int i3 = PlayerToolbar.d;
                com.amazon.aps.iva.yb0.j.f(playerToolbar, "this$0");
                com.amazon.aps.iva.cl.c cVar = playerToolbar.b;
                if (cVar != null) {
                    com.amazon.aps.iva.cl.b bVar = cVar.e;
                    if (bVar != null) {
                        bVar.E0();
                        return;
                    }
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            case 4:
                SortAndFilterActivity sortAndFilterActivity = (SortAndFilterActivity) obj;
                int i4 = SortAndFilterActivity.n;
                com.amazon.aps.iva.yb0.j.f(sortAndFilterActivity, "this$0");
                ((com.amazon.aps.iva.sn.c) sortAndFilterActivity.l.getValue()).c();
                return;
            case 5:
                AcceptTermsAndPrivacyPolicyActivity acceptTermsAndPrivacyPolicyActivity = (AcceptTermsAndPrivacyPolicyActivity) obj;
                int i5 = AcceptTermsAndPrivacyPolicyActivity.n;
                com.amazon.aps.iva.yb0.j.f(acceptTermsAndPrivacyPolicyActivity, "this$0");
                com.amazon.aps.iva.io.g presenter = acceptTermsAndPrivacyPolicyActivity.mi().getPresenter();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                presenter.h4(com.amazon.aps.iva.ab.r.p(view, null));
                acceptTermsAndPrivacyPolicyActivity.mi().getPresenter().m();
                return;
            case 6:
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = (UserMigrationWelcomeActivity) obj;
                UserMigrationWelcomeActivity.a aVar2 = UserMigrationWelcomeActivity.n;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                com.amazon.aps.iva.ko.k pi = userMigrationWelcomeActivity.pi();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                pi.C2(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 7:
                com.amazon.aps.iva.gt.c cVar2 = (com.amazon.aps.iva.gt.c) obj;
                c.a aVar3 = com.amazon.aps.iva.gt.c.k;
                com.amazon.aps.iva.yb0.j.f(cVar2, "this$0");
                com.amazon.aps.iva.gt.e ci = cVar2.ci();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ci.o4(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 8:
                com.amazon.aps.iva.vt.b bVar2 = (com.amazon.aps.iva.vt.b) obj;
                b.a aVar4 = com.amazon.aps.iva.vt.b.m;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                bVar2.hi().getPresenter().p4();
                return;
            case 9:
                com.amazon.aps.iva.ju.a aVar5 = (com.amazon.aps.iva.ju.a) obj;
                int i6 = PendingStateBannerLayout.c;
                com.amazon.aps.iva.yb0.j.f(aVar5, "$presenter");
                aVar5.M5();
                return;
            case 10:
                CommentsEntryPoint.U2((CommentsEntryPoint) obj);
                return;
            case 11:
                CrunchylistActivity crunchylistActivity = (CrunchylistActivity) obj;
                int i7 = CrunchylistActivity.m;
                com.amazon.aps.iva.yb0.j.f(crunchylistActivity, "this$0");
                crunchylistActivity.k.b().j3();
                return;
            case 12:
                com.amazon.aps.iva.zz.a aVar6 = (com.amazon.aps.iva.zz.a) obj;
                a.C0931a c0931a = com.amazon.aps.iva.zz.a.C;
                com.amazon.aps.iva.yb0.j.f(aVar6, "this$0");
                aVar6.requireActivity().getOnBackPressedDispatcher().c();
                return;
            case 13:
                com.amazon.aps.iva.z00.b bVar3 = (com.amazon.aps.iva.z00.b) obj;
                b.a aVar7 = com.amazon.aps.iva.z00.b.k;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                bVar3.dismiss();
                return;
            case 14:
                com.amazon.aps.iva.e20.b bVar4 = (com.amazon.aps.iva.e20.b) obj;
                b.a aVar8 = com.amazon.aps.iva.e20.b.e;
                com.amazon.aps.iva.yb0.j.f(bVar4, "this$0");
                bVar4.di().Q();
                return;
            case 15:
                CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = CancellationRescueActivity.s;
                com.amazon.aps.iva.yb0.j.f(cancellationRescueActivity, "this$0");
                com.amazon.aps.iva.k20.l ni = cancellationRescueActivity.ni();
                TextView textView = cancellationRescueActivity.mi().c.c;
                com.amazon.aps.iva.yb0.j.e(textView, "binding.cancellationResc…ionRescueDowngradeCtaText");
                ni.C0(com.amazon.aps.iva.ab.r.p(textView, null));
                return;
            case 16:
                UpsellV2Activity upsellV2Activity = (UpsellV2Activity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = UpsellV2Activity.s;
                com.amazon.aps.iva.yb0.j.f(upsellV2Activity, "this$0");
                upsellV2Activity.oi().c();
                return;
            case 17:
                SearchResultDetailActivity searchResultDetailActivity = (SearchResultDetailActivity) obj;
                SearchResultDetailActivity.a aVar9 = SearchResultDetailActivity.D;
                com.amazon.aps.iva.yb0.j.f(searchResultDetailActivity, "this$0");
                searchResultDetailActivity.ni().b();
                return;
            case 18:
                StartupActivity startupActivity = (StartupActivity) obj;
                int i8 = StartupActivity.r;
                com.amazon.aps.iva.yb0.j.f(startupActivity, "this$0");
                startupActivity.mi().A();
                return;
            case 19:
                ToolbarMenuDialog.onViewCreated$lambda$3((ToolbarMenuDialog) obj, view);
                return;
            default:
                SwitcherLayout switcherLayout = (SwitcherLayout) obj;
                int i9 = SwitcherLayout.i;
                com.amazon.aps.iva.yb0.j.f(switcherLayout, "this$0");
                if (!switcherLayout.f) {
                    com.amazon.aps.iva.v70.a aVar10 = switcherLayout.d;
                    if (aVar10 != null) {
                        com.amazon.aps.iva.v70.d dVar = switcherLayout.e;
                        if (dVar != null) {
                            aVar10.h5(dVar.a);
                            com.amazon.aps.iva.v70.c cVar3 = switcherLayout.c;
                            cVar3.getView().Yb();
                            cVar3.getView().De();
                            cVar3.getView().pc();
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
