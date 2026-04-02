package com.amazon.aps.iva.c8;

import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.cp.a;
import com.amazon.aps.iva.gt.c;
import com.amazon.aps.iva.l20.b;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.qv.c;
import com.amazon.aps.iva.r10.n;
import com.amazon.aps.iva.vt.b;
import com.amazon.aps.iva.z00.b;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.crunchyroll.music.artist.ArtistActivity;
import com.crunchyroll.profiles.presentation.avatar.AvatarSelectionActivity;
import com.crunchyroll.usermigration.welcome.UserMigrationWelcomeActivity;
import com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsLayout;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.presentation.content.seasons.a;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.presentation.search.result.detail.SearchResultDetailActivity;
import com.ellation.crunchyroll.presentation.update.UpdateAppActivity;
import com.ellation.crunchyroll.showrating.ratingview.ShowRatingLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
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
                    cVar.C0.D(cVar.C0.i().a().d(3).g().b());
                    cVar.l.dismiss();
                    return;
                }
                return;
            case 1:
                DefaultInAppMessageModalViewFactory.a((DefaultInAppMessageModalViewFactory) obj, view);
                return;
            case 2:
                InAppMessageModalView.c((InAppMessageModalView) obj, view);
                return;
            case 3:
                com.amazon.aps.iva.xb0.a aVar = (com.amazon.aps.iva.xb0.a) obj;
                int i2 = ArtistActivity.m;
                com.amazon.aps.iva.yb0.j.f(aVar, "$onCtaButtonClick");
                aVar.invoke();
                return;
            case 4:
                AvatarSelectionActivity avatarSelectionActivity = (AvatarSelectionActivity) obj;
                int i3 = AvatarSelectionActivity.n;
                com.amazon.aps.iva.yb0.j.f(avatarSelectionActivity, "this$0");
                avatarSelectionActivity.mi().S1();
                return;
            case 5:
                UserMigrationWelcomeActivity userMigrationWelcomeActivity = (UserMigrationWelcomeActivity) obj;
                UserMigrationWelcomeActivity.a aVar2 = UserMigrationWelcomeActivity.n;
                com.amazon.aps.iva.yb0.j.f(userMigrationWelcomeActivity, "this$0");
                com.amazon.aps.iva.ko.k pi = userMigrationWelcomeActivity.pi();
                Object checkedOption = userMigrationWelcomeActivity.oi().d.h.getCheckedOption();
                com.amazon.aps.iva.yb0.j.d(checkedOption, "null cannot be cast to non-null type com.crunchyroll.usermigration.MigrationOption");
                com.amazon.aps.iva.yb0.j.e(view, "it");
                pi.x((com.amazon.aps.iva.co.c) checkedOption, com.amazon.aps.iva.ab.r.p(view, null));
                return;
            case 6:
                WatchScreenAssetsLayout watchScreenAssetsLayout = (WatchScreenAssetsLayout) obj;
                int i4 = WatchScreenAssetsLayout.d;
                com.amazon.aps.iva.yb0.j.f(watchScreenAssetsLayout, "this$0");
                com.amazon.aps.iva.so.c cVar2 = watchScreenAssetsLayout.c;
                if (cVar2 != null) {
                    com.amazon.aps.iva.so.b bVar = cVar2.a.e;
                    if (bVar != null) {
                        bVar.j1();
                        return;
                    }
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("module");
                throw null;
            case 7:
                com.amazon.aps.iva.cp.a aVar3 = (com.amazon.aps.iva.cp.a) obj;
                a.C0183a c0183a = com.amazon.aps.iva.cp.a.m;
                com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                ((com.amazon.aps.iva.cp.e) aVar3.l.getValue()).c();
                return;
            case 8:
                com.amazon.aps.iva.gt.c cVar3 = (com.amazon.aps.iva.gt.c) obj;
                c.a aVar4 = com.amazon.aps.iva.gt.c.k;
                com.amazon.aps.iva.yb0.j.f(cVar3, "this$0");
                com.amazon.aps.iva.gt.e ci = cVar3.ci();
                com.amazon.aps.iva.fc0.l<?>[] lVarArr = com.amazon.aps.iva.gt.c.l;
                ci.o6(com.amazon.aps.iva.ab.r.p((View) cVar3.c.getValue(cVar3, lVarArr[1]), ((TextView) cVar3.d.getValue(cVar3, lVarArr[2])).getText().toString()));
                return;
            case 9:
                com.amazon.aps.iva.vt.b bVar2 = (com.amazon.aps.iva.vt.b) obj;
                b.a aVar5 = com.amazon.aps.iva.vt.b.m;
                com.amazon.aps.iva.yb0.j.f(bVar2, "this$0");
                bVar2.hi().getPresenter().a();
                return;
            case 10:
                CrunchylistActivity crunchylistActivity = (CrunchylistActivity) obj;
                int i5 = CrunchylistActivity.m;
                com.amazon.aps.iva.yb0.j.f(crunchylistActivity, "this$0");
                crunchylistActivity.k.b().j3();
                return;
            case 11:
                com.amazon.aps.iva.qv.c cVar4 = (com.amazon.aps.iva.qv.c) obj;
                c.a aVar6 = com.amazon.aps.iva.qv.c.f;
                com.amazon.aps.iva.yb0.j.f(cVar4, "this$0");
                cVar4.ei().getPresenter().e();
                return;
            case 12:
                com.ellation.crunchyroll.presentation.content.seasons.a aVar7 = (com.ellation.crunchyroll.presentation.content.seasons.a) obj;
                a.C0969a c0969a = com.ellation.crunchyroll.presentation.content.seasons.a.h;
                com.amazon.aps.iva.yb0.j.f(aVar7, "this$0");
                ((com.amazon.aps.iva.m00.h) aVar7.g.getValue()).Q();
                return;
            case 13:
                com.amazon.aps.iva.z00.b bVar3 = (com.amazon.aps.iva.z00.b) obj;
                b.a aVar8 = com.amazon.aps.iva.z00.b.k;
                com.amazon.aps.iva.yb0.j.f(bVar3, "this$0");
                com.amazon.aps.iva.zv.b bVar4 = com.amazon.aps.iva.sv.e.e;
                if (bVar4 != null) {
                    com.amazon.aps.iva.zv.e f = bVar4.f();
                    androidx.fragment.app.h requireActivity = bVar3.requireActivity();
                    com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
                    f.f(requireActivity).a();
                    bVar3.dismiss();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            case 14:
                com.amazon.aps.iva.r10.n nVar = (com.amazon.aps.iva.r10.n) obj;
                n.a aVar9 = com.amazon.aps.iva.r10.n.w;
                com.amazon.aps.iva.yb0.j.f(nVar, "this$0");
                nVar.ei().r3();
                return;
            case 15:
                CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = CancellationRescueActivity.s;
                com.amazon.aps.iva.yb0.j.f(cancellationRescueActivity, "this$0");
                com.amazon.aps.iva.k20.l ni = cancellationRescueActivity.ni();
                com.amazon.aps.iva.yb0.j.e(view, "it");
                ni.K2(com.amazon.aps.iva.ab.r.p(view, "Close"));
                return;
            case 16:
                com.amazon.aps.iva.l20.b bVar5 = (com.amazon.aps.iva.l20.b) obj;
                b.a aVar10 = com.amazon.aps.iva.l20.b.f;
                com.amazon.aps.iva.yb0.j.f(bVar5, "this$0");
                ((com.amazon.aps.iva.l20.c) bVar5.e.getValue()).c();
                return;
            case 17:
                SearchResultDetailActivity searchResultDetailActivity = (SearchResultDetailActivity) obj;
                SearchResultDetailActivity.a aVar11 = SearchResultDetailActivity.D;
                com.amazon.aps.iva.yb0.j.f(searchResultDetailActivity, "this$0");
                searchResultDetailActivity.ni().u();
                return;
            case 18:
                com.amazon.aps.iva.t40.c cVar5 = (com.amazon.aps.iva.t40.c) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr3 = com.amazon.aps.iva.t40.c.w;
                com.amazon.aps.iva.yb0.j.f(cVar5, "this$0");
                cVar5.onBackPressed();
                return;
            case 19:
                UpdateAppActivity updateAppActivity = (UpdateAppActivity) obj;
                UpdateAppActivity.a aVar12 = UpdateAppActivity.e;
                com.amazon.aps.iva.yb0.j.f(updateAppActivity, "this$0");
                ((com.amazon.aps.iva.z40.f) updateAppActivity.c.getValue()).E1();
                return;
            default:
                ShowRatingLayout showRatingLayout = (ShowRatingLayout) obj;
                int i6 = ShowRatingLayout.e;
                com.amazon.aps.iva.yb0.j.f(showRatingLayout, "this$0");
                com.amazon.aps.iva.s50.e eVar = showRatingLayout.c;
                if (eVar != null) {
                    eVar.getView().Q3();
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("presenter");
                    throw null;
                }
        }
    }
}
