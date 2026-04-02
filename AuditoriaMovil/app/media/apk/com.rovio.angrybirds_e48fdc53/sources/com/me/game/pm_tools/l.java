package com.me.game.pm_tools;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
/* loaded from: classes5.dex */
public class l extends ShapeDrawable {
    private float a;
    private RectF b = new RectF();
    private boolean c;

    /* loaded from: classes5.dex */
    public class a extends RectShape {
        public a() {
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            try {
                canvas.drawRoundRect(l.this.b, l.this.a, l.this.a, paint);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public l(int i) {
        setShape(new a());
        getPaint().setColor(i);
    }

    public l c(boolean z) {
        this.c = z;
        return this;
    }

    public l d(int i) {
        this.a = i;
        return this;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        this.b.set(rect);
        if (this.c) {
            this.a = width > height ? height / 2 : width / 2;
        }
    }
}
