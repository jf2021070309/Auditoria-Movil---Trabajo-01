package com.amazon.aps.iva.ne;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.b60.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i10.a;
import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.ru.b;
import com.amazon.aps.iva.se.d;
import com.amazon.aps.iva.tl.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yu.e;
import com.crunchyroll.billingnotifications.cancelled.CancellationCompleteActivity;
import com.crunchyroll.music.artist.summary.ArtistSummaryLayout;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.crunchyroll.sortandfilters.filters.empty.EmptyFilterResultLayout;
import com.crunchyroll.usermigration.verification.CrOwnershipVerificationActivity;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
import com.ellation.crunchyroll.cast.overlay.toolbar.CastOverlayToolbarLayout;
import com.ellation.crunchyroll.crunchylists.addtocrunchylistbutton.AddToCrunchylistButton;
import com.ellation.crunchyroll.presentation.availability.ServiceUnavailableActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.success.downgrade.DowngradeSuccessActivity;
import com.ellation.crunchyroll.presentation.search.recent.RecentSearchesLayout;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.presentation.signing.signin.SignInActivity;
import com.ellation.crunchyroll.presentation.watchlist.favorite.FavoriteToggleButton;
import com.ellation.feature.empty.EmptyCtaLayout;
import com.ellation.widgets.input.password.PasswordInputView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.search.SearchView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                CancellationCompleteActivity cancellationCompleteActivity = (CancellationCompleteActivity) obj;
                int i2 = CancellationCompleteActivity.n;
                j.f(cancellationCompleteActivity, "this$0");
                ((f) cancellationCompleteActivity.l.getValue()).c();
                return;
            case 1:
                com.amazon.aps.iva.se.d dVar = (com.amazon.aps.iva.se.d) obj;
                d.a aVar = com.amazon.aps.iva.se.d.g;
                j.f(dVar, "this$0");
                j.e(view, "it");
                ((com.amazon.aps.iva.se.e) dVar.f.getValue()).d(r.p(view, null));
                return;
            case 2:
                com.amazon.aps.iva.xb0.a aVar2 = (com.amazon.aps.iva.xb0.a) obj;
                int i3 = ArtistSummaryLayout.d;
                j.f(aVar2, "$onSummaryCtaButtonClick");
                aVar2.invoke();
                return;
            case 3:
                PlayerControlsLayout.b1((PlayerControlsLayout) obj);
                return;
            case 4:
                com.amazon.aps.iva.tl.f fVar = (com.amazon.aps.iva.tl.f) obj;
                f.a aVar3 = com.amazon.aps.iva.tl.f.d;
                j.f(fVar, "this$0");
                com.amazon.aps.iva.tl.g gVar = (com.amazon.aps.iva.tl.g) fVar.c.getValue();
                if (gVar.getView().getCanGoBack()) {
                    gVar.getView().dismiss();
                    return;
                }
                return;
            case 5:
                ProfileActivationActivityLegacy profileActivationActivityLegacy = (ProfileActivationActivityLegacy) obj;
                int i4 = ProfileActivationActivityLegacy.m;
                j.f(profileActivationActivityLegacy, "this$0");
                profileActivationActivityLegacy.mi().getPresenter().y3();
                return;
            case 6:
                EmptyFilterResultLayout emptyFilterResultLayout = (EmptyFilterResultLayout) obj;
                int i5 = EmptyFilterResultLayout.e;
                j.f(emptyFilterResultLayout, "this$0");
                com.amazon.aps.iva.qn.a aVar4 = emptyFilterResultLayout.d;
                if (aVar4 != null) {
                    j.e(view, "it");
                    aVar4.K1(r.p(view, null));
                    return;
                }
                j.m("presenter");
                throw null;
            case 7:
                com.amazon.aps.iva.tn.a aVar5 = (com.amazon.aps.iva.tn.a) obj;
                l<Object>[] lVarArr = com.amazon.aps.iva.tn.a.i;
                j.f(aVar5, "this$0");
                j.e(view, "it");
                ((com.amazon.aps.iva.tn.b) aVar5.h.getValue()).N(r.p(view, null));
                return;
            case 8:
                CrOwnershipVerificationActivity crOwnershipVerificationActivity = (CrOwnershipVerificationActivity) obj;
                CrOwnershipVerificationActivity.a aVar6 = CrOwnershipVerificationActivity.o;
                j.f(crOwnershipVerificationActivity, "this$0");
                ((com.amazon.aps.iva.jo.e) crOwnershipVerificationActivity.n.getValue()).O1(new com.amazon.aps.iva.fs.b(b0.CENTER, crOwnershipVerificationActivity.mi().d.getText()), crOwnershipVerificationActivity.mi().b.getEmail(), crOwnershipVerificationActivity.mi().e.getPassword());
                return;
            case 9:
                WatchScreenSummaryLayout.b1((WatchScreenSummaryLayout) obj);
                return;
            case 10:
                CastOverlayToolbarLayout.U2((CastOverlayToolbarLayout) obj, view);
                return;
            case 11:
                com.amazon.aps.iva.ru.b bVar = (com.amazon.aps.iva.ru.b) obj;
                b.a aVar7 = com.amazon.aps.iva.ru.b.m;
                j.f(bVar, "this$0");
                bVar.gi().getPresenter().v2();
                return;
            case 12:
                com.amazon.aps.iva.yu.e eVar = (com.amazon.aps.iva.yu.e) obj;
                e.a aVar8 = com.amazon.aps.iva.yu.e.h;
                j.f(eVar, "this$0");
                eVar.ei().getPresenter().U();
                return;
            case 13:
                AddToCrunchylistButton addToCrunchylistButton = (AddToCrunchylistButton) obj;
                int i6 = AddToCrunchylistButton.d;
                j.f(addToCrunchylistButton, "this$0");
                addToCrunchylistButton.c.h();
                return;
            case 14:
                com.amazon.aps.iva.fy.a.U2((com.amazon.aps.iva.fy.a) obj);
                return;
            case 15:
                ServiceUnavailableActivity serviceUnavailableActivity = (ServiceUnavailableActivity) obj;
                ServiceUnavailableActivity.a aVar9 = ServiceUnavailableActivity.o;
                j.f(serviceUnavailableActivity, "this$0");
                com.amazon.aps.iva.rz.c cVar = serviceUnavailableActivity.m;
                cVar.getView().j();
                cVar.c.onServiceAvailabilityRefresh();
                return;
            case 16:
                com.amazon.aps.iva.i10.a aVar10 = (com.amazon.aps.iva.i10.a) obj;
                a.C0349a c0349a = com.amazon.aps.iva.i10.a.x;
                j.f(aVar10, "this$0");
                aVar10.ei().w();
                return;
            case 17:
                DowngradeSuccessActivity downgradeSuccessActivity = (DowngradeSuccessActivity) obj;
                int i7 = DowngradeSuccessActivity.n;
                j.f(downgradeSuccessActivity, "this$0");
                ((com.amazon.aps.iva.i30.e) downgradeSuccessActivity.m.getValue()).m();
                return;
            case 18:
                RecentSearchesLayout.G((RecentSearchesLayout) obj);
                return;
            case 19:
                SearchResultSummaryActivity searchResultSummaryActivity = (SearchResultSummaryActivity) obj;
                SearchResultSummaryActivity.a aVar11 = SearchResultSummaryActivity.r;
                j.f(searchResultSummaryActivity, "this$0");
                searchResultSummaryActivity.onBackPressed();
                return;
            case 20:
                SignInActivity signInActivity = (SignInActivity) obj;
                SignInActivity.a aVar12 = SignInActivity.O;
                j.f(signInActivity, "this$0");
                signInActivity.vi().X2();
                return;
            case 21:
                FavoriteToggleButton favoriteToggleButton = (FavoriteToggleButton) obj;
                int i8 = FavoriteToggleButton.c;
                j.f(favoriteToggleButton, "this$0");
                com.amazon.aps.iva.d50.c cVar2 = favoriteToggleButton.b;
                cVar2.q6().d = !cVar2.q6().d;
                cVar2.getView().setSelected(cVar2.q6().d);
                cVar2.getView().setEnabled(false);
                k q6 = cVar2.q6();
                cVar2.b.p1(q6.g, cVar2.q6().d, new com.amazon.aps.iva.d50.a(cVar2), new com.amazon.aps.iva.d50.b(cVar2));
                return;
            case 22:
                EmptyCtaLayout.b1((EmptyCtaLayout) obj);
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                PasswordInputView passwordInputView = (PasswordInputView) obj;
                l<Object>[] lVarArr2 = PasswordInputView.l;
                j.f(passwordInputView, "this$0");
                com.amazon.aps.iva.k70.b bVar2 = passwordInputView.i;
                if (bVar2.getView().Hb()) {
                    com.amazon.aps.iva.k70.a view2 = bVar2.getView();
                    view2.f6();
                    view2.t8();
                    view2.U8();
                    return;
                }
                com.amazon.aps.iva.k70.a view3 = bVar2.getView();
                view3.Gc();
                view3.ie();
                view3.U8();
                return;
            default:
                ((SearchView) obj).lambda$setUpClearButton$2(view);
                return;
        }
    }
}
