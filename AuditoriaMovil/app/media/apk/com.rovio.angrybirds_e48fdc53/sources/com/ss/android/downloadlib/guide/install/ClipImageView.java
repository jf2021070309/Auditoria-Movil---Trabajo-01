package com.ss.android.downloadlib.guide.install;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes3.dex */
public class ClipImageView extends ImageView {
    private boolean dr;
    private Paint g;
    private Path ge;
    private RectF o;
    private float[] q;

    public ClipImageView(Context context) {
        super(context);
        this.dr = true;
        dr(context);
    }

    public ClipImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dr = true;
        dr(context);
    }

    public ClipImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dr = true;
        dr(context);
    }

    protected void dr(Context context) {
        this.ge = new Path();
        this.o = new RectF();
    }

    public void setRadius(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        this.q = fArr;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g.setColor(i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.dr) {
            this.ge.reset();
            this.o.set(0.0f, 0.0f, getWidth(), getHeight());
            float[] fArr = this.q;
            if (fArr != null) {
                this.ge.addRoundRect(this.o, fArr, Path.Direction.CW);
            }
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.clipPath(this.ge);
            Paint paint = this.g;
            if (paint != null) {
                canvas.drawPath(this.ge, paint);
            }
        }
        super.onDraw(canvas);
    }

    public void setRoundRadius(int i) {
        if (i > 0) {
            float f = i;
            setRadius(new float[]{f, f, f, f, f, f, f, f});
        }
    }

    public void setClip(boolean z) {
        this.dr = z;
    }
}
