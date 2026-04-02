package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class i extends com.facebook.ads.internal.view.e.a.c {
    private final a a;
    private final int b;
    private final String c;
    private final String d;
    private final AtomicBoolean e;
    private final com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n> f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends TextView {
        private final Paint a;
        private final Paint b;
        private final RectF c;

        public a(Context context) {
            super(context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            setBackgroundColor(0);
            setTextColor(-3355444);
            setPadding((int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f), (int) (displayMetrics.density * 9.0f), (int) (displayMetrics.density * 5.0f));
            setTextSize(18.0f);
            this.a = new Paint();
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setColor(-10066330);
            this.a.setStrokeWidth(1.0f);
            this.a.setAntiAlias(true);
            this.b = new Paint();
            this.b.setStyle(Paint.Style.FILL);
            this.b.setColor(-1895825408);
            this.c = new RectF();
        }

        @Override // android.widget.TextView, android.view.View
        protected void onDraw(Canvas canvas) {
            if (getText().length() == 0) {
                return;
            }
            int width = getWidth();
            int height = getHeight();
            this.c.set(0, 0, width, height);
            canvas.drawRoundRect(this.c, 6.0f, 6.0f, this.b);
            this.c.set(2, 2, width - 2, height - 2);
            canvas.drawRoundRect(this.c, 6.0f, 6.0f, this.a);
            super.onDraw(canvas);
        }
    }

    public i(Context context, int i, String str, String str2) {
        super(context);
        this.f = new com.facebook.ads.internal.j.f<com.facebook.ads.internal.view.e.b.n>() { // from class: com.facebook.ads.internal.view.e.c.i.1
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.n> a() {
                return com.facebook.ads.internal.view.e.b.n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (i.this.e.get() || i.this.getVideoView() == null) {
                    return;
                }
                int currentPosition = i.this.b - (i.this.getVideoView().getCurrentPosition() / 1000);
                if (currentPosition > 0) {
                    i.this.a.setText(i.this.c + ' ' + currentPosition);
                    return;
                }
                i.this.a.setText(i.this.d);
                i.this.e.set(true);
            }
        };
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = new AtomicBoolean(false);
        this.a = new a(context);
        this.a.setText(this.c + ' ' + i);
        addView(this.a, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    public void a() {
        super.a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f);
        }
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.i.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!i.this.e.get()) {
                    Log.i("SkipPlugin", "User clicked skip before the ads is allowed to skip.");
                } else if (i.this.getVideoView() != null) {
                    i.this.getVideoView().e();
                }
            }
        });
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    public void b() {
        if (getVideoView() != null) {
            this.a.setOnClickListener(null);
            getVideoView().getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f);
        }
        super.b();
    }
}
