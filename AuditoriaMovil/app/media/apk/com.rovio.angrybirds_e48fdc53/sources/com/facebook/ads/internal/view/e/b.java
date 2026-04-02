package com.facebook.ads.internal.view.e;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.j.f;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.n;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.r;
import com.facebook.ads.internal.view.e.b.s;
import com.facebook.ads.internal.view.e.b.t;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.x;
import com.facebook.ads.internal.view.e.b.y;
import com.facebook.ads.internal.view.e.d;
import com.facebook.ads.internal.view.e.d.e;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class b extends RelativeLayout implements d.a, e {
    private static final l b = new l();
    private static final com.facebook.ads.internal.view.e.b.d c = new com.facebook.ads.internal.view.e.b.d();
    private static final com.facebook.ads.internal.view.e.b.b d = new com.facebook.ads.internal.view.e.b.b();
    private static final n e = new n();
    private static final r f = new r();
    private static final h g = new h();
    private static final s h = new s();
    private static final j i = new j();
    private static final v j = new v();
    private static final y k = new y();
    private static final x l = new x();
    protected final com.facebook.ads.internal.view.e.d.c a;
    private final List<com.facebook.ads.internal.view.e.a.b> m;
    private final Handler n;
    private final com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d> o;
    private boolean p;
    private boolean q;
    private final View.OnTouchListener r;

    public b(Context context) {
        super(context);
        this.m = new ArrayList();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        if (com.facebook.ads.internal.l.a.a(context)) {
            this.a = new com.facebook.ads.internal.view.e.d.a(context);
        } else {
            this.a = new com.facebook.ads.internal.view.e.d.b(context);
        }
        a();
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        if (com.facebook.ads.internal.l.a.a(context)) {
            this.a = new com.facebook.ads.internal.view.e.d.a(context, attributeSet);
        } else {
            this.a = new com.facebook.ads.internal.view.e.d.b(context, attributeSet);
        }
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new ArrayList();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        if (com.facebook.ads.internal.l.a.a(context)) {
            this.a = new com.facebook.ads.internal.view.e.d.a(context, attributeSet, i2);
        } else {
            this.a = new com.facebook.ads.internal.view.e.d.b(context, attributeSet, i2);
        }
        a();
    }

    public b(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.m = new ArrayList();
        this.n = new Handler();
        this.o = new com.facebook.ads.internal.j.e<>();
        this.r = new View.OnTouchListener() { // from class: com.facebook.ads.internal.view.e.b.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.o.a((com.facebook.ads.internal.j.e) new t(view, motionEvent));
                return false;
            }
        };
        if (com.facebook.ads.internal.l.a.a(context)) {
            this.a = new com.facebook.ads.internal.view.e.d.a(context, attributeSet, i2, i3);
        } else {
            this.a = new com.facebook.ads.internal.view.e.d.b(context, attributeSet, i2, i3);
        }
        a();
    }

    private void a() {
        if (g() && (this.a instanceof com.facebook.ads.internal.view.e.d.a)) {
            ((com.facebook.ads.internal.view.e.d.a) this.a).setTestMode(AdInternalSettings.isTestMode(getContext()));
        }
        this.a.setRequestedVolume(1.0f);
        this.a.setVideoStateChangeListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView((View) this.a, layoutParams);
        setOnTouchListener(this.r);
    }

    public void a(int i2) {
        this.a.a(i2);
    }

    @Override // com.facebook.ads.internal.view.e.d.e
    public void a(int i2, int i3) {
        this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) new p(i2, i3));
    }

    public void a(com.facebook.ads.internal.view.e.a.a aVar) {
        if (this.p && this.a.getState() == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
            this.p = false;
        }
        this.a.a(aVar);
    }

    public void a(com.facebook.ads.internal.view.e.a.b bVar) {
        this.m.add(bVar);
    }

    @Override // com.facebook.ads.internal.view.e.d.e
    public void a(com.facebook.ads.internal.view.e.d.d dVar) {
        if (dVar == com.facebook.ads.internal.view.e.d.d.PREPARED) {
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) b);
        } else if (dVar == com.facebook.ads.internal.view.e.d.d.ERROR) {
            this.p = true;
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) c);
        } else if (dVar == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
            this.p = true;
            this.n.removeCallbacksAndMessages(null);
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) d);
        } else if (dVar == com.facebook.ads.internal.view.e.d.d.STARTED) {
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) i);
            this.n.removeCallbacksAndMessages(null);
            this.n.postDelayed(new Runnable() { // from class: com.facebook.ads.internal.view.e.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.p) {
                        return;
                    }
                    b.this.o.a((com.facebook.ads.internal.j.e) b.e);
                    b.this.n.postDelayed(this, 250L);
                }
            }, 250L);
        } else if (dVar == com.facebook.ads.internal.view.e.d.d.PAUSED) {
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) g);
            this.n.removeCallbacksAndMessages(null);
        } else if (dVar == com.facebook.ads.internal.view.e.d.d.IDLE) {
            this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) h);
            this.n.removeCallbacksAndMessages(null);
        }
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public void c() {
        for (com.facebook.ads.internal.view.e.a.b bVar : this.m) {
            if (bVar instanceof com.facebook.ads.internal.view.e.a.c) {
                com.facebook.ads.internal.view.e.a.c cVar = (com.facebook.ads.internal.view.e.a.c) bVar;
                if (cVar.getParent() == null) {
                    addView(cVar);
                    cVar.a(this);
                }
            } else {
                bVar.a(this);
            }
        }
    }

    public void d() {
        for (com.facebook.ads.internal.view.e.a.b bVar : this.m) {
            if (bVar instanceof com.facebook.ads.internal.view.e.a.c) {
                com.facebook.ads.internal.view.e.a.c cVar = (com.facebook.ads.internal.view.e.a.c) bVar;
                if (cVar.getParent() != null) {
                    cVar.b(this);
                    removeView(cVar);
                }
            } else {
                bVar.b(this);
            }
        }
    }

    public void e() {
        getEventBus().a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) f);
        this.a.b();
    }

    public void f() {
        this.a.c();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public boolean g() {
        return com.facebook.ads.internal.l.a.a(getContext());
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public int getCurrentPosition() {
        return this.a.getCurrentPosition();
    }

    public int getDuration() {
        return this.a.getDuration();
    }

    public com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d> getEventBus() {
        return this.o;
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public long getInitialBufferTime() {
        return this.a.getInitialBufferTime();
    }

    public com.facebook.ads.internal.view.e.d.d getState() {
        return this.a.getState();
    }

    public TextureView getTextureView() {
        return (TextureView) this.a;
    }

    public int getVideoHeight() {
        return this.a.getVideoHeight();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public com.facebook.ads.internal.view.e.a.a getVideoStartReason() {
        return this.a.getStartReason();
    }

    public View getVideoView() {
        return this.a.getView();
    }

    public int getVideoWidth() {
        return this.a.getVideoWidth();
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public float getVolume() {
        return this.a.getVolume();
    }

    public void h() {
        this.a.b(true);
    }

    @Override // com.facebook.ads.internal.view.e.d.a
    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.a.d();
    }

    public void k() {
        this.a.setVideoStateChangeListener(null);
        this.a.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) l);
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.o.a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) k);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        if (this.a != null) {
            this.a.setControlsAnchorView(view);
        }
    }

    public void setIsFullScreen(boolean z) {
        this.q = z;
        this.a.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.a.setVideoMPD(str);
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            d();
        } else {
            c();
            this.a.setup(uri);
        }
        this.p = false;
    }

    public void setVideoURI(String str) {
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f2) {
        this.a.setRequestedVolume(f2);
        getEventBus().a((com.facebook.ads.internal.j.e<f, com.facebook.ads.internal.j.d>) j);
    }
}
