package com.amazon.aps.iva.c8;

import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.e40.a;
import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.oy.a;
import com.amazon.aps.iva.t00.b;
import com.crunchyroll.auth.emailmandatory.EmailMandatoryActivity;
import com.crunchyroll.emailverification.banner.EmailVerificationBannerLayout;
import com.crunchyroll.onboarding.OnboardingV2Activity;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.ellation.crunchyroll.cast.overlay.InternalCastOverlayLayout;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.feed.HomeFeedScreenView;
import com.ellation.crunchyroll.inappupdates.view.InAppUpdatesLayout;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayheadTimeProviderKt;
import com.ellation.crunchyroll.presentation.content.seasons.SelectedSeasonFragment;
import com.ellation.crunchyroll.presentation.downloads.empty.DownloadsEmptyLayout;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long playheadMs;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                androidx.media3.ui.c.a((androidx.media3.ui.c) obj);
                return;
            case 1:
                EmailMandatoryActivity emailMandatoryActivity = (EmailMandatoryActivity) obj;
                int i2 = EmailMandatoryActivity.o;
                com.amazon.aps.iva.yb0.j.f(emailMandatoryActivity, "this$0");
                emailMandatoryActivity.k.a().a();
                return;
            case 2:
                EmailVerificationBannerLayout.b1((EmailVerificationBannerLayout) obj);
                return;
            case 3:
                OnboardingV2Activity onboardingV2Activity = (OnboardingV2Activity) obj;
                int i3 = OnboardingV2Activity.o;
                com.amazon.aps.iva.yb0.j.f(onboardingV2Activity, "this$0");
                TextView textView = (TextView) onboardingV2Activity.n.getValue();
                com.amazon.aps.iva.yb0.j.e(textView, "upsellButton");
                ((com.amazon.aps.iva.yi.g) onboardingV2Activity.l.getValue()).p6(com.amazon.aps.iva.ab.r.p(textView, null));
                return;
            case 4:
                PlayerControlsLayout.U2((PlayerControlsLayout) obj);
                return;
            case 5:
                PlayerToolbar playerToolbar = (PlayerToolbar) obj;
                int i4 = PlayerToolbar.d;
                com.amazon.aps.iva.yb0.j.f(playerToolbar, "this$0");
                com.amazon.aps.iva.cl.c cVar = playerToolbar.b;
                if (cVar != null) {
                    com.amazon.aps.iva.cl.b bVar = cVar.e;
                    if (bVar != null) {
                        bVar.h0();
                    }
                    cVar.d.b();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            case 6:
                com.amazon.aps.iva.pn.a aVar = (com.amazon.aps.iva.pn.a) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.pn.a.f;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ((com.amazon.aps.iva.pn.b) aVar.e.getValue()).N(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 7:
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = (UserMigrationWelcomeActivity) obj;
                UserMigrationWelcomeActivity.a aVar2 = UserMigrationWelcomeActivity.n;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                com.amazon.aps.iva.ko.k pi = userMigrationWelcomeActivity.pi();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                pi.C2(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 8:
                InternalCastOverlayLayout.b1((com.amazon.aps.iva.cf.a) obj, view);
                return;
            case 9:
                com.amazon.aps.iva.du.e eVar = (com.amazon.aps.iva.du.e) obj;
                int i5 = com.amazon.aps.iva.du.e.e;
                com.amazon.aps.iva.yb0.j.f(eVar, "this$0");
                com.amazon.aps.iva.du.j jVar = eVar.c;
                EventDispatcher<com.amazon.aps.iva.du.f> eventDispatcher = jVar.d;
                if (eventDispatcher != null) {
                    eventDispatcher.notify(new com.amazon.aps.iva.du.l(jVar));
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("eventDispatcher");
                    throw null;
                }
            case 10:
                HomeFeedScreenView.Oa((HomeFeedScreenView) obj);
                return;
            case 11:
                com.amazon.aps.iva.ey.a.U2((com.amazon.aps.iva.ey.a) obj);
                return;
            case 12:
                InAppUpdatesLayout inAppUpdatesLayout = (InAppUpdatesLayout) obj;
                int i6 = InAppUpdatesLayout.e;
                com.amazon.aps.iva.yb0.j.f(inAppUpdatesLayout, "this$0");
                com.amazon.aps.iva.oy.b bVar2 = inAppUpdatesLayout.c.b;
                com.amazon.aps.iva.oy.a aVar3 = (com.amazon.aps.iva.oy.a) bVar2.q4().d();
                if (aVar3 instanceof a.i) {
                    bVar2.m1();
                    return;
                } else if (com.amazon.aps.iva.yb0.j.a(aVar3, a.b.i)) {
                    bVar2.I3();
                    return;
                } else {
                    return;
                }
            case 13:
                SelectedSeasonFragment selectedSeasonFragment = (SelectedSeasonFragment) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = SelectedSeasonFragment.f;
                com.amazon.aps.iva.yb0.j.f(selectedSeasonFragment, "this$0");
                ((com.amazon.aps.iva.m00.k) selectedSeasonFragment.e.getValue()).A();
                return;
            case 14:
                com.amazon.aps.iva.t00.b bVar3 = (com.amazon.aps.iva.t00.b) obj;
                b.a aVar4 = com.amazon.aps.iva.t00.b.i;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                ((com.amazon.aps.iva.t00.d) bVar3.h.getValue()).a();
                return;
            case 15:
                DownloadsEmptyLayout downloadsEmptyLayout = (DownloadsEmptyLayout) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr3 = DownloadsEmptyLayout.i;
                com.amazon.aps.iva.yb0.j.f(downloadsEmptyLayout, "this$0");
                com.amazon.aps.iva.h10.b bVar4 = downloadsEmptyLayout.h;
                if (bVar4 != null) {
                    bVar4.b.C();
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("presenter");
                    throw null;
                }
            case 16:
                com.amazon.aps.iva.m10.h hVar = (com.amazon.aps.iva.m10.h) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr4 = com.amazon.aps.iva.m10.h.f;
                com.amazon.aps.iva.yb0.j.f(hVar, "this$0");
                com.amazon.aps.iva.m10.i iVar = hVar.e;
                com.amazon.aps.iva.l10.a aVar5 = iVar.c;
                if (aVar5 != null) {
                    iVar.b.invoke(aVar5);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("genre");
                    throw null;
                }
            case 17:
                com.amazon.aps.iva.e20.b bVar5 = (com.amazon.aps.iva.e20.b) obj;
                b.a aVar6 = com.amazon.aps.iva.e20.b.e;
                com.amazon.aps.iva.yb0.j.f(bVar5, "this$0");
                bVar5.di().q();
                return;
            case 18:
                CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr5 = CancellationRescueActivity.s;
                com.amazon.aps.iva.yb0.j.f(cancellationRescueActivity, "this$0");
                com.amazon.aps.iva.k20.l ni = cancellationRescueActivity.ni();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ni.u3(com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 19:
                UpsellV2Activity upsellV2Activity = (UpsellV2Activity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr6 = UpsellV2Activity.s;
                com.amazon.aps.iva.yb0.j.f(upsellV2Activity, "this$0");
                upsellV2Activity.oi().j(com.amazon.aps.iva.ab.r.p(upsellV2Activity.ni().e.getButtonTextView(), null));
                return;
            case 20:
                com.amazon.aps.iva.e40.a aVar7 = (com.amazon.aps.iva.e40.a) obj;
                a.C0215a c0215a = com.amazon.aps.iva.e40.a.t;
                com.amazon.aps.iva.yb0.j.f(aVar7, "this$0");
                ((com.amazon.aps.iva.e40.i) aVar7.s.getValue()).I5(com.amazon.aps.iva.ab.r.p((View) aVar7.o.getValue(aVar7, com.amazon.aps.iva.e40.a.u[12]), null));
                return;
            case 21:
                SignInActivity signInActivity = (SignInActivity) obj;
                SignInActivity.a aVar8 = SignInActivity.O;
                com.amazon.aps.iva.yb0.j.f(signInActivity, "this$0");
                signInActivity.vi().R2(new com.amazon.aps.iva.fs.b(b0.CENTER, signInActivity.wi().getText()));
                return;
            case 22:
                StartupActivity startupActivity = (StartupActivity) obj;
                int i7 = StartupActivity.r;
                com.amazon.aps.iva.yb0.j.f(startupActivity, "this$0");
                startupActivity.mi().u2();
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                com.amazon.aps.iva.c50.e eVar2 = (com.amazon.aps.iva.c50.e) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr7 = com.amazon.aps.iva.c50.e.k;
                com.amazon.aps.iva.yb0.j.f(eVar2, "this$0");
                com.amazon.aps.iva.c50.f fVar = eVar2.j;
                com.amazon.aps.iva.b60.k kVar = fVar.e;
                if (kVar != null) {
                    int i8 = fVar.f;
                    boolean z = kVar.d;
                    com.amazon.aps.iva.b50.b bVar6 = fVar.d;
                    Panel panel = kVar.g;
                    bVar6.x(i8, panel, z);
                    com.amazon.aps.iva.b60.k kVar2 = fVar.e;
                    if (kVar2 != null) {
                        if (kVar2.f) {
                            fVar.getView().t(panel);
                            return;
                        }
                        com.amazon.aps.iva.no.a aVar9 = com.amazon.aps.iva.no.a.WATCHLIST_ITEM;
                        if (kVar2 != null) {
                            long playheadSec = kVar2.getPlayheadSec();
                            com.amazon.aps.iva.b60.k kVar3 = fVar.e;
                            if (kVar3 != null) {
                                if (playheadSec == DurationProviderKt.getDurationSecs(kVar3.g.getMetadata())) {
                                    playheadMs = 0;
                                } else {
                                    com.amazon.aps.iva.b60.k kVar4 = fVar.e;
                                    if (kVar4 != null) {
                                        playheadMs = PlayheadTimeProviderKt.getPlayheadMs(kVar4);
                                    } else {
                                        com.amazon.aps.iva.yb0.j.m("watchlistItem");
                                        throw null;
                                    }
                                }
                                Long valueOf = Long.valueOf(playheadMs);
                                com.amazon.aps.iva.b60.k kVar5 = fVar.e;
                                if (kVar5 != null) {
                                    fVar.c.c(panel, aVar9, valueOf, Boolean.valueOf(kVar5.c));
                                    return;
                                }
                                com.amazon.aps.iva.yb0.j.m("watchlistItem");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("watchlistItem");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("watchlistItem");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("watchlistItem");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("watchlistItem");
                throw null;
            default:
                com.amazon.aps.iva.p50.c cVar2 = (com.amazon.aps.iva.p50.c) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr8 = com.amazon.aps.iva.p50.c.e;
                com.amazon.aps.iva.yb0.j.f(cVar2, "this$0");
                ((com.amazon.aps.iva.p50.h) cVar2.c.getValue()).m6();
                return;
        }
    }
}
