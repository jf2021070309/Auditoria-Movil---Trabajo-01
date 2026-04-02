package com.amazon.aps.iva.c8;

import android.view.View;
import com.amazon.aps.iva.i10.a;
import com.amazon.aps.iva.lv.a;
import com.amazon.aps.iva.ru.b;
import com.amazon.aps.iva.tl.f;
import com.amazon.aps.iva.yu.e;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.crunchyroll.onboarding.OnboardingV2Activity;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
import com.ellation.crunchyroll.cast.overlay.InternalCastOverlayLayout;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.inappupdates.view.InAppUpdatesLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.downgrade.DowngradeSuccessActivity;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
import com.ellation.widgets.searchtoolbar.SearchToolbarLayout;
import com.google.android.material.datepicker.MaterialDatePicker;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                androidx.media3.ui.c.a((androidx.media3.ui.c) obj);
                return;
            case 1:
                DefaultInAppMessageViewWrapper.a((DefaultInAppMessageViewWrapper) obj, view);
                return;
            case 2:
                OnboardingV2Activity onboardingV2Activity = (OnboardingV2Activity) obj;
                int i2 = OnboardingV2Activity.o;
                com.amazon.aps.iva.yb0.j.f(onboardingV2Activity, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "clickedView");
                ((com.amazon.aps.iva.yi.g) onboardingV2Activity.l.getValue()).c4(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 3:
                PlayerControlsLayout.G4((PlayerControlsLayout) obj);
                return;
            case 4:
                com.amazon.aps.iva.tl.f fVar = (com.amazon.aps.iva.tl.f) obj;
                f.a aVar = com.amazon.aps.iva.tl.f.d;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                ((com.amazon.aps.iva.tl.g) fVar.c.getValue()).getView().dismiss();
                return;
            case 5:
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = (UserMigrationWelcomeActivity) obj;
                UserMigrationWelcomeActivity.a aVar2 = UserMigrationWelcomeActivity.n;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                userMigrationWelcomeActivity.pi().q5();
                return;
            case 6:
                WatchScreenSummaryLayout watchScreenSummaryLayout = (WatchScreenSummaryLayout) obj;
                int i3 = WatchScreenSummaryLayout.e;
                com.amazon.aps.iva.yb0.j.f(watchScreenSummaryLayout, "this$0");
                com.amazon.aps.iva.xb0.l<? super View, com.amazon.aps.iva.kb0.q> lVar = watchScreenSummaryLayout.c;
                if (lVar != null) {
                    com.amazon.aps.iva.yb0.j.e(view, "it");
                    lVar.invoke(view);
                    return;
                }
                return;
            case 7:
                InternalCastOverlayLayout.U2((com.amazon.aps.iva.cf.a) obj, view);
                return;
            case 8:
                com.amazon.aps.iva.du.e eVar = (com.amazon.aps.iva.du.e) obj;
                int i4 = com.amazon.aps.iva.du.e.e;
                com.amazon.aps.iva.yb0.j.f(eVar, "this$0");
                com.amazon.aps.iva.du.j jVar = eVar.c;
                EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = jVar.d;
                if (eventDispatcher != null) {
                    eventDispatcher.notify(new com.amazon.aps.iva.du.m(jVar));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("eventDispatcher");
                    throw null;
                }
            case 9:
                com.amazon.aps.iva.ru.b bVar = (com.amazon.aps.iva.ru.b) obj;
                b.a aVar3 = com.amazon.aps.iva.ru.b.m;
                com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
                bVar.gi().getPresenter().O2();
                return;
            case 10:
                com.amazon.aps.iva.yu.e eVar2 = (com.amazon.aps.iva.yu.e) obj;
                e.a aVar4 = com.amazon.aps.iva.yu.e.h;
                com.amazon.aps.iva.yb0.j.f(eVar2, "this$0");
                eVar2.ei().getPresenter().e();
                return;
            case 11:
                com.amazon.aps.iva.lv.a aVar5 = (com.amazon.aps.iva.lv.a) obj;
                a.C0493a c0493a = com.amazon.aps.iva.lv.a.g;
                com.amazon.aps.iva.yb0.j.f(aVar5, "this$0");
                aVar5.ei().getPresenter().n1();
                return;
            case 12:
                com.amazon.aps.iva.fy.a.b1((com.amazon.aps.iva.fy.a) obj);
                return;
            case 13:
                InAppUpdatesLayout inAppUpdatesLayout = (InAppUpdatesLayout) obj;
                int i5 = InAppUpdatesLayout.e;
                com.amazon.aps.iva.yb0.j.f(inAppUpdatesLayout, "this$0");
                inAppUpdatesLayout.c.e6();
                return;
            case 14:
                com.amazon.aps.iva.e00.b.G((com.amazon.aps.iva.e00.b) obj);
                return;
            case 15:
                com.amazon.aps.iva.i10.a aVar6 = (com.amazon.aps.iva.i10.a) obj;
                a.C0349a c0349a = com.amazon.aps.iva.i10.a.x;
                com.amazon.aps.iva.yb0.j.f(aVar6, "this$0");
                aVar6.ei().r4();
                return;
            case 16:
                DowngradeSuccessActivity downgradeSuccessActivity = (DowngradeSuccessActivity) obj;
                int i6 = DowngradeSuccessActivity.n;
                com.amazon.aps.iva.yb0.j.f(downgradeSuccessActivity, "this$0");
                ((com.amazon.aps.iva.i30.e) downgradeSuccessActivity.m.getValue()).c();
                return;
            case 17:
                SignInActivity signInActivity = (SignInActivity) obj;
                SignInActivity.a aVar7 = SignInActivity.O;
                com.amazon.aps.iva.yb0.j.f(signInActivity, "this$0");
                com.amazon.aps.iva.u40.c vi = signInActivity.vi();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                vi.t1(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 18:
                com.amazon.aps.iva.i60.b bVar2 = (com.amazon.aps.iva.i60.b) obj;
                int i7 = com.amazon.aps.iva.i60.b.j;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                bVar2.getOnBackPressedDispatcher().c();
                return;
            case 19:
                SearchToolbarLayout searchToolbarLayout = (SearchToolbarLayout) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = SearchToolbarLayout.e;
                com.amazon.aps.iva.yb0.j.f(searchToolbarLayout, "this$0");
                searchToolbarLayout.d.J0();
                return;
            default:
                MaterialDatePicker.ci((MaterialDatePicker) obj, view);
                return;
        }
    }
}
