package com.crunchyroll.watchscreen.screen.layout;

import android.annotation.SuppressLint;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.g;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.dp.c;
import com.amazon.aps.iva.dp.d;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.h60.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.xa0.f;
import com.amazon.aps.iva.xw.b;
import com.amazon.aps.iva.xw.b0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.cast.overlay.CastOverlayLayout;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.presentation.playerview.PlayerViewLayout;
import com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsLayout;
import com.crunchyroll.watchscreen.screen.loading.WatchScreenLoadingLayout;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
import kotlin.Metadata;
/* compiled from: WatchScreenLayout.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/crunchyroll/watchscreen/screen/layout/WatchScreenLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/dp/d;", "Lcom/crunchyroll/watchscreen/screen/summary/WatchScreenSummaryLayout;", "c", "Lcom/crunchyroll/watchscreen/screen/summary/WatchScreenSummaryLayout;", "getSummary", "()Lcom/crunchyroll/watchscreen/screen/summary/WatchScreenSummaryLayout;", "summary", "Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsLayout;", "d", "Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsLayout;", "getAssetList", "()Lcom/crunchyroll/watchscreen/screen/assets/WatchScreenAssetsLayout;", "assetList", "Lcom/crunchyroll/watchscreen/screen/loading/WatchScreenLoadingLayout;", "e", "Lcom/crunchyroll/watchscreen/screen/loading/WatchScreenLoadingLayout;", "getProgressOverlay", "()Lcom/crunchyroll/watchscreen/screen/loading/WatchScreenLoadingLayout;", "progressOverlay", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "getTransparentProgressOverlay", "()Landroid/widget/FrameLayout;", "transparentProgressOverlay", "g", "getNoNetworkMessageViewContainer", "noNetworkMessageViewContainer", "Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "h", "Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "getPlayerView", "()Lcom/crunchyroll/player/presentation/playerview/PlayerViewLayout;", "playerView", "Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "i", "Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "getCastOverlay", "()Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "castOverlay", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class WatchScreenLayout extends ConstraintLayout implements d {
    public final e b;
    public final WatchScreenSummaryLayout c;
    public final WatchScreenAssetsLayout d;
    public final WatchScreenLoadingLayout e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final PlayerViewLayout h;
    public final CastOverlayLayout i;
    public final c j;

    /* compiled from: WatchScreenLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.h = z;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            f.a(fVar2, false, false, true, false, new com.crunchyroll.watchscreen.screen.layout.a(this.h), 251);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WatchScreenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.dp.d
    public final boolean D() {
        return ((h0) b0.a(this.b.e.getSizeState())).isFullscreen();
    }

    @Override // com.amazon.aps.iva.dp.d
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void D0() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(12);
        }
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void M1() {
        e eVar = this.b;
        FrameLayout frameLayout = eVar.c;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.i = eVar.g.getId();
        bVar.k = eVar.b.getId();
        bVar.t = eVar.g.getId();
        bVar.u = eVar.d.getId();
        frameLayout.setLayoutParams(bVar);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void O1() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(11);
        }
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void S1() {
        e eVar = this.b;
        NestedScrollView nestedScrollView = eVar.f;
        j.e(nestedScrollView, "binding.scrollContainer");
        nestedScrollView.setVisibility(0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        ConstraintLayout constraintLayout = eVar.g;
        bVar.i = constraintLayout.getId();
        bVar.k = eVar.b.getId();
        bVar.s = eVar.d.getId();
        bVar.v = constraintLayout.getId();
        NestedScrollView nestedScrollView2 = eVar.f;
        nestedScrollView2.setLayoutParams(bVar);
        j.e(nestedScrollView2, "binding.scrollContainer");
        t0.h(nestedScrollView2, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.watch_screen_toolbar_height)), null, null, 13);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void S2(boolean z) {
        FrameLayout frameLayout = this.b.c;
        j.e(frameLayout, "binding.playerContainer");
        f1.i(frameLayout, new a(z));
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void T0() {
        NestedScrollView nestedScrollView = this.b.f;
        j.e(nestedScrollView, "binding.scrollContainer");
        nestedScrollView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void f1() {
        Context context = getContext();
        j.e(context, "context");
        int e = com.amazon.aps.iva.xw.q.e(context);
        Context context2 = getContext();
        j.e(context2, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_seekbar_padding_bottom) + ((int) (com.amazon.aps.iva.xw.q.e(context2) * 0.5625d));
        e eVar = this.b;
        FrameLayout frameLayout = eVar.c;
        ConstraintLayout.b bVar = new ConstraintLayout.b(e, dimensionPixelSize);
        bVar.i = eVar.g.getId();
        bVar.t = eVar.g.getId();
        bVar.v = eVar.g.getId();
        frameLayout.setLayoutParams(bVar);
    }

    public final WatchScreenAssetsLayout getAssetList() {
        return this.d;
    }

    public final CastOverlayLayout getCastOverlay() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    public final FrameLayout getNoNetworkMessageViewContainer() {
        return this.g;
    }

    public final PlayerViewLayout getPlayerView() {
        return this.h;
    }

    public final WatchScreenLoadingLayout getProgressOverlay() {
        return this.e;
    }

    public final WatchScreenSummaryLayout getSummary() {
        return this.c;
    }

    public final FrameLayout getTransparentProgressOverlay() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void h1() {
        e eVar = this.b;
        NestedScrollView nestedScrollView = eVar.f;
        j.e(nestedScrollView, "binding.scrollContainer");
        nestedScrollView.setVisibility(0);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.j = eVar.c.getId();
        bVar.k = eVar.b.getId();
        ConstraintLayout constraintLayout = eVar.g;
        bVar.t = constraintLayout.getId();
        bVar.v = constraintLayout.getId();
        NestedScrollView nestedScrollView2 = eVar.f;
        nestedScrollView2.setLayoutParams(bVar);
        j.e(nestedScrollView2, "binding.scrollContainer");
        t0.f(nestedScrollView2, 0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void l1() {
        e eVar = this.b;
        FrameLayout frameLayout = eVar.c;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.i = eVar.g.getId();
        bVar.k = eVar.b.getId();
        bVar.t = eVar.g.getId();
        bVar.v = eVar.g.getId();
        frameLayout.setLayoutParams(bVar);
        FrameLayout frameLayout2 = eVar.c;
        j.e(frameLayout2, "binding.playerContainer");
        frameLayout2.setPadding(0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void m1() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            b.f(a2);
        }
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void o0() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.setRequestedOrientation(2);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j.onConfigurationChanged(configuration);
    }

    @Override // com.amazon.aps.iva.dp.d
    public final void y2() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            b.a(a2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchScreenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_screen_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.assets_error_overlay_container;
        if (((FrameLayout) z.u(R.id.assets_error_overlay_container, inflate)) != null) {
            i2 = R.id.assets_list;
            WatchScreenAssetsLayout watchScreenAssetsLayout = (WatchScreenAssetsLayout) z.u(R.id.assets_list, inflate);
            if (watchScreenAssetsLayout != null) {
                i2 = R.id.cast_mini_container;
                if (((FrameLayout) z.u(R.id.cast_mini_container, inflate)) != null) {
                    i2 = R.id.comments_container;
                    if (((FrameLayout) z.u(R.id.comments_container, inflate)) != null) {
                        i2 = R.id.comments_entry_point;
                        if (z.u(R.id.comments_entry_point, inflate) != null) {
                            i2 = R.id.error_overlay_container;
                            if (((FrameLayout) z.u(R.id.error_overlay_container, inflate)) != null) {
                                i2 = R.id.no_network_message_view;
                                if (((ErrorBottomMessageView) z.u(R.id.no_network_message_view, inflate)) != null) {
                                    i2 = R.id.no_network_message_view_container;
                                    FrameLayout frameLayout = (FrameLayout) z.u(R.id.no_network_message_view_container, inflate);
                                    if (frameLayout != null) {
                                        i2 = R.id.player_container;
                                        FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.player_container, inflate);
                                        if (frameLayout2 != null) {
                                            i2 = R.id.player_landscape_guideline;
                                            Guideline guideline = (Guideline) z.u(R.id.player_landscape_guideline, inflate);
                                            if (guideline != null) {
                                                i2 = R.id.player_view;
                                                PlayerViewLayout playerViewLayout = (PlayerViewLayout) z.u(R.id.player_view, inflate);
                                                if (playerViewLayout != null) {
                                                    i2 = R.id.scroll_container;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) z.u(R.id.scroll_container, inflate);
                                                    if (nestedScrollView != null) {
                                                        i2 = R.id.snackbar_container;
                                                        if (((FrameLayout) z.u(R.id.snackbar_container, inflate)) != null) {
                                                            i2 = R.id.summary;
                                                            WatchScreenSummaryLayout watchScreenSummaryLayout = (WatchScreenSummaryLayout) z.u(R.id.summary, inflate);
                                                            if (watchScreenSummaryLayout != null) {
                                                                i2 = R.id.transparent_progress_overlay;
                                                                FrameLayout frameLayout3 = (FrameLayout) z.u(R.id.transparent_progress_overlay, inflate);
                                                                if (frameLayout3 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                    WatchScreenLoadingLayout watchScreenLoadingLayout = (WatchScreenLoadingLayout) z.u(R.id.watch_screen_progress_overlay, inflate);
                                                                    if (watchScreenLoadingLayout != null) {
                                                                        this.b = new e(constraintLayout, watchScreenAssetsLayout, frameLayout, frameLayout2, guideline, playerViewLayout, nestedScrollView, watchScreenSummaryLayout, frameLayout3, constraintLayout, watchScreenLoadingLayout);
                                                                        this.c = watchScreenSummaryLayout;
                                                                        this.d = watchScreenAssetsLayout;
                                                                        this.e = watchScreenLoadingLayout;
                                                                        this.f = frameLayout3;
                                                                        this.g = frameLayout;
                                                                        this.h = playerViewLayout;
                                                                        this.i = playerViewLayout.getCastOverlayLayout();
                                                                        c cVar = new c(k.n(context), playerViewLayout, new n(new Handler(Looper.getMainLooper())), this);
                                                                        com.ellation.crunchyroll.mvp.lifecycle.a.b(cVar, this);
                                                                        this.j = cVar;
                                                                        return;
                                                                    }
                                                                    i2 = R.id.watch_screen_progress_overlay;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
