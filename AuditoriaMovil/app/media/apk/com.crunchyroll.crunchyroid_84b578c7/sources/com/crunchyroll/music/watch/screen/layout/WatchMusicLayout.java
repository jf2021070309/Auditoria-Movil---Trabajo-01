package com.crunchyroll.music.watch.screen.layout;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.xa0.f;
import com.amazon.aps.iva.xw.b0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.presentation.playerview.PlayerViewLayout;
import kotlin.Metadata;
/* compiled from: WatchMusicLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/crunchyroll/music/watch/screen/layout/WatchMusicLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/oi/c;", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "getAssetList", "()Landroidx/recyclerview/widget/RecyclerView;", "assetList", "Landroid/widget/FrameLayout;", "d", "Landroid/widget/FrameLayout;", "getAssetsError", "()Landroid/widget/FrameLayout;", "assetsError", "Landroid/widget/RelativeLayout;", "e", "Landroid/widget/RelativeLayout;", "getAssetsProgress", "()Landroid/widget/RelativeLayout;", "assetsProgress", "Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "f", "Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "getPlayer", "()Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "player", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WatchMusicLayout extends ConstraintLayout implements com.amazon.aps.iva.oi.c {
    public final com.amazon.aps.iva.ah.a b;
    public final RecyclerView c;
    public final FrameLayout d;
    public final RelativeLayout e;
    public final PlayerViewLayout f;
    public final com.amazon.aps.iva.oi.b g;

    /* compiled from: WatchMusicLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            f.a(fVar2, false, false, false, true, com.crunchyroll.music.watch.screen.layout.a.h, 223);
            return q.a;
        }
    }

    /* compiled from: WatchMusicLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            f.a(fVar2, false, false, true, false, com.crunchyroll.music.watch.screen.layout.b.h, 251);
            return q.a;
        }
    }

    /* compiled from: WatchMusicLayout.kt */
    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            f.a(fVar2, false, false, true, false, com.crunchyroll.music.watch.screen.layout.c.h, 251);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchMusicLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.oi.c
    public final boolean D() {
        return ((h0) b0.a(((PlayerViewLayout) this.b.e).getSizeState())).isFullscreen();
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void D0() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(12);
        }
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void Jd() {
        PlayerViewLayout playerViewLayout = (PlayerViewLayout) this.b.e;
        j.e(playerViewLayout, "binding.playerView");
        f1.i(playerViewLayout, a.h);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void M1() {
        com.amazon.aps.iva.ah.a aVar = this.b;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        View view = aVar.h;
        bVar.i = ((ConstraintLayout) view).getId();
        bVar.l = ((ConstraintLayout) view).getId();
        bVar.t = ((ConstraintLayout) view).getId();
        bVar.u = ((Guideline) aVar.d).getId();
        ((PlayerViewLayout) aVar.e).setLayoutParams(bVar);
        PlayerViewLayout playerViewLayout = (PlayerViewLayout) aVar.e;
        j.e(playerViewLayout, "binding.playerView");
        f1.i(playerViewLayout, c.h);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void O1() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(11);
        }
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void S1() {
        com.amazon.aps.iva.ah.a aVar = this.b;
        RecyclerView recyclerView = (RecyclerView) aVar.g;
        j.e(recyclerView, "binding.watchMusicAssetsList");
        recyclerView.setVisibility(0);
        View view = aVar.g;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        View view2 = aVar.h;
        bVar.i = ((ConstraintLayout) view2).getId();
        bVar.l = ((ConstraintLayout) view2).getId();
        bVar.s = ((Guideline) aVar.d).getId();
        bVar.v = ((ConstraintLayout) view2).getId();
        ((RecyclerView) view).setLayoutParams(bVar);
        RecyclerView recyclerView2 = (RecyclerView) view;
        j.e(recyclerView2, "binding.watchMusicAssetsList");
        t0.h(recyclerView2, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.watch_music_toolbar_height)), null, null, 13);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void T0() {
        RecyclerView recyclerView = (RecyclerView) this.b.g;
        j.e(recyclerView, "binding.watchMusicAssetsList");
        recyclerView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void f1() {
        Context context = getContext();
        j.e(context, "context");
        int e = com.amazon.aps.iva.xw.q.e(context);
        Context context2 = getContext();
        j.e(context2, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_seekbar_padding_bottom) + ((int) (com.amazon.aps.iva.xw.q.e(context2) * 0.5625d));
        com.amazon.aps.iva.ah.a aVar = this.b;
        ConstraintLayout.b bVar = new ConstraintLayout.b(e, dimensionPixelSize);
        View view = aVar.h;
        bVar.i = ((ConstraintLayout) view).getId();
        bVar.t = ((ConstraintLayout) view).getId();
        bVar.v = ((ConstraintLayout) view).getId();
        ((PlayerViewLayout) aVar.e).setLayoutParams(bVar);
        PlayerViewLayout playerViewLayout = (PlayerViewLayout) aVar.e;
        j.e(playerViewLayout, "binding.playerView");
        f1.i(playerViewLayout, b.h);
    }

    public final RecyclerView getAssetList() {
        return this.c;
    }

    public final FrameLayout getAssetsError() {
        return this.d;
    }

    public final RelativeLayout getAssetsProgress() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    public final PlayerViewLayout getPlayer() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void h1() {
        com.amazon.aps.iva.ah.a aVar = this.b;
        RecyclerView recyclerView = (RecyclerView) aVar.g;
        j.e(recyclerView, "binding.watchMusicAssetsList");
        recyclerView.setVisibility(0);
        View view = aVar.g;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.j = ((PlayerViewLayout) aVar.e).getId();
        View view2 = aVar.h;
        bVar.l = ((ConstraintLayout) view2).getId();
        bVar.t = ((ConstraintLayout) view2).getId();
        bVar.v = ((ConstraintLayout) view2).getId();
        ((RecyclerView) view).setLayoutParams(bVar);
        RecyclerView recyclerView2 = (RecyclerView) view;
        j.e(recyclerView2, "binding.watchMusicAssetsList");
        t0.f(recyclerView2, 0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void l1() {
        com.amazon.aps.iva.ah.a aVar = this.b;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.i = ((ConstraintLayout) aVar.h).getId();
        bVar.l = ((ConstraintLayout) aVar.h).getId();
        bVar.t = ((ConstraintLayout) aVar.h).getId();
        bVar.v = ((ConstraintLayout) aVar.h).getId();
        ((PlayerViewLayout) aVar.e).setLayoutParams(bVar);
        PlayerViewLayout playerViewLayout = (PlayerViewLayout) aVar.e;
        j.e(playerViewLayout, "binding.playerView");
        playerViewLayout.setPadding(0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void m1() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            com.amazon.aps.iva.xw.b.f(a2);
        }
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void o0() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(2);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.onConfigurationChanged(configuration);
    }

    @Override // com.amazon.aps.iva.oi.c
    public final void y2() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            com.amazon.aps.iva.xw.b.a(a2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchMusicLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_music_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.assets_error_overlay_container;
        FrameLayout frameLayout = (FrameLayout) z.u(R.id.assets_error_overlay_container, inflate);
        if (frameLayout != null) {
            i2 = R.id.assets_progress_overlay;
            View u = z.u(R.id.assets_progress_overlay, inflate);
            if (u != null) {
                RelativeLayout relativeLayout = (RelativeLayout) u;
                com.amazon.aps.iva.vf.a aVar = new com.amazon.aps.iva.vf.a(relativeLayout, relativeLayout, 1);
                int i3 = R.id.landscape_player_guideline;
                Guideline guideline = (Guideline) z.u(R.id.landscape_player_guideline, inflate);
                if (guideline != null) {
                    i3 = R.id.player_view;
                    PlayerViewLayout playerViewLayout = (PlayerViewLayout) z.u(R.id.player_view, inflate);
                    if (playerViewLayout != null) {
                        i3 = R.id.snackbar_container;
                        FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.snackbar_container, inflate);
                        if (frameLayout2 != null) {
                            i3 = R.id.watch_music_assets_list;
                            RecyclerView recyclerView = (RecyclerView) z.u(R.id.watch_music_assets_list, inflate);
                            if (recyclerView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                this.b = new com.amazon.aps.iva.ah.a(constraintLayout, frameLayout, aVar, guideline, playerViewLayout, frameLayout2, recyclerView, constraintLayout);
                                this.c = recyclerView;
                                this.d = frameLayout;
                                this.e = relativeLayout;
                                this.f = playerViewLayout;
                                com.amazon.aps.iva.oi.b bVar = new com.amazon.aps.iva.oi.b(k.n(context), playerViewLayout, new n(new Handler(Looper.getMainLooper())), this);
                                com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar, this);
                                this.g = bVar;
                                return;
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
