package com.kwad.components.core.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.kwad.components.core.video.VideoAdapters;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.PhotoInfo;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public class DetailVideoView extends KSFrameLayout implements View.OnClickListener {
    private int SA;
    private final d SB;
    public com.kwad.components.core.page.widget.b Ss;
    private b St;
    private SurfaceTexture Su;
    public Surface Sv;
    private a Sw;
    private PhotoInfo.VideoInfo Sx;
    private final RectF Sy;
    private int Sz;
    private Matrix mMatrix;

    /* loaded from: classes.dex */
    public interface a {
        void onClickRootView();

        void onClickVideoView();
    }

    public DetailVideoView(Context context) {
        super(context);
        this.Sy = new RectF();
        this.Sz = 0;
        this.SA = 0;
        this.SB = new d();
        D(context);
    }

    public DetailVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Sy = new RectF();
        this.Sz = 0;
        this.SA = 0;
        this.SB = new d();
        D(context);
    }

    private void D(Context context) {
        this.mMatrix = new Matrix();
        this.Ss = new com.kwad.components.core.page.widget.b(context);
        addView(this.Ss, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        qL();
    }

    private void a(View view, long j, long j2) {
        View view2;
        if (view == null || j == 0 || j2 == 0 || (view2 = (View) view.getParent()) == null) {
            return;
        }
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        view.getLayoutParams();
        float f = ((float) j) / ((float) j2);
        float f2 = height * f;
        float f3 = width;
        if (f2 > f3) {
            height = (int) (f3 / f);
        } else {
            width = (int) f2;
        }
        if (width == 0 || height == 0) {
            height = -1;
            width = -1;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        this.Ss.setLayoutParams(layoutParams);
    }

    private void qL() {
        this.Ss.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.kwad.components.core.video.DetailVideoView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (DetailVideoView.this.Su == surfaceTexture) {
                    return;
                }
                DetailVideoView.this.Su = surfaceTexture;
                DetailVideoView.this.qM();
                DetailVideoView.this.Sv = new Surface(surfaceTexture);
                if (DetailVideoView.this.St != null) {
                    DetailVideoView.this.St.setSurface(DetailVideoView.this.Sv);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qM() {
        Surface surface = this.Sv;
        if (surface != null) {
            try {
                surface.release();
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
            this.Sv = null;
        }
    }

    public final ValueAnimator a(AdTemplate adTemplate, int i, final ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        float height = getHeight();
        final float width = height / getWidth();
        final boolean O = com.kwad.sdk.core.response.b.a.O(com.kwad.sdk.core.response.b.d.ck(adTemplate));
        final ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt((int) height, i);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kwad.components.core.video.DetailVideoView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (O) {
                    int i2 = (int) (intValue / width);
                    ViewGroup.LayoutParams layoutParams2 = layoutParams;
                    if (layoutParams2 != null) {
                        layoutParams2.height = intValue;
                        layoutParams.width = i2;
                        DetailVideoView.this.setLayoutParams(layoutParams);
                    }
                    DetailVideoView.this.adaptVideoSize(i2, intValue);
                } else {
                    ViewGroup.LayoutParams layoutParams3 = layoutParams;
                    if (layoutParams3 != null) {
                        layoutParams3.height = intValue;
                        layoutParams.width = -1;
                        DetailVideoView.this.setLayoutParams(layoutParams);
                    }
                }
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = animatorUpdateListener;
                if (animatorUpdateListener2 != null) {
                    animatorUpdateListener2.onAnimationUpdate(valueAnimator);
                }
            }
        });
        Interpolator create = PathInterpolatorCompat.create(0.0f, 0.0f, 0.58f, 1.0f);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(create);
        return ofInt;
    }

    public final void adaptVideoSize(int i, int i2) {
        if (this.Ss == null) {
            com.kwad.sdk.core.e.c.w("DetailVideoView", "adaptVideoSize mTextureView is null");
            return;
        }
        this.SA = i2;
        this.Sz = i;
        if (this.SB.qN()) {
            int qO = this.SB.qO();
            VideoAdapters.a aVar = null;
            if (qO == 1) {
                aVar = new VideoAdapters.c();
            } else if (qO == 2) {
                aVar = new VideoAdapters.b();
            }
            if (aVar != null) {
                com.kwad.components.core.page.widget.b bVar = this.Ss;
                aVar.a(bVar, (View) bVar.getParent(), i, i2);
            }
        } else if (this.SB.qT()) {
            com.kwad.sdk.d.a.a.C(this.Ss);
        } else if (this.SB.qP()) {
            com.kwad.sdk.d.a.a.e(this.Ss, i, i2);
        } else if (this.SB.qR()) {
            com.kwad.sdk.d.a.a.f(this.Ss, i, i2);
        } else if (this.SB.qQ()) {
            com.kwad.sdk.d.a.a.d(this.Ss, i, i2);
        } else if (this.SB.qS()) {
            a(this.Ss, i, i2);
        } else {
            View view = (View) this.Ss.getParent();
            if (view == null) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            PhotoInfo.VideoInfo videoInfo = this.Sx;
            if (videoInfo == null || !com.kwad.sdk.core.response.b.f.a(this.mMatrix, width, height, videoInfo)) {
                ViewGroup.LayoutParams layoutParams = this.Ss.getLayoutParams();
                layoutParams.width = width;
                layoutParams.height = (int) ((i2 / (i * 1.0f)) * width);
                this.mMatrix.reset();
                this.Ss.setTransform(this.mMatrix);
                this.Ss.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.Ss.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.Ss.setTransform(this.mMatrix);
                this.Ss.setLayoutParams(layoutParams2);
            }
            this.Sy.set(this.Ss.getLeft(), this.Ss.getTop(), this.Ss.getRight(), this.Ss.getBottom());
        }
    }

    public final void f(boolean z, int i) {
        this.SB.setAd(true);
        this.SB.aL(i);
    }

    @Deprecated
    public final void fixWidth(boolean z) {
        this.SB.aK(z);
    }

    public int getTextureViewGravity() {
        com.kwad.components.core.page.widget.b bVar = this.Ss;
        if (bVar == null) {
            return 17;
        }
        ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return ((FrameLayout.LayoutParams) layoutParams).gravity;
        }
        return 17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.Ss) {
            a aVar = this.Sw;
            if (aVar != null) {
                aVar.onClickVideoView();
                return;
            }
            return;
        }
        a aVar2 = this.Sw;
        if (aVar2 != null) {
            aVar2.onClickRootView();
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qM();
        SurfaceTexture surfaceTexture = this.Su;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.Su = null;
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        int i6 = this.Sz;
        if (i6 <= 0 || (i5 = this.SA) <= 0) {
            return;
        }
        adaptVideoSize(i6, i5);
    }

    @Deprecated
    public void setAd(boolean z) {
        this.SB.setAd(z);
    }

    public void setClickListener(a aVar) {
        this.Sw = aVar;
        setOnClickListener(this);
    }

    @Deprecated
    public void setFillXY(boolean z) {
        this.SB.setFillXY(z);
    }

    @Deprecated
    public void setForce(boolean z) {
        this.SB.setForce(z);
    }

    public void setHorizontalVideo(boolean z) {
        this.SB.setHorizontalVideo(z);
    }

    public void setMediaPlayer(b bVar) {
        this.St = bVar;
        Surface surface = this.Sv;
        if (surface == null || bVar == null) {
            return;
        }
        bVar.setSurface(surface);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public void setRadius(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            com.kwad.components.core.widget.h.b(this, f);
        }
    }

    public void setVideoInfo(PhotoInfo.VideoInfo videoInfo) {
        this.Sx = videoInfo;
    }

    public final void updateTextureViewGravity(int i) {
        com.kwad.components.core.page.widget.b bVar = this.Ss;
        if (bVar == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            this.Ss.requestLayout();
        }
    }
}
