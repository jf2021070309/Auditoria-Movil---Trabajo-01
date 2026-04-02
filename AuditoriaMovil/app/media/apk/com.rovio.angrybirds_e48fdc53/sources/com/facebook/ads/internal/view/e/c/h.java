package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
/* loaded from: classes2.dex */
public class h extends com.facebook.ads.internal.view.e.a.c implements View.OnTouchListener {
    private final com.facebook.ads.internal.view.e.b.m a;
    private final com.facebook.ads.internal.view.e.b.i b;
    private final com.facebook.ads.internal.view.e.b.k c;
    private final com.facebook.ads.internal.view.e.b.c d;
    private final m e;

    public h(Context context) {
        this(context, null);
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new com.facebook.ads.internal.view.e.b.m() { // from class: com.facebook.ads.internal.view.e.c.h.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.l lVar) {
                h.this.setVisibility(0);
            }
        };
        this.b = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.h.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                h.this.e.setChecked(true);
            }
        };
        this.c = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.h.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                h.this.e.setChecked(false);
            }
        };
        this.d = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.h.4
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                h.this.e.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.e = new m(context);
        this.e.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.e, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        this.e.setOnTouchListener(this);
        setOnTouchListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.a, this.d, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().b(this.c, this.b, this.d, this.a);
        }
        setOnTouchListener(null);
        this.e.setOnTouchListener(null);
        super.b();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.facebook.ads.internal.view.e.b videoView;
        if (motionEvent.getAction() == 1 && (videoView = getVideoView()) != null) {
            if (videoView.getState() == com.facebook.ads.internal.view.e.d.d.PREPARED || videoView.getState() == com.facebook.ads.internal.view.e.d.d.PAUSED || videoView.getState() == com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED) {
                videoView.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                return true;
            } else if (videoView.getState() == com.facebook.ads.internal.view.e.d.d.STARTED) {
                videoView.a(true);
                return false;
            } else {
                return false;
            }
        }
        return false;
    }
}
