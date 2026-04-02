package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.c;
import com.amazon.aps.iva.c8.t;
import com.amazon.aps.iva.c8.u;
import com.amazon.aps.iva.q5.j0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.q5.y0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w6.j;
import com.crunchyroll.crunchyroid.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PlayerView.java */
/* loaded from: classes.dex */
public class d extends FrameLayout implements com.amazon.aps.iva.q5.d {
    public final a b;
    public final AspectRatioFrameLayout c;
    public final View d;
    public final View e;
    public final boolean f;
    public final ImageView g;
    public final SubtitleView h;
    public final View i;
    public final TextView j;
    public final androidx.media3.ui.c k;
    public final FrameLayout l;
    public final FrameLayout m;
    public l0 n;
    public boolean o;
    public c.l p;
    public int q;
    public Drawable r;
    public int s;
    public boolean t;
    public CharSequence u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* compiled from: PlayerView.java */
    /* loaded from: classes.dex */
    public final class a implements l0.c, View.OnLayoutChangeListener, View.OnClickListener, c.l, c.InterfaceC0038c {
        public final r0.b b = new r0.b();
        public Object c;

        public a() {
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void B(y0 y0Var) {
            d dVar;
            l0 l0Var;
            if (!y0Var.equals(y0.f) && (l0Var = (dVar = d.this).n) != null && l0Var.h() != 1) {
                dVar.yh();
            }
        }

        @Override // androidx.media3.ui.c.l
        public final void G(int i) {
            d dVar = d.this;
            dVar.di();
            dVar.getClass();
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void H(int i, l0.d dVar, l0.d dVar2) {
            androidx.media3.ui.c cVar;
            d dVar3 = d.this;
            if (dVar3.G4() && dVar3.x && (cVar = dVar3.k) != null) {
                cVar.g();
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void J(int i) {
            d dVar = d.this;
            dVar.ci();
            dVar.ei();
            d.G(dVar);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void V() {
            View view = d.this.d;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void b(v0 v0Var) {
            r0 r0Var;
            d dVar = d.this;
            l0 l0Var = dVar.n;
            l0Var.getClass();
            if (l0Var.V(17)) {
                r0Var = l0Var.a0();
            } else {
                r0Var = r0.b;
            }
            if (r0Var.r()) {
                this.c = null;
            } else {
                boolean V = l0Var.V(30);
                r0.b bVar = this.b;
                if (V && !l0Var.Q().b.isEmpty()) {
                    this.c = r0Var.h(l0Var.p0(), bVar, true).c;
                } else {
                    Object obj = this.c;
                    if (obj != null) {
                        int c = r0Var.c(obj);
                        if (c != -1) {
                            if (l0Var.K0() == r0Var.h(c, bVar, false).d) {
                                return;
                            }
                        }
                        this.c = null;
                    }
                }
            }
            dVar.fi(false);
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g(com.amazon.aps.iva.s5.b bVar) {
            SubtitleView subtitleView = d.this.h;
            if (subtitleView != null) {
                subtitleView.setCues(bVar.b);
            }
        }

        @Override // com.amazon.aps.iva.q5.l0.c
        public final void g0(int i, boolean z) {
            d dVar = d.this;
            dVar.ci();
            d.G(dVar);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.mh();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            d.U2((TextureView) view, d.this.z);
        }
    }

    /* compiled from: PlayerView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: PlayerView.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void G(d dVar) {
        if (dVar.G4() && dVar.x) {
            androidx.media3.ui.c cVar = dVar.k;
            if (cVar != null) {
                cVar.g();
                return;
            }
            return;
        }
        dVar.H6(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G4() {
        l0 l0Var = this.n;
        if (l0Var != null && l0Var.V(16) && this.n.o() && this.n.k0()) {
            return true;
        }
        return false;
    }

    public static void U2(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final void H6(boolean z) {
        boolean z2;
        if ((!G4() || !this.x) && gi()) {
            androidx.media3.ui.c cVar = this.k;
            if (cVar.h() && cVar.getShowTimeoutMs() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean Oa = Oa();
            if (z || z2 || Oa) {
                nf(Oa);
            }
        }
    }

    public final boolean Oa() {
        l0 l0Var = this.n;
        if (l0Var == null) {
            return true;
        }
        int h = l0Var.h();
        if (this.w && (!this.n.V(17) || !this.n.a0().r())) {
            if (h == 1 || h == 4) {
                return true;
            }
            l0 l0Var2 = this.n;
            l0Var2.getClass();
            if (!l0Var2.k0()) {
                return true;
            }
        }
        return false;
    }

    public final boolean X7(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.q == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.c;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.g;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r5.n.k0() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ci() {
        /*
            r5 = this;
            android.view.View r0 = r5.i
            if (r0 == 0) goto L29
            com.amazon.aps.iva.q5.l0 r1 = r5.n
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.h()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.s
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            com.amazon.aps.iva.q5.l0 r1 = r5.n
            boolean r1 = r1.k0()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.d.ci():void");
    }

    public final void di() {
        String str = null;
        androidx.media3.ui.c cVar = this.k;
        if (cVar != null && this.o) {
            if (cVar.h()) {
                if (this.y) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        l0 l0Var = this.n;
        if (l0Var != null && l0Var.V(16) && this.n.o()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z = false;
        } else {
            z = true;
        }
        androidx.media3.ui.c cVar = this.k;
        if (z && gi() && !cVar.h()) {
            H6(true);
        } else {
            if (gi() && cVar.d(keyEvent)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z || !gi()) {
                    return false;
                }
                H6(true);
                return false;
            }
            H6(true);
        }
        return true;
    }

    public final void ei() {
        TextView textView = this.j;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            l0 l0Var = this.n;
            if (l0Var != null) {
                l0Var.K();
            }
            textView.setVisibility(8);
        }
    }

    public final void fi(boolean z) {
        boolean z2;
        byte[] bArr;
        l0 l0Var = this.n;
        View view = this.d;
        boolean z3 = false;
        ImageView imageView = this.g;
        if (l0Var != null && l0Var.V(30) && !l0Var.Q().b.isEmpty()) {
            if (z && !this.t && view != null) {
                view.setVisibility(0);
            }
            if (l0Var.Q().b(2)) {
                if (imageView != null) {
                    imageView.setImageResource(17170445);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.q != 0) {
                com.amazon.aps.iva.cq.b.D(imageView);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (l0Var.V(18) && (bArr = l0Var.U0().k) != null) {
                    z3 = X7(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z3 || X7(this.r)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
        } else if (!this.t) {
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.d
    public List<com.amazon.aps.iva.q5.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            arrayList.add(new com.amazon.aps.iva.q5.a(4, frameLayout, "Transparent overlay does not impact viewability"));
        }
        androidx.media3.ui.c cVar = this.k;
        if (cVar != null) {
            arrayList.add(new com.amazon.aps.iva.q5.a(1, cVar, null));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // com.amazon.aps.iva.q5.d
    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.l;
        com.amazon.aps.iva.cq.b.E(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.q;
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    public Drawable getDefaultArtwork() {
        return this.r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.m;
    }

    public l0 getPlayer() {
        return this.n;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.c;
        com.amazon.aps.iva.cq.b.D(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.h;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.q != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.o;
    }

    public View getVideoSurfaceView() {
        return this.e;
    }

    public final boolean gi() {
        if (this.o) {
            com.amazon.aps.iva.cq.b.D(this.k);
            return true;
        }
        return false;
    }

    public final void mh() {
        if (gi() && this.n != null) {
            androidx.media3.ui.c cVar = this.k;
            if (!cVar.h()) {
                H6(true);
            } else if (this.y) {
                cVar.g();
            }
        }
    }

    public final void nf(boolean z) {
        int i;
        if (!gi()) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = this.v;
        }
        androidx.media3.ui.c cVar = this.k;
        cVar.setShowTimeoutMs(i);
        t tVar = cVar.b;
        androidx.media3.ui.c cVar2 = tVar.a;
        if (!cVar2.i()) {
            cVar2.setVisibility(0);
            cVar2.j();
            View view = cVar2.p;
            if (view != null) {
                view.requestFocus();
            }
        }
        tVar.k();
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (gi() && this.n != null) {
            H6(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        mh();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        boolean z;
        if (i != 0 && this.g == null) {
            z = false;
        } else {
            z = true;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (this.q != i) {
            this.q = i;
            fi(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.c;
        com.amazon.aps.iva.cq.b.D(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.w = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.x = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        com.amazon.aps.iva.cq.b.D(this.k);
        this.y = z;
        di();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(c.InterfaceC0038c interfaceC0038c) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setOnFullScreenModeChangedListener(interfaceC0038c);
    }

    public void setControllerShowTimeoutMs(int i) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        this.v = i;
        if (cVar.h()) {
            nf(Oa());
        }
    }

    public void setControllerVisibilityListener(b bVar) {
        if (bVar != null) {
            setControllerVisibilityListener((c.l) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.j != null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        this.u = charSequence;
        ei();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            fi(false);
        }
    }

    public void setErrorMessageProvider(com.amazon.aps.iva.q5.t<? super j0> tVar) {
        if (tVar != null) {
            ei();
        }
    }

    public void setFullscreenButtonClickListener(c cVar) {
        androidx.media3.ui.c cVar2 = this.k;
        com.amazon.aps.iva.cq.b.D(cVar2);
        cVar2.setOnFullScreenModeChangedListener(this.b);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.t != z) {
            this.t = z;
            fi(false);
        }
    }

    public void setPlayer(l0 l0Var) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        if (l0Var != null && l0Var.c0() != Looper.getMainLooper()) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.amazon.aps.iva.cq.b.t(z2);
        l0 l0Var2 = this.n;
        if (l0Var2 == l0Var) {
            return;
        }
        View view = this.e;
        a aVar = this.b;
        if (l0Var2 != null) {
            l0Var2.t0(aVar);
            if (l0Var2.V(27)) {
                if (view instanceof TextureView) {
                    l0Var2.r0((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    l0Var2.L0((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.n = l0Var;
        boolean gi = gi();
        androidx.media3.ui.c cVar = this.k;
        if (gi) {
            cVar.setPlayer(l0Var);
        }
        ci();
        ei();
        fi(true);
        if (l0Var != null) {
            if (l0Var.V(27)) {
                if (view instanceof TextureView) {
                    l0Var.f0((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    l0Var.B((SurfaceView) view);
                }
                if (!l0Var.V(30) || l0Var.Q().c()) {
                    yh();
                }
            }
            if (subtitleView != null && l0Var.V(28)) {
                subtitleView.setCues(l0Var.S().b);
            }
            l0Var.u(aVar);
            H6(false);
        } else if (cVar != null) {
            cVar.g();
        }
    }

    public void setRepeatToggleModes(int i) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.c;
        com.amazon.aps.iva.cq.b.D(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.s != i) {
            this.s = i;
            ci();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.d;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2;
        boolean z3 = false;
        androidx.media3.ui.c cVar = this.k;
        if (z && cVar == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        if (z || hasOnClickListeners()) {
            z3 = true;
        }
        setClickable(z3);
        if (this.o == z) {
            return;
        }
        this.o = z;
        if (gi()) {
            cVar.setPlayer(this.n);
        } else if (cVar != null) {
            cVar.g();
            cVar.setPlayer(null);
        }
        di();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public final void yh() {
        y0 y0Var;
        float f;
        l0 l0Var = this.n;
        if (l0Var != null) {
            y0Var = l0Var.s0();
        } else {
            y0Var = y0.f;
        }
        int i = y0Var.b;
        float f2 = 0.0f;
        int i2 = y0Var.c;
        if (i2 != 0 && i != 0) {
            f = (i * y0Var.e) / i2;
        } else {
            f = 0.0f;
        }
        View view = this.e;
        if (view instanceof TextureView) {
            int i3 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int i4 = y0Var.d;
            if (i3 > 0 && (i4 == 90 || i4 == 270)) {
                f = 1.0f / f;
            }
            int i5 = this.z;
            a aVar = this.b;
            if (i5 != 0) {
                view.removeOnLayoutChangeListener(aVar);
            }
            this.z = i4;
            if (i4 != 0) {
                view.addOnLayoutChangeListener(aVar);
            }
            U2((TextureView) view, this.z);
        }
        if (!this.f) {
            f2 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.c;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        boolean z7;
        a aVar = new a();
        this.b = aVar;
        if (isInEditMode()) {
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = false;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            ImageView imageView = new ImageView(context);
            if (g0.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(g0.t(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(g0.t(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, u.d, i, 0);
            try {
                z3 = obtainStyledAttributes.hasValue(28);
                i7 = obtainStyledAttributes.getColor(28, 0);
                int resourceId = obtainStyledAttributes.getResourceId(15, R.layout.exo_player_view);
                z4 = obtainStyledAttributes.getBoolean(33, true);
                i8 = obtainStyledAttributes.getInt(3, 1);
                i5 = obtainStyledAttributes.getResourceId(9, 0);
                boolean z8 = obtainStyledAttributes.getBoolean(34, true);
                i4 = obtainStyledAttributes.getInt(29, 1);
                int i11 = obtainStyledAttributes.getInt(17, 0);
                int i12 = obtainStyledAttributes.getInt(26, 5000);
                z = obtainStyledAttributes.getBoolean(11, true);
                boolean z9 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(23, 0);
                this.t = obtainStyledAttributes.getBoolean(12, this.t);
                boolean z10 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.recycle();
                z2 = z9;
                i6 = integer;
                z5 = z8;
                i3 = i11;
                i2 = i12;
                i9 = resourceId;
                z6 = z10;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = 0;
            i4 = 1;
            i5 = 0;
            z = true;
            i6 = 0;
            z2 = true;
            i7 = 0;
            z3 = false;
            z4 = true;
            i8 = 1;
            z5 = true;
            i9 = R.layout.exo_player_view;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i3);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.d = findViewById;
        if (findViewById != null && z3) {
            findViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout != null && i4 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.e = new TextureView(context);
            } else if (i4 == 3) {
                try {
                    int i13 = j.m;
                    this.e = (View) j.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.e.setLayoutParams(layoutParams);
                    this.e.setOnClickListener(aVar);
                    i10 = 0;
                    this.e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.e, 0);
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i4 != 4) {
                this.e = new SurfaceView(context);
            } else {
                try {
                    int i14 = com.amazon.aps.iva.v6.e.c;
                    this.e = (View) com.amazon.aps.iva.v6.e.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z7 = false;
            this.e.setLayoutParams(layoutParams);
            this.e.setOnClickListener(aVar);
            i10 = 0;
            this.e.setClickable(false);
            aspectRatioFrameLayout.addView(this.e, 0);
        } else {
            i10 = 0;
            this.e = null;
            z7 = false;
        }
        this.f = z7;
        this.l = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.m = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.g = imageView2;
        this.q = ((!z4 || i8 == 0 || imageView2 == null) ? i10 : 1) != 0 ? i8 : i10;
        if (i5 != 0) {
            this.r = com.amazon.aps.iva.d3.a.getDrawable(getContext(), i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.h = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.i = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.s = i6;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.c cVar = (androidx.media3.ui.c) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.k = cVar;
        } else if (findViewById3 != null) {
            androidx.media3.ui.c cVar2 = new androidx.media3.ui.c(context, attributeSet);
            this.k = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(cVar2, indexOfChild);
        } else {
            this.k = null;
        }
        androidx.media3.ui.c cVar3 = this.k;
        this.v = cVar3 != null ? i2 : i10;
        this.y = z;
        this.w = z2;
        this.x = z6;
        this.o = (!z5 || cVar3 == null) ? i10 : 1;
        if (cVar3 != null) {
            t tVar = cVar3.b;
            int i15 = tVar.z;
            if (i15 != 3 && i15 != 2) {
                tVar.f();
                tVar.i(2);
            }
            this.k.e.add(aVar);
        }
        if (z5) {
            setClickable(true);
        }
        di();
    }

    @Deprecated
    public void setControllerVisibilityListener(c.l lVar) {
        androidx.media3.ui.c cVar = this.k;
        com.amazon.aps.iva.cq.b.D(cVar);
        c.l lVar2 = this.p;
        if (lVar2 == lVar) {
            return;
        }
        CopyOnWriteArrayList<c.l> copyOnWriteArrayList = cVar.e;
        if (lVar2 != null) {
            copyOnWriteArrayList.remove(lVar2);
        }
        this.p = lVar;
        if (lVar != null) {
            copyOnWriteArrayList.add(lVar);
            setControllerVisibilityListener((b) null);
        }
    }
}
