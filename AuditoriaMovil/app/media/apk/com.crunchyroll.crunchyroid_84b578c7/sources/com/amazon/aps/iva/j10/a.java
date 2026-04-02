package com.amazon.aps.iva.j10;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.h;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.de.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.om.m;
import com.amazon.aps.iva.om.n;
import com.amazon.aps.iva.om.o;
import com.amazon.aps.iva.om.p;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.v10.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.inappupdates.view.InAppUpdatesLayout;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: HomeFeedFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/aps/iva/j10/a;", "Lcom/amazon/aps/iva/wy/e;", "Landroidx/appcompat/widget/Toolbar$h;", "Lcom/amazon/aps/iva/v10/k;", "Lcom/amazon/aps/iva/de/e;", "Lcom/amazon/aps/iva/bh/c;", "Lcom/amazon/aps/iva/om/p;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.e implements Toolbar.h, k, com.amazon.aps.iva.de.e, com.amazon.aps.iva.bh.c, p {
    public final v c;
    public final v d;
    public final v e;
    public final v f;
    public final com.amazon.aps.iva.de.d g;
    public final m h;
    public static final /* synthetic */ l<Object>[] j = {q.a(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), q.a(a.class, "subscriptionButton", "getSubscriptionButton()Landroid/view/View;", 0), q.a(a.class, "inGraceFeedButton", "getInGraceFeedButton()Landroid/view/View;", 0), q.a(a.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0)};
    public static final C0397a i = new C0397a();

    /* compiled from: HomeFeedFragment.kt */
    /* renamed from: com.amazon.aps.iva.j10.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0397a {
    }

    /* compiled from: HomeFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.amazon.aps.iva.j10.b.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: HomeFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            boolean z;
            a aVar = a.this;
            if (((View) aVar.e.getValue(aVar, a.j[2])).getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: HomeFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            a aVar = a.this;
            boolean z = true;
            if (((View) aVar.d.getValue(aVar, a.j[1])).getVisibility() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: HomeFeedFragment.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.feed.HomeFeedFragment$onViewCreated$4", f = "HomeFeedFragment.kt", l = {95}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, Object> {
        public int h;
        public /* synthetic */ int i;
        public /* synthetic */ int j;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(Integer num, Integer num2, com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>> dVar) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            e eVar = new e(dVar);
            eVar.i = intValue;
            eVar.j = intValue2;
            return eVar.invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                int i2 = this.i;
                int i3 = this.j;
                EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
                Integer num = new Integer(i2);
                Integer num2 = new Integer(i3);
                this.h = 1;
                obj = etpContentService.getHomeFeed(num, num2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: HomeFeedFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f implements com.amazon.aps.iva.py.d {
        public f() {
        }

        @Override // com.amazon.aps.iva.py.d
        public final void a() {
            a aVar = a.this;
            v vVar = aVar.d;
            l<?>[] lVarArr = a.j;
            t0.j((View) vVar.getValue(aVar, lVarArr[1]), null, null, null, Integer.valueOf(aVar.getResources().getDimensionPixelSize(R.dimen.home_feed_subscription_button_padding_bottom)), 7);
            t0.j((View) aVar.e.getValue(aVar, lVarArr[2]), null, null, null, Integer.valueOf(aVar.getResources().getDimensionPixelSize(R.dimen.home_feed_subscription_button_padding_bottom)), 7);
        }

        @Override // com.amazon.aps.iva.py.d
        public final void b() {
            a aVar = a.this;
            v vVar = aVar.d;
            l<?>[] lVarArr = a.j;
            t0.j((View) vVar.getValue(aVar, lVarArr[1]), null, null, null, Integer.valueOf(aVar.getResources().getDimensionPixelSize(R.dimen.home_feed_subscription_button_padding_bottom_dodge)), 7);
            t0.j((View) aVar.e.getValue(aVar, lVarArr[2]), null, null, null, Integer.valueOf(aVar.getResources().getDimensionPixelSize(R.dimen.home_feed_subscription_button_padding_bottom_dodge)), 7);
        }
    }

    public a() {
        super(0);
        this.c = g.f(this, R.id.toolbar);
        this.d = g.f(this, R.id.subscription_button);
        this.e = g.f(this, R.id.in_grace_feed_button);
        this.f = g.f(this, R.id.snackbar_container);
        com.amazon.aps.iva.de.b.a.getClass();
        com.amazon.aps.iva.de.c cVar = b.a.b;
        j.f(cVar, "monitor");
        this.g = new com.amazon.aps.iva.de.d(this, cVar);
        o oVar = ((d0) com.ellation.crunchyroll.application.e.a()).c.b;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c2 = aVar.c().c(com.amazon.aps.iva.ox.a.class, "lupin");
            if (c2 != null) {
                j.f(oVar, "profilesOnboardingDialogStore");
                this.h = new m(this, oVar, (com.amazon.aps.iva.ox.a) c2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.profiles.LupinConfigImpl");
        }
        j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.om.p
    public final void A3() {
        new com.amazon.aps.iva.om.d().show(getChildFragmentManager(), "profiles_onboarding_dialog_tag");
    }

    @Override // com.amazon.aps.iva.wy.e
    public final void ci(Intent intent) {
        j.f(intent, "intent");
        super.ci(intent);
        di().G4(intent);
    }

    public final com.amazon.aps.iva.bh.a di() {
        View findViewById = requireView().findViewById(R.id.home_feed);
        j.e(findViewById, "requireView().findViewById(R.id.home_feed)");
        return (com.amazon.aps.iva.bh.a) findViewById;
    }

    @Override // com.amazon.aps.iva.bh.c
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a = c.a.a((ViewGroup) this.f.getValue(this, j[3]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a.b(aVar, aVar2);
        String string = requireContext().getString(R.string.mark_as_watched_actionbar_title, str);
        j.e(string, "requireContext().getStri…  title\n                )");
        com.amazon.aps.iva.u70.c.c(a, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    public final Toolbar ei() {
        return (Toolbar) this.c.getValue(this, j[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_home_feed, viewGroup, false);
        j.e(inflate, "inflater.inflate(R.layou…e_feed, container, false)");
        return inflate;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        j.f(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.a aVar = SearchResultSummaryActivity.r;
            h requireActivity = requireActivity();
            j.e(requireActivity, "requireActivity()");
            aVar.getClass();
            SearchResultSummaryActivity.a.a(requireActivity);
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        h activity = getActivity();
        if (activity != null) {
            com.amazon.aps.iva.xw.b.e(activity, 17170445);
        }
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        ei().inflateMenu(R.menu.menu_main);
        ei().setOnMenuItemClickListener(this);
        f1.i(ei(), b.h);
        super.onViewCreated(view, bundle);
        ((d0) com.ellation.crunchyroll.application.e.a()).j.addCastButton(ei());
        com.amazon.aps.iva.bh.a di = di();
        c cVar = new c();
        d dVar = new d();
        e eVar = new e(null);
        List<? extends HomeFeedItemResponseType> K = f1.K(HomeFeedItemResponseType.WATCHLIST, HomeFeedItemResponseType.HISTORY, HomeFeedItemResponseType.SERIES, HomeFeedItemResponseType.RECOMMENDATIONS, HomeFeedItemResponseType.BROWSE, HomeFeedItemResponseType.BECAUSE_YOU_WATCHED, HomeFeedItemResponseType.UNDEFINED, HomeFeedItemResponseType.MUSIC_VIDEO, HomeFeedItemResponseType.CONCERT, HomeFeedItemResponseType.ARTIST);
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HOME;
        di.U2(this, cVar, dVar, eVar, K, true, false, aVar);
        com.amazon.aps.iva.me.h h = ((d0) com.ellation.crunchyroll.application.e.a()).p.h();
        h requireActivity = requireActivity();
        j.e(requireActivity, "requireActivity()");
        h.b(requireActivity);
        h requireActivity2 = requireActivity();
        j.e(requireActivity2, "requireActivity()");
        h requireActivity3 = requireActivity();
        j.d(requireActivity3, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        h.a(requireActivity2, (com.amazon.aps.iva.u70.j) requireActivity3);
        h requireActivity4 = requireActivity();
        j.e(requireActivity4, "requireActivity()");
        h.c(requireActivity4);
        com.amazon.aps.iva.fo.h hVar = ((d0) com.ellation.crunchyroll.application.e.a()).q.d;
        h requireActivity5 = requireActivity();
        j.e(requireActivity5, "requireActivity()");
        h requireActivity6 = requireActivity();
        j.d(requireActivity6, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        hVar.f(requireActivity5, (com.amazon.aps.iva.u70.j) requireActivity6);
        h requireActivity7 = requireActivity();
        j.e(requireActivity7, "requireActivity()");
        h requireActivity8 = requireActivity();
        j.d(requireActivity8, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        hVar.e(requireActivity7, (com.amazon.aps.iva.u70.j) requireActivity8, aVar);
        h requireActivity9 = requireActivity();
        j.e(requireActivity9, "requireActivity()");
        com.amazon.aps.iva.g30.f v = ((d0) com.ellation.crunchyroll.application.e.a()).i.v(requireActivity9);
        h requireActivity10 = requireActivity();
        j.e(requireActivity10, "requireActivity()");
        v.a(requireActivity10);
        ((InAppUpdatesLayout) view.findViewById(R.id.in_app_updates_view)).setInAppUpdatesVisibilityListener(new f());
        m mVar = this.h;
        if (bundle == null) {
            n nVar = mVar.b;
            if (nVar.b() && mVar.c.isEnabled()) {
                mVar.getView().A3();
                nVar.a();
                return;
            }
            return;
        }
        mVar.getClass();
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.g);
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        j.f(iVar, "message");
        h activity = getActivity();
        j.d(activity, "null cannot be cast to non-null type com.ellation.widgets.snackbar.SnackbarMessageView");
        ((com.amazon.aps.iva.u70.j) activity).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.v10.k
    public final void yh() {
        di().H6();
    }
}
