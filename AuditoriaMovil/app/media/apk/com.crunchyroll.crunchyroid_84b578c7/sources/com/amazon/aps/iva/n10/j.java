package com.amazon.aps.iva.n10;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.n60.b;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.application.a;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.search.result.summary.SearchResultSummaryActivity;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.crunchyroll.watchlist.a;
import com.ellation.widgets.ScrollToggleRecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: GenreFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/aps/iva/n10/j;", "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/n10/z;", "Landroidx/appcompat/widget/Toolbar$h;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/f60/k;", "Lcom/amazon/aps/iva/oh/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.qy.a implements z, Toolbar.h, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.f60.k, com.amazon.aps.iva.oh.i {
    public w i;
    public com.amazon.aps.iva.gn.d j;
    public com.amazon.aps.iva.f60.e k;
    public final com.amazon.aps.iva.f60.d o;
    public final com.amazon.aps.iva.ez.f p;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] r = {defpackage.e.b(j.class, "genre", "getGenre()Lcom/ellation/crunchyroll/presentation/genres/Genre;", 0), com.amazon.aps.iva.k.q.a(j.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0), com.amazon.aps.iva.k.q.a(j.class, "contentLayout", "getContentLayout()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(j.class, "genreTitle", "getGenreTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(j.class, "genreIcon", "getGenreIcon()Landroid/widget/ImageView;", 0), com.amazon.aps.iva.k.q.a(j.class, "genreFeedRecyclerView", "getGenreFeedRecyclerView()Lcom/ellation/widgets/ScrollToggleRecyclerView;", 0), com.amazon.aps.iva.k.q.a(j.class, "genreViewModel", "getGenreViewModel()Lcom/ellation/crunchyroll/presentation/genres/genre/GenreFeedViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "cardWatchlistItemToggleViewModel", "getCardWatchlistItemToggleViewModel()Lcom/ellation/crunchyroll/watchlisttoggle/CardWatchlistItemToggleViewModelImpl;", 0)};
    public static final a q = new a();
    public final com.amazon.aps.iva.xw.s c = new com.amazon.aps.iva.xw.s("genre");
    public final com.amazon.aps.iva.xw.v d = com.amazon.aps.iva.xw.g.f(this, R.id.toolbar);
    public final com.amazon.aps.iva.xw.v e = com.amazon.aps.iva.xw.g.f(this, R.id.content_layout);
    public final com.amazon.aps.iva.xw.v f = com.amazon.aps.iva.xw.g.f(this, R.id.genre_title);
    public final com.amazon.aps.iva.xw.v g = com.amazon.aps.iva.xw.g.f(this, R.id.genre_icon);
    public final com.amazon.aps.iva.xw.v h = com.amazon.aps.iva.xw.g.f(this, R.id.genre_list);
    public final Handler l = new Handler(Looper.getMainLooper());
    public final com.amazon.aps.iva.kb0.m m = com.amazon.aps.iva.kb0.f.b(new d());
    public final com.amazon.aps.iva.ez.f n = new com.amazon.aps.iva.ez.f(this, i.class, new c());

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.f60.m> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.f60.m invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return j.this.o.b();
        }
    }

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, i> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final i invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
            a aVar = j.q;
            j jVar = j.this;
            jVar.getClass();
            com.amazon.aps.iva.fc0.l<?> lVar = j.r[0];
            com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
            return new i(new com.amazon.aps.iva.n10.d(etpContentService, (com.amazon.aps.iva.l10.a) jVar.c.getValue(jVar, lVar)));
        }
    }

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.oh.g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.oh.g invoke() {
            return ((d0) com.ellation.crunchyroll.application.e.a()).y.c(j.this, com.amazon.aps.iva.ls.a.GENRE);
        }
    }

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e implements com.amazon.aps.iva.k50.h {
        public e() {
        }

        @Override // com.amazon.aps.iva.k50.h
        public final void t(Panel panel) {
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            ShowPageActivity.a aVar = ShowPageActivity.K;
            Context requireContext = j.this.requireContext();
            com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
            aVar.getClass();
            ShowPageActivity.a.a(requireContext, panel);
        }
    }

    /* compiled from: GenreFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public f(w wVar) {
            super(0, wVar, s.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((s) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public j() {
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.BROWSE;
        EtpContentService etpContentService = com.ellation.crunchyroll.application.e.c().getEtpContentService();
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        this.o = new com.amazon.aps.iva.f60.d(aVar, etpContentService, this);
        this.p = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.f60.m.class, new b());
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void Gf(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "icons");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.ly.c.c(imageUtil, requireContext, list, (ImageView) this.g.getValue(this, r[4]), 0);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void H() {
        ei().setScrollEnabled(true);
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        w wVar = this.i;
        if (wVar != null) {
            wVar.U0(jVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void Wd(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        ((TextView) this.f.getValue(this, r[3])).setText(str);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void X5(List<? extends com.amazon.aps.iva.n10.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, "genreFeedAdapterItems");
        di().e(list);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void c() {
        this.l.postDelayed(new com.amazon.aps.iva.e.k(this, 10), 500L);
    }

    public final com.amazon.aps.iva.o10.a di() {
        com.amazon.aps.iva.o10.a aVar;
        RecyclerView.h adapter = ei().getAdapter();
        if (adapter instanceof com.amazon.aps.iva.o10.a) {
            aVar = (com.amazon.aps.iva.o10.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            com.amazon.aps.iva.f60.e eVar = this.k;
            if (eVar != null) {
                k kVar = new k(eVar);
                com.amazon.aps.iva.gn.d dVar = this.j;
                if (dVar != null) {
                    com.amazon.aps.iva.nt.a aVar2 = new com.amazon.aps.iva.nt.a(kVar, new l(dVar), new m(this), new n(this));
                    o oVar = new o(this);
                    w wVar = this.i;
                    if (wVar != null) {
                        aVar = new com.amazon.aps.iva.o10.a(aVar2, oVar, new p(wVar));
                        ei().setAdapter(aVar);
                        ei().addItemDecoration(new g());
                    } else {
                        com.amazon.aps.iva.yb0.j.m("presenter");
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("sharePresenter");
                    throw null;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("watchlistItemTogglePresenter");
                throw null;
            }
        }
        return aVar;
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        ViewParent viewParent;
        com.amazon.aps.iva.yb0.j.f(aVar2, "onUndoClicked");
        int i = com.amazon.aps.iva.u70.c.a;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        com.amazon.aps.iva.yb0.j.d(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) viewParent, 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = requireContext().getString(R.string.mark_as_watched_actionbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "requireContext().getStri…  title\n                )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    public final ScrollToggleRecyclerView ei() {
        return (ScrollToggleRecyclerView) this.h.getValue(this, r[5]);
    }

    public final Toolbar fi() {
        return (Toolbar) this.d.getValue(this, r[1]);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void ib() {
        this.l.removeCallbacksAndMessages(null);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void k1() {
        ((ImageView) this.g.getValue(this, r[4])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void n9(int i, int i2) {
        View view;
        RecyclerView.p layoutManager = ei().getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.findViewByPosition(i);
        } else {
            view = null;
        }
        com.amazon.aps.iva.p10.b bVar = (com.amazon.aps.iva.p10.b) view;
        if (bVar != null) {
            bVar.b1(i2);
        } else {
            di().notifyItemChanged(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_genre, viewGroup, false);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.menu_item_search) {
            SearchResultSummaryActivity.a aVar = SearchResultSummaryActivity.r;
            androidx.fragment.app.h requireActivity = requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            aVar.getClass();
            SearchResultSummaryActivity.a.a(requireActivity);
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        fi().setTitle(getString(R.string.genres_toolbar_title));
        fi().inflateMenu(R.menu.menu_main);
        fi().setNavigationOnClickListener(new com.amazon.aps.iva.c8.h(this, 16));
        fi().setOnMenuItemClickListener(this);
        f1.i(fi(), r.h);
        super.onViewCreated(view, bundle);
        ((d0) com.ellation.crunchyroll.application.e.a()).j.addCastButton(fi());
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        ((d0) com.ellation.crunchyroll.application.e.a()).y.a(requireActivity, this, (com.amazon.aps.iva.oh.g) this.m.getValue());
    }

    @Override // com.amazon.aps.iva.n10.z
    public final boolean q0() {
        if (getView() == null) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = r;
        com.amazon.aps.iva.l10.a aVar = (com.amazon.aps.iva.l10.a) this.c.getValue(this, lVarArr[0]);
        i iVar = (i) this.n.getValue(this, lVarArr[6]);
        com.amazon.aps.iva.ws.f a2 = d.a.a(com.amazon.aps.iva.ls.a.GENRE);
        com.ellation.crunchyroll.application.a aVar2 = a.C0959a.a;
        if (aVar2 != null) {
            Object c2 = aVar2.c().c(com.amazon.aps.iva.cx.p.class, "app_resume_screens_reload_intervals");
            if (c2 != null) {
                com.amazon.aps.iva.n60.c a3 = b.a.a((com.amazon.aps.iva.cx.p) c2);
                e eVar = new e();
                com.amazon.aps.iva.oh.g gVar = (com.amazon.aps.iva.oh.g) this.m.getValue();
                com.ellation.crunchyroll.watchlist.a.u0.getClass();
                com.ellation.crunchyroll.watchlist.a aVar3 = a.C0975a.b;
                com.amazon.aps.iva.yb0.j.f(aVar3, "watchlistChangeRegister");
                com.amazon.aps.iva.yb0.j.f(gVar, "markAsWatchedToggleViewModel");
                this.i = new w(this, aVar, iVar, a2, a3, eVar, aVar3, gVar);
                com.amazon.aps.iva.ts.b.a.getClass();
                this.j = c.a.a(this, com.amazon.aps.iva.ts.a.j);
                com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[7];
                com.amazon.aps.iva.f60.h a4 = this.o.a((com.amazon.aps.iva.f60.m) this.p.getValue(this, lVar));
                this.k = a4;
                com.amazon.aps.iva.wy.k[] kVarArr = new com.amazon.aps.iva.wy.k[3];
                w wVar = this.i;
                if (wVar != null) {
                    kVarArr[0] = wVar;
                    com.amazon.aps.iva.gn.d dVar = this.j;
                    if (dVar != null) {
                        kVarArr[1] = dVar;
                        kVarArr[2] = a4;
                        return l1.I(kVarArr);
                    }
                    com.amazon.aps.iva.yb0.j.m("sharePresenter");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("presenter");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.configs.ScreenReloadIntervalsImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = requireActivity().findViewById(R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "requireActivity().findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void v() {
        ei().setScrollEnabled(false);
    }

    @Override // com.amazon.aps.iva.n10.z
    public final void w1() {
        ((ImageView) this.g.getValue(this, r[4])).setVisibility(0);
    }
}
