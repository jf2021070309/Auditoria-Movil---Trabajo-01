package com.crunchyroll.player.presentation.controls;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.dj.f;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.il.f;
import com.amazon.aps.iva.il.k;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xn.h;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.presentation.controls.adstimeline.AdsTimelineLayout;
import com.crunchyroll.player.presentation.controls.playbackbutton.PlaybackButton;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
import com.crunchyroll.trickscrubbing.TrickScrubbingLayout;
import com.ellation.widgets.seekbar.EasySeekSeekBar;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
/* compiled from: PlayerControlsLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/PlayerControlsLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/vk/e;", "Lcom/amazon/aps/iva/xn/h;", "Lcom/amazon/aps/iva/vk/f;", "visibilityController", "Lcom/amazon/aps/iva/kb0/q;", "setupVisibilityCallbacks", "Lcom/amazon/aps/iva/vk/c;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/vk/c;", "presenter", "Landroid/view/View;", "getControlsContainer", "()Landroid/view/View;", "controlsContainer", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayerControlsLayout extends g implements com.amazon.aps.iva.vk.e, h {
    public final com.amazon.aps.iva.mj.h b;
    public final m c;
    public final com.amazon.aps.iva.xn.g d;

    /* compiled from: PlayerControlsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ob0.g> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ob0.g invoke() {
            return x.O(PlayerControlsLayout.this).c;
        }
    }

    /* compiled from: PlayerControlsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ob0.g> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ob0.g invoke() {
            return x.O(PlayerControlsLayout.this).c;
        }
    }

    /* compiled from: PlayerControlsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<i, Integer, q> {
        public final /* synthetic */ Context h;
        public final /* synthetic */ PlayerControlsLayout i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, PlayerControlsLayout playerControlsLayout) {
            super(2);
            this.h = context;
            this.i = playerControlsLayout;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                Activity a = com.amazon.aps.iva.xw.q.a(this.h);
                j.d(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                com.amazon.aps.iva.il.e.a((f) com.amazon.aps.iva.ez.l.a((androidx.fragment.app.h) a, k.class, new com.crunchyroll.player.presentation.controls.c(this.i)), iVar2, 8);
            }
            return q.a;
        }
    }

    /* compiled from: PlayerControlsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vk.c> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.vk.c invoke() {
            com.amazon.aps.iva.cj.h hVar = n.e;
            if (hVar != null) {
                v0 state = hVar.getState();
                PlayerControlsLayout playerControlsLayout = PlayerControlsLayout.this;
                LifecycleCoroutineScopeImpl O = x.O(playerControlsLayout);
                j.f(state, "state");
                com.amazon.aps.iva.ij.f fVar = new com.amazon.aps.iva.ij.f(state, O);
                com.amazon.aps.iva.cj.h hVar2 = n.e;
                if (hVar2 != null) {
                    com.amazon.aps.iva.hj.c a = hVar2.a();
                    com.amazon.aps.iva.yk.e eVar = new com.amazon.aps.iva.yk.e(fVar);
                    com.amazon.aps.iva.dj.f.a.getClass();
                    com.amazon.aps.iva.vk.b bVar = f.a.b.b;
                    j.f(a, "playerController");
                    j.f(bVar, "analytics");
                    return new com.amazon.aps.iva.vk.d(playerControlsLayout, a, fVar, eVar, bVar);
                }
                j.m("player");
                throw null;
            }
            j.m("player");
            throw null;
        }
    }

    /* compiled from: PlayerControlsLayout.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.t70.c {
        public final /* synthetic */ com.amazon.aps.iva.vk.f c;

        public e(com.amazon.aps.iva.vk.f fVar) {
            this.c = fVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            PlayerControlsLayout.this.getPresenter().I4(this.c);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            PlayerControlsLayout playerControlsLayout = PlayerControlsLayout.this;
            playerControlsLayout.getPresenter().d1(((PlayerTimelineLayout) playerControlsLayout.b.i).getPositionMs(), this.c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerControlsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static void G4(PlayerControlsLayout playerControlsLayout) {
        j.f(playerControlsLayout, "this$0");
        playerControlsLayout.getPresenter().W3();
    }

    public static void U2(PlayerControlsLayout playerControlsLayout) {
        j.f(playerControlsLayout, "this$0");
        playerControlsLayout.getPresenter().d4();
    }

    public static void b1(PlayerControlsLayout playerControlsLayout) {
        j.f(playerControlsLayout, "this$0");
        playerControlsLayout.getPresenter().k6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.vk.c getPresenter() {
        return (com.amazon.aps.iva.vk.c) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void C8() {
        PlaybackButton playbackButton = (PlaybackButton) ((com.amazon.aps.iva.mj.g) this.b.e).d;
        j.e(playbackButton, "binding.centerVideoControls.playbackButton");
        playbackButton.setVisibility(4);
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void E0() {
        com.amazon.aps.iva.mj.h hVar = this.b;
        ComposeView composeView = (ComposeView) hVar.h;
        j.e(composeView, "binding.skipSegmentButtonContainer");
        composeView.setVisibility(8);
        ImageView imageView = (ImageView) ((com.amazon.aps.iva.mj.g) hVar.e).e;
        j.e(imageView, "binding.centerVideoControls.videoRewind");
        imageView.setVisibility(8);
        ImageView imageView2 = ((com.amazon.aps.iva.mj.g) hVar.e).b;
        j.e(imageView2, "binding.centerVideoControls.videoFastForward");
        imageView2.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) hVar.d;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ads_video_player_padding_bottom);
        j.e(relativeLayout, "videoControlsContainer");
        t0.i(relativeLayout, 0, 0, 0, Integer.valueOf(dimensionPixelSize));
    }

    @Override // com.amazon.aps.iva.xn.h
    public final void Ua(com.amazon.aps.iva.yn.a aVar) {
        ((TrickScrubbingLayout) this.b.g).b.c = aVar;
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void W5(com.amazon.aps.iva.yk.f fVar) {
        j.f(fVar, "buttonUiModel");
        com.amazon.aps.iva.mj.h hVar = this.b;
        ((PlaybackButton) ((com.amazon.aps.iva.mj.g) hVar.e).d).setImageResource(fVar.a);
        ((PlaybackButton) ((com.amazon.aps.iva.mj.g) hVar.e).d).setContentDescription(getContext().getString(fVar.b));
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void ff() {
        PlaybackButton playbackButton = (PlaybackButton) ((com.amazon.aps.iva.mj.g) this.b.e).d;
        j.e(playbackButton, "binding.centerVideoControls.playbackButton");
        playbackButton.setVisibility(0);
    }

    public final View getControlsContainer() {
        RelativeLayout relativeLayout = (RelativeLayout) this.b.c;
        j.e(relativeLayout, "binding.controlsContainer");
        return relativeLayout;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.xn.h
    public final void kd() {
        com.amazon.aps.iva.mj.h hVar = this.b;
        EasySeekSeekBar seekBar = ((PlayerTimelineLayout) hVar.i).getSeekBar();
        TrickScrubbingLayout trickScrubbingLayout = (TrickScrubbingLayout) hVar.g;
        j.e(trickScrubbingLayout, "binding.playerTrickScrubbingLayout");
        seekBar.getClass();
        seekBar.c.removeEventListener(trickScrubbingLayout);
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void n() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_controls_rewind_forward_button_size);
        com.amazon.aps.iva.mj.h hVar = this.b;
        ImageView imageView = (ImageView) ((com.amazon.aps.iva.mj.g) hVar.e).e;
        j.e(imageView, "binding.centerVideoControls.videoRewind");
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        t0.k(imageView, valueOf, valueOf);
        Object obj = hVar.e;
        ImageView imageView2 = ((com.amazon.aps.iva.mj.g) obj).b;
        j.e(imageView2, "binding.centerVideoControls.videoFastForward");
        Integer valueOf2 = Integer.valueOf(dimensionPixelSize);
        t0.k(imageView2, valueOf2, valueOf2);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.video_controls_center_rewind_forward_horizontal_margin);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.video_controls_center_button_size);
        PlaybackButton playbackButton = (PlaybackButton) ((com.amazon.aps.iva.mj.g) obj).d;
        j.e(playbackButton, "binding.centerVideoControls.playbackButton");
        t0.e(playbackButton, Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize2));
        PlaybackButton playbackButton2 = (PlaybackButton) ((com.amazon.aps.iva.mj.g) obj).d;
        j.e(playbackButton2, "binding.centerVideoControls.playbackButton");
        Integer valueOf3 = Integer.valueOf(dimensionPixelSize3);
        t0.k(playbackButton2, valueOf3, valueOf3);
        ComposeView composeView = (ComposeView) hVar.h;
        j.e(composeView, "binding.skipSegmentButtonContainer");
        t0.h(composeView, null, null, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.skip_segment_button_margin_bottom)), 7);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        getPresenter().C();
    }

    @Override // com.amazon.aps.iva.xn.h
    public final void re() {
        com.amazon.aps.iva.mj.h hVar = this.b;
        EasySeekSeekBar seekBar = ((PlayerTimelineLayout) hVar.i).getSeekBar();
        TrickScrubbingLayout trickScrubbingLayout = (TrickScrubbingLayout) hVar.g;
        j.e(trickScrubbingLayout, "binding.playerTrickScrubbingLayout");
        seekBar.getClass();
        seekBar.c.addEventListener(trickScrubbingLayout);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(this.d, getPresenter());
    }

    public void setupVisibilityCallbacks(com.amazon.aps.iva.vk.f fVar) {
        j.f(fVar, "visibilityController");
        EasySeekSeekBar seekBar = ((PlayerTimelineLayout) this.b.i).getSeekBar();
        e eVar = new e(fVar);
        seekBar.getClass();
        seekBar.c.addEventListener(eVar);
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void v1() {
        com.amazon.aps.iva.mj.h hVar = this.b;
        ComposeView composeView = (ComposeView) hVar.h;
        j.e(composeView, "binding.skipSegmentButtonContainer");
        composeView.setVisibility(0);
        ImageView imageView = (ImageView) ((com.amazon.aps.iva.mj.g) hVar.e).e;
        j.e(imageView, "binding.centerVideoControls.videoRewind");
        imageView.setVisibility(0);
        ImageView imageView2 = ((com.amazon.aps.iva.mj.g) hVar.e).b;
        j.e(imageView2, "binding.centerVideoControls.videoFastForward");
        imageView2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.vk.e
    public final void z7(String str) {
        com.amazon.aps.iva.xn.g gVar = this.d;
        gVar.getView().re();
        gVar.getView().Ua(null);
        if (str != null) {
            com.amazon.aps.iva.xn.e eVar = new com.amazon.aps.iva.xn.e(gVar.getView());
            gVar.b.H1(str, new com.amazon.aps.iva.xn.f(gVar.getView()), eVar);
            return;
        }
        gVar.getView().kd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControlsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.player_controls_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.ads_timeline;
        AdsTimelineLayout adsTimelineLayout = (AdsTimelineLayout) z.u(R.id.ads_timeline, inflate);
        if (adsTimelineLayout != null) {
            i2 = R.id.center_video_controls;
            View u = z.u(R.id.center_video_controls, inflate);
            if (u != null) {
                int i3 = R.id.playback_button;
                PlaybackButton playbackButton = (PlaybackButton) z.u(R.id.playback_button, u);
                if (playbackButton != null) {
                    i3 = R.id.video_fast_forward;
                    ImageView imageView = (ImageView) z.u(R.id.video_fast_forward, u);
                    if (imageView != null) {
                        i3 = R.id.video_rewind;
                        ImageView imageView2 = (ImageView) z.u(R.id.video_rewind, u);
                        if (imageView2 != null) {
                            com.amazon.aps.iva.mj.g gVar = new com.amazon.aps.iva.mj.g((LinearLayout) u, playbackButton, imageView, imageView2);
                            i2 = R.id.controls_background;
                            View u2 = z.u(R.id.controls_background, inflate);
                            if (u2 != null) {
                                i2 = R.id.controls_container;
                                RelativeLayout relativeLayout = (RelativeLayout) z.u(R.id.controls_container, inflate);
                                if (relativeLayout != null) {
                                    i2 = R.id.player_trick_scrubbing_layout;
                                    TrickScrubbingLayout trickScrubbingLayout = (TrickScrubbingLayout) z.u(R.id.player_trick_scrubbing_layout, inflate);
                                    if (trickScrubbingLayout != null) {
                                        i2 = R.id.skip_segment_button_container;
                                        ComposeView composeView = (ComposeView) z.u(R.id.skip_segment_button_container, inflate);
                                        if (composeView != null) {
                                            i2 = R.id.timeline;
                                            PlayerTimelineLayout playerTimelineLayout = (PlayerTimelineLayout) z.u(R.id.timeline, inflate);
                                            if (playerTimelineLayout != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) inflate;
                                                this.b = new com.amazon.aps.iva.mj.h(relativeLayout2, adsTimelineLayout, gVar, u2, relativeLayout, trickScrubbingLayout, composeView, playerTimelineLayout, relativeLayout2);
                                                this.c = com.amazon.aps.iva.kb0.f.b(new d());
                                                com.amazon.aps.iva.cj.k kVar = n.d;
                                                if (kVar != null) {
                                                    OkHttpClient o = kVar.o();
                                                    com.amazon.aps.iva.yn.d dVar = new com.amazon.aps.iva.yn.d();
                                                    z zVar = new z();
                                                    j.f(o, "okHttpClient");
                                                    this.d = new com.amazon.aps.iva.xn.g(this, new com.amazon.aps.iva.xn.d(dVar, zVar, new com.amazon.aps.iva.xn.i(o), com.amazon.aps.iva.wu.b.a));
                                                    com.amazon.aps.iva.cj.h hVar = n.e;
                                                    if (hVar != null) {
                                                        v0 state = hVar.getState();
                                                        a aVar = new a();
                                                        j.f(state, "state");
                                                        com.amazon.aps.iva.bl.d dVar2 = new com.amazon.aps.iva.bl.d(state, aVar);
                                                        Context context2 = playerTimelineLayout.getContext();
                                                        j.e(context2, "context");
                                                        com.amazon.aps.iva.rs.a aVar2 = new com.amazon.aps.iva.rs.a(context2);
                                                        com.amazon.aps.iva.dj.f.a.getClass();
                                                        com.amazon.aps.iva.vk.b bVar = f.a.b.b;
                                                        j.f(bVar, "playerControlsAnalytics");
                                                        com.amazon.aps.iva.bl.f fVar = new com.amazon.aps.iva.bl.f(playerTimelineLayout, dVar2, aVar2, bVar);
                                                        com.ellation.crunchyroll.mvp.lifecycle.a.b(fVar, playerTimelineLayout);
                                                        playerTimelineLayout.c = fVar;
                                                        EasySeekSeekBar easySeekSeekBar = (EasySeekSeekBar) playerTimelineLayout.b.e;
                                                        com.amazon.aps.iva.bl.e eVar = new com.amazon.aps.iva.bl.e(playerTimelineLayout);
                                                        easySeekSeekBar.getClass();
                                                        easySeekSeekBar.c.addEventListener(eVar);
                                                        com.amazon.aps.iva.cj.h hVar2 = n.e;
                                                        if (hVar2 != null) {
                                                            v0 state2 = hVar2.getState();
                                                            b bVar2 = new b();
                                                            j.f(state2, "state");
                                                            com.amazon.aps.iva.wk.f fVar2 = new com.amazon.aps.iva.wk.f(adsTimelineLayout, new com.amazon.aps.iva.wk.e(state2, bVar2));
                                                            com.ellation.crunchyroll.mvp.lifecycle.a.b(fVar2, adsTimelineLayout);
                                                            adsTimelineLayout.c = fVar2;
                                                            playbackButton.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 4));
                                                            imageView2.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 3));
                                                            imageView.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 3));
                                                            composeView.setContent(com.amazon.aps.iva.v0.b.c(1250624327, new c(context, this), true));
                                                            setClipChildren(false);
                                                            return;
                                                        }
                                                        j.m("player");
                                                        throw null;
                                                    }
                                                    j.m("player");
                                                    throw null;
                                                }
                                                j.m("dependencies");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i3)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
