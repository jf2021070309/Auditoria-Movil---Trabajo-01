package com.ellation.crunchyroll.presentation.showpage;

import android.annotation.SuppressLint;
import android.app.assist.AssistContent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.i50.b;
import com.amazon.aps.iva.l40.c1;
import com.amazon.aps.iva.l40.i1;
import com.amazon.aps.iva.l40.j1;
import com.amazon.aps.iva.l40.n0;
import com.amazon.aps.iva.l40.y0;
import com.amazon.aps.iva.l40.z0;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.nz.b;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.amazon.aps.iva.u70.c;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yw.d0;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.featuredmusic.FeaturedMusicLayout;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.crunchylists.addtocrunchylistbutton.AddToCrunchylistButton;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.content.assets.AssetsRecyclerView;
import com.ellation.crunchyroll.presentation.content.seasons.ShowPageSeasonPicker;
import com.ellation.crunchyroll.presentation.content.seasons.a;
import com.ellation.crunchyroll.presentation.download.notification.NotificationDismissReceiver;
import com.ellation.crunchyroll.presentation.main.lists.MyListsBottomBarActivity;
import com.ellation.crunchyroll.presentation.showpage.c;
import com.ellation.crunchyroll.presentation.showpage.cta.ShowPageCtaLayout;
import com.ellation.crunchyroll.presentation.showpage.downloading.syncedtoolbar.SyncedToolbarLayout;
import com.ellation.crunchyroll.presentation.showpage.similar.SimilarShowsLayout;
import com.ellation.crunchyroll.presentation.showpage.summary.ShowSummaryLayout;
import com.ellation.crunchyroll.showrating.ratingview.ShowRatingLayout;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.behavior.AppBarLayoutBehavior;
import com.ellation.widgets.overflow.OverflowButton;
import com.ellation.widgets.tabs.CustomTabLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ShowPageActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ellation/crunchyroll/presentation/showpage/ShowPageActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/l40/i1;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/k30/b;", "Lcom/amazon/aps/iva/j00/a;", "Lcom/amazon/aps/iva/f60/k;", "Lcom/amazon/aps/iva/xu/g;", "Lcom/amazon/aps/iva/xu/h;", "Lcom/amazon/aps/iva/us/a;", "Lcom/amazon/aps/iva/oh/i;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ShowPageActivity extends com.amazon.aps.iva.i60.b implements i1, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.k30.b, com.amazon.aps.iva.j00.a, com.amazon.aps.iva.f60.k, com.amazon.aps.iva.xu.g, com.amazon.aps.iva.xu.h, com.amazon.aps.iva.us.a, com.amazon.aps.iva.oh.i {
    public com.amazon.aps.iva.fg.g F;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] L = {com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "overflowButton", "getOverflowButton()Lcom/ellation/widgets/overflow/OverflowButton;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "overflowMenu", "getOverflowMenu()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "contentTabsContainer", "getContentTabsContainer()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "contentTabs", "getContentTabs()Lcom/ellation/widgets/tabs/CustomTabLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "similarShows", "getSimilarShows()Lcom/ellation/crunchyroll/presentation/showpage/similar/SimilarShowsLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "featuredMusic", "getFeaturedMusic()Lcom/crunchyroll/music/featuredmusic/FeaturedMusicLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "assetList", "getAssetList()Lcom/ellation/crunchyroll/presentation/content/assets/AssetsRecyclerView;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "assetContainer", "getAssetContainer()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "syncedToolbar", "getSyncedToolbar()Lcom/ellation/crunchyroll/presentation/showpage/downloading/syncedtoolbar/SyncedToolbarLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "heroImage", "getHeroImage()Landroid/widget/ImageView;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "showSummary", "getShowSummary()Lcom/ellation/crunchyroll/presentation/showpage/summary/ShowSummaryLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "progressOverlay", "getProgressOverlay()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "noNetworkMessageContainer", "getNoNetworkMessageContainer()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "seasonsDivider", "getSeasonsDivider()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "ctaButton", "getCtaButton()Lcom/ellation/crunchyroll/presentation/showpage/cta/ShowPageCtaLayout;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "showPageToolbarTitle", "getShowPageToolbarTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "fullScreenError", "getFullScreenError()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(ShowPageActivity.class, "videosTabError", "getVideosTabError()Landroid/view/ViewGroup;", 0)};
    public static final a K = new a();
    public final com.amazon.aps.iva.xw.v k = com.amazon.aps.iva.xw.g.d(this, R.id.app_bar_layout);
    public final com.amazon.aps.iva.xw.v l = com.amazon.aps.iva.xw.g.b(this, R.id.overflow_button);
    public final com.amazon.aps.iva.xw.v m = com.amazon.aps.iva.xw.g.d(this, R.id.menu_item_overflow);
    public final com.amazon.aps.iva.xw.v n = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_tab_container);
    public final com.amazon.aps.iva.xw.v o = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_tab_layout);
    public final com.amazon.aps.iva.xw.v p = com.amazon.aps.iva.xw.g.d(this, R.id.similar_shows_layout);
    public final com.amazon.aps.iva.xw.v q = com.amazon.aps.iva.xw.g.d(this, R.id.featured_music);
    public final com.amazon.aps.iva.xw.v r = com.amazon.aps.iva.xw.g.d(this, R.id.assets_list);
    public final com.amazon.aps.iva.xw.v s = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_asset_container);
    public final com.amazon.aps.iva.xw.v t = com.amazon.aps.iva.xw.g.d(this, R.id.synced_toolbar_layout);
    public final com.amazon.aps.iva.xw.v u = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_hero_image);
    public final com.amazon.aps.iva.xw.v v = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_show_summary);
    public final com.amazon.aps.iva.xw.v w = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_progress_overlay);
    public final com.amazon.aps.iva.xw.v x = com.amazon.aps.iva.xw.g.d(this, R.id.no_network_message_view_container);
    public final com.amazon.aps.iva.xw.v y = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_seasons_divider);
    public final com.amazon.aps.iva.xw.v z = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_cta);
    public final com.amazon.aps.iva.xw.v A = com.amazon.aps.iva.xw.g.d(this, R.id.snackbar_container);
    public final com.amazon.aps.iva.xw.v B = com.amazon.aps.iva.xw.g.b(this, R.id.show_page_toolbar_title);
    public final com.amazon.aps.iva.xw.v C = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_error_fullscreen);
    public final com.amazon.aps.iva.xw.v D = com.amazon.aps.iva.xw.g.d(this, R.id.show_page_episodes_tab_error);
    public final com.amazon.aps.iva.kb0.m E = com.amazon.aps.iva.kb0.f.b(new j());
    public final com.amazon.aps.iva.kb0.m G = com.amazon.aps.iva.kb0.f.b(new r());
    public final com.amazon.aps.iva.kb0.m H = com.amazon.aps.iva.kb0.f.b(new w());
    public final int I = R.layout.activity_show_page;
    public final com.amazon.aps.iva.kb0.m J = com.amazon.aps.iva.kb0.f.b(new s());

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context, Panel panel) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            Intent intent = new Intent(context, ShowPageActivity.class);
            intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(f0.c(panel), f0.a(panel), null));
            context.startActivity(intent);
        }

        public static void b(Context context, String str, com.amazon.aps.iva.x50.t tVar, boolean z) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.yb0.j.f(str, "containerId");
            com.amazon.aps.iva.yb0.j.f(tVar, "containerResourceType");
            Intent intent = new Intent(context, ShowPageActivity.class);
            intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(tVar, str, null));
            intent.putExtra("show_page_is_online", z);
            context.startActivity(intent);
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.l40.u uVar) {
            super(0, uVar, com.amazon.aps.iva.l40.u.class, "onSummaryCtaButtonClick", "onSummaryCtaButtonClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.l40.u) this.receiver).S();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.q<Panel, com.amazon.aps.iva.nt.o, com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.f60.e eVar) {
            super(3, eVar, com.amazon.aps.iva.f60.e.class, "onToggle", "onToggle(Lcom/ellation/crunchyroll/model/Panel;Lcom/ellation/crunchyroll/cards/overflow/WatchlistToggleMenuItem;Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final com.amazon.aps.iva.kb0.q invoke(Panel panel, com.amazon.aps.iva.nt.o oVar, com.amazon.aps.iva.fs.b bVar) {
            Panel panel2 = panel;
            com.amazon.aps.iva.nt.o oVar2 = oVar;
            com.amazon.aps.iva.fs.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(panel2, "p0");
            com.amazon.aps.iva.yb0.j.f(oVar2, "p1");
            com.amazon.aps.iva.yb0.j.f(bVar2, "p2");
            ((com.amazon.aps.iva.f60.e) this.receiver).o1(panel2, oVar2, bVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
        public d(com.amazon.aps.iva.gn.c cVar) {
            super(1, cVar, com.amazon.aps.iva.gn.c.class, "onPanelShare", "onPanelShare(Lcom/ellation/crunchyroll/model/Panel;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
            Panel panel2 = panel;
            com.amazon.aps.iva.yb0.j.f(panel2, "p0");
            ((com.amazon.aps.iva.gn.c) this.receiver).V(panel2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
            Panel panel2 = panel;
            com.amazon.aps.iva.yb0.j.f(panel2, "panel");
            ShowPageActivity showPageActivity = ShowPageActivity.this;
            com.amazon.aps.iva.yb0.j.f(showPageActivity, "context");
            b.a.a(new com.amazon.aps.iva.i50.c(showPageActivity, new com.amazon.aps.iva.i50.a(showPageActivity, true)), panel2, com.amazon.aps.iva.no.a.OVERFLOW_WATCH_NOW, null, 12);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Panel, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Panel panel) {
            Panel panel2 = panel;
            com.amazon.aps.iva.yb0.j.f(panel2, "panel");
            a aVar = ShowPageActivity.K;
            ShowPageActivity.this.vi().n(com.amazon.aps.iva.e.w.B(panel2), panel2.getTitle());
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ CoordinatorLayout c;

        public g(CoordinatorLayout coordinatorLayout, Toolbar toolbar) {
            this.b = toolbar;
            this.c = coordinatorLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                com.amazon.aps.iva.yb0.j.e(this.c, "coordinator");
                t0.j(this.c, null, Integer.valueOf(((Toolbar) view).getHeight()), null, null, 13);
            }
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.showpage.a.h, 251);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Integer, View> {
        public i(i1 i1Var) {
            super(1, i1Var, ShowPageActivity.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final View invoke(Integer num) {
            return ((ShowPageActivity) this.receiver).findViewById(num.intValue());
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.l40.s> {
        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.l40.s invoke() {
            CrunchyrollApplication b = com.ellation.crunchyroll.application.e.b();
            a aVar = ShowPageActivity.K;
            ShowPageActivity showPageActivity = ShowPageActivity.this;
            com.amazon.aps.iva.o40.j ti = showPageActivity.ti();
            boolean booleanExtra = showPageActivity.getIntent().getBooleanExtra("show_page_is_online", true);
            com.amazon.aps.iva.o40.k kVar = b.l;
            com.amazon.aps.iva.yb0.j.f(kVar, "showContentInteractorPool");
            if (booleanExtra) {
                return new com.amazon.aps.iva.l40.e(kVar, showPageActivity, ti);
            }
            return new com.amazon.aps.iva.l40.b(showPageActivity, ti);
        }
    }

    /* compiled from: SeasonsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class k implements com.amazon.aps.iva.n4.v {
        public final /* synthetic */ com.amazon.aps.iva.l40.u b;

        public k(com.amazon.aps.iva.l40.u uVar) {
            this.b = uVar;
        }

        @Override // com.amazon.aps.iva.n4.v
        public final void i6(Bundle bundle, String str) {
            Object obj;
            com.amazon.aps.iva.yb0.j.f(str, "<anonymous parameter 0>");
            if (bundle.containsKey("selected_season_result")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = bundle.getSerializable("selected_season_result", Season.class);
                } else {
                    obj = (Season) bundle.getSerializable("selected_season_result");
                }
                com.amazon.aps.iva.yb0.j.c(obj);
                this.b.R4((Season) obj);
            }
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends com.amazon.aps.iva.nz.a>, com.amazon.aps.iva.kb0.q> {
        public l() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(List<? extends com.amazon.aps.iva.nz.a> list) {
            List<? extends com.amazon.aps.iva.nz.a> list2 = list;
            com.amazon.aps.iva.yb0.j.f(list2, "assetIds");
            a aVar = ShowPageActivity.K;
            j1 e = ShowPageActivity.this.ui().e();
            List<? extends com.amazon.aps.iva.nz.a> list3 = list2;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
            for (com.amazon.aps.iva.nz.a aVar2 : list3) {
                arrayList.add(aVar2.a);
            }
            e.C1(arrayList);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class m extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public m(Object obj) {
            super(0, obj, ShowPageActivity.class, "showAssetsList", "showAssetsList()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ShowPageActivity showPageActivity = (ShowPageActivity) this.receiver;
            a aVar = ShowPageActivity.K;
            showPageActivity.yi().setVisibility(8);
            showPageActivity.qi().setVisibility(8);
            showPageActivity.ni().setVisibility(0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class n extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public n(Object obj) {
            super(0, obj, ShowPageActivity.class, "showSimilar", "showSimilar()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ShowPageActivity showPageActivity = (ShowPageActivity) this.receiver;
            a aVar = ShowPageActivity.K;
            showPageActivity.ni().setVisibility(8);
            showPageActivity.qi().setVisibility(8);
            showPageActivity.yi().setVisibility(0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class o extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public o(com.amazon.aps.iva.l40.u uVar) {
            super(0, uVar, com.amazon.aps.iva.l40.u.class, "onMusicDataLoaded", "onMusicDataLoaded()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.l40.u) this.receiver).s0();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class p extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public p(com.amazon.aps.iva.l40.u uVar) {
            super(0, uVar, com.amazon.aps.iva.l40.u.class, "onMusicDataLoadingFailed", "onMusicDataLoadingFailed()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.l40.u) this.receiver).F4();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final q h = new q();

        public q() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.showpage.b.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.l40.u> {
        public r() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.l40.u invoke() {
            a aVar = ShowPageActivity.K;
            return ShowPageActivity.this.ui().getPresenter();
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ls.a> {
        public s() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ls.a invoke() {
            a aVar = ShowPageActivity.K;
            return ShowPageActivity.this.ui().c().b1();
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class t extends AppBarLayout.Behavior.DragCallback {
        public final /* synthetic */ boolean a;

        public t(boolean z) {
            this.a = z;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public final boolean canDrag(AppBarLayout appBarLayout) {
            com.amazon.aps.iva.yb0.j.f(appBarLayout, "appBarLayout");
            return this.a;
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class u implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ ShowPageActivity d;
        public final /* synthetic */ int e;

        public u(ImageView imageView, View view, ShowPageActivity showPageActivity, int i) {
            this.b = imageView;
            this.c = view;
            this.d = showPageActivity;
            this.e = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ImageView imageView = (ImageView) view;
                View view2 = this.c;
                com.amazon.aps.iva.yb0.j.e(view2, "space");
                a aVar = ShowPageActivity.K;
                ShowPageActivity showPageActivity = this.d;
                int height = showPageActivity.si().getHeight();
                Toolbar toolbar = showPageActivity.f;
                com.amazon.aps.iva.yb0.j.c(toolbar);
                t0.k(view2, null, Integer.valueOf((height - toolbar.getHeight()) - this.e));
            }
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a70.b, com.amazon.aps.iva.kb0.q> {
        public v() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a70.b bVar) {
            com.amazon.aps.iva.a70.b bVar2 = bVar;
            com.amazon.aps.iva.yb0.j.f(bVar2, "actionItem");
            a aVar = ShowPageActivity.K;
            ShowPageActivity.this.vi().O(bVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ShowPageActivity.kt */
    /* loaded from: classes2.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f60.e> {
        public w() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f60.e invoke() {
            a aVar = ShowPageActivity.K;
            return ShowPageActivity.this.ui().g();
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void A5(com.amazon.aps.iva.r40.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "showSummary");
        xi().b1(aVar, new b(vi()));
    }

    public final boolean Ai() {
        com.amazon.aps.iva.o40.j jVar;
        Bundle extras;
        Object obj;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("show_page_input", com.amazon.aps.iva.o40.j.class);
            } else {
                obj = (com.amazon.aps.iva.o40.j) extras.getSerializable("show_page_input");
            }
            jVar = (com.amazon.aps.iva.o40.j) obj;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            return true;
        }
        return false;
    }

    public final void Bi(AppBarLayout appBarLayout, boolean z) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        com.amazon.aps.iva.yb0.j.d(cVar, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
        ((AppBarLayout.Behavior) cVar).setDragCallback(new t(z));
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
        vi().b2(list);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void D9(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        oi().setVisibility(8);
        zi().setVisibility(0);
        ((TextView) zi().findViewById(R.id.retry_text)).setOnClickListener(new com.amazon.aps.iva.wf.d(2, aVar));
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final boolean E() {
        return getResources().getBoolean(R.bool.show_page_is_dual_pane);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
        vi().v3();
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void F9(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        View findViewById = findViewById(R.id.watchlist_toggler);
        com.amazon.aps.iva.yb0.j.e(findViewById, "findViewById<ViewGroup>(R.id.watchlist_toggler)");
        findViewById.setVisibility(0);
        if (getSupportFragmentManager().C("watchlist_toggle_fragment") == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
            com.amazon.aps.iva.h50.g.i.getClass();
            com.amazon.aps.iva.h50.g gVar = new com.amazon.aps.iva.h50.g();
            gVar.e.b(gVar, com.amazon.aps.iva.h50.g.j[2], contentContainer);
            a2.d(R.id.watchlist_toggler, gVar, "watchlist_toggle_fragment", 1);
            a2.h();
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void G1() {
        Bi(mi(), true);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void G9() {
        Intent intent = new Intent(this, ShowPageActivity.class);
        intent.putExtras(getIntent());
        intent.putExtra("show_page_is_online", true);
        startActivity(intent);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void H4() {
        CustomTabLayout customTabLayout = (CustomTabLayout) this.o.getValue(this, L[4]);
        ((d0) com.ellation.crunchyroll.application.e.a()).s.getClass();
        com.amazon.aps.iva.di.l lVar = new com.amazon.aps.iva.di.l(this, new com.amazon.aps.iva.l40.h(this));
        customTabLayout.getClass();
        com.amazon.aps.iva.w70.e eVar = customTabLayout.b;
        eVar.getClass();
        ArrayList Z0 = x.Z0(eVar.b);
        Z0.add(1, lVar);
        eVar.a.G(lVar, 1);
        eVar.b = Z0;
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Ja(boolean z, com.amazon.aps.iva.bv.d dVar) {
        AddToCrunchylistButton addToCrunchylistsButton = xi().getAddToCrunchylistsButton();
        addToCrunchylistsButton.getClass();
        addToCrunchylistsButton.c.n0(z, dVar);
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        yi().H6(jVar);
    }

    @Override // com.amazon.aps.iva.j00.a
    public final void K() {
        ((View) this.w.getValue(this, L[12])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void K8(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "seasonIdToScroll");
        mi().setExpanded(false);
        oi().getAssetsComponent().i5(str);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void L6() {
        ((View) this.y.getValue(this, L[14])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Mc(View view, com.amazon.aps.iva.a70.c cVar, com.amazon.aps.iva.i00.a aVar, y0 y0Var) {
        com.amazon.aps.iva.yb0.j.f(view, "buttonView");
        com.amazon.aps.iva.yb0.j.f(aVar, "selectedSortType");
        String string = getString(R.string.sort_by);
        com.amazon.aps.iva.yb0.j.e(string, "getString(R.string.sort_by)");
        List<com.amazon.aps.iva.a70.a<T>> list = cVar.a;
        com.amazon.aps.iva.yb0.j.f(list, "menu");
        new com.amazon.aps.iva.pz.a(this, view, new com.amazon.aps.iva.a70.c(list, string), aVar, new com.amazon.aps.iva.l40.n(y0Var), 224).show();
    }

    @Override // com.amazon.aps.iva.j00.a
    public final void N() {
        ((View) this.w.getValue(this, L[12])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Ob() {
        View findViewById = findViewById(R.id.show_page_hero_empty_space);
        com.amazon.aps.iva.yb0.j.e(findViewById, "space");
        t0.k(findViewById, null, 0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Q0() {
        ri().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Q7(Season season) {
        com.amazon.aps.iva.yb0.j.f(season, "selectedSeason");
        ((com.amazon.aps.iva.m00.k) wi().e.getValue()).U1(season);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Sh(ContentContainer contentContainer) {
        com.amazon.aps.iva.yb0.j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        yi().G4(contentContainer, new com.amazon.aps.iva.nt.a(new c((com.amazon.aps.iva.f60.e) this.H.getValue()), new d(ui().a()), new e(), new f()));
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        startActivity(com.amazon.aps.iva.gd0.j.i(this, str));
    }

    @Override // com.amazon.aps.iva.xu.h
    public final void U2(Intent intent) {
        com.amazon.aps.iva.ab.x.B(this);
        MyListsBottomBarActivity.a aVar = MyListsBottomBarActivity.w;
        com.amazon.aps.iva.y10.m mVar = com.amazon.aps.iva.y10.m.CRUNCHYLISTS;
        aVar.getClass();
        com.amazon.aps.iva.yb0.j.f(mVar, "tabToOpen");
        Intent intent2 = new Intent(this, MyListsBottomBarActivity.class);
        intent2.putExtra("tab_to_open", mVar);
        intent2.fillIn(intent, 2);
        intent2.setFlags(131072);
        startActivity(intent2);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void Uh() {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);
        Toolbar toolbar = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar);
        if (toolbar.isLaidOut()) {
            com.amazon.aps.iva.yb0.j.e(coordinatorLayout, "coordinator");
            t0.j(coordinatorLayout, null, Integer.valueOf(toolbar.getHeight()), null, null, 13);
        } else {
            toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new g(coordinatorLayout, toolbar));
        }
        Toolbar toolbar2 = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar2);
        f1.i(toolbar2, h.h);
        ViewGroup.LayoutParams layoutParams = mi().getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        com.amazon.aps.iva.yb0.j.d(cVar, "null cannot be cast to non-null type com.ellation.widgets.behavior.AppBarLayoutBehavior");
        ((AppBarLayoutBehavior) cVar).b = new c1(new i(this));
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void V6() {
        ShowPageSeasonPicker wi = wi();
        Fragment C = wi.getParentFragmentManager().C("season_dialog");
        if (C != null) {
            FragmentManager parentFragmentManager = wi.getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.m(C);
            aVar.h();
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void X0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        ri().setVisibility(0);
        ((TextView) ri().findViewById(R.id.retry_text)).setOnClickListener(new com.amazon.aps.iva.wf.d(2, aVar));
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return (com.amazon.aps.iva.ls.a) this.J.getValue();
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void b4(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "images");
        com.amazon.aps.iva.ly.c.c(ImageUtil.INSTANCE, this, list, si(), R.color.cr_light_blue);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        vi().x5();
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void bi() {
        OverflowButton overflowButton = (OverflowButton) this.l.getValue(this, L[1]);
        if (overflowButton != null) {
            overflowButton.setVisibility(0);
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void c1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        TextView textView = (TextView) this.B.getValue(this, L[17]);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void c6(n0 n0Var) {
        pi().setOnClickListener(new com.amazon.aps.iva.rn.a(1, n0Var));
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void e(String str, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.j.f(aVar2, "onUndoClicked");
        int i2 = com.amazon.aps.iva.u70.c.a;
        com.amazon.aps.iva.u70.c a2 = c.a.a((ViewGroup) this.A.getValue(this, L[16]), 0, R.style.ActionSnackBarTextStyle, R.style.ActionSnackBarActionTextStyle);
        a2.b(aVar, aVar2);
        String string = getString(R.string.mark_as_watched_actionbar_title, str);
        com.amazon.aps.iva.yb0.j.e(string, "getString(\n             …itle, title\n            )");
        com.amazon.aps.iva.u70.c.c(a2, string, R.string.mark_as_watched_actionbar_undo, 0, 12);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void ef(com.amazon.aps.iva.di.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "featuredMusicInput");
        qi().b1(dVar);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void f5(com.amazon.aps.iva.kg.b bVar) {
        SyncedToolbarLayout syncedToolbarLayout = (SyncedToolbarLayout) this.t.getValue(this, L[9]);
        syncedToolbarLayout.getClass();
        if (syncedToolbarLayout.e == null) {
            com.amazon.aps.iva.aw.a G = ((d0) com.ellation.crunchyroll.application.e.a()).l.G(bVar);
            Context context = syncedToolbarLayout.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "context");
            com.amazon.aps.iva.n40.b bVar2 = new com.amazon.aps.iva.n40.b(context, new DecimalFormat("###,###"));
            com.amazon.aps.iva.yb0.j.f(G, "monitor");
            com.amazon.aps.iva.n40.d dVar = new com.amazon.aps.iva.n40.d(G, bVar2, syncedToolbarLayout);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(dVar, syncedToolbarLayout);
            syncedToolbarLayout.e = dVar;
        }
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void fd(com.amazon.aps.iva.m50.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "input");
        ShowRatingLayout showRating = xi().getShowRating();
        showRating.getClass();
        if (showRating.c == null) {
            com.amazon.aps.iva.s50.j jVar = new com.amazon.aps.iva.s50.j((com.amazon.aps.iva.n50.d) com.amazon.aps.iva.ez.l.a(this, com.amazon.aps.iva.n50.d.class, new com.amazon.aps.iva.s50.a(bVar)));
            Context context = showRating.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "context");
            com.amazon.aps.iva.s50.e eVar = new com.amazon.aps.iva.s50.e(showRating, jVar, new com.amazon.aps.iva.l60.b(context));
            com.ellation.crunchyroll.mvp.lifecycle.a.b(eVar, showRating);
            showRating.c = eVar;
        }
        com.amazon.aps.iva.s50.e eVar2 = showRating.c;
        if (eVar2 != null) {
            eVar2.q6(bVar);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
            showRating.d = supportFragmentManager;
            return;
        }
        com.amazon.aps.iva.yb0.j.m("presenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void g0() {
        oi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void ia(List list, com.amazon.aps.iva.l40.w wVar, z0 z0Var) {
        com.amazon.aps.iva.yb0.j.f(list, "assetModels");
        oi().getAssetsComponent().z2(list);
        oi().getAssetsComponent().O3(wVar);
        oi().getAssetsComponent().C3(z0Var);
        ((CustomTabLayout) this.o.getValue(this, L[4])).setDefaultTab(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void j9(List<com.amazon.aps.iva.n70.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, "overflowMenu");
        OverflowButton overflowButton = (OverflowButton) this.l.getValue(this, L[1]);
        if (overflowButton != null) {
            int i2 = OverflowButton.h;
            overflowButton.G(list, null, null, null, null);
        }
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.I);
    }

    @Override // com.amazon.aps.iva.i60.b
    public final com.amazon.aps.iva.mf.f ki() {
        if (getIntent().getBooleanExtra("show_page_is_online", true)) {
            return this.g;
        }
        return null;
    }

    public final AppBarLayout mi() {
        return (AppBarLayout) this.k.getValue(this, L[0]);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void nh(List<? extends com.amazon.aps.iva.a70.b> list) {
        new com.amazon.aps.iva.a70.h(this, list, Integer.valueOf((int) R.style.PopupActionMenuStyle), new v()).G((View) this.m.getValue(this, L[2]));
    }

    public final View ni() {
        return (View) this.s.getValue(this, L[8]);
    }

    public final AssetsRecyclerView oi() {
        return (AssetsRecyclerView) this.r.getValue(this, L[7]);
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        boolean z;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 228 && i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.amazon.aps.iva.ab.x.B(this);
        }
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    @SuppressLint({"BinaryOperationInTimber"})
    public final void onCreate(Bundle bundle) {
        String e2;
        super.onCreate(bundle);
        if (!Ai()) {
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            IllegalStateException illegalStateException = new IllegalStateException(defpackage.e.e("Invalid ", e0.a(com.amazon.aps.iva.o40.j.class).k(), " found in extras."));
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                e2 = "null";
            } else {
                Set<String> keySet = extras.keySet();
                com.amazon.aps.iva.yb0.j.e(keySet, "keySet()");
                e2 = defpackage.e.e("{[", x.B0(keySet, null, null, null, new com.amazon.aps.iva.x50.o(extras), 31), "]}");
            }
            c0515a.k(illegalStateException, com.amazon.aps.iva.oa.a.a("Extras - ", e2), new Object[0]);
            finish();
            return;
        }
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        t1 t1Var = com.amazon.aps.iva.xe0.k.a;
        com.amazon.aps.iva.yb0.j.f(t1Var, "dispatcher");
        com.amazon.aps.iva.nz.c cVar2 = b.a.a;
        if (cVar2 == null) {
            cVar2 = new com.amazon.aps.iva.nz.c(t1Var);
            b.a.a = cVar2;
        }
        cVar2.a(this, new l());
        View findViewById = zi().findViewById(R.id.error_image);
        com.amazon.aps.iva.yb0.j.e(findViewById, "videosTabError.findViewB…feature.R.id.error_image)");
        findViewById.setVisibility(8);
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = L;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[4];
        com.amazon.aps.iva.w70.a[] aVarArr = (com.amazon.aps.iva.w70.a[]) com.amazon.aps.iva.lb0.o.O(new com.amazon.aps.iva.w70.a[]{new c.a(this, ti().c, new m(this)), new c.b(this, new n(this))}).toArray(new com.amazon.aps.iva.w70.a[0]);
        ((CustomTabLayout) this.o.getValue(this, lVar)).b1((com.amazon.aps.iva.w70.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        ((d0) com.ellation.crunchyroll.application.e.a()).s.m(this).a(this, new o(vi()), new p(vi()));
        f1.i((View) this.x.getValue(this, lVarArr[13]), q.h);
        this.F = ((d0) com.ellation.crunchyroll.application.e.a()).l.v(this, ui().e().E4(), ui().h(), ui().f(), new com.amazon.aps.iva.l40.i(this), new com.amazon.aps.iva.l40.j(ui().e()), new com.amazon.aps.iva.l40.k(this));
        oi().addItemDecoration(new com.amazon.aps.iva.d00.e());
        AssetsRecyclerView oi = oi();
        com.amazon.aps.iva.d00.a assetItemViewInteractionListener = oi().getAssetItemViewInteractionListener();
        com.amazon.aps.iva.fg.g gVar = this.F;
        if (gVar != null) {
            com.amazon.aps.iva.f00.u uVar = new com.amazon.aps.iva.f00.u(assetItemViewInteractionListener, gVar, b1());
            uVar.f = new com.amazon.aps.iva.l40.l(vi());
            uVar.e = new com.amazon.aps.iva.l40.m(vi());
            oi.setAdapter(uVar);
            a.C0969a c0969a = com.ellation.crunchyroll.presentation.content.seasons.a.h;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
            supportFragmentManager.b0("season_dialog", this, new k(vi()));
            ((d0) com.ellation.crunchyroll.application.e.a()).y.a(this, this, ui().b());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("videoDownloadModule");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        com.amazon.aps.iva.yb0.j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_show_page, menu);
        com.ellation.crunchyroll.application.e.a().a().addCastButton(this, menu);
        return true;
    }

    @Override // com.amazon.aps.iva.i60.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "item");
        if (menuItem.getItemId() == R.id.menu_item_overflow) {
            vi().Y3();
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        com.amazon.aps.iva.yb0.j.f(assistContent, "outContent");
        super.onProvideAssistContent(assistContent);
        vi().p(new com.amazon.aps.iva.gn.a(assistContent));
    }

    public final ShowPageCtaLayout pi() {
        return (ShowPageCtaLayout) this.z.getValue(this, L[15]);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void q() {
        pi().setVisibility(8);
    }

    public final FeaturedMusicLayout qi() {
        return (FeaturedMusicLayout) this.q.getValue(this, L[6]);
    }

    public final ViewGroup ri() {
        return (ViewGroup) this.C.getValue(this, L[18]);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void s1() {
        ((View) this.n.getValue(this, L[3])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        if (Ai()) {
            return l1.I(vi(), ui().a(), (com.amazon.aps.iva.f60.e) this.H.getValue(), ui().d(), ui().h(), ui().f(), ui().i());
        }
        return b0.b;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i2 = com.amazon.aps.iva.u70.h.a;
        h.a.a((ViewGroup) this.A.getValue(this, L[16]), iVar);
    }

    public final ImageView si() {
        return (ImageView) this.u.getValue(this, L[10]);
    }

    public final com.amazon.aps.iva.o40.j ti() {
        com.amazon.aps.iva.o40.j jVar;
        Bundle extras;
        Object obj;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("show_page_input", com.amazon.aps.iva.o40.j.class);
            } else {
                obj = (com.amazon.aps.iva.o40.j) extras.getSerializable("show_page_input");
            }
            jVar = (com.amazon.aps.iva.o40.j) obj;
        } else {
            jVar = null;
        }
        com.amazon.aps.iva.yb0.j.c(jVar);
        return jVar;
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void uc(com.amazon.aps.iva.m00.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "seasonPickerData");
        ShowPageSeasonPicker wi = wi();
        List<Season> list = bVar.b.b;
        com.amazon.aps.iva.yb0.j.f(list, "seasons");
        ((com.amazon.aps.iva.m00.k) wi.e.getValue()).B2(list, bVar.a);
    }

    public final com.amazon.aps.iva.l40.s ui() {
        return (com.amazon.aps.iva.l40.s) this.E.getValue();
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void v2() {
        ((View) this.n.getValue(this, L[3])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void vd(com.amazon.aps.iva.m40.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "ctaModel");
        pi().b1(cVar);
    }

    public final com.amazon.aps.iva.l40.u vi() {
        return (com.amazon.aps.iva.l40.u) this.G.getValue();
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void w() {
        pi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void w3() {
        zi().setVisibility(8);
        View view = wi().getView();
        if (view != null) {
            view.setVisibility(0);
        }
        oi().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void we(String str) {
        int i2 = NotificationDismissReceiver.a;
        sendBroadcast(NotificationDismissReceiver.a.a(this, str));
    }

    public final ShowPageSeasonPicker wi() {
        Fragment B = getSupportFragmentManager().B(R.id.season_picker);
        com.amazon.aps.iva.yb0.j.d(B, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.seasons.ShowPageSeasonPicker");
        return (ShowPageSeasonPicker) B;
    }

    public final ShowSummaryLayout xi() {
        return (ShowSummaryLayout) this.v.getValue(this, L[11]);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void y1(com.amazon.aps.iva.e20.a aVar) {
        b.a aVar2 = com.amazon.aps.iva.e20.b.e;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        aVar2.getClass();
        b.a.a(aVar, supportFragmentManager);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void y6() {
        ((View) this.y.getValue(this, L[14])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void y7() {
        View findViewById = findViewById(R.id.show_page_hero_empty_space);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.show_page_hero_empty_space_offset);
        ImageView si = si();
        if (si.isLaidOut()) {
            com.amazon.aps.iva.yb0.j.e(findViewById, "space");
            int height = si().getHeight();
            Toolbar toolbar = this.f;
            com.amazon.aps.iva.yb0.j.c(toolbar);
            t0.k(findViewById, null, Integer.valueOf((height - toolbar.getHeight()) - dimensionPixelSize));
            return;
        }
        si.getViewTreeObserver().addOnGlobalLayoutListener(new u(si, findViewById, this, dimensionPixelSize));
    }

    public final SimilarShowsLayout yi() {
        return (SimilarShowsLayout) this.p.getValue(this, L[5]);
    }

    @Override // com.amazon.aps.iva.l40.i1
    public final void z0() {
        Bi(mi(), false);
    }

    public final ViewGroup zi() {
        return (ViewGroup) this.D.getValue(this, L[19]);
    }
}
