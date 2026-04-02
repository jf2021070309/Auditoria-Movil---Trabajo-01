package com.crunchyroll.player.presentation.playerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.h;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.el.d0;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.el.p0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fl.d;
import com.amazon.aps.iva.gl.f;
import com.amazon.aps.iva.gl.j;
import com.amazon.aps.iva.gl.t;
import com.amazon.aps.iva.gl.u;
import com.amazon.aps.iva.gl.w;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.m6.e;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.u1.g0;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
import kotlin.Metadata;
/* compiled from: PlayerGesturesLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/crunchyroll/player/presentation/playerview/PlayerGesturesLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/fl/d;", "Lcom/amazon/aps/iva/gl/u;", "Lcom/amazon/aps/iva/mj/d;", "b", "Lcom/amazon/aps/iva/mj/d;", "getBinding", "()Lcom/amazon/aps/iva/mj/d;", "binding", "Lcom/amazon/aps/iva/gl/w;", "c", "Lcom/amazon/aps/iva/ez/a;", "getTapToSeekViewModel", "()Lcom/amazon/aps/iva/gl/w;", "tapToSeekViewModel", "Lcom/amazon/aps/iva/gl/c;", "d", "Lcom/amazon/aps/iva/gl/c;", "getTapToSeekController", "()Lcom/amazon/aps/iva/gl/c;", "tapToSeekController", "player_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"UnsafeOptInUsageError", "ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class PlayerGesturesLayout extends g implements d, u {
    public static final /* synthetic */ l<Object>[] j = {q.a(PlayerGesturesLayout.class, "tapToSeekViewModel", "getTapToSeekViewModel()Lcom/crunchyroll/player/presentation/playerview/seek/PlayerTapToSeekViewModelImpl;", 0)};
    public final com.amazon.aps.iva.mj.d b;
    public final com.amazon.aps.iva.ez.a c;
    public final com.amazon.aps.iva.gl.c d;
    public f e;
    public g0 f;
    public InternalPlayerViewLayout g;
    public com.amazon.aps.iva.fl.b h;
    public ScaleGestureDetector i;

    /* compiled from: PlayerGesturesLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                j.a(PlayerGesturesLayout.this.getTapToSeekViewModel(), null, iVar2, 8, 2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    /* compiled from: PlayerGesturesLayout.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, w> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final w invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new w();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerGesturesLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w getTapToSeekViewModel() {
        return (w) this.c.getValue(this, j[0]);
    }

    @Override // com.amazon.aps.iva.gl.u
    public final void N9() {
        InternalPlayerViewLayout internalPlayerViewLayout = this.g;
        if (internalPlayerViewLayout != null) {
            PlayerTimelineLayout playerTimelineLayout = (PlayerTimelineLayout) internalPlayerViewLayout.A.c.b.i;
            com.amazon.aps.iva.yb0.j.e(playerTimelineLayout, "binding.timeline");
            playerTimelineLayout.clearAnimation();
            View view = new View[]{playerTimelineLayout}[0];
            view.animate().alpha(1.0f).setDuration(300L).withStartAction(new e(view, 7)).setInterpolator(new DecelerateInterpolator()).start();
            return;
        }
        com.amazon.aps.iva.yb0.j.m("playerView");
        throw null;
    }

    public final void U2(p0 p0Var, InternalPlayerViewLayout internalPlayerViewLayout) {
        k aVar;
        k aVar2;
        com.amazon.aps.iva.yb0.j.f(p0Var, "viewModel");
        com.amazon.aps.iva.yb0.j.f(internalPlayerViewLayout, "playerView");
        this.g = internalPlayerViewLayout;
        this.h = new com.amazon.aps.iva.fl.b(new com.amazon.aps.iva.el.g0(internalPlayerViewLayout));
        Context context = getContext();
        com.amazon.aps.iva.fl.b bVar = this.h;
        if (bVar != null) {
            this.i = new ScaleGestureDetector(context, bVar);
            com.amazon.aps.iva.cj.k kVar = n.d;
            if (kVar != null) {
                com.amazon.aps.iva.cx.n m = kVar.m();
                v<h0> vVar = p0Var.b;
                com.amazon.aps.iva.yb0.j.f(m, "config");
                com.amazon.aps.iva.yb0.j.f(vVar, "sizeState");
                if (m.b()) {
                    aVar = new com.amazon.aps.iva.fl.c(vVar, this);
                } else {
                    aVar = new com.amazon.aps.iva.fl.a(this);
                }
                com.ellation.crunchyroll.mvp.lifecycle.a.b(aVar, this);
                com.amazon.aps.iva.cj.k kVar2 = n.d;
                if (kVar2 != null) {
                    com.amazon.aps.iva.cx.n m2 = kVar2.m();
                    w tapToSeekViewModel = getTapToSeekViewModel();
                    com.amazon.aps.iva.yb0.j.f(m2, "config");
                    com.amazon.aps.iva.yb0.j.f(tapToSeekViewModel, "viewModel");
                    androidx.lifecycle.c cVar = p0Var.e;
                    com.amazon.aps.iva.yb0.j.f(cVar, "videoPlayerState");
                    if (m2.a()) {
                        aVar2 = new t(tapToSeekViewModel, cVar, this);
                    } else {
                        aVar2 = new com.amazon.aps.iva.gl.a(this);
                    }
                    com.ellation.crunchyroll.mvp.lifecycle.a.b(aVar2, this);
                    setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.iva.el.f0
                        /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
                        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
                        @Override // android.view.View.OnTouchListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
                            /*
                                r4 = this;
                                com.amazon.aps.iva.fc0.l<java.lang.Object>[] r5 = com.crunchyroll.player.presentation.playerview.PlayerGesturesLayout.j
                                java.lang.String r5 = "this$0"
                                com.crunchyroll.player.presentation.playerview.PlayerGesturesLayout r0 = com.crunchyroll.player.presentation.playerview.PlayerGesturesLayout.this
                                com.amazon.aps.iva.yb0.j.f(r0, r5)
                                com.amazon.aps.iva.gl.f r5 = r0.e
                                java.lang.String r1 = "event"
                                r2 = 1
                                r3 = 0
                                if (r5 == 0) goto L1e
                                com.amazon.aps.iva.yb0.j.e(r6, r1)
                                com.amazon.aps.iva.p3.e r5 = r5.a
                                boolean r5 = r5.a(r6)
                                if (r5 != r2) goto L1e
                                r5 = r2
                                goto L1f
                            L1e:
                                r5 = r3
                            L1f:
                                if (r5 != 0) goto L4d
                                com.amazon.aps.iva.u1.g0 r5 = r0.f
                                if (r5 == 0) goto L48
                                com.amazon.aps.iva.yb0.j.e(r6, r1)
                                int r0 = r6.getAction()
                                if (r0 == r2) goto L37
                                java.lang.Object r5 = r5.b
                                android.view.ScaleGestureDetector r5 = (android.view.ScaleGestureDetector) r5
                                boolean r5 = r5.onTouchEvent(r6)
                                goto L44
                            L37:
                                java.lang.Object r5 = r5.c
                                com.amazon.aps.iva.fl.b r5 = (com.amazon.aps.iva.fl.b) r5
                                boolean r6 = r5.c
                                if (r6 == 0) goto L43
                                r5.c = r3
                                r5 = r2
                                goto L44
                            L43:
                                r5 = r3
                            L44:
                                if (r5 != r2) goto L48
                                r5 = r2
                                goto L49
                            L48:
                                r5 = r3
                            L49:
                                if (r5 == 0) goto L4c
                                goto L4d
                            L4c:
                                r2 = r3
                            L4d:
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.el.f0.onTouch(android.view.View, android.view.MotionEvent):boolean");
                        }
                    });
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("pinchToZoomController");
        throw null;
    }

    @Override // com.amazon.aps.iva.gl.u
    public final void c2() {
        InternalPlayerViewLayout internalPlayerViewLayout = this.g;
        if (internalPlayerViewLayout != null) {
            PlayerTimelineLayout playerTimelineLayout = (PlayerTimelineLayout) internalPlayerViewLayout.A.c.b.i;
            com.amazon.aps.iva.yb0.j.e(playerTimelineLayout, "binding.timeline");
            playerTimelineLayout.clearAnimation();
            View view = new View[]{playerTimelineLayout}[0];
            view.animate().alpha(0.0f).setDuration(300L).withEndAction(new d0(view, 0)).setInterpolator(new DecelerateInterpolator()).start();
            return;
        }
        com.amazon.aps.iva.yb0.j.m("playerView");
        throw null;
    }

    @Override // com.amazon.aps.iva.gl.u
    public final void d8() {
        this.b.b.setContent(com.amazon.aps.iva.v0.b.c(1174512508, new a(), true));
        this.e = new f(this, this.d);
    }

    @Override // com.amazon.aps.iva.gl.u
    public final void e0() {
        InternalPlayerViewLayout internalPlayerViewLayout = this.g;
        if (internalPlayerViewLayout != null) {
            internalPlayerViewLayout.e0();
        } else {
            com.amazon.aps.iva.yb0.j.m("playerView");
            throw null;
        }
    }

    public final com.amazon.aps.iva.mj.d getBinding() {
        return this.b;
    }

    public final com.amazon.aps.iva.gl.c getTapToSeekController() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fl.d
    public final void n5() {
        this.f = null;
    }

    @Override // com.amazon.aps.iva.fl.d
    public final void v8() {
        ScaleGestureDetector scaleGestureDetector = this.i;
        if (scaleGestureDetector != null) {
            com.amazon.aps.iva.fl.b bVar = this.h;
            if (bVar != null) {
                this.f = new g0(scaleGestureDetector, bVar);
                return;
            } else {
                com.amazon.aps.iva.yb0.j.m("pinchToZoomController");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.m("scaleGestureDetector");
        throw null;
    }

    @Override // com.amazon.aps.iva.gl.u
    public final void wc() {
        this.e = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerGesturesLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.gl.c bVar;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_player_gestures, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.player_pinch_to_zoom_container;
        if (((FrameLayout) z.u(R.id.player_pinch_to_zoom_container, inflate)) != null) {
            i2 = R.id.player_to_seek_container;
            ComposeView composeView = (ComposeView) z.u(R.id.player_to_seek_container, inflate);
            if (composeView != null) {
                this.b = new com.amazon.aps.iva.mj.d((FrameLayout) inflate, composeView);
                this.c = new com.amazon.aps.iva.ez.a(w.class, new b((h) context), c.h);
                com.amazon.aps.iva.cj.k kVar = n.d;
                if (kVar != null) {
                    com.amazon.aps.iva.cx.n m = kVar.m();
                    com.amazon.aps.iva.cj.h hVar = n.e;
                    if (hVar != null) {
                        com.amazon.aps.iva.hj.c a2 = hVar.a();
                        w tapToSeekViewModel = getTapToSeekViewModel();
                        com.amazon.aps.iva.yb0.j.f(m, "config");
                        com.amazon.aps.iva.yb0.j.f(a2, "playerController");
                        com.amazon.aps.iva.yb0.j.f(tapToSeekViewModel, "viewModel");
                        if (m.a()) {
                            bVar = new com.amazon.aps.iva.gl.e(a2, tapToSeekViewModel);
                        } else {
                            bVar = new com.amazon.aps.iva.gl.b();
                        }
                        this.d = bVar;
                        return;
                    }
                    com.amazon.aps.iva.yb0.j.m("player");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
