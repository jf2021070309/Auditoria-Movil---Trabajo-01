package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class j extends View implements com.facebook.ads.internal.view.e.a.b {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private a d;
    private final Paint e;
    private final RectF f;
    private com.facebook.ads.internal.view.e.b g;
    private int h;
    private final AtomicInteger i;
    private final AtomicBoolean j;
    private final com.facebook.ads.internal.view.e.b.m k;
    private final com.facebook.ads.internal.view.e.b.o l;
    private final com.facebook.ads.internal.view.e.b.c m;

    /* loaded from: classes2.dex */
    public enum a {
        CLOSE_BUTTON_MODE,
        SKIP_BUTTON_MODE
    }

    public j(Context context, int i, int i2) {
        super(context);
        this.d = a.CLOSE_BUTTON_MODE;
        this.i = new AtomicInteger(0);
        this.j = new AtomicBoolean(false);
        this.k = new com.facebook.ads.internal.view.e.b.m() { // from class: com.facebook.ads.internal.view.e.c.j.1
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.l lVar) {
                j.this.j.set(true);
            }
        };
        this.l = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.e.c.j.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.n nVar) {
                if (j.this.g == null) {
                    return;
                }
                int i3 = j.this.h;
                int duration = j.this.g.getDuration();
                if (i3 <= 0) {
                    j.this.i.set(0);
                } else {
                    int min = Math.min(duration, i3 * 1000);
                    if (min == 0) {
                        return;
                    }
                    j.this.i.set(((min - j.this.g.getCurrentPosition()) * 100) / min);
                }
                j.this.postInvalidate();
            }
        };
        this.m = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.e.c.j.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar) {
                j.this.h = 0;
                j.this.i.set(0);
                j.this.postInvalidate();
            }
        };
        float f = getResources().getDisplayMetrics().density;
        this.h = i;
        this.b = new Paint();
        this.b.setStyle(Paint.Style.FILL);
        this.b.setColor(i2);
        this.c = new Paint();
        this.c.setColor(-1);
        this.c.setAlpha(230);
        this.c.setStyle(Paint.Style.FILL);
        this.c.setStrokeWidth(1.0f * f);
        this.c.setAntiAlias(true);
        this.a = new Paint();
        this.a.setColor(-16777216);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setAlpha(102);
        this.a.setStrokeWidth(1.5f * f);
        this.a.setAntiAlias(true);
        setLayerType(1, null);
        this.a.setMaskFilter(new BlurMaskFilter(6.0f, BlurMaskFilter.Blur.NORMAL));
        this.e = new Paint();
        this.e.setColor(-10066330);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setStrokeWidth(f * 2.0f);
        this.e.setAntiAlias(true);
        this.f = new RectF();
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.g = bVar;
        this.g.getEventBus().a(this.k, this.l, this.m);
    }

    public boolean a() {
        return this.g != null && (this.h <= 0 || this.i.get() < 0);
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        this.g.getEventBus().b(this.m, this.l, this.k);
        this.g = null;
    }

    public int getSkipSeconds() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.j.get()) {
            super.onDraw(canvas);
            return;
        }
        int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = min / 2;
        int i2 = min / 2;
        canvas.drawCircle(getPaddingLeft() + i, getPaddingTop() + i2, i, this.a);
        canvas.drawCircle(getPaddingLeft() + i, i2 + getPaddingTop(), i, this.c);
        if (this.i.get() > 0) {
            this.f.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawArc(this.f, -90.0f, (-(this.i.get() * 360)) / 100.0f, true, this.b);
        } else if (this.d == a.SKIP_BUTTON_MODE) {
            int i3 = min / 4;
            int i4 = min / 3;
            Path path = new Path();
            path.moveTo(getPaddingLeft() + i3, getPaddingTop() + i4);
            path.lineTo(getPaddingLeft() + i, getPaddingTop() + i);
            path.lineTo(getPaddingLeft() + i3, (i4 * 2) + getPaddingTop());
            canvas.drawPath(path, this.e);
            Path path2 = new Path();
            path2.moveTo(getPaddingLeft() + i, getPaddingTop() + i4);
            path2.lineTo((i3 * 3) + getPaddingLeft(), getPaddingTop() + i);
            path2.lineTo(i + getPaddingLeft(), (i4 * 2) + getPaddingTop());
            canvas.drawPath(path2, this.e);
        } else {
            int i5 = min / 3;
            int i6 = min / 3;
            canvas.drawLine(getPaddingLeft() + i5, getPaddingTop() + i6, (i5 * 2) + getPaddingLeft(), (i6 * 2) + getPaddingTop(), this.e);
            canvas.drawLine((i5 * 2) + getPaddingLeft(), getPaddingTop() + i6, getPaddingLeft() + i5, (i6 * 2) + getPaddingTop(), this.e);
        }
        super.onDraw(canvas);
    }

    public void setButtonMode(a aVar) {
        this.d = aVar;
    }
}
