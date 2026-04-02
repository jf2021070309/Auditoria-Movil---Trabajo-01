package com.me.game.pm_tools;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
/* loaded from: classes5.dex */
public class s0 extends m0 {
    public Paint i;
    private RectF j;
    private float k;
    public ColorStateList l;
    public boolean m;
    public int n;
    public float o;

    /* loaded from: classes5.dex */
    public class a extends RectShape {
        public a() {
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            s0 s0Var;
            int i;
            RectF rectF = new RectF();
            rectF.set(s0.this.j);
            s0 s0Var2 = s0.this;
            if (s0Var2.o > 0.0f) {
                if (!s0Var2.isSelected() || (i = (s0Var = s0.this).n) <= 1) {
                    s0 s0Var3 = s0.this;
                    if ((s0Var3.n & 1) == 1) {
                        s0Var3.i.setStyle(Paint.Style.STROKE);
                        float f = s0.this.o;
                        rectF.inset(f / 2.0f, f / 2.0f);
                    } else {
                        s0Var3.i.setStyle(Paint.Style.FILL);
                    }
                } else if ((i & 2) == 2) {
                    s0Var.i.setStyle(Paint.Style.STROKE);
                    float f2 = s0.this.o;
                    rectF.inset(f2 / 2.0f, f2 / 2.0f);
                }
            }
            s0 s0Var4 = s0.this;
            s0Var4.i.setColor(s0Var4.l.getColorForState(s0Var4.isSelected() ? c0.a : c0.f, s0.this.l.getDefaultColor()));
            canvas.drawRoundRect(rectF, s0.this.k, s0.this.k, s0.this.i);
        }
    }

    public s0(Context context) {
        super(context);
        this.i = new Paint(1);
        this.j = new RectF();
        this.k = 0.0f;
    }

    private Drawable getShape() {
        return new ShapeDrawable(new a());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.j;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.j.bottom = getHeight();
        if (this.m) {
            this.k = getHeight() / 2;
        }
    }

    public void setCircle(boolean z) {
        this.m = z;
    }

    public void setColorStateList(int i) {
        this.l = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
        setBackgroundDrawable(new RippleDrawable(i0.i, getShape(), null));
    }

    public void setRadius(float f) {
        this.k = f;
    }

    public void setStrokeWidth(float f) {
        this.o = f;
        if (f > 0.0f) {
            this.i.setStrokeWidth(f);
        } else {
            this.i.setStyle(Paint.Style.FILL);
        }
    }

    public void setStyleType(int i) {
        this.n = i;
    }

    public void setColorStateList(ColorStateList colorStateList) {
        this.l = colorStateList;
        setBackgroundDrawable(new RippleDrawable(i0.i, getShape(), null));
    }
}
