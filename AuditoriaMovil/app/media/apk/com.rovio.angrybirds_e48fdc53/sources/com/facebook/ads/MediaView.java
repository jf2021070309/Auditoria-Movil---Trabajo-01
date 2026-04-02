package com.facebook.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.l.a;
import com.facebook.ads.internal.m.c;
import com.facebook.ads.internal.m.d;
import com.facebook.ads.internal.q.a.i;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.b.b;
import com.facebook.ads.internal.view.e;
import com.facebook.ads.internal.view.o;
/* loaded from: classes2.dex */
public class MediaView extends RelativeLayout {
    private static final String a = MediaView.class.getSimpleName();
    private static final int b = Color.argb(51, 145, 150, 165);
    private b c;
    private com.facebook.ads.internal.view.hscroll.b d;
    private MediaViewVideoRenderer e;
    private MediaViewListener f;
    private boolean g;
    @Deprecated
    private boolean h;

    public MediaView(Context context) {
        super(context);
        this.h = true;
        setImageRenderer(new b(context));
        setCarouselRenderer(new com.facebook.ads.internal.view.hscroll.b(context));
        setVideoRenderer(new e(context));
        a();
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
        setImageRenderer(new b(context, attributeSet));
        setCarouselRenderer(new com.facebook.ads.internal.view.hscroll.b(context, attributeSet));
        setVideoRenderer(new e(context, attributeSet));
        a();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
        setImageRenderer(new b(context, attributeSet, i));
        setCarouselRenderer(new com.facebook.ads.internal.view.hscroll.b(context, attributeSet, i));
        setVideoRenderer(new e(context, attributeSet, i));
        a();
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = true;
        setImageRenderer(new b(context, attributeSet, i, i2));
        setCarouselRenderer(new com.facebook.ads.internal.view.hscroll.b(context, attributeSet, i));
        setVideoRenderer(new e(context, attributeSet, i, i2));
        a();
    }

    private void a() {
        setBackgroundColor(b);
        i.a(this, i.INTERNAL_AD_MEDIA);
        i.a(this.c, i.INTERNAL_AD_MEDIA);
        i.a(this.e, i.INTERNAL_AD_MEDIA);
        i.a(this.d, i.INTERNAL_AD_MEDIA);
    }

    private boolean a(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(nativeAd.b());
    }

    private boolean b(NativeAd nativeAd) {
        if (nativeAd.f() == null) {
            return false;
        }
        for (NativeAd nativeAd2 : nativeAd.f()) {
            if (nativeAd2.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    private void setCarouselRenderer(com.facebook.ads.internal.view.hscroll.b bVar) {
        if (this.g) {
            throw new IllegalStateException("Carousel renderer must be set before nativeAd.");
        }
        if (this.d != null) {
            removeView(this.d);
        }
        float f = v.b;
        int round = Math.round(4.0f * f);
        int round2 = Math.round(f * 12.0f);
        bVar.setChildSpacing(round);
        bVar.setPadding(0, round2, 0, round2);
        bVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(bVar, layoutParams);
        this.d = bVar;
    }

    private void setImageRenderer(b bVar) {
        if (this.g) {
            throw new IllegalStateException("Image renderer must be set before nativeAd.");
        }
        if (this.c != null) {
            removeView(this.c);
        }
        bVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(bVar, layoutParams);
        this.c = bVar;
    }

    public void destroy() {
        this.e.pause(false);
        this.e.destroy();
    }

    protected c getAdEventManager() {
        return d.a(getContext());
    }

    @Deprecated
    public boolean isAutoplay() {
        return this.e.shouldAutoplay();
    }

    @Deprecated
    public void setAutoplay(boolean z) {
        this.h = z;
        if (!(this.e instanceof e)) {
            throw new IllegalStateException("MediaView only supports setAutoplay for backwards compatibility. New MediaViewVideoRenderer classes should implement their own autoplay handling.");
        }
        this.e.setAutoplay(z);
    }

    @Deprecated
    public void setAutoplayOnMobile(boolean z) {
        if (!(this.e instanceof e)) {
            throw new IllegalStateException("MediaView only supports setAutoplayOnMobile for backwards compatibility. New MediaViewVideoRenderer classes should implement their own autoplay handling.");
        }
        this.e.setAutoplayOnMobile(z);
    }

    public void setListener(final MediaViewListener mediaViewListener) {
        this.f = mediaViewListener;
        if (mediaViewListener == null) {
            this.e.setListener(null);
        } else {
            this.e.setListener(new o() { // from class: com.facebook.ads.MediaView.1
                @Override // com.facebook.ads.internal.view.o
                public void a() {
                    mediaViewListener.onVolumeChange(MediaView.this, MediaView.this.e.getVolume());
                }

                @Override // com.facebook.ads.internal.view.o
                public void b() {
                    mediaViewListener.onPause(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void c() {
                    mediaViewListener.onPlay(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void d() {
                    mediaViewListener.onFullscreenBackground(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void e() {
                    mediaViewListener.onFullscreenForeground(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void f() {
                    mediaViewListener.onExitFullscreen(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void g() {
                    mediaViewListener.onEnterFullscreen(MediaView.this);
                }

                @Override // com.facebook.ads.internal.view.o
                public void h() {
                    mediaViewListener.onComplete(MediaView.this);
                }
            });
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.g = true;
        nativeAd.a(this);
        nativeAd.setMediaViewAutoplay(this.h);
        if (b(nativeAd)) {
            this.c.setVisibility(8);
            this.c.a(null, null);
            this.e.setVisibility(8);
            this.e.unsetNativeAd();
            bringChildToFront(this.d);
            this.d.setCurrentPosition(0);
            this.d.setAdapter(new com.facebook.ads.internal.adapters.i(this.d, nativeAd.getInternalNativeAd().A()));
            this.d.setVisibility(0);
        } else if (a(nativeAd)) {
            this.c.setVisibility(8);
            this.c.a(null, null);
            this.d.setVisibility(8);
            this.d.setAdapter(null);
            bringChildToFront(this.e);
            this.e.setNativeAd(nativeAd);
            this.e.setVisibility(0);
        } else if (nativeAd.getAdCoverImage() != null) {
            this.e.setVisibility(8);
            this.e.unsetNativeAd();
            this.d.setVisibility(8);
            this.d.setAdapter(null);
            bringChildToFront(this.c);
            this.c.setVisibility(0);
            new com.facebook.ads.internal.view.b.d(this.c).a(getHeight(), getWidth()).a(a.e(getContext())).a(nativeAd.getAdCoverImage().getUrl());
        }
    }

    public void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (this.g) {
            throw new IllegalStateException("Video renderer must be set before nativeAd.");
        }
        if (this.e != null) {
            removeView(this.e);
            this.e.destroy();
        }
        mediaViewVideoRenderer.setAdEventManager(getAdEventManager());
        mediaViewVideoRenderer.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(mediaViewVideoRenderer, layoutParams);
        this.e = mediaViewVideoRenderer;
    }
}
