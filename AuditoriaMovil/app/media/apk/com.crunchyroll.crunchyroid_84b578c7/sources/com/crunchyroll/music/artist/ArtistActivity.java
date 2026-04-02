package com.crunchyroll.music.artist;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e20.b;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yh.f;
import com.amazon.aps.iva.zh.r;
import com.amazon.aps.iva.zh.s;
import com.amazon.aps.iva.zh.u;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.artist.c;
import com.crunchyroll.music.artist.summary.ArtistSummaryLayout;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.ellation.widgets.FixedAspectRatioImageView;
import com.ellation.widgets.behavior.AppBarLayoutBehavior;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
import com.ellation.widgets.tabs.CustomTabLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ArtistActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/crunchyroll/music/artist/ArtistActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/zh/u;", "Lcom/amazon/aps/iva/gn/e;", "<init>", "()V", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ArtistActivity extends com.amazon.aps.iva.i60.b implements u, com.amazon.aps.iva.gn.e {
    public static final /* synthetic */ int m = 0;
    public final com.amazon.aps.iva.kb0.e k = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, new l(this));
    public final m l = com.amazon.aps.iva.kb0.f.b(new d());

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public a(com.amazon.aps.iva.zh.l lVar) {
            super(0, lVar, com.amazon.aps.iva.zh.l.class, "onSummaryCtaButtonClick", "onSummaryCtaButtonClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.zh.l) this.receiver).S();
            return q.a;
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ CoordinatorLayout c;

        public b(CoordinatorLayout coordinatorLayout, Toolbar toolbar) {
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

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, false, true, false, com.crunchyroll.music.artist.a.h, 251);
            return q.a;
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.zh.j> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.zh.j invoke() {
            com.amazon.aps.iva.l50.a aVar;
            Object obj;
            int i = ArtistActivity.m;
            ArtistActivity artistActivity = ArtistActivity.this;
            Intent intent = artistActivity.getIntent();
            com.amazon.aps.iva.yb0.j.e(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("ARTIST_INPUT", com.amazon.aps.iva.l50.a.class);
                } else {
                    obj = (com.amazon.aps.iva.l50.a) extras.getSerializable("ARTIST_INPUT");
                }
                aVar = (com.amazon.aps.iva.l50.a) obj;
            } else {
                aVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(aVar);
            return new com.amazon.aps.iva.zh.k(artistActivity, aVar);
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            int i = ArtistActivity.m;
            ArtistActivity.this.ni().getPresenter().w1(0);
            return q.a;
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            int i = ArtistActivity.m;
            ArtistActivity.this.ni().getPresenter().w1(1);
            return q.a;
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, q> {
        public static final g h = new g();

        public g() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.crunchyroll.music.artist.b.h, 253);
            return q.a;
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.w70.g {
        public h() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(TabLayout.Tab tab) {
            com.amazon.aps.iva.yb0.j.f(tab, "tab");
            int i = ArtistActivity.m;
            ArtistActivity.this.ni().getPresenter().w1(tab.getPosition());
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class i extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
        public i(com.amazon.aps.iva.zh.l lVar) {
            super(0, lVar, com.amazon.aps.iva.zh.l.class, "onPolicyChanged", "onPolicyChanged()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            ((com.amazon.aps.iva.zh.l) this.receiver).Z0();
            return q.a;
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes.dex */
    public static final class j implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ ArtistActivity d;
        public final /* synthetic */ int e;

        public j(FixedAspectRatioImageView fixedAspectRatioImageView, View view, ArtistActivity artistActivity, int i) {
            this.b = fixedAspectRatioImageView;
            this.c = view;
            this.d = artistActivity;
            this.e = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view2 = this.c;
                com.amazon.aps.iva.yb0.j.e(view2, "space");
                int height = ((FixedAspectRatioImageView) view).getHeight();
                Toolbar toolbar = this.d.f;
                com.amazon.aps.iva.yb0.j.c(toolbar);
                t0.k(view2, null, Integer.valueOf((height - toolbar.getHeight()) - this.e));
            }
        }
    }

    /* compiled from: ArtistActivity.kt */
    /* loaded from: classes.dex */
    public static final class k extends AppBarLayout.Behavior.DragCallback {
        public final /* synthetic */ boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public final boolean canDrag(AppBarLayout appBarLayout) {
            com.amazon.aps.iva.yb0.j.f(appBarLayout, "appBarLayout");
            return this.a;
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vy.a> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.vy.a invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            com.amazon.aps.iva.yb0.j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_artist, (ViewGroup) null, false);
            AppBarLayout appBarLayout = (AppBarLayout) z.u(R.id.app_bar_layout, inflate);
            int i = R.id.artist_bottom_buttons_container;
            LinearLayout linearLayout = (LinearLayout) z.u(R.id.artist_bottom_buttons_container, inflate);
            if (linearLayout != null) {
                View u = z.u(R.id.artist_cover, inflate);
                i = R.id.artist_cta;
                View u2 = z.u(R.id.artist_cta, inflate);
                if (u2 != null) {
                    TextView textView = (TextView) z.u(R.id.artist_cta_text, u2);
                    if (textView != null) {
                        com.amazon.aps.iva.xd.d dVar = new com.amazon.aps.iva.xd.d((LinearLayout) u2, textView, 1);
                        int i2 = R.id.artist_error_fullscreen;
                        View u3 = z.u(R.id.artist_error_fullscreen, inflate);
                        if (u3 != null) {
                            i2 = R.id.artist_image;
                            FixedAspectRatioImageView fixedAspectRatioImageView = (FixedAspectRatioImageView) z.u(R.id.artist_image, inflate);
                            if (fixedAspectRatioImageView != null) {
                                LinearLayout linearLayout2 = (LinearLayout) z.u(R.id.artist_info, inflate);
                                i2 = R.id.artist_single_tab;
                                TextView textView2 = (TextView) z.u(R.id.artist_single_tab, inflate);
                                if (textView2 != null) {
                                    i2 = R.id.artist_summary;
                                    ArtistSummaryLayout artistSummaryLayout = (ArtistSummaryLayout) z.u(R.id.artist_summary, inflate);
                                    if (artistSummaryLayout != null) {
                                        i2 = R.id.artist_tab_container;
                                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.artist_tab_container, inflate);
                                        if (frameLayout != null) {
                                            i2 = R.id.artist_tab_layout;
                                            CustomTabLayout customTabLayout = (CustomTabLayout) z.u(R.id.artist_tab_layout, inflate);
                                            if (customTabLayout != null) {
                                                FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.artist_toolbar_background_solid, inflate);
                                                TextView textView3 = (TextView) z.u(R.id.artist_toolbar_title, inflate);
                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) z.u(R.id.coordinator, inflate);
                                                Guideline guideline = (Guideline) z.u(R.id.dual_pane_guideline, inflate);
                                                i2 = R.id.no_music_videos;
                                                View u4 = z.u(R.id.no_music_videos, inflate);
                                                if (u4 != null) {
                                                    TextView textView4 = (TextView) z.u(R.id.explore_library_cta, u4);
                                                    if (textView4 != null) {
                                                        com.amazon.aps.iva.vy.d dVar2 = new com.amazon.aps.iva.vy.d((LinearLayout) u4, textView4);
                                                        i2 = R.id.no_network_message_view;
                                                        if (((ErrorBottomMessageView) z.u(R.id.no_network_message_view, inflate)) != null) {
                                                            i2 = R.id.no_network_message_view_container;
                                                            FrameLayout frameLayout3 = (FrameLayout) z.u(R.id.no_network_message_view_container, inflate);
                                                            if (frameLayout3 != null) {
                                                                i2 = R.id.progress_overlay;
                                                                View u5 = z.u(R.id.progress_overlay, inflate);
                                                                if (u5 != null) {
                                                                    RelativeLayout relativeLayout = (RelativeLayout) u5;
                                                                    com.amazon.aps.iva.vf.a aVar = new com.amazon.aps.iva.vf.a(relativeLayout, relativeLayout, 1);
                                                                    int i3 = R.id.snackbar_container;
                                                                    if (((FrameLayout) z.u(R.id.snackbar_container, inflate)) != null) {
                                                                        i3 = R.id.toolbar;
                                                                        if (((Toolbar) z.u(R.id.toolbar, inflate)) != null) {
                                                                            FrameLayout frameLayout4 = (FrameLayout) z.u(R.id.toolbar_container, inflate);
                                                                            i3 = R.id.videos_concerts_list;
                                                                            RecyclerView recyclerView = (RecyclerView) z.u(R.id.videos_concerts_list, inflate);
                                                                            if (recyclerView != null) {
                                                                                return new com.amazon.aps.iva.vy.a((ConstraintLayout) inflate, appBarLayout, linearLayout, u, dVar, u3, fixedAspectRatioImageView, textView2, artistSummaryLayout, frameLayout, customTabLayout, frameLayout2, textView3, dVar2, frameLayout3, aVar, recyclerView);
                                                                            }
                                                                        }
                                                                    }
                                                                    i = i3;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        throw new NullPointerException("Missing required view with ID: ".concat(u4.getResources().getResourceName(R.id.explore_library_cta)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i = i2;
                    } else {
                        throw new NullPointerException("Missing required view with ID: ".concat(u2.getResources().getResourceName(R.id.artist_cta_text)));
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void C1(com.amazon.aps.iva.l50.c cVar) {
        com.amazon.aps.iva.hi.a aVar = f.a.b;
        if (aVar != null) {
            aVar.d(this, cVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("watchMusicScreenRouter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final boolean E() {
        return getResources().getBoolean(R.bool.artist_is_dual_pane);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void G1() {
        AppBarLayout appBarLayout = mi().b;
        if (appBarLayout != null) {
            oi(appBarLayout, true);
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void K() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().p.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void M6() {
        ViewGroup.LayoutParams layoutParams;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);
        Toolbar toolbar = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar);
        if (toolbar.isLaidOut()) {
            com.amazon.aps.iva.yb0.j.e(coordinatorLayout, "coordinator");
            t0.j(coordinatorLayout, null, Integer.valueOf(toolbar.getHeight()), null, null, 13);
        } else {
            toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new b(coordinatorLayout, toolbar));
        }
        Toolbar toolbar2 = this.f;
        com.amazon.aps.iva.yb0.j.c(toolbar2);
        f1.i(toolbar2, c.h);
        AppBarLayout appBarLayout = mi().b;
        if (appBarLayout != null) {
            layoutParams = appBarLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        com.amazon.aps.iva.yb0.j.d(cVar, "null cannot be cast to non-null type com.ellation.widgets.behavior.AppBarLayoutBehavior");
        com.amazon.aps.iva.vy.a mi = mi();
        com.amazon.aps.iva.yb0.j.e(mi, "binding");
        ((AppBarLayoutBehavior) cVar).b = new s(mi);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void M8() {
        mi().h.setText(R.string.artist_tab_music_videos);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void N() {
        RelativeLayout relativeLayout = (RelativeLayout) mi().p.b;
        com.amazon.aps.iva.yb0.j.e(relativeLayout, "binding.progressOverlay.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void Q0() {
        View view = mi().f;
        com.amazon.aps.iva.yb0.j.e(view, "binding.artistErrorFullscreen");
        view.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        startActivity(com.amazon.aps.iva.gd0.j.i(this, str));
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void Th() {
        RecyclerView recyclerView = mi().q;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.videosConcertsList");
        recyclerView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void X0(com.amazon.aps.iva.xb0.a<q> aVar) {
        View view = mi().f;
        com.amazon.aps.iva.yb0.j.e(view, "binding.artistErrorFullscreen");
        view.setVisibility(0);
        View view2 = mi().f;
        com.amazon.aps.iva.yb0.j.e(view2, "binding.artistErrorFullscreen");
        ((TextView) view2.findViewById(R.id.retry_text)).setOnClickListener(new com.amazon.aps.iva.zh.a(0, aVar));
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void Zf() {
        View findViewById = mi().i.findViewById(R.id.artist_hero_empty_space);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.artist_empty_space_offset);
        FixedAspectRatioImageView fixedAspectRatioImageView = mi().g;
        if (fixedAspectRatioImageView.isLaidOut()) {
            com.amazon.aps.iva.yb0.j.e(findViewById, "space");
            int height = fixedAspectRatioImageView.getHeight();
            Toolbar toolbar = this.f;
            com.amazon.aps.iva.yb0.j.c(toolbar);
            t0.k(findViewById, null, Integer.valueOf((height - toolbar.getHeight()) - dimensionPixelSize));
            return;
        }
        fixedAspectRatioImageView.getViewTreeObserver().addOnGlobalLayoutListener(new j(fixedAspectRatioImageView, findViewById, this, dimensionPixelSize));
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void c1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        TextView textView = mi().m;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void cf() {
        View findViewById = mi().i.findViewById(R.id.artist_hero_empty_space);
        com.amazon.aps.iva.yb0.j.e(findViewById, "binding.artistSummary.fi….artist_hero_empty_space)");
        t0.k(findViewById, null, 0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void da() {
        LinearLayout linearLayout = mi().c;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.artistBottomButtonsContainer");
        linearLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void e6() {
        TextView textView = mi().n.b;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.noMusicVideos.exploreLibraryCta");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void f7(com.amazon.aps.iva.ai.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "summary");
        mi().i.b1(aVar, new a(ni().getPresenter()));
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void g8() {
        TextView textView = mi().h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.artistSingleTab");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void gd(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "images");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        FixedAspectRatioImageView fixedAspectRatioImageView = mi().g;
        com.amazon.aps.iva.yb0.j.e(fixedAspectRatioImageView, "binding.artistImage");
        com.amazon.aps.iva.ly.c.c(imageUtil, this, list, fixedAspectRatioImageView, R.color.cr_light_blue);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void k7() {
        com.amazon.aps.iva.yh.i iVar = f.a.a;
        if (iVar != null) {
            iVar.d(this);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void lb() {
        LinearLayout linearLayout = mi().n.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.noMusicVideos.root");
        linearLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void m4() {
        TextView textView = mi().n.b;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.noMusicVideos.exploreLibraryCta");
        textView.setVisibility(0);
    }

    public final com.amazon.aps.iva.vy.a mi() {
        return (com.amazon.aps.iva.vy.a) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void n6(int i2, r rVar) {
        com.amazon.aps.iva.xd.d dVar = mi().e;
        ((TextView) dVar.c).setText(i2);
        ((LinearLayout) dVar.b).setOnClickListener(new com.amazon.aps.iva.c8.k(rVar, 3));
    }

    public final com.amazon.aps.iva.zh.j ni() {
        return (com.amazon.aps.iva.zh.j) this.l.getValue();
    }

    public final void oi(AppBarLayout appBarLayout, boolean z) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        com.amazon.aps.iva.yb0.j.d(cVar, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
        ((AppBarLayout.Behavior) cVar).setDragCallback(new k(z));
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        CustomTabLayout customTabLayout = mi().k;
        com.amazon.aps.iva.w70.a[] aVarArr = (com.amazon.aps.iva.w70.a[]) o.O(new com.amazon.aps.iva.w70.a[]{new c.b(this, new e()), new c.a(this, new f())}).toArray(new com.amazon.aps.iva.w70.a[0]);
        customTabLayout.b1((com.amazon.aps.iva.w70.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        FrameLayout frameLayout = mi().o;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.noNetworkMessageViewContainer");
        f1.i(frameLayout, g.h);
        mi().k.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new h());
        mi().q.addItemDecoration(com.amazon.aps.iva.ci.f.a);
        mi().q.setLayoutManager(new GridLayoutManager(this, getResources().getInteger(R.integer.music_list_span_count)));
        mi().q.setAdapter(ni().a());
        mi().n.b.setOnClickListener(new com.amazon.aps.iva.c8.j(this, 4));
        com.amazon.aps.iva.yh.i iVar = f.a.a;
        if (iVar != null) {
            iVar.e(this, new i(ni().getPresenter()));
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        com.amazon.aps.iva.yb0.j.f(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_artist, menu);
        return true;
    }

    @Override // com.amazon.aps.iva.i60.b, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        com.amazon.aps.iva.yb0.j.f(menuItem, "item");
        if (menuItem.getItemId() == R.id.menu_item_share) {
            ni().getPresenter().D2();
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        com.amazon.aps.iva.yb0.j.f(assistContent, "outContent");
        super.onProvideAssistContent(assistContent);
        ni().getPresenter().p(new com.amazon.aps.iva.gn.a(assistContent));
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void qd() {
        TextView textView = mi().h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.artistSingleTab");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void s1() {
        FrameLayout frameLayout = mi().j;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.artistTabContainer");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ni().getPresenter());
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void ta() {
        mi().h.setText(R.string.artist_tab_concerts);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void tf() {
        LinearLayout linearLayout = mi().n.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.noMusicVideos.root");
        linearLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void v2() {
        FrameLayout frameLayout = mi().j;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.artistTabContainer");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void y1(com.amazon.aps.iva.e20.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "details");
        b.a aVar2 = com.amazon.aps.iva.e20.b.e;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "supportFragmentManager");
        aVar2.getClass();
        b.a.a(aVar, supportFragmentManager);
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void z0() {
        AppBarLayout appBarLayout = mi().b;
        if (appBarLayout != null) {
            oi(appBarLayout, false);
        }
    }

    @Override // com.amazon.aps.iva.zh.u
    public final void z6(List<com.amazon.aps.iva.ci.h> list) {
        com.amazon.aps.iva.yb0.j.f(list, "list");
        ni().a().e(list);
    }
}
