package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
/* loaded from: classes3.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private float adjustedRadius;
    private int arcDirectionFactor;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    public CircularDrawingDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.arcDirectionFactor = 1;
    }

    private void drawRoundedEnd(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.adjustedRadius;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    private int getSize() {
        S s = this.spec;
        return (((CircularProgressIndicatorSpec) s).indicatorInset * 2) + ((CircularProgressIndicatorSpec) s).indicatorSize;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(Canvas canvas, Rect rect, float f) {
        S s;
        int i;
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s2 = this.spec;
        float f2 = (((CircularProgressIndicatorSpec) s2).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s2).indicatorInset;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.arcDirectionFactor = i;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s).trackThickness * f;
        this.displayedCornerRadius = ((CircularProgressIndicatorSpec) s).trackCornerRadius * f;
        this.adjustedRadius = (((CircularProgressIndicatorSpec) s).indicatorSize - ((CircularProgressIndicatorSpec) s).trackThickness) / 2.0f;
        if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
            this.adjustedRadius = (((1.0f - f) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f) + this.adjustedRadius;
        } else if ((this.drawable.isShowing() && ((CircularProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((CircularProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            this.adjustedRadius -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.spec).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.displayedTrackThickness);
        int i2 = this.arcDirectionFactor;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.adjustedRadius;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.displayedCornerRadius > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f4);
            drawRoundedEnd(canvas, paint, this.displayedTrackThickness, this.displayedCornerRadius, f4 + f5);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(Canvas canvas, Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f = this.adjustedRadius;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }
}
