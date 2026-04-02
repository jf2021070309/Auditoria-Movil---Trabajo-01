package com.facebook.ads.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.VideoStartReason;
import com.facebook.ads.internal.r.a;
/* loaded from: classes2.dex */
public final class e extends MediaViewVideoRenderer {
    private static final String d = e.class.getSimpleName();
    private final com.facebook.ads.internal.view.e.c.g e;
    private final com.facebook.ads.internal.r.a f;
    private final a.AbstractC0116a g;
    private n h;
    private boolean i;
    private boolean j;
    private boolean k;

    public e(Context context) {
        super(context);
        this.e = new com.facebook.ads.internal.view.e.c.g(context);
        this.g = c();
        this.f = b();
        a();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new com.facebook.ads.internal.view.e.c.g(context);
        this.g = c();
        this.f = b();
        a();
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new com.facebook.ads.internal.view.e.c.g(context);
        this.g = c();
        this.f = b();
        a();
    }

    public e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new com.facebook.ads.internal.view.e.c.g(context);
        this.g = c();
        this.f = b();
        a();
    }

    private void a() {
        setVolume(0.0f);
        float f = com.facebook.ads.internal.q.a.v.b;
        int i = (int) (2.0f * f);
        int i2 = (int) (f * 25.0f);
        com.facebook.ads.internal.view.e.c.h hVar = new com.facebook.ads.internal.view.e.c.h(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        hVar.setPadding(i, i2, i2, i);
        hVar.setLayoutParams(layoutParams);
        int i3 = 0;
        while (true) {
            if (i3 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(0);
            if (childAt instanceof n) {
                this.h = (n) childAt;
                break;
            }
            i3++;
        }
        if (this.h == null) {
            Log.e(d, "Unable to find MediaViewVideo child.");
        } else {
            this.h.a(this.e);
            this.h.a(hVar);
        }
        this.f.a(0);
        this.f.b(250);
    }

    private com.facebook.ads.internal.r.a b() {
        return new com.facebook.ads.internal.r.a(this, 50, true, this.g);
    }

    private a.AbstractC0116a c() {
        return new a.AbstractC0116a() { // from class: com.facebook.ads.internal.view.e.1
            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void a() {
                if (e.this.h == null) {
                    return;
                }
                if (!e.this.k && (e.this.j || e.this.shouldAutoplay())) {
                    e.this.play(VideoStartReason.AUTO_STARTED);
                }
                e.this.j = false;
                e.this.k = false;
            }

            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void b() {
                if (e.this.h == null) {
                    return;
                }
                if (e.this.h.getState() == com.facebook.ads.internal.view.e.d.d.PAUSED) {
                    e.this.k = true;
                } else if (e.this.h.getState() == com.facebook.ads.internal.view.e.d.d.STARTED) {
                    e.this.j = true;
                }
                e.this.pause(e.this.k);
            }
        };
    }

    private void d() {
        if (getVisibility() == 0 && this.i && hasWindowFocus()) {
            this.f.a();
            return;
        }
        if (this.h != null && this.h.getState() == com.facebook.ads.internal.view.e.d.d.PAUSED) {
            this.k = true;
        }
        this.f.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.i = false;
        d();
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void onPrepared() {
        super.onPrepared();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (e.this.h != null && motionEvent.getAction() == 1) {
                    e.this.h.a();
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        d();
    }

    @Override // com.facebook.ads.MediaViewVideoRenderer
    public void setNativeAd(NativeAd nativeAd) {
        super.setNativeAd(nativeAd);
        this.j = false;
        this.k = false;
        this.e.setImage((nativeAd == null || nativeAd.getAdCoverImage() == null) ? null : nativeAd.getAdCoverImage().getUrl());
        this.f.a();
    }
}
