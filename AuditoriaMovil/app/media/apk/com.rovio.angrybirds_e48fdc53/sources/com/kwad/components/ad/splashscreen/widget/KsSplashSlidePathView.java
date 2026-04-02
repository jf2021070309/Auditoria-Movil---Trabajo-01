package com.kwad.components.ad.splashscreen.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class KsSplashSlidePathView extends ImageView {
    private Path Gm;
    private Paint Gn;
    private float Go;
    private float Gp;
    private float Gq;
    private float Gr;
    private int Gs;
    private a Gt;
    private GestureDetector Gu;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, float f2, float f3, float f4);

        void ls();
    }

    public KsSplashSlidePathView(Context context) {
        super(context);
        this.Gs = Color.parseColor("#66ffffff");
        init();
    }

    public KsSplashSlidePathView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Gs = Color.parseColor("#66ffffff");
        init();
    }

    private void b(MotionEvent motionEvent) {
        if (this.Gu.onTouchEvent(motionEvent)) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Gm.reset();
            this.Go = motionEvent.getX();
            float y = motionEvent.getY();
            this.Gp = y;
            float f = this.Go;
            this.Gq = f;
            this.Gr = y;
            this.Gm.moveTo(f, y);
            invalidate();
            if (this.Gt != null) {
            }
        } else if (actionMasked != 1) {
            if (actionMasked != 2) {
                return;
            }
            c(motionEvent.getX(), motionEvent.getY());
            invalidate();
        } else {
            this.Gm.reset();
            invalidate();
            a aVar = this.Gt;
            if (aVar != null) {
                aVar.a(this.Go, this.Gp, motionEvent.getX(), motionEvent.getY());
            }
        }
    }

    private void c(float f, float f2) {
        float abs = Math.abs(f - this.Gq);
        float abs2 = Math.abs(f2 - this.Gr);
        if (abs >= 3.0f || abs2 >= 3.0f) {
            Path path = this.Gm;
            float f3 = this.Gq;
            float f4 = this.Gr;
            path.quadTo(f3, f4, (f + f3) / 2.0f, (f2 + f4) / 2.0f);
            this.Gq = f;
            this.Gr = f2;
        }
    }

    private void init() {
        this.Gm = new Path();
        Paint paint = new Paint();
        this.Gn = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.Gn.setStrokeWidth(com.kwad.sdk.d.a.a.a(getContext(), 15.0f));
        this.Gn.setStyle(Paint.Style.STROKE);
        this.Gn.setColor(this.Gs);
        this.Gn.setDither(true);
        this.Gu = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.kwad.components.ad.splashscreen.widget.KsSplashSlidePathView.1
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (KsSplashSlidePathView.this.Gt != null) {
                    KsSplashSlidePathView.this.Gt.ls();
                    return true;
                }
                return false;
            }
        });
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.Gm, this.Gn);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        return true;
    }

    public void setOnSlideTouchListener(a aVar) {
        this.Gt = aVar;
    }
}
