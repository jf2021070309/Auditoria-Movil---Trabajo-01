package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.qq.e.comm.adevent.AdEventType;
/* loaded from: classes2.dex */
public class l extends com.facebook.ads.internal.view.e.a.c {
    private final com.facebook.ads.internal.view.e.b.i a;
    private final com.facebook.ads.internal.view.e.b.k b;
    private final com.facebook.ads.internal.view.e.b.c c;
    private final m d;
    private final Paint e;

    /* renamed from: com.facebook.ads.internal.view.e.c.l$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[com.facebook.ads.internal.view.e.d.d.values().length];

        static {
            try {
                a[com.facebook.ads.internal.view.e.d.d.PREPARED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[com.facebook.ads.internal.view.e.d.d.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[com.facebook.ads.internal.view.e.d.d.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[com.facebook.ads.internal.view.e.d.d.PLAYBACK_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[com.facebook.ads.internal.view.e.d.d.STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public l(Context context) {
        this(context, false);
    }

    public l(Context context, boolean z) {
        super(context);
        this.a = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.e.c.l.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                l.this.d.setChecked(true);
            }
        };
        this.b = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.e.c.l.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                l.this.d.setChecked(false);
            }
        };
        this.c = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.l.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                l.this.d.setChecked(true);
            }
        };
        this.d = new m(context, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 23.76d), (int) (displayMetrics.density * 23.76d));
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        this.d.setChecked(true);
        this.e = new Paint();
        this.e.setStyle(Paint.Style.FILL);
        if (z) {
            this.e.setColor(-1728053248);
        } else {
            this.e.setColor(-1);
            this.e.setAlpha(AdEventType.VIDEO_PAUSE);
        }
        setBackgroundColor(0);
        addView(this.d);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 72.0d), (int) (displayMetrics.density * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a(this.a, this.b, this.c);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (l.this.getVideoView() == null) {
                    return;
                }
                switch (AnonymousClass5.a[l.this.getVideoView().getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        l.this.getVideoView().a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                        return;
                    case 5:
                        l.this.getVideoView().a(true);
                        return;
                    default:
                        return;
                }
            }
        };
        this.d.setClickable(false);
        setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().b(this.c, this.b, this.a);
        }
        super.b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = min / 2;
        canvas.drawCircle(getPaddingLeft() + i, (min / 2) + getPaddingTop(), i, this.e);
        super.onDraw(canvas);
    }
}
