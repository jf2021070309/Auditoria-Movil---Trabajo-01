package com.crunchyroll.player.presentation.playerview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.cl.f;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.el.a0;
import com.amazon.aps.iva.el.b0;
import com.amazon.aps.iva.el.d0;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.el.i;
import com.amazon.aps.iva.el.j0;
import com.amazon.aps.iva.el.k0;
import com.amazon.aps.iva.el.o;
import com.amazon.aps.iva.el.p0;
import com.amazon.aps.iva.el.s;
import com.amazon.aps.iva.el.t;
import com.amazon.aps.iva.el.u;
import com.amazon.aps.iva.el.w;
import com.amazon.aps.iva.el.x;
import com.amazon.aps.iva.el.y;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.hl.c0;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.jl.g;
import com.amazon.aps.iva.jl.j;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kl.r;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.cast.overlay.CastOverlayLayout;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.octopussubtitlescomponent.renderrer.OctopusSubtitlesView;
import com.crunchyroll.player.presentation.buffering.PlayerBufferingLayout;
import com.crunchyroll.player.presentation.controls.PlayerControlsLayout;
import com.crunchyroll.player.presentation.controls.maturityrestrictionlabel.PlayerMaturityLabelLayout;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
import com.crunchyroll.player.presentation.controls.toolbar.PlayerToolbar;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.toolbarmenu.MenuButtonData;
import com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuContentFactory;
import com.ellation.crunchyroll.ui.toolbarmenu.dialog.ToolbarMenuDialog;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import kotlin.Metadata;
/* compiled from: InternalPlayerViewLayout.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010%\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060&0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060&0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010$R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/crunchyroll/player/presentation/playerview/InternalPlayerViewLayout;", "Landroidx/media3/ui/d;", "Lcom/amazon/aps/iva/el/a;", "Lcom/amazon/aps/iva/jl/j;", "Lcom/amazon/aps/iva/cl/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/aps/iva/kb0/q;", "setToolbarListener", "Lcom/amazon/aps/iva/el/p0;", "F", "Lcom/amazon/aps/iva/ez/a;", "getViewModel", "()Lcom/amazon/aps/iva/el/p0;", "viewModel", "Lcom/amazon/aps/iva/dl/d;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "getControlsVisibilityViewModel", "()Lcom/amazon/aps/iva/dl/d;", "controlsVisibilityViewModel", "Lcom/amazon/aps/iva/kl/r;", "H", "getUpNextBannerViewModel", "()Lcom/amazon/aps/iva/kl/r;", "upNextBannerViewModel", "Lcom/amazon/aps/iva/jl/g;", "J", "Lcom/amazon/aps/iva/kb0/e;", "getStreamOverCellularPresenter", "()Lcom/amazon/aps/iva/jl/g;", "streamOverCellularPresenter", "Lcom/amazon/aps/iva/i5/v;", "Lcom/amazon/aps/iva/el/h0;", "kotlin.jvm.PlatformType", "M", "Lcom/amazon/aps/iva/i5/v;", "getSizeState", "()Lcom/amazon/aps/iva/i5/v;", "sizeState", "Lcom/amazon/aps/iva/ez/d;", "N", "getFullScreenToggledEvent", "fullScreenToggledEvent", "O", "getExitFullscreenByTapEvent", "exitFullscreenByTapEvent", "Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "getCastOverlayLayout", "()Lcom/crunchyroll/cast/overlay/CastOverlayLayout;", "castOverlayLayout", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "player_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor", "UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class InternalPlayerViewLayout extends androidx.media3.ui.d implements com.amazon.aps.iva.el.a, j {
    public static final /* synthetic */ l<Object>[] P = {q.a(InternalPlayerViewLayout.class, "viewModel", "getViewModel()Lcom/crunchyroll/player/presentation/playerview/PlayerViewViewModelImpl;", 0), q.a(InternalPlayerViewLayout.class, "controlsVisibilityViewModel", "getControlsVisibilityViewModel()Lcom/crunchyroll/player/presentation/controls/visibility/ControlsVisibilityViewModelImpl;", 0), q.a(InternalPlayerViewLayout.class, "upNextBannerViewModel", "getUpNextBannerViewModel()Lcom/crunchyroll/player/presentation/upnext/banner/UpNextBannerViewModelImpl;", 0)};
    public final com.amazon.aps.iva.mj.b A;
    public e B;
    public f C;
    public b0 D;
    public v<MenuButtonData> E;
    public final com.amazon.aps.iva.ez.a F;
    public final com.amazon.aps.iva.ez.a G;
    public final com.amazon.aps.iva.ez.a H;
    public final j0 I;
    public final m J;
    public final c0 K;
    public final com.amazon.aps.iva.dl.a L;
    public final v<h0> M;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> N;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> O;

    /* compiled from: InternalPlayerViewLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
        public final /* synthetic */ MotionEvent i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MotionEvent motionEvent) {
            super(0);
            this.i = motionEvent;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(InternalPlayerViewLayout.super.dispatchTouchEvent(this.i));
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ InternalPlayerViewLayout c;

        public b(PlayerToolbar playerToolbar, InternalPlayerViewLayout internalPlayerViewLayout) {
            this.b = playerToolbar;
            this.c = internalPlayerViewLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            PlayerToolbar playerToolbar = (PlayerToolbar) view;
            v<MenuButtonData> vVar = this.c.E;
            if (vVar != null) {
                ImageView imageView = playerToolbar.getBinding().b;
                com.amazon.aps.iva.yb0.j.e(imageView, "binding.buttonSettings");
                Rect rect = new Rect();
                imageView.getGlobalVisibleRect(rect);
                vVar.k(new MenuButtonData(R.drawable.ic_player_settings, rect));
            }
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: InternalPlayerViewLayout.kt */
    /* loaded from: classes2.dex */
    public static final class c implements com.amazon.aps.iva.cl.b {
        public final /* synthetic */ com.amazon.aps.iva.cl.b b;
        public final /* synthetic */ com.amazon.aps.iva.cl.b c;
        public final /* synthetic */ InternalPlayerViewLayout d;

        public c(com.amazon.aps.iva.cl.b bVar, InternalPlayerViewLayout internalPlayerViewLayout) {
            this.c = bVar;
            this.d = internalPlayerViewLayout;
            this.b = bVar;
        }

        @Override // com.amazon.aps.iva.cl.b
        public final void E0() {
            this.c.E0();
        }

        @Override // com.amazon.aps.iva.cl.b
        public final void f1() {
            this.d.I.q6();
        }

        @Override // com.amazon.aps.iva.cl.b
        public final void h0() {
            this.d.I.getView().lh();
        }
    }

    /* compiled from: InternalPlayerViewLayout.kt */
    /* loaded from: classes2.dex */
    public static final class d implements ToolbarMenuContentFactory {
        @Override // com.ellation.crunchyroll.ui.toolbarmenu.ToolbarMenuContentFactory
        public final Fragment createMenuContentFragment() {
            com.amazon.aps.iva.ll.c.q.getClass();
            return new com.amazon.aps.iva.ll.c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPlayerViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.xe0.d i = z.i(com.amazon.aps.iva.wu.b.c);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_internal_player, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.cast_overlay;
        CastOverlayLayout castOverlayLayout = (CastOverlayLayout) z.u(R.id.cast_overlay, inflate);
        if (castOverlayLayout != null) {
            i2 = R.id.controls;
            PlayerControlsLayout playerControlsLayout = (PlayerControlsLayout) z.u(R.id.controls, inflate);
            if (playerControlsLayout != null) {
                i2 = R.id.gestures_layout;
                PlayerGesturesLayout playerGesturesLayout = (PlayerGesturesLayout) z.u(R.id.gestures_layout, inflate);
                if (playerGesturesLayout != null) {
                    i2 = R.id.player_buffering_layout;
                    PlayerBufferingLayout playerBufferingLayout = (PlayerBufferingLayout) z.u(R.id.player_buffering_layout, inflate);
                    if (playerBufferingLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        i2 = R.id.player_maturity_label;
                        PlayerMaturityLabelLayout playerMaturityLabelLayout = (PlayerMaturityLabelLayout) z.u(R.id.player_maturity_label, inflate);
                        if (playerMaturityLabelLayout != null) {
                            i2 = R.id.player_toolbar;
                            PlayerToolbar playerToolbar = (PlayerToolbar) z.u(R.id.player_toolbar, inflate);
                            if (playerToolbar != null) {
                                i2 = R.id.player_up_next_banner;
                                ComposeView composeView = (ComposeView) z.u(R.id.player_up_next_banner, inflate);
                                if (composeView != null) {
                                    i2 = R.id.restriction_overlay;
                                    ComposeView composeView2 = (ComposeView) z.u(R.id.restriction_overlay, inflate);
                                    if (composeView2 != null) {
                                        i2 = R.id.subtitles_renderer;
                                        OctopusSubtitlesView octopusSubtitlesView = (OctopusSubtitlesView) z.u(R.id.subtitles_renderer, inflate);
                                        if (octopusSubtitlesView != null) {
                                            i2 = R.id.truex_ad_overlay;
                                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.truex_ad_overlay, inflate);
                                            if (frameLayout2 != null) {
                                                this.A = new com.amazon.aps.iva.mj.b(frameLayout, castOverlayLayout, playerControlsLayout, playerGesturesLayout, playerBufferingLayout, playerMaturityLabelLayout, playerToolbar, composeView, composeView2, octopusSubtitlesView, frameLayout2);
                                                Activity a2 = com.amazon.aps.iva.xw.q.a(context);
                                                com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                                this.F = new com.amazon.aps.iva.ez.a(p0.class, new u((h) a2), new a0(this));
                                                Activity a3 = com.amazon.aps.iva.xw.q.a(context);
                                                com.amazon.aps.iva.yb0.j.d(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                                this.G = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.dl.d.class, new com.amazon.aps.iva.el.v((h) a3), t.h);
                                                Activity a4 = com.amazon.aps.iva.xw.q.a(context);
                                                com.amazon.aps.iva.yb0.j.d(a4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                                this.H = new com.amazon.aps.iva.ez.a(r.class, new w((h) a4), new y(this, context));
                                                p0 viewModel = getViewModel();
                                                com.amazon.aps.iva.cj.h hVar = n.e;
                                                if (hVar != null) {
                                                    com.amazon.aps.iva.rv.e n = k.n(context);
                                                    com.amazon.aps.iva.cj.k kVar = n.d;
                                                    if (kVar != null) {
                                                        Activity a5 = com.amazon.aps.iva.xw.q.a(context);
                                                        com.amazon.aps.iva.yb0.j.d(a5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                                        com.amazon.aps.iva.nx.b f = kVar.f((h) a5);
                                                        com.amazon.aps.iva.dj.f.a.getClass();
                                                        com.amazon.aps.iva.vk.b bVar = f.a.b.b;
                                                        com.amazon.aps.iva.yb0.j.f(viewModel, "viewModel");
                                                        com.amazon.aps.iva.yb0.j.f(f, "settingsRouter");
                                                        com.amazon.aps.iva.yb0.j.f(bVar, "playerControlsAnalytics");
                                                        this.I = new j0(this, viewModel, hVar, n, f, bVar);
                                                        this.J = com.amazon.aps.iva.kb0.f.b(new x(this));
                                                        p0 viewModel2 = getViewModel();
                                                        com.amazon.aps.iva.yb0.j.f(viewModel2, "fullScreenStateDataProvider");
                                                        c0 c0Var = new c0(context, viewModel2);
                                                        this.K = c0Var;
                                                        com.amazon.aps.iva.dl.d controlsVisibilityViewModel = getControlsVisibilityViewModel();
                                                        com.amazon.aps.iva.gl.c tapToSeekController = playerGesturesLayout.getTapToSeekController();
                                                        com.amazon.aps.iva.yb0.j.f(controlsVisibilityViewModel, "viewModel");
                                                        com.amazon.aps.iva.yb0.j.f(tapToSeekController, "playerGesturesHandler");
                                                        this.L = new com.amazon.aps.iva.dl.a(this, controlsVisibilityViewModel, tapToSeekController);
                                                        this.M = getViewModel().b;
                                                        this.N = getViewModel().d;
                                                        this.O = getViewModel().c;
                                                        setClipChildren(false);
                                                        setUseController(false);
                                                        setShowBuffering(0);
                                                        com.amazon.aps.iva.cj.h hVar2 = n.e;
                                                        if (hVar2 != null) {
                                                            hVar2.j(octopusSubtitlesView);
                                                            c0Var.c.b(new com.amazon.aps.iva.el.d(c0Var.b));
                                                            composeView2.setContent(com.amazon.aps.iva.v0.b.c(1200893495, new com.amazon.aps.iva.el.h(this), true));
                                                            composeView.setContent(com.amazon.aps.iva.v0.b.c(1465754208, new i(this), true));
                                                            playerControlsLayout.setupVisibilityCallbacks(getControlsVisibilityViewModel());
                                                            f1.i(playerToolbar, com.amazon.aps.iva.el.k.h);
                                                            f1.i(playerControlsLayout.getControlsContainer(), com.amazon.aps.iva.el.m.h);
                                                            f1.i(composeView, o.h);
                                                            f1.i(playerBufferingLayout, com.amazon.aps.iva.el.q.h);
                                                            playerGesturesLayout.U2(getViewModel(), this);
                                                            playerToolbar.getBinding().i.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 5));
                                                            com.amazon.aps.iva.se0.i.d(i, null, null, new s(this, null), 3);
                                                            return;
                                                        }
                                                        com.amazon.aps.iva.yb0.j.m("player");
                                                        throw null;
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("dependencies");
                                                    throw null;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("player");
                                                throw null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.dl.d getControlsVisibilityViewModel() {
        return (com.amazon.aps.iva.dl.d) this.G.getValue(this, P[1]);
    }

    private final g getStreamOverCellularPresenter() {
        return (g) this.J.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r getUpNextBannerViewModel() {
        return (r) this.H.getValue(this, P[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p0 getViewModel() {
        return (p0) this.F.getValue(this, P[0]);
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void F1() {
        this.I.q6();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void J5(boolean z, v<MenuButtonData> vVar, com.amazon.aps.iva.cl.f fVar, b0 b0Var) {
        com.amazon.aps.iva.yb0.j.f(vVar, "buttonDataProviderLiveData");
        com.amazon.aps.iva.yb0.j.f(b0Var, "backButtonClickListener");
        PlayerToolbar playerToolbar = this.A.e;
        p0 viewModel = getViewModel();
        playerToolbar.getClass();
        com.amazon.aps.iva.yb0.j.f(viewModel, "playerToolbarDataProvider");
        com.amazon.aps.iva.dj.f.a.getClass();
        com.amazon.aps.iva.vk.b bVar = f.a.b.b;
        com.amazon.aps.iva.yb0.j.f(bVar, "analytics");
        com.amazon.aps.iva.cl.c cVar = new com.amazon.aps.iva.cl.c(playerToolbar, z, viewModel, bVar);
        playerToolbar.b = cVar;
        com.ellation.crunchyroll.mvp.lifecycle.a.b(cVar, playerToolbar);
        com.amazon.aps.iva.mj.j jVar = playerToolbar.c;
        jVar.c.setOnClickListener(new com.amazon.aps.iva.c8.r(playerToolbar, 3));
        jVar.d.setOnClickListener(new com.amazon.aps.iva.c8.s(playerToolbar, 6));
        jVar.b.setOnClickListener(new com.amazon.aps.iva.c8.e(playerToolbar, 5));
        this.E = vVar;
        this.C = fVar;
        this.D = b0Var;
    }

    @Override // com.amazon.aps.iva.el.a
    public final void Jf(com.amazon.aps.iva.cj.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "player");
        OctopusSubtitlesView octopusSubtitlesView = this.A.f;
        com.amazon.aps.iva.yb0.j.e(octopusSubtitlesView, "binding.subtitlesRenderer");
        hVar.j(octopusSubtitlesView);
    }

    @Override // com.amazon.aps.iva.el.a
    public final void K2(com.amazon.aps.iva.cj.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "player");
        FrameLayout frameLayout = this.A.g;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.truexAdOverlay");
        hVar.f(frameLayout);
    }

    @Override // com.amazon.aps.iva.el.i0
    public final boolean Ye() {
        k0 k0Var = this.I.b;
        if (((h0) com.amazon.aps.iva.xw.b0.a(k0Var.getSizeState())).isFullscreen()) {
            k0Var.v8();
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void Z1(LabelUiModel labelUiModel) {
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        this.A.d.U2(labelUiModel);
    }

    @Override // com.amazon.aps.iva.el.a
    public final void bc(com.amazon.aps.iva.cj.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "player");
        hVar.h(this);
    }

    @Override // com.amazon.aps.iva.dl.b
    public final void c9() {
        com.amazon.aps.iva.mj.b bVar = this.A;
        PlayerToolbar playerToolbar = bVar.e;
        com.amazon.aps.iva.yb0.j.e(playerToolbar, "binding.playerToolbar");
        View[] viewArr = {playerToolbar};
        for (View view : viewArr) {
            view.clearAnimation();
        }
        for (View view2 : viewArr) {
            view2.animate().alpha(1.0f).setDuration(300L).withStartAction(new com.amazon.aps.iva.m6.e(view2, 7)).setInterpolator(new DecelerateInterpolator()).start();
        }
        com.amazon.aps.iva.mj.h hVar = bVar.c.b;
        View view3 = (View) hVar.f;
        com.amazon.aps.iva.yb0.j.e(view3, "binding.controlsBackground");
        PlayerTimelineLayout playerTimelineLayout = (PlayerTimelineLayout) hVar.i;
        com.amazon.aps.iva.yb0.j.e(playerTimelineLayout, "binding.timeline");
        LinearLayout linearLayout = (LinearLayout) ((com.amazon.aps.iva.mj.g) hVar.e).c;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.centerVideoControls.root");
        ComposeView composeView = (ComposeView) hVar.h;
        com.amazon.aps.iva.yb0.j.e(composeView, "binding.skipSegmentButtonContainer");
        View[] viewArr2 = {view3, playerTimelineLayout, linearLayout, composeView};
        for (int i = 0; i < 4; i++) {
            viewArr2[i].clearAnimation();
        }
        for (int i2 = 0; i2 < 4; i2++) {
            View view4 = viewArr2[i2];
            view4.animate().alpha(1.0f).setDuration(300L).withStartAction(new com.amazon.aps.iva.m6.e(view4, 7)).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    @Override // com.amazon.aps.iva.el.a
    public final void closeScreen() {
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        if (a2 != null) {
            a2.finish();
        }
    }

    @Override // com.amazon.aps.iva.jl.j
    public final void dc() {
        e eVar = this.B;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.B = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        return this.L.q6(num, new a(motionEvent));
    }

    @Override // com.amazon.aps.iva.dl.b
    public final void e0() {
        com.amazon.aps.iva.mj.b bVar = this.A;
        PlayerToolbar playerToolbar = bVar.e;
        com.amazon.aps.iva.yb0.j.e(playerToolbar, "binding.playerToolbar");
        View[] viewArr = {playerToolbar};
        for (View view : viewArr) {
            view.clearAnimation();
        }
        for (View view2 : viewArr) {
            view2.animate().alpha(0.0f).setDuration(300L).withEndAction(new d0(view2, 0)).setInterpolator(new DecelerateInterpolator()).start();
        }
        com.amazon.aps.iva.mj.h hVar = bVar.c.b;
        View view3 = (View) hVar.f;
        com.amazon.aps.iva.yb0.j.e(view3, "binding.controlsBackground");
        PlayerTimelineLayout playerTimelineLayout = (PlayerTimelineLayout) hVar.i;
        com.amazon.aps.iva.yb0.j.e(playerTimelineLayout, "binding.timeline");
        LinearLayout linearLayout = (LinearLayout) ((com.amazon.aps.iva.mj.g) hVar.e).c;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.centerVideoControls.root");
        ComposeView composeView = (ComposeView) hVar.h;
        com.amazon.aps.iva.yb0.j.e(composeView, "binding.skipSegmentButtonContainer");
        View[] viewArr2 = {view3, playerTimelineLayout, linearLayout, composeView};
        for (int i = 0; i < 4; i++) {
            viewArr2[i].clearAnimation();
        }
        for (int i2 = 0; i2 < 4; i2++) {
            View view4 = viewArr2[i2];
            view4.animate().alpha(0.0f).setDuration(300L).withEndAction(new d0(view4, 0)).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    @Override // com.amazon.aps.iva.el.i0
    public CastOverlayLayout getCastOverlayLayout() {
        CastOverlayLayout castOverlayLayout = this.A.b;
        com.amazon.aps.iva.yb0.j.e(castOverlayLayout, "binding.castOverlay");
        return castOverlayLayout;
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void h0() {
        this.I.getView().lh();
    }

    @Override // com.amazon.aps.iva.el.i0
    public final void jf() {
        this.I.onConfigurationChanged(null);
    }

    @Override // com.amazon.aps.iva.el.a
    public final void lh() {
        ToolbarMenuDialog.Companion companion = ToolbarMenuDialog.Companion;
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        FragmentManager supportFragmentManager = ((com.amazon.aps.iva.k.c) a2).getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "context.asAppCompatActiv…().supportFragmentManager");
        androidx.fragment.app.g show = companion.show(supportFragmentManager, new d());
        com.amazon.aps.iva.cj.h hVar = n.e;
        if (hVar != null) {
            androidx.lifecycle.g lifecycle = show.getLifecycle();
            com.amazon.aps.iva.yb0.j.e(lifecycle, "dialog.lifecycle");
            hVar.U(lifecycle);
            return;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.ellation.crunchyroll.mvp.lifecycle.a.b(this.I, this);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(getStreamOverCellularPresenter(), this);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(this.L, this);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.I.onConfigurationChanged(configuration);
    }

    @Override // com.amazon.aps.iva.el.i0
    public void setToolbarListener(com.amazon.aps.iva.cl.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.A.e.setListener(new c(bVar, this));
    }

    @Override // com.amazon.aps.iva.el.a
    public final void yd() {
        PlayerToolbar playerToolbar = this.A.e;
        playerToolbar.getViewTreeObserver().addOnGlobalLayoutListener(new b(playerToolbar, this));
    }

    @Override // com.amazon.aps.iva.jl.j
    public final void z8(com.amazon.aps.iva.jl.h hVar) {
        this.B = new MaterialAlertDialogBuilder(getContext()).setTitle(R.string.stream_over_cellular_dialog_title).setMessage(R.string.stream_over_cellular_dialog_message).setNegativeButton(R.string.stream_over_cellular_dialog_negative_button, (DialogInterface.OnClickListener) new com.amazon.aps.iva.el.b()).setPositiveButton(R.string.stream_over_cellular_dialog_positive_button, (DialogInterface.OnClickListener) new com.amazon.aps.iva.el.c(0, hVar)).show();
    }

    @Override // com.amazon.aps.iva.el.i0
    public v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> getExitFullscreenByTapEvent() {
        return this.O;
    }

    @Override // com.amazon.aps.iva.el.i0
    public v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.kb0.q>> getFullScreenToggledEvent() {
        return this.N;
    }

    @Override // com.amazon.aps.iva.el.i0
    public v<h0> getSizeState() {
        return this.M;
    }
}
