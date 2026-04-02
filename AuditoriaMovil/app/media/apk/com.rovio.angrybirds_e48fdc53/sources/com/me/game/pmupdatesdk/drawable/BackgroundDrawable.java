package com.me.game.pmupdatesdk.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
/* loaded from: classes7.dex */
public class BackgroundDrawable extends ShapeDrawable {
    private boolean mCenter;
    private float mRadius;
    private RectF mRoundRectF = new RectF();

    public BackgroundDrawable(int color) {
        setShape(new RectShape() { // from class: com.me.game.pmupdatesdk.drawable.BackgroundDrawable.1
            @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
            public void draw(Canvas canvas, Paint paint) {
                try {
                    canvas.drawRoundRect(BackgroundDrawable.this.mRoundRectF, BackgroundDrawable.this.mRadius, BackgroundDrawable.this.mRadius, paint);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        getPaint().setColor(color);
    }

    public BackgroundDrawable setRadius(int radius) {
        this.mRadius = radius;
        return this;
    }

    public BackgroundDrawable setCenter(boolean center) {
        this.mCenter = center;
        return this;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int width = bounds.width();
        int height = bounds.height();
        this.mRoundRectF.set(bounds);
        if (this.mCenter) {
            this.mRadius = width > height ? height / 2 : width / 2;
        }
    }
}
